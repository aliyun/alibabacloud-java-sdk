// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>-</p>
     */
    @NameInMap("Data")
    public GetDetectionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionResponseBody self = new GetDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDetectionResponseBody setData(GetDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDetectionResponseBodyData getData() {
        return this.data;
    }

    public GetDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDetectionResponseBodyDataTasks extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Status")
        public String status;

        @NameInMap("VideoMetaUrl")
        public String videoMetaUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetDetectionResponseBodyDataTasks build(java.util.Map<String, ?> map) throws Exception {
            GetDetectionResponseBodyDataTasks self = new GetDetectionResponseBodyDataTasks();
            return TeaModel.build(map, self);
        }

        public GetDetectionResponseBodyDataTasks setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDetectionResponseBodyDataTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDetectionResponseBodyDataTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDetectionResponseBodyDataTasks setVideoMetaUrl(String videoMetaUrl) {
            this.videoMetaUrl = videoMetaUrl;
            return this;
        }
        public String getVideoMetaUrl() {
            return this.videoMetaUrl;
        }

        public GetDetectionResponseBodyDataTasks setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class GetDetectionResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DepartmentId")
        public String departmentId;

        @NameInMap("DepartmentName")
        public String departmentName;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("RecordingType")
        public String recordingType;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tasks")
        public java.util.List<GetDetectionResponseBodyDataTasks> tasks;

        public static GetDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDetectionResponseBodyData self = new GetDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDetectionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetDetectionResponseBodyData setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public GetDetectionResponseBodyData setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetDetectionResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDetectionResponseBodyData setRecordingType(String recordingType) {
            this.recordingType = recordingType;
            return this;
        }
        public String getRecordingType() {
            return this.recordingType;
        }

        public GetDetectionResponseBodyData setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetDetectionResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetDetectionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDetectionResponseBodyData setTasks(java.util.List<GetDetectionResponseBodyDataTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetDetectionResponseBodyDataTasks> getTasks() {
            return this.tasks;
        }

    }

}
