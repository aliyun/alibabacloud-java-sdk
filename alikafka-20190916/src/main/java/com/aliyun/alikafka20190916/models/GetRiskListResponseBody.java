// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetRiskListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetRiskListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>06084011-E093-46F3-A51F-4B19A8AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRiskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRiskListResponseBody self = new GetRiskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRiskListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetRiskListResponseBody setData(GetRiskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRiskListResponseBodyData getData() {
        return this.data;
    }

    public GetRiskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRiskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRiskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRiskListResponseBodyDataRiskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1702545932000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("GradeType")
        public String gradeType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Health")
        public Boolean health;

        /**
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-m7r1tzxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1683270264</p>
         */
        @NameInMap("LastAlarmTime")
        public Long lastAlarmTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelType")
        public Long levelType;

        /**
         * <strong>example:</strong>
         * <p>1637719920000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>inputIo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0123123123xxx</p>
         */
        @NameInMap("Owner")
        public String owner;

        @NameInMap("RelationList")
        public java.util.List<String> relationList;

        @NameInMap("ReportTips")
        public String reportTips;

        /**
         * <strong>example:</strong>
         * <p>doc</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReportValue")
        public String reportValue;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>inputIo</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetRiskListResponseBodyDataRiskList build(java.util.Map<String, ?> map) throws Exception {
            GetRiskListResponseBodyDataRiskList self = new GetRiskListResponseBodyDataRiskList();
            return TeaModel.build(map, self);
        }

        public GetRiskListResponseBodyDataRiskList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRiskListResponseBodyDataRiskList setGradeType(String gradeType) {
            this.gradeType = gradeType;
            return this;
        }
        public String getGradeType() {
            return this.gradeType;
        }

        public GetRiskListResponseBodyDataRiskList setHealth(Boolean health) {
            this.health = health;
            return this;
        }
        public Boolean getHealth() {
            return this.health;
        }

        public GetRiskListResponseBodyDataRiskList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRiskListResponseBodyDataRiskList setLastAlarmTime(Long lastAlarmTime) {
            this.lastAlarmTime = lastAlarmTime;
            return this;
        }
        public Long getLastAlarmTime() {
            return this.lastAlarmTime;
        }

        public GetRiskListResponseBodyDataRiskList setLevelType(Long levelType) {
            this.levelType = levelType;
            return this;
        }
        public Long getLevelType() {
            return this.levelType;
        }

        public GetRiskListResponseBodyDataRiskList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetRiskListResponseBodyDataRiskList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRiskListResponseBodyDataRiskList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetRiskListResponseBodyDataRiskList setRelationList(java.util.List<String> relationList) {
            this.relationList = relationList;
            return this;
        }
        public java.util.List<String> getRelationList() {
            return this.relationList;
        }

        public GetRiskListResponseBodyDataRiskList setReportTips(String reportTips) {
            this.reportTips = reportTips;
            return this;
        }
        public String getReportTips() {
            return this.reportTips;
        }

        public GetRiskListResponseBodyDataRiskList setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public GetRiskListResponseBodyDataRiskList setReportValue(String reportValue) {
            this.reportValue = reportValue;
            return this;
        }
        public String getReportValue() {
            return this.reportValue;
        }

        public GetRiskListResponseBodyDataRiskList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetRiskListResponseBodyDataRiskList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRiskListResponseBodyDataRiskList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetRiskListResponseBodyData extends TeaModel {
        @NameInMap("RiskList")
        public java.util.List<GetRiskListResponseBodyDataRiskList> riskList;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetRiskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRiskListResponseBodyData self = new GetRiskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRiskListResponseBodyData setRiskList(java.util.List<GetRiskListResponseBodyDataRiskList> riskList) {
            this.riskList = riskList;
            return this;
        }
        public java.util.List<GetRiskListResponseBodyDataRiskList> getRiskList() {
            return this.riskList;
        }

        public GetRiskListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
