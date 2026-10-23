// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListActionRecordsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6F******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of instance change records.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListActionRecordsResponseBodyResult> result;

    public static ListActionRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListActionRecordsResponseBody self = new ListActionRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListActionRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListActionRecordsResponseBody setResult(java.util.List<ListActionRecordsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListActionRecordsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo extends TeaModel {
        /**
         * <p>The number of completed nodes in the sub-phase.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("completeNodeCount")
        public Integer completeNodeCount;

        /**
         * <p>The end time of the sub-phase. The value is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The exception information for the sub-phase.</p>
         */
        @NameInMap("exception")
        public String exception;

        /**
         * <p>The time elapsed for the sub-phase, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("latencyMills")
        public Long latencyMills;

        /**
         * <p>The total number of nodes involved in the sub-phase.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("nodeCount")
        public Integer nodeCount;

        /**
         * <p>The completion progress of the sub-phase, represented as a percentage string.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("process")
        public String process;

        /**
         * <p>The start time of the sub-phase. The value is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The current state of the sub-phase.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("stateType")
        public String stateType;

        /**
         * <p>The name of the sub-phase.</p>
         * 
         * <strong>example:</strong>
         * <p>clusterStateWait</p>
         */
        @NameInMap("subState")
        public String subState;

        public static ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo self = new ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo();
            return TeaModel.build(map, self);
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setCompleteNodeCount(Integer completeNodeCount) {
            this.completeNodeCount = completeNodeCount;
            return this;
        }
        public Integer getCompleteNodeCount() {
            return this.completeNodeCount;
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setLatencyMills(Long latencyMills) {
            this.latencyMills = latencyMills;
            return this;
        }
        public Long getLatencyMills() {
            return this.latencyMills;
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setStateType(String stateType) {
            this.stateType = stateType;
            return this;
        }
        public String getStateType() {
            return this.stateType;
        }

        public ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo setSubState(String subState) {
            this.subState = subState;
            return this;
        }
        public String getSubState() {
            return this.subState;
        }

    }

    public static class ListActionRecordsResponseBodyResultStatusInfo extends TeaModel {
        /**
         * <p>The number of completed nodes in the phase.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("completeNodeCount")
        public Integer completeNodeCount;

        /**
         * <p>The end time of the phase. The value is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The exception information for the phase.</p>
         */
        @NameInMap("exception")
        public String exception;

        /**
         * <p>The time elapsed for the phase, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("latencyMills")
        public Long latencyMills;

        /**
         * <p>The total number of nodes involved in the phase.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("nodeCount")
        public Integer nodeCount;

        /**
         * <p>The completion progress of the phase, represented as a percentage string.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("process")
        public String process;

        /**
         * <p>The start time of the phase. The value is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The current state of the phase.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("stateType")
        public String stateType;

        /**
         * <p>The name of the phase.</p>
         * 
         * <strong>example:</strong>
         * <p>rolling</p>
         */
        @NameInMap("subState")
        public String subState;

        /**
         * <p>The list of status details for the sub-phases included in the current phase.</p>
         */
        @NameInMap("subStatusInfo")
        public java.util.List<ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo> subStatusInfo;

        public static ListActionRecordsResponseBodyResultStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ListActionRecordsResponseBodyResultStatusInfo self = new ListActionRecordsResponseBodyResultStatusInfo();
            return TeaModel.build(map, self);
        }

        public ListActionRecordsResponseBodyResultStatusInfo setCompleteNodeCount(Integer completeNodeCount) {
            this.completeNodeCount = completeNodeCount;
            return this;
        }
        public Integer getCompleteNodeCount() {
            return this.completeNodeCount;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setException(String exception) {
            this.exception = exception;
            return this;
        }
        public String getException() {
            return this.exception;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setLatencyMills(Long latencyMills) {
            this.latencyMills = latencyMills;
            return this;
        }
        public Long getLatencyMills() {
            return this.latencyMills;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setStateType(String stateType) {
            this.stateType = stateType;
            return this;
        }
        public String getStateType() {
            return this.stateType;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setSubState(String subState) {
            this.subState = subState;
            return this;
        }
        public String getSubState() {
            return this.subState;
        }

        public ListActionRecordsResponseBodyResultStatusInfo setSubStatusInfo(java.util.List<ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo> subStatusInfo) {
            this.subStatusInfo = subStatusInfo;
            return this;
        }
        public java.util.List<ListActionRecordsResponseBodyResultStatusInfoSubStatusInfo> getSubStatusInfo() {
            return this.subStatusInfo;
        }

    }

    public static class ListActionRecordsResponseBodyResult extends TeaModel {
        /**
         * <p>The name of the operation that triggered the change.</p>
         * 
         * <strong>example:</strong>
         * <p>RestartInstance</p>
         */
        @NameInMap("actionName")
        public String actionName;

        /**
         * <p>The parameters used for the change.</p>
         */
        @NameInMap("actionParams")
        public java.util.Map<String, ?> actionParams;

        @NameInMap("actionResultAccessList")
        public java.util.List<String> actionResultAccessList;

        /**
         * <p>The end time of the change. The value is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The ID of the Elasticsearch instance that was changed.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif24adwc0082****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The instance information after the change, represented as a JSON string.</p>
         */
        @NameInMap("metaNow")
        public String metaNow;

        /**
         * <p>The instance information before the change, represented as a JSON string.</p>
         */
        @NameInMap("metaOld")
        public String metaOld;

        /**
         * <p>The ID of the Alibaba Cloud account to which the account that triggered the change belongs.</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <p>The progress of the change, represented as a percentage string.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("process")
        public String process;

        /**
         * <p>The field differences before and after the change.</p>
         */
        @NameInMap("recordDiff")
        public java.util.Map<String, ?> recordDiff;

        @NameInMap("recordIds")
        public java.util.List<String> recordIds;

        /**
         * <p>The ID of the request that triggered the change.</p>
         * 
         * <strong>example:</strong>
         * <p>request-123</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>The start time of the change. The value is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The current state of the change.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("stateType")
        public String stateType;

        /**
         * <p>The list of status details for each phase of the change.</p>
         */
        @NameInMap("statusInfo")
        public java.util.List<ListActionRecordsResponseBodyResultStatusInfo> statusInfo;

        /**
         * <p>The ID of the user that triggered the change.</p>
         * 
         * <strong>example:</strong>
         * <p>user-123</p>
         */
        @NameInMap("userId")
        public String userId;

        @NameInMap("userInfo")
        public String userInfo;

        /**
         * <p>The type of the account that triggered the change.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("userType")
        public String userType;

        public static ListActionRecordsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListActionRecordsResponseBodyResult self = new ListActionRecordsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListActionRecordsResponseBodyResult setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public ListActionRecordsResponseBodyResult setActionParams(java.util.Map<String, ?> actionParams) {
            this.actionParams = actionParams;
            return this;
        }
        public java.util.Map<String, ?> getActionParams() {
            return this.actionParams;
        }

        public ListActionRecordsResponseBodyResult setActionResultAccessList(java.util.List<String> actionResultAccessList) {
            this.actionResultAccessList = actionResultAccessList;
            return this;
        }
        public java.util.List<String> getActionResultAccessList() {
            return this.actionResultAccessList;
        }

        public ListActionRecordsResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListActionRecordsResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListActionRecordsResponseBodyResult setMetaNow(String metaNow) {
            this.metaNow = metaNow;
            return this;
        }
        public String getMetaNow() {
            return this.metaNow;
        }

        public ListActionRecordsResponseBodyResult setMetaOld(String metaOld) {
            this.metaOld = metaOld;
            return this;
        }
        public String getMetaOld() {
            return this.metaOld;
        }

        public ListActionRecordsResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListActionRecordsResponseBodyResult setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public ListActionRecordsResponseBodyResult setRecordDiff(java.util.Map<String, ?> recordDiff) {
            this.recordDiff = recordDiff;
            return this;
        }
        public java.util.Map<String, ?> getRecordDiff() {
            return this.recordDiff;
        }

        public ListActionRecordsResponseBodyResult setRecordIds(java.util.List<String> recordIds) {
            this.recordIds = recordIds;
            return this;
        }
        public java.util.List<String> getRecordIds() {
            return this.recordIds;
        }

        public ListActionRecordsResponseBodyResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListActionRecordsResponseBodyResult setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListActionRecordsResponseBodyResult setStateType(String stateType) {
            this.stateType = stateType;
            return this;
        }
        public String getStateType() {
            return this.stateType;
        }

        public ListActionRecordsResponseBodyResult setStatusInfo(java.util.List<ListActionRecordsResponseBodyResultStatusInfo> statusInfo) {
            this.statusInfo = statusInfo;
            return this;
        }
        public java.util.List<ListActionRecordsResponseBodyResultStatusInfo> getStatusInfo() {
            return this.statusInfo;
        }

        public ListActionRecordsResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListActionRecordsResponseBodyResult setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

        public ListActionRecordsResponseBodyResult setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
