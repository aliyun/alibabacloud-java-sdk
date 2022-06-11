// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListActionRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("completeNodeCount")
        public Integer completeNodeCount;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("exception")
        public String exception;

        @NameInMap("latencyMills")
        public Long latencyMills;

        @NameInMap("nodeCount")
        public Integer nodeCount;

        @NameInMap("process")
        public String process;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("stateType")
        public String stateType;

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
        @NameInMap("completeNodeCount")
        public Integer completeNodeCount;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("exception")
        public String exception;

        @NameInMap("latencyMills")
        public Long latencyMills;

        @NameInMap("nodeCount")
        public Integer nodeCount;

        @NameInMap("process")
        public String process;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("stateType")
        public String stateType;

        @NameInMap("subState")
        public String subState;

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
        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("ActionParams")
        public java.util.Map<String, ?> actionParams;

        @NameInMap("ActionResultAccessList")
        public java.util.List<String> actionResultAccessList;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MetaNow")
        public String metaNow;

        @NameInMap("MetaOld")
        public String metaOld;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Process")
        public String process;

        @NameInMap("RecordDiff")
        public java.util.Map<String, ?> recordDiff;

        @NameInMap("RecordIds")
        public java.util.List<String> recordIds;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StateType")
        public String stateType;

        @NameInMap("StatusInfo")
        public java.util.List<ListActionRecordsResponseBodyResultStatusInfo> statusInfo;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserInfo")
        public String userInfo;

        @NameInMap("UserType")
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
