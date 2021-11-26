// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BpmsUrl")
    public String bpmsUrl;

    @NameInMap("CompleteTime")
    public String completeTime;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Details")
    public java.util.List<GetTaskResponseBodyDetails> details;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("StatusReason")
    public String statusReason;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskType")
    public String taskType;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetTaskResponseBody setBpmsUrl(String bpmsUrl) {
        this.bpmsUrl = bpmsUrl;
        return this;
    }
    public String getBpmsUrl() {
        return this.bpmsUrl;
    }

    public GetTaskResponseBody setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }
    public String getCompleteTime() {
        return this.completeTime;
    }

    public GetTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetTaskResponseBody setDetails(java.util.List<GetTaskResponseBodyDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<GetTaskResponseBodyDetails> getDetails() {
        return this.details;
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTaskResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public GetTaskResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public static class GetTaskResponseBodyDetails extends TeaModel {
        @NameInMap("Data")
        public java.util.Map<String, ?> data;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static GetTaskResponseBodyDetails build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyDetails self = new GetTaskResponseBodyDetails();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyDetails setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public GetTaskResponseBodyDetails setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTaskResponseBodyDetails setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
