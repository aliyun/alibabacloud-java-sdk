// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentListByIdListResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<GetIncidentListByIdListResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetIncidentListByIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentListByIdListResponseBody self = new GetIncidentListByIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncidentListByIdListResponseBody setData(java.util.List<GetIncidentListByIdListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetIncidentListByIdListResponseBodyData> getData() {
        return this.data;
    }

    public GetIncidentListByIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIncidentListByIdListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("assignToWhoIsValid")
        public Integer assignToWhoIsValid;

        /**
         * <strong>example:</strong>
         * <p>12312</p>
         */
        @NameInMap("assignUserId")
        public Long assignUserId;

        @NameInMap("assignUserName")
        public String assignUserName;

        /**
         * <strong>example:</strong>
         * <p>139****1111</p>
         */
        @NameInMap("assignUserPhone")
        public String assignUserPhone;

        /**
         * <strong>example:</strong>
         * <p>2010-03-09 15:53:45</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1212</p>
         */
        @NameInMap("defaultAssignToWho")
        public Integer defaultAssignToWho;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("defaultAssignToWhoIsValid")
        public Integer defaultAssignToWhoIsValid;

        @NameInMap("defaultAssignToWhoName")
        public String defaultAssignToWhoName;

        /**
         * <strong>example:</strong>
         * <p>3000000</p>
         */
        @NameInMap("durationTime")
        public String durationTime;

        /**
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("effect")
        public String effect;

        @NameInMap("incidentDescription")
        public String incidentDescription;

        /**
         * <strong>example:</strong>
         * <p>3213</p>
         */
        @NameInMap("incidentId")
        public Long incidentId;

        /**
         * <strong>example:</strong>
         * <p>P4</p>
         */
        @NameInMap("incidentLevel")
        public String incidentLevel;

        /**
         * <strong>example:</strong>
         * <p>I13002001</p>
         */
        @NameInMap("incidentNumber")
        public String incidentNumber;

        /**
         * <strong>example:</strong>
         * <p>FINISHE</p>
         */
        @NameInMap("incidentStatus")
        public String incidentStatus;

        @NameInMap("incidentTitle")
        public String incidentTitle;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isManual")
        public Boolean isManual;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isUpgrade")
        public Boolean isUpgrade;

        @NameInMap("notifyChannels")
        public java.util.List<String> notifyChannels;

        /**
         * <strong>example:</strong>
         * <p>12312</p>
         */
        @NameInMap("problemId")
        public Long problemId;

        /**
         * <strong>example:</strong>
         * <p>P1231231</p>
         */
        @NameInMap("problemNumber")
        public String problemNumber;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relRouteRuleDeleteType")
        public Integer relRouteRuleDeleteType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relServiceDeleteType")
        public Integer relServiceDeleteType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relServiceGroupIsValid")
        public Integer relServiceGroupIsValid;

        @NameInMap("relatedServiceDescription")
        public String relatedServiceDescription;

        /**
         * <strong>example:</strong>
         * <p>13000</p>
         */
        @NameInMap("relatedServiceGroupId")
        public Long relatedServiceGroupId;

        @NameInMap("relatedServiceGroupName")
        public String relatedServiceGroupName;

        /**
         * <strong>example:</strong>
         * <p>213123</p>
         */
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        @NameInMap("routeRuleName")
        public String routeRuleName;

        public static GetIncidentListByIdListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIncidentListByIdListResponseBodyData self = new GetIncidentListByIdListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIncidentListByIdListResponseBodyData setAssignToWhoIsValid(Integer assignToWhoIsValid) {
            this.assignToWhoIsValid = assignToWhoIsValid;
            return this;
        }
        public Integer getAssignToWhoIsValid() {
            return this.assignToWhoIsValid;
        }

        public GetIncidentListByIdListResponseBodyData setAssignUserId(Long assignUserId) {
            this.assignUserId = assignUserId;
            return this;
        }
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        public GetIncidentListByIdListResponseBodyData setAssignUserName(String assignUserName) {
            this.assignUserName = assignUserName;
            return this;
        }
        public String getAssignUserName() {
            return this.assignUserName;
        }

        public GetIncidentListByIdListResponseBodyData setAssignUserPhone(String assignUserPhone) {
            this.assignUserPhone = assignUserPhone;
            return this;
        }
        public String getAssignUserPhone() {
            return this.assignUserPhone;
        }

        public GetIncidentListByIdListResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetIncidentListByIdListResponseBodyData setDefaultAssignToWho(Integer defaultAssignToWho) {
            this.defaultAssignToWho = defaultAssignToWho;
            return this;
        }
        public Integer getDefaultAssignToWho() {
            return this.defaultAssignToWho;
        }

        public GetIncidentListByIdListResponseBodyData setDefaultAssignToWhoIsValid(Integer defaultAssignToWhoIsValid) {
            this.defaultAssignToWhoIsValid = defaultAssignToWhoIsValid;
            return this;
        }
        public Integer getDefaultAssignToWhoIsValid() {
            return this.defaultAssignToWhoIsValid;
        }

        public GetIncidentListByIdListResponseBodyData setDefaultAssignToWhoName(String defaultAssignToWhoName) {
            this.defaultAssignToWhoName = defaultAssignToWhoName;
            return this;
        }
        public String getDefaultAssignToWhoName() {
            return this.defaultAssignToWhoName;
        }

        public GetIncidentListByIdListResponseBodyData setDurationTime(String durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public String getDurationTime() {
            return this.durationTime;
        }

        public GetIncidentListByIdListResponseBodyData setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public GetIncidentListByIdListResponseBodyData setIncidentDescription(String incidentDescription) {
            this.incidentDescription = incidentDescription;
            return this;
        }
        public String getIncidentDescription() {
            return this.incidentDescription;
        }

        public GetIncidentListByIdListResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public GetIncidentListByIdListResponseBodyData setIncidentLevel(String incidentLevel) {
            this.incidentLevel = incidentLevel;
            return this;
        }
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        public GetIncidentListByIdListResponseBodyData setIncidentNumber(String incidentNumber) {
            this.incidentNumber = incidentNumber;
            return this;
        }
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        public GetIncidentListByIdListResponseBodyData setIncidentStatus(String incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }
        public String getIncidentStatus() {
            return this.incidentStatus;
        }

        public GetIncidentListByIdListResponseBodyData setIncidentTitle(String incidentTitle) {
            this.incidentTitle = incidentTitle;
            return this;
        }
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        public GetIncidentListByIdListResponseBodyData setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }
        public Boolean getIsManual() {
            return this.isManual;
        }

        public GetIncidentListByIdListResponseBodyData setIsUpgrade(Boolean isUpgrade) {
            this.isUpgrade = isUpgrade;
            return this;
        }
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        public GetIncidentListByIdListResponseBodyData setNotifyChannels(java.util.List<String> notifyChannels) {
            this.notifyChannels = notifyChannels;
            return this;
        }
        public java.util.List<String> getNotifyChannels() {
            return this.notifyChannels;
        }

        public GetIncidentListByIdListResponseBodyData setProblemId(Long problemId) {
            this.problemId = problemId;
            return this;
        }
        public Long getProblemId() {
            return this.problemId;
        }

        public GetIncidentListByIdListResponseBodyData setProblemNumber(String problemNumber) {
            this.problemNumber = problemNumber;
            return this;
        }
        public String getProblemNumber() {
            return this.problemNumber;
        }

        public GetIncidentListByIdListResponseBodyData setRelRouteRuleDeleteType(Integer relRouteRuleDeleteType) {
            this.relRouteRuleDeleteType = relRouteRuleDeleteType;
            return this;
        }
        public Integer getRelRouteRuleDeleteType() {
            return this.relRouteRuleDeleteType;
        }

        public GetIncidentListByIdListResponseBodyData setRelServiceDeleteType(Integer relServiceDeleteType) {
            this.relServiceDeleteType = relServiceDeleteType;
            return this;
        }
        public Integer getRelServiceDeleteType() {
            return this.relServiceDeleteType;
        }

        public GetIncidentListByIdListResponseBodyData setRelServiceGroupIsValid(Integer relServiceGroupIsValid) {
            this.relServiceGroupIsValid = relServiceGroupIsValid;
            return this;
        }
        public Integer getRelServiceGroupIsValid() {
            return this.relServiceGroupIsValid;
        }

        public GetIncidentListByIdListResponseBodyData setRelatedServiceDescription(String relatedServiceDescription) {
            this.relatedServiceDescription = relatedServiceDescription;
            return this;
        }
        public String getRelatedServiceDescription() {
            return this.relatedServiceDescription;
        }

        public GetIncidentListByIdListResponseBodyData setRelatedServiceGroupId(Long relatedServiceGroupId) {
            this.relatedServiceGroupId = relatedServiceGroupId;
            return this;
        }
        public Long getRelatedServiceGroupId() {
            return this.relatedServiceGroupId;
        }

        public GetIncidentListByIdListResponseBodyData setRelatedServiceGroupName(String relatedServiceGroupName) {
            this.relatedServiceGroupName = relatedServiceGroupName;
            return this;
        }
        public String getRelatedServiceGroupName() {
            return this.relatedServiceGroupName;
        }

        public GetIncidentListByIdListResponseBodyData setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public GetIncidentListByIdListResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public GetIncidentListByIdListResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public GetIncidentListByIdListResponseBodyData setRouteRuleName(String routeRuleName) {
            this.routeRuleName = routeRuleName;
            return this;
        }
        public String getRouteRuleName() {
            return this.routeRuleName;
        }

    }

}
