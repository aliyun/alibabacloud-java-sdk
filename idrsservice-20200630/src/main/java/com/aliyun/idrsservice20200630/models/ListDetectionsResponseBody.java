// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectionsResponseBody extends TeaModel {
    @NameInMap("Errors")
    public java.util.List<ListDetectionsResponseBodyErrors> errors;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListDetectionsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListDetectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDetectionsResponseBody self = new ListDetectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDetectionsResponseBody setErrors(java.util.List<ListDetectionsResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<ListDetectionsResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public ListDetectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDetectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDetectionsResponseBody setData(ListDetectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDetectionsResponseBodyData getData() {
        return this.data;
    }

    public ListDetectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListDetectionsResponseBodyErrors extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Field")
        public String field;

        public static ListDetectionsResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionsResponseBodyErrors self = new ListDetectionsResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public ListDetectionsResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListDetectionsResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

    }

    public static class ListDetectionsResponseBodyDataItemsTasks extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VideoMetaUrl")
        public String videoMetaUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static ListDetectionsResponseBodyDataItemsTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionsResponseBodyDataItemsTasks self = new ListDetectionsResponseBodyDataItemsTasks();
            return TeaModel.build(map, self);
        }

        public ListDetectionsResponseBodyDataItemsTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDetectionsResponseBodyDataItemsTasks setVideoMetaUrl(String videoMetaUrl) {
            this.videoMetaUrl = videoMetaUrl;
            return this;
        }
        public String getVideoMetaUrl() {
            return this.videoMetaUrl;
        }

        public ListDetectionsResponseBodyDataItemsTasks setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDetectionsResponseBodyDataItemsTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDetectionsResponseBodyDataItemsTasks setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class ListDetectionsResponseBodyDataItems extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("Tasks")
        public java.util.List<ListDetectionsResponseBodyDataItemsTasks> tasks;

        @NameInMap("RecordingType")
        public String recordingType;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DepartmentId")
        public String departmentId;

        @NameInMap("Id")
        public String id;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static ListDetectionsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionsResponseBodyDataItems self = new ListDetectionsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListDetectionsResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDetectionsResponseBodyDataItems setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public ListDetectionsResponseBodyDataItems setTasks(java.util.List<ListDetectionsResponseBodyDataItemsTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<ListDetectionsResponseBodyDataItemsTasks> getTasks() {
            return this.tasks;
        }

        public ListDetectionsResponseBodyDataItems setRecordingType(String recordingType) {
            this.recordingType = recordingType;
            return this;
        }
        public String getRecordingType() {
            return this.recordingType;
        }

        public ListDetectionsResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDetectionsResponseBodyDataItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public ListDetectionsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDetectionsResponseBodyDataItems setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListDetectionsResponseBodyDataItems setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class ListDetectionsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListDetectionsResponseBodyDataItems> items;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("TotalElements")
        public Long totalElements;

        public static ListDetectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDetectionsResponseBodyData self = new ListDetectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDetectionsResponseBodyData setItems(java.util.List<ListDetectionsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDetectionsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListDetectionsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListDetectionsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

    }

}
