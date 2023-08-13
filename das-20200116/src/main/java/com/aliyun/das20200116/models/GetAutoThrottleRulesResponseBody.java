// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoThrottleRulesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAutoThrottleRulesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>The maximum period of time during which an exception occurs when automatic SQL throttling is triggered. Unit: minutes.</p>
         */
        @NameInMap("AbnormalDuration")
        public Double abnormalDuration;

        /**
         * <p>The maximum number of active sessions.</p>
         */
        @NameInMap("ActiveSessions")
        public Long activeSessions;

        /**
         * <p>The end time of the throttling window. The value of this parameter is in UTC.</p>
         */
        @NameInMap("AllowThrottleEndTime")
        public String allowThrottleEndTime;

        /**
         * <p>The start time of the throttling window. The value of this parameter is in UTC.</p>
         */
        @NameInMap("AllowThrottleStartTime")
        public String allowThrottleStartTime;

        /**
         * <p>Indicates whether abnormal SQL statements in execution are terminated at a time. Valid values:</p>
         * <br>
         * <p>> Abnormal SQL statements use the same template as the SQL statements that need to be throttled.</p>
         * <br>
         * <p>* **true**</p>
         * <p>* **false**</p>
         */
        @NameInMap("AutoKillSession")
        public Boolean autoKillSession;

        /**
         * <p>The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:</p>
         * <br>
         * <p>* **AND**</p>
         * <p>* **OR**</p>
         */
        @NameInMap("CpuSessionRelation")
        public String cpuSessionRelation;

        /**
         * <p>The CPU utilization threshold.</p>
         */
        @NameInMap("CpuUsage")
        public Double cpuUsage;

        /**
         * <p>The database instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The maximum throttling duration. Unit: minutes.</p>
         */
        @NameInMap("MaxThrottleTime")
        public Double maxThrottleTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Indicates whether the automatic SQL throttling feature is enabled. Valid values:</p>
         * <br>
         * <p>* **true**</p>
         * <p>* **false**</p>
         */
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
        /**
         * <p>The maximum period of time during which the automatic SQL throttling feature is triggered. Unit: minutes.</p>
         */
        @NameInMap("AbnormalDuration")
        public Double abnormalDuration;

        /**
         * <p>The maximum number of active sessions.</p>
         */
        @NameInMap("ActiveSessions")
        public Long activeSessions;

        /**
         * <p>The end time of the throttling window. The value of this parameter is in UTC.</p>
         */
        @NameInMap("AllowThrottleEndTime")
        public String allowThrottleEndTime;

        /**
         * <p>The start time of the throttling window. The value of this parameter is in UTC.</p>
         */
        @NameInMap("AllowThrottleStartTime")
        public String allowThrottleStartTime;

        /**
         * <p>Indicates whether abnormal SQL statements in execution are terminated at a time. Valid values:</p>
         * <br>
         * <p>> Abnormal SQL statements use the same template as the SQL statements that need to be throttled.</p>
         * <br>
         * <p>* **true**</p>
         * <p>* **false**</p>
         */
        @NameInMap("AutoKillSession")
        public Boolean autoKillSession;

        /**
         * <p>The logical relationship between the CPU utilization threshold and the maximum number of active sessions. Valid values:</p>
         * <br>
         * <p>* **AND**</p>
         * <p>* **OR**</p>
         */
        @NameInMap("CpuSessionRelation")
        public String cpuSessionRelation;

        /**
         * <p>The CPU utilization threshold.</p>
         */
        @NameInMap("CpuUsage")
        public Double cpuUsage;

        /**
         * <p>The database instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The maximum throttling duration. Unit: minutes.</p>
         */
        @NameInMap("MaxThrottleTime")
        public Double maxThrottleTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Indicates whether the automatic SQL throttling feature is enabled. Valid values:</p>
         * <br>
         * <p>* **true**</p>
         * <p>* **false**</p>
         */
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
        /**
         * <p>The number of database instances for which the automatic SQL throttling feature is currently enabled.</p>
         */
        @NameInMap("EnableAutoThrottleCount")
        public Long enableAutoThrottleCount;

        /**
         * <p>The database instances for which the automatic SQL throttling feature is currently enabled.</p>
         */
        @NameInMap("EnableAutoThrottleList")
        public java.util.List<GetAutoThrottleRulesResponseBodyDataEnableAutoThrottleList> enableAutoThrottleList;

        /**
         * <p>The number of database instances that do not exist or for which the automatic SQL throttling feature has never been enabled.</p>
         * <br>
         * <p>>  If a database instance does not exist, the instance has been released or the specified instance ID is invalid.</p>
         */
        @NameInMap("NeverEnableAutoThrottleOrReleasedInstanceCount")
        public Long neverEnableAutoThrottleOrReleasedInstanceCount;

        /**
         * <p>The number of database instances that do not exist or for which the automatic SQL throttling feature has never been enabled.</p>
         * <br>
         * <p>>  If a database instance does not exist, the instance has been released or the specified instance ID is invalid.</p>
         */
        @NameInMap("NeverEnableAutoThrottleOrReleasedInstanceIdList")
        public java.util.List<String> neverEnableAutoThrottleOrReleasedInstanceIdList;

        /**
         * <p>The number of databases for which the automatic SQL throttling feature has been enabled.</p>
         */
        @NameInMap("TotalAutoThrottleRulesCount")
        public Long totalAutoThrottleRulesCount;

        /**
         * <p>The number of database instances for which the automatic SQL throttling feature was once enabled but is currently disabled.</p>
         */
        @NameInMap("TurnOffAutoThrottleCount")
        public Long turnOffAutoThrottleCount;

        /**
         * <p>The database instances for which the automatic SQL throttling feature was once enabled but is currently disabled.</p>
         */
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
