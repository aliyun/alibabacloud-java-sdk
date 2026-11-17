// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    /**
     * <p>The error code. Returned when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("Data")
    public GetTaskResponseBodyData data;

    /**
     * <p>The error or result message. Used to explain the cause when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of this request. You can provide this value for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is processed successfully. A value of true indicates that the request is processed successfully. To determine whether an asynchronous task is completed, you must query the task status separately.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskResponseBody setData(GetTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTaskResponseBodyData getData() {
        return this.data;
    }

    public GetTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskResponseBodyDataResourceList extends TeaModel {
        /**
         * <p>The resource content corresponding to ResourceType. For the URL type, enter or return an accessible resource address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/apps/business/setup.exe">https://example.com/apps/business/setup.exe</a></p>
         */
        @NameInMap("Resource")
        public String resource;

        /**
         * <p>The provision method of the resource content.
         * Valid values:</p>
         * <ul>
         * <li><strong>HOSTED</strong>: Hosted resource.</li>
         * <li><strong>TEXT</strong>: Text resource.</li>
         * <li><strong>URL</strong>: Resource provided through a URL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetTaskResponseBodyDataResourceList build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyDataResourceList self = new GetTaskResponseBodyDataResourceList();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyDataResourceList setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public GetTaskResponseBodyDataResourceList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetTaskResponseBodyDataTaskStepList extends TeaModel {
        /**
         * <p>The end time of the step. It is a UNIX timestamp calculated from 1970-01-01T00:00:00Z. Unit: milliseconds. This field may not be returned if the step has not ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1790130491000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the step. It is a UNIX timestamp calculated from 1970-01-01T00:00:00Z. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790130490000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The execution status of the step.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The step is being executed.</li>
         * <li><strong>SUCCESS</strong>: The step is executed successfully.</li>
         * <li><strong>FAILED</strong>: The step fails to be executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ISO 8601 string of the step end time, including the time zone offset. In the example, +08:00 indicates UTC+8. It represents the same time as EndTime and is parsed according to the offset in the return value. This field may not be returned if the step has not ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:28:11+08:00</p>
         */
        @NameInMap("StepEndTime")
        public String stepEndTime;

        /**
         * <p>The ISO 8601 string of the step start time, including the time zone offset. In the example, +08:00 indicates UTC+8. It represents the same time as StartTime and is parsed according to the offset in the return value.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:28:10+08:00</p>
         */
        @NameInMap("StepStartTime")
        public String stepStartTime;

        /**
         * <p>The prompt or execution result description of this step.</p>
         * 
         * <strong>example:</strong>
         * <p>[code=Builder.Failed,httpStatusCode=<null>,message=Builder environment deploy failed.]</p>
         */
        @NameInMap("TaskMessage")
        public String taskMessage;

        /**
         * <p>The task step identifier corresponding to this record. You can call ListTaskStep to query the image creation and application adaptation steps.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_BUILDER_ENV</p>
         */
        @NameInMap("TaskStep")
        public String taskStep;

        public static GetTaskResponseBodyDataTaskStepList build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyDataTaskStepList self = new GetTaskResponseBodyDataTaskStepList();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyDataTaskStepList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetTaskResponseBodyDataTaskStepList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetTaskResponseBodyDataTaskStepList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseBodyDataTaskStepList setStepEndTime(String stepEndTime) {
            this.stepEndTime = stepEndTime;
            return this;
        }
        public String getStepEndTime() {
            return this.stepEndTime;
        }

        public GetTaskResponseBodyDataTaskStepList setStepStartTime(String stepStartTime) {
            this.stepStartTime = stepStartTime;
            return this;
        }
        public String getStepStartTime() {
            return this.stepStartTime;
        }

        public GetTaskResponseBodyDataTaskStepList setTaskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }
        public String getTaskMessage() {
            return this.taskMessage;
        }

        public GetTaskResponseBodyDataTaskStepList setTaskStep(String taskStep) {
            this.taskStep = taskStep;
            return this;
        }
        public String getTaskStep() {
            return this.taskStep;
        }

    }

    public static class GetTaskResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The prompt or execution result description of the current task step.</p>
         * 
         * <strong>example:</strong>
         * <p>[code=Builder.Failed,httpStatusCode=<null>,message=Builder environment deploy failed.]</p>
         */
        @NameInMap("CurrentTaskMessage")
        public String currentTaskMessage;

        /**
         * <p>The identifier of the step currently being executed in the task. You can call ListTaskStep to query the image creation and application adaptation steps.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_BUILDER_ENV</p>
         */
        @NameInMap("CurrentTaskStep")
        public String currentTaskStep;

        /**
         * <p>The ID of the region where the task is actually executed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ExecuteRegion")
        public String executeRegion;

        /**
         * <p>The time when the task was created. The time is in ISO 8601 format, accurate to milliseconds, and the time zone offset is +00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T02:28:10.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the task was last modified. The time is in ISO 8601 format, accurate to milliseconds, and the time zone offset is +00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T02:32:43.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The compute type of the task creation resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>CPU</strong>: CPU compute resource.</li>
         * <li><strong>GPU</strong>: GPU compute resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("PerformanceType")
        public String performanceType;

        /**
         * <p><strong>Not enabled. Currently, no valid task progress is returned.</strong> Determine the task execution status based on Status, CurrentTaskStep, and TaskStepList.</p>
         * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status, not an actual API return sample.</p>
         * 
         * <strong>example:</strong>
         * <p>Not applicable (not enabled)</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The list of resources used for task creation, which corresponds to the creation resources submitted when the task is created.</p>
         */
        @NameInMap("ResourceList")
        public java.util.List<GetTaskResponseBodyDataResourceList> resourceList;

        /**
         * <p>The running mode of the task creation environment.
         * Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: Normal running mode.</li>
         * <li><strong>COMPATIBLE</strong>: Compatible running mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("RunMode")
        public String runMode;

        /**
         * <p>The overall status of the task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is initialized.</li>
         * <li><strong>START</strong>: The task is being created or executed.</li>
         * <li><strong>SUCCESS</strong>: The task is executed successfully.</li>
         * <li><strong>FAILED</strong>: The task fails to be executed.</li>
         * <li><strong>DELETED</strong>: The task is deleted.</li>
         * </ul>
         * <p>Deleted tasks are not included in the regular valid task query scope.</p>
         * 
         * <strong>example:</strong>
         * <p>START</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The system cloud disk capacity of the task creation environment. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The ID of the base system image used in the task creation environment.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-bp1parent****</p>
         */
        @NameInMap("SystemImageId")
        public String systemImageId;

        /**
         * <p>The task ID. You can use it to call GetTask to query the task status.</p>
         * 
         * <strong>example:</strong>
         * <p>tid-bp1example****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The list of recorded task execution steps and results.</p>
         */
        @NameInMap("TaskStepList")
        public java.util.List<GetTaskResponseBodyDataTaskStepList> taskStepList;

        /**
         * <p>The actual type of the task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>AUTO_ADAPT</strong>: Automatic adaptation.</li>
         * <li><strong>AUTO_CREATE_IMAGE</strong>: Automatic image creation.</li>
         * <li><strong>RETRY_ADAPT</strong>: Retry automatic adaptation.</li>
         * <li><strong>RETRY_CREATE_IMAGE</strong>: Retry automatic image creation.</li>
         * <li><strong>AUTO_OTA_IMAGE</strong>: Automatic image OTA.</li>
         * <li><strong>AUTO_CREATE_VHD</strong>: Automatic VHD creation.</li>
         * <li><strong>RETRY_VHD</strong>: Retry VHD creation.</li>
         * <li><strong>AUTO_CREATE_IMAGE_VHD</strong>: Automatic VHD image creation.</li>
         * <li><strong>RETRY_CREATE_IMAGE_VHD</strong>: Retry VHD image creation.</li>
         * <li><strong>AUTO_VALIDATE_VHD</strong>: Automatic VHD validation.</li>
         * <li><strong>RETRY_VALIDATE_VHD</strong>: Retry VHD validation.</li>
         * <li><strong>SYNCHRONIZE_APP_IMAGE</strong>: Synchronize application image.</li>
         * <li><strong>APPLY_VHD_BUILDER</strong>: Apply for VHD application recording environment.</li>
         * <li><strong>RETRY_VHD_BUILDER</strong>: Retry applying for VHD recording environment.</li>
         * <li><strong>ADAPT_AUTO</strong>: Automatic application adaptation creation.</li>
         * <li><strong>ADAPT_AUTO_RETRY</strong>: Retry automatic application adaptation creation.</li>
         * <li><strong>ADAPT_MANUAL</strong>: Manual application adaptation creation.</li>
         * <li><strong>ADAPT_MANUAL_RETRY</strong>: Retry manual application adaptation creation.</li>
         * <li><strong>IMAGE_AUTO</strong>: Automatic image creation.</li>
         * <li><strong>IMAGE_AUTO_RETRY</strong>: Retry automatic image creation.</li>
         * <li><strong>IMAGE_AUTO_VALIDATE</strong>: Automatic image validation.</li>
         * <li><strong>IMAGE_AUTO_VALIDATE_RETRY</strong>: Retry automatic image validation.</li>
         * <li><strong>IMAGE_MANUAL</strong>: Manual image creation.</li>
         * <li><strong>IMAGE_MANUAL_RETRY</strong>: Retry manual image creation.</li>
         * <li><strong>DESKTOP_CUSTOM_IMAGE</strong>: Create cloud desktop custom image.</li>
         * <li><strong>DESKTOP_CUSTOM_IMAGE_RETRY</strong>: Retry creating cloud desktop custom image.</li>
         * <li><strong>DESKTOP_SYNC_IMAGE</strong>: Synchronize cloud desktop image across regions.</li>
         * <li><strong>DESKTOP_SYNC_IMAGE_RETRY</strong>: Retry synchronizing cloud desktop image across regions.</li>
         * <li><strong>IMAGE_DISTRIBUTE</strong>: Distribute image to multiple regions.</li>
         * <li><strong>IMAGE_DISTRIBUTE_RETRY</strong>: Retry image distribution.</li>
         * <li><strong>IMAGE_FROM_INSTANCE</strong>: Create image based on instance.</li>
         * <li><strong>IMAGE_FROM_INSTANCE_RETRY</strong>: Retry creating image based on instance.</li>
         * <li><strong>SNAPSHOT_DISTRIBUTE</strong>: Distribute snapshot to multiple regions.</li>
         * <li><strong>SNAPSHOT_DISTRIBUTE_RETRY</strong>: Retry snapshot distribution.</li>
         * <li><strong>SNAPSHOT_FROM_DISK</strong>: Create snapshot based on disk.</li>
         * <li><strong>SNAPSHOT_FROM_DISK_RETRY</strong>: Retry creating snapshot based on disk.</li>
         * <li><strong>IMAGE_CLEAN_AND_CREATE</strong>: Create a temporary instance based on an image, and create the final image after cleanup.</li>
         * <li><strong>IMAGE_CLEAN_AND_CREATE_RETRY</strong>: Retry creating the final image after cleanup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE_MANUAL</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static GetTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyData self = new GetTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetTaskResponseBodyData setCurrentTaskMessage(String currentTaskMessage) {
            this.currentTaskMessage = currentTaskMessage;
            return this;
        }
        public String getCurrentTaskMessage() {
            return this.currentTaskMessage;
        }

        public GetTaskResponseBodyData setCurrentTaskStep(String currentTaskStep) {
            this.currentTaskStep = currentTaskStep;
            return this;
        }
        public String getCurrentTaskStep() {
            return this.currentTaskStep;
        }

        public GetTaskResponseBodyData setExecuteRegion(String executeRegion) {
            this.executeRegion = executeRegion;
            return this;
        }
        public String getExecuteRegion() {
            return this.executeRegion;
        }

        public GetTaskResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTaskResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTaskResponseBodyData setPerformanceType(String performanceType) {
            this.performanceType = performanceType;
            return this;
        }
        public String getPerformanceType() {
            return this.performanceType;
        }

        public GetTaskResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetTaskResponseBodyData setResourceList(java.util.List<GetTaskResponseBodyDataResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<GetTaskResponseBodyDataResourceList> getResourceList() {
            return this.resourceList;
        }

        public GetTaskResponseBodyData setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public GetTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseBodyData setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public GetTaskResponseBodyData setSystemImageId(String systemImageId) {
            this.systemImageId = systemImageId;
            return this;
        }
        public String getSystemImageId() {
            return this.systemImageId;
        }

        public GetTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskResponseBodyData setTaskStepList(java.util.List<GetTaskResponseBodyDataTaskStepList> taskStepList) {
            this.taskStepList = taskStepList;
            return this;
        }
        public java.util.List<GetTaskResponseBodyDataTaskStepList> getTaskStepList() {
            return this.taskStepList;
        }

        public GetTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
