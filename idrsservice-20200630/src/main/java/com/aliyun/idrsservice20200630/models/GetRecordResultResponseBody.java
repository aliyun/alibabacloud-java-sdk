// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordResultResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRecordResultResponseBodyData data;

    @NameInMap("Errors")
    public java.util.List<GetRecordResultResponseBodyErrors> errors;

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

    public static GetRecordResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordResultResponseBody self = new GetRecordResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRecordResultResponseBody setData(GetRecordResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRecordResultResponseBodyData getData() {
        return this.data;
    }

    public GetRecordResultResponseBody setErrors(java.util.List<GetRecordResultResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<GetRecordResultResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public GetRecordResultResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetRecordResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecordResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecordResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRecordResultResponseBodyDataRecordRoomList extends TeaModel {
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

        public static GetRecordResultResponseBodyDataRecordRoomList build(java.util.Map<String, ?> map) throws Exception {
            GetRecordResultResponseBodyDataRecordRoomList self = new GetRecordResultResponseBodyDataRecordRoomList();
            return TeaModel.build(map, self);
        }

        public GetRecordResultResponseBodyDataRecordRoomList setOuterBusinessId(String outerBusinessId) {
            this.outerBusinessId = outerBusinessId;
            return this;
        }
        public String getOuterBusinessId() {
            return this.outerBusinessId;
        }

        public GetRecordResultResponseBodyDataRecordRoomList setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public GetRecordResultResponseBodyDataRecordRoomList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetRecordResultResponseBodyDataRecordRoomList setRoomMetaUrl(String roomMetaUrl) {
            this.roomMetaUrl = roomMetaUrl;
            return this;
        }
        public String getRoomMetaUrl() {
            return this.roomMetaUrl;
        }

        public GetRecordResultResponseBodyDataRecordRoomList setRoomRecordAt(String roomRecordAt) {
            this.roomRecordAt = roomRecordAt;
            return this;
        }
        public String getRoomRecordAt() {
            return this.roomRecordAt;
        }

        public GetRecordResultResponseBodyDataRecordRoomList setRoomResultUrl(String roomResultUrl) {
            this.roomResultUrl = roomResultUrl;
            return this;
        }
        public String getRoomResultUrl() {
            return this.roomResultUrl;
        }

        public GetRecordResultResponseBodyDataRecordRoomList setRoomStatus(String roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }
        public String getRoomStatus() {
            return this.roomStatus;
        }

        public GetRecordResultResponseBodyDataRecordRoomList setRoomVideoUrl(String roomVideoUrl) {
            this.roomVideoUrl = roomVideoUrl;
            return this;
        }
        public String getRoomVideoUrl() {
            return this.roomVideoUrl;
        }

        public GetRecordResultResponseBodyDataRecordRoomList setRtcRecordId(String rtcRecordId) {
            this.rtcRecordId = rtcRecordId;
            return this;
        }
        public String getRtcRecordId() {
            return this.rtcRecordId;
        }

    }

    public static class GetRecordResultResponseBodyData extends TeaModel {
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
        public java.util.List<GetRecordResultResponseBodyDataRecordRoomList> recordRoomList;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetRecordResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRecordResultResponseBodyData self = new GetRecordResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRecordResultResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetRecordResultResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRecordResultResponseBodyData setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetRecordResultResponseBodyData setDetectProcessName(String detectProcessName) {
            this.detectProcessName = detectProcessName;
            return this;
        }
        public String getDetectProcessName() {
            return this.detectProcessName;
        }

        public GetRecordResultResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetRecordResultResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRecordResultResponseBodyData setMetaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
            return this;
        }
        public String getMetaUrl() {
            return this.metaUrl;
        }

        public GetRecordResultResponseBodyData setOuterBusinessId(String outerBusinessId) {
            this.outerBusinessId = outerBusinessId;
            return this;
        }
        public String getOuterBusinessId() {
            return this.outerBusinessId;
        }

        public GetRecordResultResponseBodyData setRecordAt(String recordAt) {
            this.recordAt = recordAt;
            return this;
        }
        public String getRecordAt() {
            return this.recordAt;
        }

        public GetRecordResultResponseBodyData setRecordRoomList(java.util.List<GetRecordResultResponseBodyDataRecordRoomList> recordRoomList) {
            this.recordRoomList = recordRoomList;
            return this;
        }
        public java.util.List<GetRecordResultResponseBodyDataRecordRoomList> getRecordRoomList() {
            return this.recordRoomList;
        }

        public GetRecordResultResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetRecordResultResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetRecordResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRecordResultResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class GetRecordResultResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static GetRecordResultResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            GetRecordResultResponseBodyErrors self = new GetRecordResultResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public GetRecordResultResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetRecordResultResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
