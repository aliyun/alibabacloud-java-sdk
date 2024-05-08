// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordsByOuterBusinessIdResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetRecordsByOuterBusinessIdResponseBodyData> data;

    @NameInMap("Errors")
    public java.util.List<GetRecordsByOuterBusinessIdResponseBodyErrors> errors;

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

    public static GetRecordsByOuterBusinessIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsByOuterBusinessIdResponseBody self = new GetRecordsByOuterBusinessIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordsByOuterBusinessIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRecordsByOuterBusinessIdResponseBody setData(java.util.List<GetRecordsByOuterBusinessIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRecordsByOuterBusinessIdResponseBodyData> getData() {
        return this.data;
    }

    public GetRecordsByOuterBusinessIdResponseBody setErrors(java.util.List<GetRecordsByOuterBusinessIdResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<GetRecordsByOuterBusinessIdResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public GetRecordsByOuterBusinessIdResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetRecordsByOuterBusinessIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecordsByOuterBusinessIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecordsByOuterBusinessIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList extends TeaModel {
        @NameInMap("OuterBusinessId")
        public String outerBusinessId;

        @NameInMap("RecordType")
        public String recordType;

        @NameInMap("Role")
        public String role;

        @NameInMap("RoomMetaUrl")
        public String roomMetaUrl;

        @NameInMap("RoomRecordAt")
        public String roomRecordAt;

        @NameInMap("RoomResultUrl")
        public String roomResultUrl;

        @NameInMap("RoomStatus")
        public String roomStatus;

        @NameInMap("RoomVideoUrl")
        public String roomVideoUrl;

        @NameInMap("RtcRecordId")
        public String rtcRecordId;

        public static GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList build(java.util.Map<String, ?> map) throws Exception {
            GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList self = new GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList();
            return TeaModel.build(map, self);
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setOuterBusinessId(String outerBusinessId) {
            this.outerBusinessId = outerBusinessId;
            return this;
        }
        public String getOuterBusinessId() {
            return this.outerBusinessId;
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setRoomMetaUrl(String roomMetaUrl) {
            this.roomMetaUrl = roomMetaUrl;
            return this;
        }
        public String getRoomMetaUrl() {
            return this.roomMetaUrl;
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setRoomRecordAt(String roomRecordAt) {
            this.roomRecordAt = roomRecordAt;
            return this;
        }
        public String getRoomRecordAt() {
            return this.roomRecordAt;
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setRoomResultUrl(String roomResultUrl) {
            this.roomResultUrl = roomResultUrl;
            return this;
        }
        public String getRoomResultUrl() {
            return this.roomResultUrl;
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setRoomStatus(String roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }
        public String getRoomStatus() {
            return this.roomStatus;
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setRoomVideoUrl(String roomVideoUrl) {
            this.roomVideoUrl = roomVideoUrl;
            return this;
        }
        public String getRoomVideoUrl() {
            return this.roomVideoUrl;
        }

        public GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList setRtcRecordId(String rtcRecordId) {
            this.rtcRecordId = rtcRecordId;
            return this;
        }
        public String getRtcRecordId() {
            return this.rtcRecordId;
        }

    }

    public static class GetRecordsByOuterBusinessIdResponseBodyData extends TeaModel {
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

        @NameInMap("RecordRoomList")
        public java.util.List<GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList> recordRoomList;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetRecordsByOuterBusinessIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRecordsByOuterBusinessIdResponseBodyData self = new GetRecordsByOuterBusinessIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setDetectProcessName(String detectProcessName) {
            this.detectProcessName = detectProcessName;
            return this;
        }
        public String getDetectProcessName() {
            return this.detectProcessName;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setMetaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
            return this;
        }
        public String getMetaUrl() {
            return this.metaUrl;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setOuterBusinessId(String outerBusinessId) {
            this.outerBusinessId = outerBusinessId;
            return this;
        }
        public String getOuterBusinessId() {
            return this.outerBusinessId;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setRecordAt(String recordAt) {
            this.recordAt = recordAt;
            return this;
        }
        public String getRecordAt() {
            return this.recordAt;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setRecordRoomList(java.util.List<GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList> recordRoomList) {
            this.recordRoomList = recordRoomList;
            return this;
        }
        public java.util.List<GetRecordsByOuterBusinessIdResponseBodyDataRecordRoomList> getRecordRoomList() {
            return this.recordRoomList;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRecordsByOuterBusinessIdResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class GetRecordsByOuterBusinessIdResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static GetRecordsByOuterBusinessIdResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            GetRecordsByOuterBusinessIdResponseBodyErrors self = new GetRecordsByOuterBusinessIdResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public GetRecordsByOuterBusinessIdResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetRecordsByOuterBusinessIdResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
