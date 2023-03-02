// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemResponseBody extends TeaModel {
    @NameInMap("data")
    public GetProblemResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static GetProblemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProblemResponseBody self = new GetProblemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProblemResponseBody setData(GetProblemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProblemResponseBodyData getData() {
        return this.data;
    }

    public GetProblemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProblemResponseBodyDataCancelProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        public String actionName;

        @NameInMap("actionTime")
        public String actionTime;

        @NameInMap("operator")
        public String operator;

        @NameInMap("userId")
        public Long userId;

        public static GetProblemResponseBodyDataCancelProblemOperateLogs build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataCancelProblemOperateLogs self = new GetProblemResponseBodyDataCancelProblemOperateLogs();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyDataCancelProblemOperateLogs setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public GetProblemResponseBodyDataCancelProblemOperateLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public GetProblemResponseBodyDataCancelProblemOperateLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetProblemResponseBodyDataCancelProblemOperateLogs setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class GetProblemResponseBodyDataCoordinationGroups extends TeaModel {
        @NameInMap("isValid")
        public Long isValid;

        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        public static GetProblemResponseBodyDataCoordinationGroups build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataCoordinationGroups self = new GetProblemResponseBodyDataCoordinationGroups();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyDataCoordinationGroups setIsValid(Long isValid) {
            this.isValid = isValid;
            return this;
        }
        public Long getIsValid() {
            return this.isValid;
        }

        public GetProblemResponseBodyDataCoordinationGroups setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public GetProblemResponseBodyDataCoordinationGroups setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

    }

    public static class GetProblemResponseBodyDataEffectionServices extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("effectionLevel")
        public Long effectionLevel;

        @NameInMap("effectionServiceId")
        public Long effectionServiceId;

        @NameInMap("effectionStatus")
        public Integer effectionStatus;

        @NameInMap("serviceDeleteType")
        public Integer serviceDeleteType;

        @NameInMap("serviceName")
        public String serviceName;

        public static GetProblemResponseBodyDataEffectionServices build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataEffectionServices self = new GetProblemResponseBodyDataEffectionServices();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyDataEffectionServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProblemResponseBodyDataEffectionServices setEffectionLevel(Long effectionLevel) {
            this.effectionLevel = effectionLevel;
            return this;
        }
        public Long getEffectionLevel() {
            return this.effectionLevel;
        }

        public GetProblemResponseBodyDataEffectionServices setEffectionServiceId(Long effectionServiceId) {
            this.effectionServiceId = effectionServiceId;
            return this;
        }
        public Long getEffectionServiceId() {
            return this.effectionServiceId;
        }

        public GetProblemResponseBodyDataEffectionServices setEffectionStatus(Integer effectionStatus) {
            this.effectionStatus = effectionStatus;
            return this;
        }
        public Integer getEffectionStatus() {
            return this.effectionStatus;
        }

        public GetProblemResponseBodyDataEffectionServices setServiceDeleteType(Integer serviceDeleteType) {
            this.serviceDeleteType = serviceDeleteType;
            return this;
        }
        public Integer getServiceDeleteType() {
            return this.serviceDeleteType;
        }

        public GetProblemResponseBodyDataEffectionServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetProblemResponseBodyDataHandingProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        public String actionName;

        @NameInMap("actionTime")
        public String actionTime;

        @NameInMap("operator")
        public String operator;

        @NameInMap("userId")
        public Long userId;

        @NameInMap("userIsValid")
        public Long userIsValid;

        public static GetProblemResponseBodyDataHandingProblemOperateLogs build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataHandingProblemOperateLogs self = new GetProblemResponseBodyDataHandingProblemOperateLogs();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyDataHandingProblemOperateLogs setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public GetProblemResponseBodyDataHandingProblemOperateLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public GetProblemResponseBodyDataHandingProblemOperateLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetProblemResponseBodyDataHandingProblemOperateLogs setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetProblemResponseBodyDataHandingProblemOperateLogs setUserIsValid(Long userIsValid) {
            this.userIsValid = userIsValid;
            return this;
        }
        public Long getUserIsValid() {
            return this.userIsValid;
        }

    }

    public static class GetProblemResponseBodyDataReplayProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        public String actionName;

        @NameInMap("actionTime")
        public String actionTime;

        @NameInMap("operator")
        public String operator;

        @NameInMap("userId")
        public Long userId;

        @NameInMap("userIsValid")
        public Long userIsValid;

        public static GetProblemResponseBodyDataReplayProblemOperateLogs build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataReplayProblemOperateLogs self = new GetProblemResponseBodyDataReplayProblemOperateLogs();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyDataReplayProblemOperateLogs setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public GetProblemResponseBodyDataReplayProblemOperateLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public GetProblemResponseBodyDataReplayProblemOperateLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetProblemResponseBodyDataReplayProblemOperateLogs setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetProblemResponseBodyDataReplayProblemOperateLogs setUserIsValid(Long userIsValid) {
            this.userIsValid = userIsValid;
            return this;
        }
        public Long getUserIsValid() {
            return this.userIsValid;
        }

    }

    public static class GetProblemResponseBodyDataReplayingProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        public String actionName;

        @NameInMap("actionTime")
        public String actionTime;

        @NameInMap("operator")
        public String operator;

        @NameInMap("userId")
        public Long userId;

        @NameInMap("userIsValid")
        public Long userIsValid;

        public static GetProblemResponseBodyDataReplayingProblemOperateLogs build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataReplayingProblemOperateLogs self = new GetProblemResponseBodyDataReplayingProblemOperateLogs();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyDataReplayingProblemOperateLogs setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public GetProblemResponseBodyDataReplayingProblemOperateLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public GetProblemResponseBodyDataReplayingProblemOperateLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetProblemResponseBodyDataReplayingProblemOperateLogs setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetProblemResponseBodyDataReplayingProblemOperateLogs setUserIsValid(Long userIsValid) {
            this.userIsValid = userIsValid;
            return this;
        }
        public Long getUserIsValid() {
            return this.userIsValid;
        }

    }

    public static class GetProblemResponseBodyDataRestoredProblemOperateLogs extends TeaModel {
        @NameInMap("actionName")
        public String actionName;

        @NameInMap("actionTime")
        public String actionTime;

        @NameInMap("operator")
        public String operator;

        @NameInMap("userId")
        public Long userId;

        @NameInMap("userIsValid")
        public Long userIsValid;

        public static GetProblemResponseBodyDataRestoredProblemOperateLogs build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataRestoredProblemOperateLogs self = new GetProblemResponseBodyDataRestoredProblemOperateLogs();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyDataRestoredProblemOperateLogs setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public GetProblemResponseBodyDataRestoredProblemOperateLogs setActionTime(String actionTime) {
            this.actionTime = actionTime;
            return this;
        }
        public String getActionTime() {
            return this.actionTime;
        }

        public GetProblemResponseBodyDataRestoredProblemOperateLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetProblemResponseBodyDataRestoredProblemOperateLogs setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetProblemResponseBodyDataRestoredProblemOperateLogs setUserIsValid(Long userIsValid) {
            this.userIsValid = userIsValid;
            return this;
        }
        public Long getUserIsValid() {
            return this.userIsValid;
        }

    }

    public static class GetProblemResponseBodyDataTimelines extends TeaModel {
        @NameInMap("keyNode")
        public String keyNode;

        public static GetProblemResponseBodyDataTimelines build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataTimelines self = new GetProblemResponseBodyDataTimelines();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyDataTimelines setKeyNode(String keyNode) {
            this.keyNode = keyNode;
            return this;
        }
        public String getKeyNode() {
            return this.keyNode;
        }

    }

    public static class GetProblemResponseBodyData extends TeaModel {
        @NameInMap("cancelProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataCancelProblemOperateLogs> cancelProblemOperateLogs;

        @NameInMap("cancelReason")
        public Long cancelReason;

        @NameInMap("cancelReasonDescription")
        public String cancelReasonDescription;

        @NameInMap("coordinationGroups")
        public java.util.List<GetProblemResponseBodyDataCoordinationGroups> coordinationGroups;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("discoverTime")
        public String discoverTime;

        @NameInMap("durationTime")
        public Long durationTime;

        @NameInMap("effectionServices")
        public java.util.List<GetProblemResponseBodyDataEffectionServices> effectionServices;

        @NameInMap("feedback")
        public String feedback;

        @NameInMap("handingProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataHandingProblemOperateLogs> handingProblemOperateLogs;

        @NameInMap("incidentId")
        public Long incidentId;

        @NameInMap("incidentNumber")
        public String incidentNumber;

        @NameInMap("isRuleTrigger")
        public Boolean isRuleTrigger;

        @NameInMap("mainHandler")
        public Long mainHandler;

        @NameInMap("mainHandlerId")
        public Long mainHandlerId;

        @NameInMap("mainHandlerIsValid")
        public Long mainHandlerIsValid;

        @NameInMap("mainHandlerPhone")
        public String mainHandlerPhone;

        @NameInMap("preliminaryReason")
        public String preliminaryReason;

        /**
         * <p>ID</p>
         */
        @NameInMap("problemId")
        public Long problemId;

        @NameInMap("problemLevel")
        public Integer problemLevel;

        @NameInMap("problemName")
        public String problemName;

        @NameInMap("problemNumber")
        public String problemNumber;

        @NameInMap("problemStatus")
        public Integer problemStatus;

        @NameInMap("progressSummary")
        public String progressSummary;

        @NameInMap("progressSummaryRichTextId")
        public Long progressSummaryRichTextId;

        @NameInMap("recoveryTime")
        public String recoveryTime;

        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        @NameInMap("replayProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataReplayProblemOperateLogs> replayProblemOperateLogs;

        @NameInMap("replayingProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataReplayingProblemOperateLogs> replayingProblemOperateLogs;

        @NameInMap("restoredProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataRestoredProblemOperateLogs> restoredProblemOperateLogs;

        /**
         * <p>serviceDeleteType</p>
         */
        @NameInMap("serviceDeleteType")
        public Integer serviceDeleteType;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("timelines")
        public java.util.List<GetProblemResponseBodyDataTimelines> timelines;

        public static GetProblemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyData self = new GetProblemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProblemResponseBodyData setCancelProblemOperateLogs(java.util.List<GetProblemResponseBodyDataCancelProblemOperateLogs> cancelProblemOperateLogs) {
            this.cancelProblemOperateLogs = cancelProblemOperateLogs;
            return this;
        }
        public java.util.List<GetProblemResponseBodyDataCancelProblemOperateLogs> getCancelProblemOperateLogs() {
            return this.cancelProblemOperateLogs;
        }

        public GetProblemResponseBodyData setCancelReason(Long cancelReason) {
            this.cancelReason = cancelReason;
            return this;
        }
        public Long getCancelReason() {
            return this.cancelReason;
        }

        public GetProblemResponseBodyData setCancelReasonDescription(String cancelReasonDescription) {
            this.cancelReasonDescription = cancelReasonDescription;
            return this;
        }
        public String getCancelReasonDescription() {
            return this.cancelReasonDescription;
        }

        public GetProblemResponseBodyData setCoordinationGroups(java.util.List<GetProblemResponseBodyDataCoordinationGroups> coordinationGroups) {
            this.coordinationGroups = coordinationGroups;
            return this;
        }
        public java.util.List<GetProblemResponseBodyDataCoordinationGroups> getCoordinationGroups() {
            return this.coordinationGroups;
        }

        public GetProblemResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProblemResponseBodyData setDiscoverTime(String discoverTime) {
            this.discoverTime = discoverTime;
            return this;
        }
        public String getDiscoverTime() {
            return this.discoverTime;
        }

        public GetProblemResponseBodyData setDurationTime(Long durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public Long getDurationTime() {
            return this.durationTime;
        }

        public GetProblemResponseBodyData setEffectionServices(java.util.List<GetProblemResponseBodyDataEffectionServices> effectionServices) {
            this.effectionServices = effectionServices;
            return this;
        }
        public java.util.List<GetProblemResponseBodyDataEffectionServices> getEffectionServices() {
            return this.effectionServices;
        }

        public GetProblemResponseBodyData setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public GetProblemResponseBodyData setHandingProblemOperateLogs(java.util.List<GetProblemResponseBodyDataHandingProblemOperateLogs> handingProblemOperateLogs) {
            this.handingProblemOperateLogs = handingProblemOperateLogs;
            return this;
        }
        public java.util.List<GetProblemResponseBodyDataHandingProblemOperateLogs> getHandingProblemOperateLogs() {
            return this.handingProblemOperateLogs;
        }

        public GetProblemResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

        public GetProblemResponseBodyData setIncidentNumber(String incidentNumber) {
            this.incidentNumber = incidentNumber;
            return this;
        }
        public String getIncidentNumber() {
            return this.incidentNumber;
        }

        public GetProblemResponseBodyData setIsRuleTrigger(Boolean isRuleTrigger) {
            this.isRuleTrigger = isRuleTrigger;
            return this;
        }
        public Boolean getIsRuleTrigger() {
            return this.isRuleTrigger;
        }

        public GetProblemResponseBodyData setMainHandler(Long mainHandler) {
            this.mainHandler = mainHandler;
            return this;
        }
        public Long getMainHandler() {
            return this.mainHandler;
        }

        public GetProblemResponseBodyData setMainHandlerId(Long mainHandlerId) {
            this.mainHandlerId = mainHandlerId;
            return this;
        }
        public Long getMainHandlerId() {
            return this.mainHandlerId;
        }

        public GetProblemResponseBodyData setMainHandlerIsValid(Long mainHandlerIsValid) {
            this.mainHandlerIsValid = mainHandlerIsValid;
            return this;
        }
        public Long getMainHandlerIsValid() {
            return this.mainHandlerIsValid;
        }

        public GetProblemResponseBodyData setMainHandlerPhone(String mainHandlerPhone) {
            this.mainHandlerPhone = mainHandlerPhone;
            return this;
        }
        public String getMainHandlerPhone() {
            return this.mainHandlerPhone;
        }

        public GetProblemResponseBodyData setPreliminaryReason(String preliminaryReason) {
            this.preliminaryReason = preliminaryReason;
            return this;
        }
        public String getPreliminaryReason() {
            return this.preliminaryReason;
        }

        public GetProblemResponseBodyData setProblemId(Long problemId) {
            this.problemId = problemId;
            return this;
        }
        public Long getProblemId() {
            return this.problemId;
        }

        public GetProblemResponseBodyData setProblemLevel(Integer problemLevel) {
            this.problemLevel = problemLevel;
            return this;
        }
        public Integer getProblemLevel() {
            return this.problemLevel;
        }

        public GetProblemResponseBodyData setProblemName(String problemName) {
            this.problemName = problemName;
            return this;
        }
        public String getProblemName() {
            return this.problemName;
        }

        public GetProblemResponseBodyData setProblemNumber(String problemNumber) {
            this.problemNumber = problemNumber;
            return this;
        }
        public String getProblemNumber() {
            return this.problemNumber;
        }

        public GetProblemResponseBodyData setProblemStatus(Integer problemStatus) {
            this.problemStatus = problemStatus;
            return this;
        }
        public Integer getProblemStatus() {
            return this.problemStatus;
        }

        public GetProblemResponseBodyData setProgressSummary(String progressSummary) {
            this.progressSummary = progressSummary;
            return this;
        }
        public String getProgressSummary() {
            return this.progressSummary;
        }

        public GetProblemResponseBodyData setProgressSummaryRichTextId(Long progressSummaryRichTextId) {
            this.progressSummaryRichTextId = progressSummaryRichTextId;
            return this;
        }
        public Long getProgressSummaryRichTextId() {
            return this.progressSummaryRichTextId;
        }

        public GetProblemResponseBodyData setRecoveryTime(String recoveryTime) {
            this.recoveryTime = recoveryTime;
            return this;
        }
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public GetProblemResponseBodyData setRelatedServiceId(Long relatedServiceId) {
            this.relatedServiceId = relatedServiceId;
            return this;
        }
        public Long getRelatedServiceId() {
            return this.relatedServiceId;
        }

        public GetProblemResponseBodyData setReplayProblemOperateLogs(java.util.List<GetProblemResponseBodyDataReplayProblemOperateLogs> replayProblemOperateLogs) {
            this.replayProblemOperateLogs = replayProblemOperateLogs;
            return this;
        }
        public java.util.List<GetProblemResponseBodyDataReplayProblemOperateLogs> getReplayProblemOperateLogs() {
            return this.replayProblemOperateLogs;
        }

        public GetProblemResponseBodyData setReplayingProblemOperateLogs(java.util.List<GetProblemResponseBodyDataReplayingProblemOperateLogs> replayingProblemOperateLogs) {
            this.replayingProblemOperateLogs = replayingProblemOperateLogs;
            return this;
        }
        public java.util.List<GetProblemResponseBodyDataReplayingProblemOperateLogs> getReplayingProblemOperateLogs() {
            return this.replayingProblemOperateLogs;
        }

        public GetProblemResponseBodyData setRestoredProblemOperateLogs(java.util.List<GetProblemResponseBodyDataRestoredProblemOperateLogs> restoredProblemOperateLogs) {
            this.restoredProblemOperateLogs = restoredProblemOperateLogs;
            return this;
        }
        public java.util.List<GetProblemResponseBodyDataRestoredProblemOperateLogs> getRestoredProblemOperateLogs() {
            return this.restoredProblemOperateLogs;
        }

        public GetProblemResponseBodyData setServiceDeleteType(Integer serviceDeleteType) {
            this.serviceDeleteType = serviceDeleteType;
            return this;
        }
        public Integer getServiceDeleteType() {
            return this.serviceDeleteType;
        }

        public GetProblemResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetProblemResponseBodyData setTimelines(java.util.List<GetProblemResponseBodyDataTimelines> timelines) {
            this.timelines = timelines;
            return this;
        }
        public java.util.List<GetProblemResponseBodyDataTimelines> getTimelines() {
            return this.timelines;
        }

    }

}
