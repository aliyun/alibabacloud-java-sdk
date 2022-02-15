// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemResponseBody extends TeaModel {
    // 详情
    @NameInMap("data")
    public GetProblemResponseBodyData data;

    // 请求ID
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
        // 动作名称
        @NameInMap("actionName")
        public String actionName;

        // 操作时间
        @NameInMap("actionTime")
        public String actionTime;

        // 操作人
        @NameInMap("operator")
        public String operator;

        // 用户ID
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
        // 服务组ID
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 服务组名字
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        public static GetProblemResponseBodyDataCoordinationGroups build(java.util.Map<String, ?> map) throws Exception {
            GetProblemResponseBodyDataCoordinationGroups self = new GetProblemResponseBodyDataCoordinationGroups();
            return TeaModel.build(map, self);
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
        // 影响描述
        @NameInMap("description")
        public String description;

        // 影响等级 P1 . P2 P3 P4
        @NameInMap("effectionLevel")
        public Long effectionLevel;

        // 服务ID
        @NameInMap("effectionServiceId")
        public Long effectionServiceId;

        // 影响服务状态  RECOVERED 已经恢复 ,UN_RECOVERED 未恢复
        @NameInMap("effectionStatus")
        public Integer effectionStatus;

        // 服务名称
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

        public GetProblemResponseBodyDataEffectionServices setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetProblemResponseBodyDataHandingProblemOperateLogs extends TeaModel {
        // 动作名称
        @NameInMap("actionName")
        public String actionName;

        // 操作时间
        @NameInMap("actionTime")
        public String actionTime;

        // 操作人
        @NameInMap("operator")
        public String operator;

        // 用户id
        @NameInMap("userId")
        public Long userId;

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

    }

    public static class GetProblemResponseBodyDataReplayProblemOperateLogs extends TeaModel {
        // 动作名称
        @NameInMap("actionName")
        public String actionName;

        // 操作时间
        @NameInMap("actionTime")
        public String actionTime;

        // 操作人
        @NameInMap("operator")
        public String operator;

        // 用户id
        @NameInMap("userId")
        public Long userId;

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

    }

    public static class GetProblemResponseBodyDataReplayingProblemOperateLogs extends TeaModel {
        // 动作名称
        @NameInMap("actionName")
        public String actionName;

        // 操作时间
        @NameInMap("actionTime")
        public String actionTime;

        // 操作人
        @NameInMap("operator")
        public String operator;

        // 用户id
        @NameInMap("userId")
        public Long userId;

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

    }

    public static class GetProblemResponseBodyDataRestoredProblemOperateLogs extends TeaModel {
        // 动作名称
        @NameInMap("actionName")
        public String actionName;

        // 操作时间
        @NameInMap("actionTime")
        public String actionTime;

        // 操作人
        @NameInMap("operator")
        public String operator;

        // 用户id
        @NameInMap("userId")
        public Long userId;

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

    }

    public static class GetProblemResponseBodyDataTimelines extends TeaModel {
        // 关键节点 码表:PROBLEM_KEY_NODE (逗号分隔)
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
        // 已取消故障操作日志
        @NameInMap("cancelProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataCancelProblemOperateLogs> cancelProblemOperateLogs;

        // 取消原因
        @NameInMap("cancelReason")
        public Long cancelReason;

        // 取消原因描述
        @NameInMap("cancelReasonDescription")
        public String cancelReasonDescription;

        // 应急协同组
        @NameInMap("coordinationGroups")
        public java.util.List<GetProblemResponseBodyDataCoordinationGroups> coordinationGroups;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 发现时间
        @NameInMap("discoverTime")
        public String discoverTime;

        // 持续时间
        @NameInMap("durationTime")
        public Long durationTime;

        // 影响服务
        @NameInMap("effectionServices")
        public java.util.List<GetProblemResponseBodyDataEffectionServices> effectionServices;

        // 舆情反馈
        @NameInMap("feedback")
        public String feedback;

        // 处理中故障操作日志
        @NameInMap("handingProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataHandingProblemOperateLogs> handingProblemOperateLogs;

        // 事件id
        @NameInMap("incidentId")
        public Long incidentId;

        // 事件编号
        @NameInMap("incidentNumber")
        public String incidentNumber;

        // 主要处理人
        @NameInMap("mainHandler")
        public Long mainHandler;

        // 主要处理人ID
        @NameInMap("mainHandlerId")
        public Long mainHandlerId;

        // 主要处理人手机号
        @NameInMap("mainHandlerPhone")
        public String mainHandlerPhone;

        // 初步原因
        @NameInMap("preliminaryReason")
        public String preliminaryReason;

        // ID
        @NameInMap("problemId")
        public Long problemId;

        // 故障等级 P1 P2 P3 P4
        @NameInMap("problemLevel")
        public Integer problemLevel;

        // 故障名称
        @NameInMap("problemName")
        public String problemName;

        // 故障编号
        @NameInMap("problemNumber")
        public String problemNumber;

        // 故障状态  HANDLING    处理中 RECOVERED  已恢复  REPLAYING   复盘中  REPLAYED     已复盘 CANCEL        已取消
        @NameInMap("problemStatus")
        public Integer problemStatus;

        // 进展摘要
        @NameInMap("progressSummary")
        public String progressSummary;

        // 进展摘要富文本id
        @NameInMap("progressSummaryRichTextId")
        public Long progressSummaryRichTextId;

        // 恢复时间
        @NameInMap("recoveryTime")
        public String recoveryTime;

        // 关联服务ID
        @NameInMap("relatedServiceId")
        public Long relatedServiceId;

        // 已复盘故障操作日志
        @NameInMap("replayProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataReplayProblemOperateLogs> replayProblemOperateLogs;

        // 复盘中故障操作日志
        @NameInMap("replayingProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataReplayingProblemOperateLogs> replayingProblemOperateLogs;

        // 已恢复故障操作日志
        @NameInMap("restoredProblemOperateLogs")
        public java.util.List<GetProblemResponseBodyDataRestoredProblemOperateLogs> restoredProblemOperateLogs;

        // 关联服务 名称
        @NameInMap("serviceName")
        public String serviceName;

        // 故障操作时间线
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
