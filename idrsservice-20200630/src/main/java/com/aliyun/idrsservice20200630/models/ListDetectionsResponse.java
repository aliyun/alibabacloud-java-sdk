// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectionsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Errors")
    @Validation(required = true)
    public java.util.List<ListDetectionsResponseErrors> errors;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDetectionsResponseData data;

    public static ListDetectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionsResponse self = new ListDetectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDetectionsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDetectionsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDetectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDetectionsResponse setErrors(java.util.List<ListDetectionsResponseErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<ListDetectionsResponseErrors> getErrors() {
        return this.errors;
    }

    public ListDetectionsResponse setData(ListDetectionsResponseData data) {
        this.data = data;
        return this;
    }
    public ListDetectionsResponseData getData() {
        return this.data;
    }

    public static class ListDetectionsResponseErrors extends TeaModel {
        @NameInMap("Field")
        @Validation(required = true)
        public String field;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static ListDetectionsResponseErrors build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionsResponseErrors self = new ListDetectionsResponseErrors();
            return TeaModel.build(map, self);
        }

        public ListDetectionsResponseErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListDetectionsResponseErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class ListDetectionsResponseDataItemsTasks extends TeaModel {
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

        public static ListDetectionsResponseDataItemsTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionsResponseDataItemsTasks self = new ListDetectionsResponseDataItemsTasks();
            return TeaModel.build(map, self);
        }

        public ListDetectionsResponseDataItemsTasks setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDetectionsResponseDataItemsTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDetectionsResponseDataItemsTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDetectionsResponseDataItemsTasks setVideoMetaUrl(String videoMetaUrl) {
            this.videoMetaUrl = videoMetaUrl;
            return this;
        }
        public String getVideoMetaUrl() {
            return this.videoMetaUrl;
        }

        public ListDetectionsResponseDataItemsTasks setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class ListDetectionsResponseDataItems extends TeaModel {
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
        public java.util.List<ListDetectionsResponseDataItemsTasks> tasks;

        public static ListDetectionsResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionsResponseDataItems self = new ListDetectionsResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListDetectionsResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDetectionsResponseDataItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public ListDetectionsResponseDataItems setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public ListDetectionsResponseDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDetectionsResponseDataItems setRecordingType(String recordingType) {
            this.recordingType = recordingType;
            return this;
        }
        public String getRecordingType() {
            return this.recordingType;
        }

        public ListDetectionsResponseDataItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListDetectionsResponseDataItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListDetectionsResponseDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDetectionsResponseDataItems setTasks(java.util.List<ListDetectionsResponseDataItemsTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListDetectionsResponseDataItemsTasks> getTasks() {
            return this.tasks;
        }

    }

    public static class ListDetectionsResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListDetectionsResponseDataItems> items;

        public static ListDetectionsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionsResponseData self = new ListDetectionsResponseData();
            return TeaModel.build(map, self);
        }

        public ListDetectionsResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListDetectionsResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListDetectionsResponseData setItems(java.util.List<ListDetectionsResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDetectionsResponseDataItems> getItems() {
            return this.items;
        }

    }

}
