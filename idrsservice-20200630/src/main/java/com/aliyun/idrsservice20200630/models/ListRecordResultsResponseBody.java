// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListRecordResultsResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListRecordResultsResponseBodyData data;

    @NameInMap("Errors")
    public java.util.List<ListRecordResultsResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>requestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRecordResultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecordResultsResponseBody self = new ListRecordResultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecordResultsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRecordResultsResponseBody setData(ListRecordResultsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRecordResultsResponseBodyData getData() {
        return this.data;
    }

    public ListRecordResultsResponseBody setErrors(java.util.List<ListRecordResultsResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<ListRecordResultsResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public ListRecordResultsResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListRecordResultsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecordResultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecordResultsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRecordResultsResponseBodyDataItems extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("DetectProcessName")
        public String detectProcessName;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Id")
        public String id;

        @NameInMap("MetaUrl")
        public String metaUrl;

        @NameInMap("OuterBusinessId")
        public String outerBusinessId;

        @NameInMap("RecordAt")
        public String recordAt;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("RtcRecordId")
        public String rtcRecordId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static ListRecordResultsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListRecordResultsResponseBodyDataItems self = new ListRecordResultsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListRecordResultsResponseBodyDataItems setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListRecordResultsResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRecordResultsResponseBodyDataItems setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public ListRecordResultsResponseBodyDataItems setDetectProcessName(String detectProcessName) {
            this.detectProcessName = detectProcessName;
            return this;
        }
        public String getDetectProcessName() {
            return this.detectProcessName;
        }

        public ListRecordResultsResponseBodyDataItems setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListRecordResultsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRecordResultsResponseBodyDataItems setMetaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
            return this;
        }
        public String getMetaUrl() {
            return this.metaUrl;
        }

        public ListRecordResultsResponseBodyDataItems setOuterBusinessId(String outerBusinessId) {
            this.outerBusinessId = outerBusinessId;
            return this;
        }
        public String getOuterBusinessId() {
            return this.outerBusinessId;
        }

        public ListRecordResultsResponseBodyDataItems setRecordAt(String recordAt) {
            this.recordAt = recordAt;
            return this;
        }
        public String getRecordAt() {
            return this.recordAt;
        }

        public ListRecordResultsResponseBodyDataItems setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public ListRecordResultsResponseBodyDataItems setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRecordResultsResponseBodyDataItems setRtcRecordId(String rtcRecordId) {
            this.rtcRecordId = rtcRecordId;
            return this;
        }
        public String getRtcRecordId() {
            return this.rtcRecordId;
        }

        public ListRecordResultsResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRecordResultsResponseBodyDataItems setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class ListRecordResultsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListRecordResultsResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListRecordResultsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRecordResultsResponseBodyData self = new ListRecordResultsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRecordResultsResponseBodyData setItems(java.util.List<ListRecordResultsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListRecordResultsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListRecordResultsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListRecordResultsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

    public static class ListRecordResultsResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static ListRecordResultsResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            ListRecordResultsResponseBodyErrors self = new ListRecordResultsResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public ListRecordResultsResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListRecordResultsResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
