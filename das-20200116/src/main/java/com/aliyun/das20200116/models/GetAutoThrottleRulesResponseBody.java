// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoThrottleRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetAutoThrottleRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAutoThrottleRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoThrottleRulesResponseBody self = new GetAutoThrottleRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoThrottleRulesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAutoThrottleRulesResponseBody setData(GetAutoThrottleRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoThrottleRulesResponseBodyData getData() {
        return this.data;
    }

    public GetAutoThrottleRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoThrottleRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoThrottleRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList extends TeaModel {
        @NameInMap("AbnormalDuration")
        public Double abnormalDuration;

        @NameInMap("ActiveSessions")
        public Long activeSessions;

        @NameInMap("AllowThrottleEndTime")
        public String allowThrottleEndTime;

        @NameInMap("AllowThrottleStartTime")
        public String allowThrottleStartTime;

        @NameInMap("AutoKillSession")
        public Boolean autoKillSession;

        @NameInMap("CpuSessionRelation")
        public String cpuSessionRelation;

        @NameInMap("CpuUsage")
        public Double cpuUsage;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxThrottleTime")
        public Double maxThrottleTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Visible")
        public Boolean visible;

        public static GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList self = new GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList();
            return TeaModel.build(map, self);
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setAbnormalDuration(Double abnormalDuration) {
            this.abnormalDuration = abnormalDuration;
            return this;
        }
        public Double getAbnormalDuration() {
            return this.abnormalDuration;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setActiveSessions(Long activeSessions) {
            this.activeSessions = activeSessions;
            return this;
        }
        public Long getActiveSessions() {
            return this.activeSessions;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setAllowThrottleEndTime(String allowThrottleEndTime) {
            this.allowThrottleEndTime = allowThrottleEndTime;
            return this;
        }
        public String getAllowThrottleEndTime() {
            return this.allowThrottleEndTime;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setAllowThrottleStartTime(String allowThrottleStartTime) {
            this.allowThrottleStartTime = allowThrottleStartTime;
            return this;
        }
        public String getAllowThrottleStartTime() {
            return this.allowThrottleStartTime;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setAutoKillSession(Boolean autoKillSession) {
            this.autoKillSession = autoKillSession;
            return this;
        }
        public Boolean getAutoKillSession() {
            return this.autoKillSession;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setCpuSessionRelation(String cpuSessionRelation) {
            this.cpuSessionRelation = cpuSessionRelation;
            return this;
        }
        public String getCpuSessionRelation() {
            return this.cpuSessionRelation;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setCpuUsage(Double cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public Double getCpuUsage() {
            return this.cpuUsage;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setMaxThrottleTime(Double maxThrottleTime) {
            this.maxThrottleTime = maxThrottleTime;
            return this;
        }
        public Double getMaxThrottleTime() {
            return this.maxThrottleTime;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList extends TeaModel {
        @NameInMap("AbnormalDuration")
        public Double abnormalDuration;

        @NameInMap("ActiveSessions")
        public Long activeSessions;

        @NameInMap("AllowThrottleEndTime")
        public String allowThrottleEndTime;

        @NameInMap("AllowThrottleStartTime")
        public String allowThrottleStartTime;

        @NameInMap("AutoKillSession")
        public Boolean autoKillSession;

        @NameInMap("CpuSessionRelation")
        public String cpuSessionRelation;

        @NameInMap("CpuUsage")
        public Double cpuUsage;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxThrottleTime")
        public Double maxThrottleTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Visible")
        public Boolean visible;

        public static GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList self = new GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList();
            return TeaModel.build(map, self);
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setAbnormalDuration(Double abnormalDuration) {
            this.abnormalDuration = abnormalDuration;
            return this;
        }
        public Double getAbnormalDuration() {
            return this.abnormalDuration;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setActiveSessions(Long activeSessions) {
            this.activeSessions = activeSessions;
            return this;
        }
        public Long getActiveSessions() {
            return this.activeSessions;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setAllowThrottleEndTime(String allowThrottleEndTime) {
            this.allowThrottleEndTime = allowThrottleEndTime;
            return this;
        }
        public String getAllowThrottleEndTime() {
            return this.allowThrottleEndTime;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setAllowThrottleStartTime(String allowThrottleStartTime) {
            this.allowThrottleStartTime = allowThrottleStartTime;
            return this;
        }
        public String getAllowThrottleStartTime() {
            return this.allowThrottleStartTime;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setAutoKillSession(Boolean autoKillSession) {
            this.autoKillSession = autoKillSession;
            return this;
        }
        public Boolean getAutoKillSession() {
            return this.autoKillSession;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setCpuSessionRelation(String cpuSessionRelation) {
            this.cpuSessionRelation = cpuSessionRelation;
            return this;
        }
        public String getCpuSessionRelation() {
            return this.cpuSessionRelation;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setCpuUsage(Double cpuUsage) {
            this.cpuUsage = cpuUsage;
            return this;
        }
        public Double getCpuUsage() {
            return this.cpuUsage;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setMaxThrottleTime(Double maxThrottleTime) {
            this.maxThrottleTime = maxThrottleTime;
            return this;
        }
        public Double getMaxThrottleTime() {
            return this.maxThrottleTime;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

    }

    public static class GetAutoThrottleRulesResponseBodyData extends TeaModel {
        @NameInMap("EnableAutoThrottleCount")
        public Long enableAutoThrottleCount;

        @NameInMap("EnableAutoThrottleList")
        public java.util.List<GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList> enableAutoThrottleList;

        @NameInMap("NeverEnableAutoThrottleOrReleasedInstanceCount")
        public Long neverEnableAutoThrottleOrReleasedInstanceCount;

        @NameInMap("NeverEnableAutoThrottleOrReleasedInstanceIdList")
        public java.util.List<String> neverEnableAutoThrottleOrReleasedInstanceIdList;

        @NameInMap("TotalAutoThrottleRulesCount")
        public Long totalAutoThrottleRulesCount;

        @NameInMap("TurnOffAutoThrottleCount")
        public Long turnOffAutoThrottleCount;

        @NameInMap("TurnOffAutoThrottleList")
        public java.util.List<GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList> turnOffAutoThrottleList;

        public static GetAutoThrottleRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoThrottleRulesResponseBodyData self = new GetAutoThrottleRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoThrottleRulesResponseBodyData setEnableAutoThrottleCount(Long enableAutoThrottleCount) {
            this.enableAutoThrottleCount = enableAutoThrottleCount;
            return this;
        }
        public Long getEnableAutoThrottleCount() {
            return this.enableAutoThrottleCount;
        }

        public GetAutoThrottleRulesResponseBodyData setEnableAutoThrottleList(java.util.List<GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList> enableAutoThrottleList) {
            this.enableAutoThrottleList = enableAutoThrottleList;
            return this;
        }
        public java.util.List<GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList> getEnableAutoThrottleList() {
            return this.enableAutoThrottleList;
        }

        public GetAutoThrottleRulesResponseBodyData setNeverEnableAutoThrottleOrReleasedInstanceCount(Long neverEnableAutoThrottleOrReleasedInstanceCount) {
            this.neverEnableAutoThrottleOrReleasedInstanceCount = neverEnableAutoThrottleOrReleasedInstanceCount;
            return this;
        }
        public Long getNeverEnableAutoThrottleOrReleasedInstanceCount() {
            return this.neverEnableAutoThrottleOrReleasedInstanceCount;
        }

        public GetAutoThrottleRulesResponseBodyData setNeverEnableAutoThrottleOrReleasedInstanceIdList(java.util.List<String> neverEnableAutoThrottleOrReleasedInstanceIdList) {
            this.neverEnableAutoThrottleOrReleasedInstanceIdList = neverEnableAutoThrottleOrReleasedInstanceIdList;
            return this;
        }
        public java.util.List<String> getNeverEnableAutoThrottleOrReleasedInstanceIdList() {
            return this.neverEnableAutoThrottleOrReleasedInstanceIdList;
        }

        public GetAutoThrottleRulesResponseBodyData setTotalAutoThrottleRulesCount(Long totalAutoThrottleRulesCount) {
            this.totalAutoThrottleRulesCount = totalAutoThrottleRulesCount;
            return this;
        }
        public Long getTotalAutoThrottleRulesCount() {
            return this.totalAutoThrottleRulesCount;
        }

        public GetAutoThrottleRulesResponseBodyData setTurnOffAutoThrottleCount(Long turnOffAutoThrottleCount) {
            this.turnOffAutoThrottleCount = turnOffAutoThrottleCount;
            return this;
        }
        public Long getTurnOffAutoThrottleCount() {
            return this.turnOffAutoThrottleCount;
        }

        public GetAutoThrottleRulesResponseBodyData setTurnOffAutoThrottleList(java.util.List<GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList> turnOffAutoThrottleList) {
            this.turnOffAutoThrottleList = turnOffAutoThrottleList;
            return this;
        }
        public java.util.List<GetAutoThrottleRulesResponseBodyDataTurnOffAutoThrottleList> getTurnOffAutoThrottleList() {
            return this.turnOffAutoThrottleList;
        }

    }

}
