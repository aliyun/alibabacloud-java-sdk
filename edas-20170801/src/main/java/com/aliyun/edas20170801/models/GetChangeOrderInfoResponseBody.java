// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetChangeOrderInfoResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details about the change process.</p>
     */
    @NameInMap("changeOrderInfo")
    public GetChangeOrderInfoResponseBodyChangeOrderInfo changeOrderInfo;

    public static GetChangeOrderInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChangeOrderInfoResponseBody self = new GetChangeOrderInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChangeOrderInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
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

    public GetChangeOrderInfoResponseBody setChangeOrderInfo(GetChangeOrderInfoResponseBodyChangeOrderInfo changeOrderInfo) {
        this.changeOrderInfo = changeOrderInfo;
        return this;
    }
    public GetChangeOrderInfoResponseBodyChangeOrderInfo getChangeOrderInfo() {
        return this.changeOrderInfo;
    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO extends TeaModel {
        /**
         * <p>The type of the retry policy. Value 0 indicates no retry, value 1 indicates automatic retry, and value 2 indicates manual retry.</p>
         */
        @NameInMap("RetryType")
        public Integer retryType;

        /**
         * <p>Indicates whether errors that occur in the change process are ignored. Valid values:``</p>
         * <br>
         * <p>*   true: Errors that occur in the change process are ignored. This parameter can be set to true only when URL health checks are performed.</p>
         * <p>*   false: Errors that occur in the change process are not ignored.</p>
         */
        @NameInMap("ShowManualIgnorance")
        public Boolean showManualIgnorance;

        /**
         * <p>Error codes</p>
         */
        @NameInMap("TaskErrorCode")
        public String taskErrorCode;

        /**
         * <p>Indicates whether the task is error-tolerant. If the task can tolerate errors, the errors that occur in the change process are ignored and the next task is executed.</p>
         * <br>
         * <p>*   0: The task is not error-tolerant.</p>
         * <p>*   1: The task is error-tolerant.</p>
         */
        @NameInMap("TaskErrorIgnorance")
        public Integer taskErrorIgnorance;

        /**
         * <p>The error message for the task.</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Task information</p>
         */
        @NameInMap("TaskMessage")
        public String taskMessage;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The state of the task. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   8: wait for manual confirmation to trigger the next batch during a manual phased release</p>
         * <p>*   9: wait to trigger the next batch during an automatic phased release</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setRetryType(Integer retryType) {
            this.retryType = retryType;
            return this;
        }
        public Integer getRetryType() {
            return this.retryType;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setShowManualIgnorance(Boolean showManualIgnorance) {
            this.showManualIgnorance = showManualIgnorance;
            return this;
        }
        public Boolean getShowManualIgnorance() {
            return this.showManualIgnorance;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
            return this;
        }
        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskErrorIgnorance(Integer taskErrorIgnorance) {
            this.taskErrorIgnorance = taskErrorIgnorance;
            return this;
        }
        public Integer getTaskErrorIgnorance() {
            return this.taskErrorIgnorance;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }
        public String getTaskMessage() {
            return this.taskMessage;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskListTaskInfoDTO setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
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
        /**
         * <p>The ID of the stage.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The name of the stage.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The status of the stage. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   8: wait for manual confirmation to trigger the next batch during a manual phased release</p>
         * <p>*   9: wait to trigger the next batch during an automatic phased release</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("StageStatus")
        public Integer stageStatus;

        /**
         * <p>The information about the task.</p>
         */
        @NameInMap("TaskList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTOTaskList taskList;

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

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailListStageDetailDTO setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
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

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO extends TeaModel {
        /**
         * <p>The time when the execution stopped.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The ID of the stage.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The information about the stage.</p>
         */
        @NameInMap("StageMessage")
        public String stageMessage;

        /**
         * <p>The name of the stage.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The time when the execution was started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the stage. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   8: wait for manual confirmation to trigger the next batch during a manual phased release</p>
         * <p>*   9: wait to trigger the next batch during an automatic phased release</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStageMessage(String stageMessage) {
            this.stageMessage = stageMessage;
            return this;
        }
        public String getStageMessage() {
            return this.stageMessage;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOListInstanceStageDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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
        /**
         * <p>The IP address of the ECS instance.</p>
         */
        @NameInMap("InstanceIp")
        public String instanceIp;

        /**
         * <p>The name of the ECS instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The results of the task executed on the ECS instance in each stage.</p>
         */
        @NameInMap("InstanceStageDTOList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList instanceStageDTOList;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>The state of the pod.</p>
         */
        @NameInMap("PodStatus")
        public String podStatus;

        /**
         * <p>The running state. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   8: wait for manual confirmation to trigger the next batch during a manual phased release</p>
         * <p>*   9: wait to trigger the next batch during an automatic phased release</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setInstanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }
        public String getInstanceIp() {
            return this.instanceIp;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setInstanceStageDTOList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList instanceStageDTOList) {
            this.instanceStageDTOList = instanceStageDTOList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTOInstanceStageDTOList getInstanceStageDTOList() {
            return this.instanceStageDTOList;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setPodStatus(String podStatus) {
            this.podStatus = podStatus;
            return this;
        }
        public String getPodStatus() {
            return this.podStatus;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOListInstanceDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage extends TeaModel {
        /**
         * <p>The execution result in the stage.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the stage.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>Phase Name</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The running state. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   8: wait for manual confirmation to trigger the next batch during a manual phased release</p>
         * <p>*   9: wait to trigger the next batch during an automatic phased release</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO extends TeaModel {
        /**
         * <p>The results of the task executed on each Elastic Compute Service (ECS) instance in each stage.</p>
         */
        @NameInMap("InstanceDTOList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList instanceDTOList;

        /**
         * <p>The results of tasks executed in each service-oriented stage.</p>
         */
        @NameInMap("ServiceStage")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage serviceStage;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO setInstanceDTOList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList instanceDTOList) {
            this.instanceDTOList = instanceDTOList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOInstanceDTOList getInstanceDTOList() {
            return this.instanceDTOList;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO setServiceStage(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage serviceStage) {
            this.serviceStage = serviceStage;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTOServiceStage getServiceStage() {
            return this.serviceStage;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO extends TeaModel {
        /**
         * <p>The ID of the stage.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The name of the stage.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The results of the task executed in the stage.</p>
         */
        @NameInMap("StageResultDTO")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO stageResultDTO;

        /**
         * <p>The state of the stage. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   8: wait for manual confirmation to trigger the next batch during a manual phased release</p>
         * <p>*   9: wait to trigger the next batch during an automatic phased release</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("Status")
        public Integer status;

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

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO setStageResultDTO(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO stageResultDTO) {
            this.stageResultDTO = stageResultDTO;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTOStageResultDTO getStageResultDTO() {
            return this.stageResultDTO;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageListStageInfoDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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
        /**
         * <p>The ID of each batch for the change during the phased release.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The name of the batch.</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>The state of the change task. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   8: wait for manual confirmation to trigger the next batch during a manual phased release</p>
         * <p>*   9: wait to trigger the next batch during an automatic phased release</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("PipelineStatus")
        public Integer pipelineStatus;

        /**
         * <p>The execution results in each stage.</p>
         */
        @NameInMap("StageDetailList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageDetailList stageDetailList;

        /**
         * <p>The stages of the change process.</p>
         */
        @NameInMap("StageList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList stageList;

        /**
         * <p>The time when the change task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time when the change task was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo self = new GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
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

        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfo setStageList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList stageList) {
            this.stageList = stageList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoListPipelineInfoStageList getStageList() {
            return this.stageList;
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

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoTargets extends TeaModel {
        @NameInMap("Items")
        public java.util.List<String> items;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoTargets build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoTargets self = new GetChangeOrderInfoResponseBodyChangeOrderInfoTargets();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfoTargets setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl extends TeaModel {
        /**
         * <p>The route forwarding policy.</p>
         */
        @NameInMap("Routes")
        public String routes;

        /**
         * <p>The traffic routing rules.</p>
         */
        @NameInMap("Rules")
        public String rules;

        /**
         * <p>The description of throttling rules.</p>
         */
        @NameInMap("Tips")
        public String tips;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl self = new GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl();
            return TeaModel.build(map, self);
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

        public GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class GetChangeOrderInfoResponseBodyChangeOrderInfo extends TeaModel {
        /**
         * <p>The number of batches for the change.</p>
         */
        @NameInMap("BatchCount")
        public Integer batchCount;

        /**
         * <p>Indicates whether the change for the next batch is automatically or manually triggered when phased release is performed. Valid values:</p>
         * <br>
         * <p>*   Automatic: The change for the next batch is automatically triggered.</p>
         * <p>*   Manual: The change for the next batch is manually triggered.</p>
         */
        @NameInMap("BatchType")
        public String batchType;

        /**
         * <p>The description of the change process.</p>
         */
        @NameInMap("ChangeOrderDescription")
        public String changeOrderDescription;

        /**
         * <p>The ID of the change process.</p>
         */
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        /**
         * <p>The type of the change process.</p>
         */
        @NameInMap("CoType")
        public String coType;

        /**
         * <p>The time when the change process is created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The person in charge of the change process.</p>
         */
        @NameInMap("CreateUserId")
        public String createUserId;

        /**
         * <p>The description of the change process.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The information about the batches of the change task.</p>
         */
        @NameInMap("PipelineInfoList")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList pipelineInfoList;

        /**
         * <p>The state of the change process. Valid values:</p>
         * <br>
         * <p>*   0: ready</p>
         * <p>*   1: in progress</p>
         * <p>*   2: successful</p>
         * <p>*   3: failed</p>
         * <p>*   6: terminated</p>
         * <p>*   7: partially executed</p>
         * <p>*   8: wait for manual confirmation to trigger the next batch during a manual phased release</p>
         * <p>*   9: wait to trigger the next batch during an automatic phased release</p>
         * <p>*   10: failed due to a system exception</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether rollbacks are allowed. Valid values:</p>
         * <br>
         * <p>*   true: Rollbacks are allowed.</p>
         * <p>*   false: Rollbacks are not allowed.</p>
         */
        @NameInMap("SupportRollback")
        public Boolean supportRollback;

        @NameInMap("Targets")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoTargets targets;

        /**
         * <p>The throttling rules.</p>
         */
        @NameInMap("TrafficControl")
        public GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl trafficControl;

        public static GetChangeOrderInfoResponseBodyChangeOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            GetChangeOrderInfoResponseBodyChangeOrderInfo self = new GetChangeOrderInfoResponseBodyChangeOrderInfo();
            return TeaModel.build(map, self);
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setChangeOrderDescription(String changeOrderDescription) {
            this.changeOrderDescription = changeOrderDescription;
            return this;
        }
        public String getChangeOrderDescription() {
            return this.changeOrderDescription;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setPipelineInfoList(GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList pipelineInfoList) {
            this.pipelineInfoList = pipelineInfoList;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoPipelineInfoList getPipelineInfoList() {
            return this.pipelineInfoList;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setSupportRollback(Boolean supportRollback) {
            this.supportRollback = supportRollback;
            return this;
        }
        public Boolean getSupportRollback() {
            return this.supportRollback;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setTargets(GetChangeOrderInfoResponseBodyChangeOrderInfoTargets targets) {
            this.targets = targets;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoTargets getTargets() {
            return this.targets;
        }

        public GetChangeOrderInfoResponseBodyChangeOrderInfo setTrafficControl(GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl trafficControl) {
            this.trafficControl = trafficControl;
            return this;
        }
        public GetChangeOrderInfoResponseBodyChangeOrderInfoTrafficControl getTrafficControl() {
            return this.trafficControl;
        }

    }

}
