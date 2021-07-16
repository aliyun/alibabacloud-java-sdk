// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public GetIncidentResponseBodyData data;

    public static GetIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentResponseBody self = new GetIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIncidentResponseBody setData(GetIncidentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIncidentResponseBodyData getData() {
        return this.data;
    }

    public static class GetIncidentResponseBodyData extends TeaModel {
        // 事件Id
        @NameInMap("incidentId")
        public Long incidentId;

        // 流转规则ID
        @NameInMap("routeRuleId")
        public Long routeRuleId;

        // 流转规则名称
        @NameInMap("routeRuleName")
        public String routeRuleName;

        // 关联服务ID
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        // 关联服务名称
        @NameInMap("relatedServiceName")
        public String relatedServiceName;

        // 关联服务描述
        @NameInMap("relatedServiceDescription")
        public String relatedServiceDescription;

        // 事件状态 ASSIGNED已分派 RESPONDED已响应  FINISHED已完结
        @NameInMap("incidentStatus")
        public String incidentStatus;

        // 事件级别 P1 P2 P3 P4
        @NameInMap("incidentLevel")
        public String incidentLevel;

        // HIGH	影响等级 高：HIGH 低 LOW
        @NameInMap("effect")
        public String effect;

        // 分派的用户ID
        @NameInMap("assignUserId")
        public Long assignUserId;

        // 分派的用户姓名 (用户表获取)
        @NameInMap("assignUserName")
        public String assignUserName;

        // 分派的用户手机号
        @NameInMap("assignUserPhone")
        public String assignUserPhone;

        // 事件编号
        @NameInMap("incidentNumber")
        public String incidentNumber;

        // 事件标题
        @NameInMap("incidentTitle")
        public String incidentTitle;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 事件来源 是：手动 否：自动
        @NameInMap("isManual")
        public Boolean isManual;

        // 是否升级 是 否
        @NameInMap("isUpgrade")
        public Boolean isUpgrade;

        // 事件描述
        @NameInMap("incidentDescription")
        public String incidentDescription;

        // 故障Id
        @NameInMap("problemId")
        public Long problemId;

        // 故障编号
        @NameInMap("problemNumber")
        public String problemNumber;

        public static GetIncidentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIncidentResponseBodyData self = new GetIncidentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIncidentResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public GetIncidentResponseBodyData setRouteRuleId(Long routeRuleId) {
            this.routeRuleId = routeRuleId;
            return this;
        }
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public GetIncidentResponseBodyData setRouteRuleName(String routeRuleName) {
            this.routeRuleName = routeRuleName;
            return this;
        }
        public String getRouteRuleName() {
            return this.routeRuleName;
        }

        public GetIncidentResponseBodyData setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public GetIncidentResponseBodyData setRelatedServiceName(String relatedServiceName) {
            this.relatedServiceName = relatedServiceName;
            return this;
        }
        public String getRelatedServiceName() {
            return this.relatedServiceName;
        }

        public GetIncidentResponseBodyData setRelatedServiceDescription(String relatedServiceDescription) {
            this.relatedServiceDescription = relatedServiceDescription;
            return this;
        }
        public String getRelatedServiceDescription() {
            return this.relatedServiceDescription;
        }

        public GetIncidentResponseBodyData setIncidentStatus(String incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }
        public String getIncidentStatus() {
            return this.incidentStatus;
        }

        public GetIncidentResponseBodyData setIncidentLevel(String incidentLevel) {
            this.incidentLevel = incidentLevel;
            return this;
        }
        public String getIncidentLevel() {
            return this.incidentLevel;
        }

        public GetIncidentResponseBodyData setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public GetIncidentResponseBodyData setAssignUserId(Long assignUserId) {
            this.assignUserId = assignUserId;
            return this;
        }
        public Long getAssignUserId() {
            return this.assignUserId;
        }

        public GetIncidentResponseBodyData setAssignUserName(String assignUserName) {
            this.assignUserName = assignUserName;
            return this;
        }
        public String getAssignUserName() {
            return this.assignUserName;
        }

        public GetIncidentResponseBodyData setAssignUserPhone(String assignUserPhone) {
            this.assignUserPhone = assignUserPhone;
            return this;
        }
        public String getAssignUserPhone() {
            return this.assignUserPhone;
        }

        public GetIncidentResponseBodyData setIncidentNumber(String incidentNumber) {
            this.incidentNumber = incidentNumber;
            return this;
        }
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        public GetIncidentResponseBodyData setIncidentTitle(String incidentTitle) {
            this.incidentTitle = incidentTitle;
            return this;
        }
        public String getIncidentTitle() {
            return this.incidentTitle;
        }

        public GetIncidentResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetIncidentResponseBodyData setIsManual(Boolean isManual) {
            this.isManual = isManual;
            return this;
        }
        public Boolean getIsManual() {
            return this.isManual;
        }

        public GetIncidentResponseBodyData setIsUpgrade(Boolean isUpgrade) {
            this.isUpgrade = isUpgrade;
            return this;
        }
        public Boolean getIsUpgrade() {
            return this.isUpgrade;
        }

        public GetIncidentResponseBodyData setIncidentDescription(String incidentDescription) {
            this.incidentDescription = incidentDescription;
            return this;
        }
        public String getIncidentDescription() {
            return this.incidentDescription;
        }

        public GetIncidentResponseBodyData setProblemId(Long problemId) {
            this.problemId = problemId;
            return this;
        }
        public Long getProblemId() {
            return this.problemId;
        }

        public GetIncidentResponseBodyData setProblemNumber(String problemNumber) {
            this.problemNumber = problemNumber;
            return this;
        }
        public String getProblemNumber() {
            return this.problemNumber;
        }

    }

}
