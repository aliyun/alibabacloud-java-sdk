// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetChangeOrderInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("changeOrderInfo")
    public GetChangeOrderInfoResponseBodyChangeOrderInfo changeOrderInfo;

    public static GetChangeOrderInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderInfoResponseBody self = new GetChangeOrderInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChangeOrderInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChangeOrderInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetChangeOrderInfoResponseBody setChangeOrderInfo(GetChangeOrderInfoResponseBodyChangeOrderInfo changeOrderInfo) {
        this.changeOrderInfo = changeOrderInfo;
        return this;
    }
    public GetChangeOrderInfoResponseBodyChangeOrderInfo getChangeOrderInfo() {
        return this.changeOrderInfo;
    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl extends TeaModel {
        @NameInMap("Tips")
        public String tips;

        @NameInMap("Routes")
        public String routes;

        @NameInMap("Rules")
        public String rules;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl self = new GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl setRoutes(String routes) {
            this.routes = routes;
            return this;
        }
        public String getRoutes() {
            return this.routes;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl setRules(String rules) {
            this.rules = rules;
            return this;
        }
        public String getRules() {
            return this.rules;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO extends TeaModel {
        @NameInMap("TaskErrorIgnorance")
        public Integer taskErrorIgnorance;

        @NameInMap("ShowManualIgnorance")
        public Boolean showManualIgnorance;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskMessage")
        public String taskMessage;

        @NameInMap("TaskErrorCode")
        public String taskErrorCode;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskErrorIgnorance(Integer taskErrorIgnorance) {
            this.taskErrorIgnorance = taskErrorIgnorance;
            return this;
        }
        public Integer getTaskErrorIgnorance() {
            return this.taskErrorIgnorance;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setShowManualIgnorance(Boolean showManualIgnorance) {
            this.showManualIgnorance = showManualIgnorance;
            return this;
        }
        public Boolean getShowManualIgnorance() {
            return this.showManualIgnorance;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }
        public String getTaskMessage() {
            return this.taskMessage;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
            return this;
        }
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList extends TeaModel {
        @NameInMap("TaskInfoDTO")
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO> taskInfoDTO;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList setTaskInfoDTO(java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO> taskInfoDTO) {
            this.taskInfoDTO = taskInfoDTO;
            return this;
        }
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO> getTaskInfoDTO() {
            return this.taskInfoDTO;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO extends TeaModel {
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("StageStatus")
        public Integer stageStatus;

        @NameInMap("TaskList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList taskList;

        @NameInMap("StageName")
        public String stageName;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO setStageStatus(Integer stageStatus) {
            this.stageStatus = stageStatus;
            return this;
        }
        public Integer getStageStatus() {
            return this.stageStatus;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO setTaskList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList taskList) {
            this.taskList = taskList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList getTaskList() {
            return this.taskList;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList extends TeaModel {
        @NameInMap("StageDetailDTO")
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO> stageDetailDTO;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList setStageDetailDTO(java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO> stageDetailDTO) {
            this.stageDetailDTO = stageDetailDTO;
            return this;
        }
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO> getStageDetailDTO() {
            return this.stageDetailDTO;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage extends TeaModel {
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Message")
        public String message;

        @NameInMap("StageName")
        public String stageName;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO extends TeaModel {
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StageMessage")
        public String stageMessage;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("StageName")
        public String stageName;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStageMessage(String stageMessage) {
            this.stageMessage = stageMessage;
            return this;
        }
        public String getStageMessage() {
            return this.stageMessage;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList extends TeaModel {
        @NameInMap("InstanceStageDTO")
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO> instanceStageDTO;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList setInstanceStageDTO(java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO> instanceStageDTO) {
            this.instanceStageDTO = instanceStageDTO;
            return this;
        }
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO> getInstanceStageDTO() {
            return this.instanceStageDTO;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("InstanceIp")
        public String instanceIp;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("InstanceStageDTOList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList instanceStageDTOList;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("PodStatus")
        public String podStatus;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setInstanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }
        public String getInstanceIp() {
            return this.instanceIp;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setInstanceStageDTOList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList instanceStageDTOList) {
            this.instanceStageDTOList = instanceStageDTOList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList getInstanceStageDTOList() {
            return this.instanceStageDTOList;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setPodStatus(String podStatus) {
            this.podStatus = podStatus;
            return this;
        }
        public String getPodStatus() {
            return this.podStatus;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList extends TeaModel {
        @NameInMap("InstanceDTO")
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO> instanceDTO;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList setInstanceDTO(java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO> instanceDTO) {
            this.instanceDTO = instanceDTO;
            return this;
        }
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO> getInstanceDTO() {
            return this.instanceDTO;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO extends TeaModel {
        @NameInMap("ServiceStage")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage serviceStage;

        @NameInMap("InstanceDTOList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList instanceDTOList;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO setServiceStage(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage serviceStage) {
            this.serviceStage = serviceStage;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage getServiceStage() {
            return this.serviceStage;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO setInstanceDTOList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList instanceDTOList) {
            this.instanceDTOList = instanceDTOList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList getInstanceDTOList() {
            return this.instanceDTOList;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO extends TeaModel {
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StageResultDTO")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO stageResultDTO;

        @NameInMap("StageName")
        public String stageName;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO setStageResultDTO(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO stageResultDTO) {
            this.stageResultDTO = stageResultDTO;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO getStageResultDTO() {
            return this.stageResultDTO;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList extends TeaModel {
        @NameInMap("StageInfoDTO")
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO> stageInfoDTO;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList setStageInfoDTO(java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO> stageInfoDTO) {
            this.stageInfoDTO = stageInfoDTO;
            return this;
        }
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO> getStageInfoDTO() {
            return this.stageInfoDTO;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("PipelineStatus")
        public Integer pipelineStatus;

        @NameInMap("StageDetailList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList stageDetailList;

        @NameInMap("PipelineName")
        public String pipelineName;

        @NameInMap("StageList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList stageList;

        @NameInMap("PipelineId")
        public String pipelineId;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setPipelineStatus(Integer pipelineStatus) {
            this.pipelineStatus = pipelineStatus;
            return this;
        }
        public Integer getPipelineStatus() {
            return this.pipelineStatus;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setStageDetailList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList stageDetailList) {
            this.stageDetailList = stageDetailList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList getStageDetailList() {
            return this.stageDetailList;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setStageList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList stageList) {
            this.stageList = stageList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList getStageList() {
            return this.stageList;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList extends TeaModel {
        @NameInMap("PipelineInfo")
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo> pipelineInfo;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList setPipelineInfo(java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo> pipelineInfo) {
            this.pipelineInfo = pipelineInfo;
            return this;
        }
        public java.util.List<GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo> getPipelineInfo() {
            return this.pipelineInfo;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfo extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ChangeOrderDescription")
        public String changeOrderDescription;

        @NameInMap("BatchCount")
        public Integer batchCount;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("SupportRollback")
        public Boolean supportRollback;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("BatchType")
        public String batchType;

        @NameInMap("CoType")
        public String coType;

        @NameInMap("TrafficControl")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl trafficControl;

        @NameInMap("PipelineInfoList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList pipelineInfoList;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfo self = new GetChangeOrderInfoResponseBodyChangeOrderInfo();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setChangeOrderDescription(String changeOrderDescription) {
            this.changeOrderDescription = changeOrderDescription;
            return this;
        }
        public String getChangeOrderDescription() {
            return this.changeOrderDescription;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setSupportRollback(Boolean supportRollback) {
            this.supportRollback = supportRollback;
            return this;
        }
        public Boolean getSupportRollback() {
            return this.supportRollback;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setTrafficControl(GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl trafficControl) {
            this.trafficControl = trafficControl;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl getTrafficControl() {
            return this.trafficControl;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setPipelineInfoList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList pipelineInfoList) {
            this.pipelineInfoList = pipelineInfoList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList getPipelineInfoList() {
            return this.pipelineInfoList;
        }

    }

}
