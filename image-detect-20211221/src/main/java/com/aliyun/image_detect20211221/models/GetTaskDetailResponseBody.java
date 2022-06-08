// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetTaskDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Response")
    public GetTaskDetailResponseBodyResponse response;

    @NameInMap("Success")
    public Boolean success;

    public static GetTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskDetailResponseBody self = new GetTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskDetailResponseBody setResponse(GetTaskDetailResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public GetTaskDetailResponseBodyResponse getResponse() {
        return this.response;
    }

    public GetTaskDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskDetailResponseBodyResponse extends TeaModel {
        @NameInMap("ErrorCode")
        public Integer errorCode;

        @NameInMap("ExceptionMessage")
        public String exceptionMessage;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ImageCompletedTotal")
        public Integer imageCompletedTotal;

        @NameInMap("ImageTotal")
        public Integer imageTotal;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("MqAccessKey")
        public String mqAccessKey;

        @NameInMap("MqConfigName")
        public String mqConfigName;

        @NameInMap("MqEndpoint")
        public String mqEndpoint;

        @NameInMap("MqGroupId")
        public String mqGroupId;

        @NameInMap("MqTopic")
        public String mqTopic;

        @NameInMap("OssAccessKeyId")
        public String ossAccessKeyId;

        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssConfigName")
        public String ossConfigName;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("OssInputPath")
        public String ossInputPath;

        @NameInMap("OssOutputPath")
        public String ossOutputPath;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("TaskDescription")
        public String taskDescription;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TaskUid")
        public String taskUid;

        public static GetTaskDetailResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            GetTaskDetailResponseBodyResponse self = new GetTaskDetailResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public GetTaskDetailResponseBodyResponse setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Integer getErrorCode() {
            return this.errorCode;
        }

        public GetTaskDetailResponseBodyResponse setExceptionMessage(String exceptionMessage) {
            this.exceptionMessage = exceptionMessage;
            return this;
        }
        public String getExceptionMessage() {
            return this.exceptionMessage;
        }

        public GetTaskDetailResponseBodyResponse setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTaskDetailResponseBodyResponse setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTaskDetailResponseBodyResponse setImageCompletedTotal(Integer imageCompletedTotal) {
            this.imageCompletedTotal = imageCompletedTotal;
            return this;
        }
        public Integer getImageCompletedTotal() {
            return this.imageCompletedTotal;
        }

        public GetTaskDetailResponseBodyResponse setImageTotal(Integer imageTotal) {
            this.imageTotal = imageTotal;
            return this;
        }
        public Integer getImageTotal() {
            return this.imageTotal;
        }

        public GetTaskDetailResponseBodyResponse setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GetTaskDetailResponseBodyResponse setMqAccessKey(String mqAccessKey) {
            this.mqAccessKey = mqAccessKey;
            return this;
        }
        public String getMqAccessKey() {
            return this.mqAccessKey;
        }

        public GetTaskDetailResponseBodyResponse setMqConfigName(String mqConfigName) {
            this.mqConfigName = mqConfigName;
            return this;
        }
        public String getMqConfigName() {
            return this.mqConfigName;
        }

        public GetTaskDetailResponseBodyResponse setMqEndpoint(String mqEndpoint) {
            this.mqEndpoint = mqEndpoint;
            return this;
        }
        public String getMqEndpoint() {
            return this.mqEndpoint;
        }

        public GetTaskDetailResponseBodyResponse setMqGroupId(String mqGroupId) {
            this.mqGroupId = mqGroupId;
            return this;
        }
        public String getMqGroupId() {
            return this.mqGroupId;
        }

        public GetTaskDetailResponseBodyResponse setMqTopic(String mqTopic) {
            this.mqTopic = mqTopic;
            return this;
        }
        public String getMqTopic() {
            return this.mqTopic;
        }

        public GetTaskDetailResponseBodyResponse setOssAccessKeyId(String ossAccessKeyId) {
            this.ossAccessKeyId = ossAccessKeyId;
            return this;
        }
        public String getOssAccessKeyId() {
            return this.ossAccessKeyId;
        }

        public GetTaskDetailResponseBodyResponse setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public GetTaskDetailResponseBodyResponse setOssConfigName(String ossConfigName) {
            this.ossConfigName = ossConfigName;
            return this;
        }
        public String getOssConfigName() {
            return this.ossConfigName;
        }

        public GetTaskDetailResponseBodyResponse setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public GetTaskDetailResponseBodyResponse setOssInputPath(String ossInputPath) {
            this.ossInputPath = ossInputPath;
            return this;
        }
        public String getOssInputPath() {
            return this.ossInputPath;
        }

        public GetTaskDetailResponseBodyResponse setOssOutputPath(String ossOutputPath) {
            this.ossOutputPath = ossOutputPath;
            return this;
        }
        public String getOssOutputPath() {
            return this.ossOutputPath;
        }

        public GetTaskDetailResponseBodyResponse setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetTaskDetailResponseBodyResponse setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public GetTaskDetailResponseBodyResponse setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetTaskDetailResponseBodyResponse setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetTaskDetailResponseBodyResponse setTaskUid(String taskUid) {
            this.taskUid = taskUid;
            return this;
        }
        public String getTaskUid() {
            return this.taskUid;
        }

    }

}
