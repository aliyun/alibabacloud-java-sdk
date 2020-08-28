// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectionResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDetectionResponseData data;

    public static GetDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResponse self = new GetDetectionResponse();
        return TeaModel.build(map, self);
    }

    public GetDetectionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDetectionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDetectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDetectionResponse setData(GetDetectionResponseData data) {
        this.data = data;
        return this;
    }
    public GetDetectionResponseData getData() {
        return this.data;
    }

    public static class GetDetectionResponseDataTasks extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VideoMetaUrl")
        @Validation(required = true)
        public String videoMetaUrl;

        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static GetDetectionResponseDataTasks build(java.util.Map<String, ?> map) throws Exception {
            GetDetectionResponseDataTasks self = new GetDetectionResponseDataTasks();
            return TeaModel.build(map, self);
        }

        public GetDetectionResponseDataTasks setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDetectionResponseDataTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDetectionResponseDataTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDetectionResponseDataTasks setVideoMetaUrl(String videoMetaUrl) {
            this.videoMetaUrl = videoMetaUrl;
            return this;
        }
        public String getVideoMetaUrl() {
            return this.videoMetaUrl;
        }

        public GetDetectionResponseDataTasks setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class GetDetectionResponseData extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("DepartmentId")
        @Validation(required = true)
        public String departmentId;

        @NameInMap("DepartmentName")
        @Validation(required = true)
        public String departmentName;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("RecordingType")
        @Validation(required = true)
        public String recordingType;

        @NameInMap("RuleId")
        @Validation(required = true)
        public String ruleId;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Tasks")
        @Validation(required = true)
        public java.util.List<GetDetectionResponseDataTasks> tasks;

        public static GetDetectionResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDetectionResponseData self = new GetDetectionResponseData();
            return TeaModel.build(map, self);
        }

        public GetDetectionResponseData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDetectionResponseData setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public GetDetectionResponseData setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetDetectionResponseData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDetectionResponseData setRecordingType(String recordingType) {
            this.recordingType = recordingType;
            return this;
        }
        public String getRecordingType() {
            return this.recordingType;
        }

        public GetDetectionResponseData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetDetectionResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDetectionResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDetectionResponseData setTasks(java.util.List<GetDetectionResponseDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetDetectionResponseDataTasks> getTasks() {
            return this.tasks;
        }

    }

}
