// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordsByFeeIdResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetRecordsByFeeIdResponseBodyData> data;

    @NameInMap("Errors")
    public java.util.List<GetRecordsByFeeIdResponseBodyErrors> errors;

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

    public static GetRecordsByFeeIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsByFeeIdResponseBody self = new GetRecordsByFeeIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordsByFeeIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRecordsByFeeIdResponseBody setData(java.util.List<GetRecordsByFeeIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRecordsByFeeIdResponseBodyData> getData() {
        return this.data;
    }

    public GetRecordsByFeeIdResponseBody setErrors(java.util.List<GetRecordsByFeeIdResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<GetRecordsByFeeIdResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public GetRecordsByFeeIdResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetRecordsByFeeIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecordsByFeeIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecordsByFeeIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRecordsByFeeIdResponseBodyDataRecordRoomList extends TeaModel {
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

        public static GetRecordsByFeeIdResponseBodyDataRecordRoomList build(java.util.Map<String, ?> map) throws Exception {
            GetRecordsByFeeIdResponseBodyDataRecordRoomList self = new GetRecordsByFeeIdResponseBodyDataRecordRoomList();
            return TeaModel.build(map, self);
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setOuterBusinessId(String outerBusinessId) {
            this.outerBusinessId = outerBusinessId;
            return this;
        }
        public String getOuterBusinessId() {
            return this.outerBusinessId;
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setRoomMetaUrl(String roomMetaUrl) {
            this.roomMetaUrl = roomMetaUrl;
            return this;
        }
        public String getRoomMetaUrl() {
            return this.roomMetaUrl;
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setRoomRecordAt(String roomRecordAt) {
            this.roomRecordAt = roomRecordAt;
            return this;
        }
        public String getRoomRecordAt() {
            return this.roomRecordAt;
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setRoomResultUrl(String roomResultUrl) {
            this.roomResultUrl = roomResultUrl;
            return this;
        }
        public String getRoomResultUrl() {
            return this.roomResultUrl;
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setRoomStatus(String roomStatus) {
            this.roomStatus = roomStatus;
            return this;
        }
        public String getRoomStatus() {
            return this.roomStatus;
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setRoomVideoUrl(String roomVideoUrl) {
            this.roomVideoUrl = roomVideoUrl;
            return this;
        }
        public String getRoomVideoUrl() {
            return this.roomVideoUrl;
        }

        public GetRecordsByFeeIdResponseBodyDataRecordRoomList setRtcRecordId(String rtcRecordId) {
            this.rtcRecordId = rtcRecordId;
            return this;
        }
        public String getRtcRecordId() {
            return this.rtcRecordId;
        }

    }

    public static class GetRecordsByFeeIdResponseBodyData extends TeaModel {
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
        public java.util.List<GetRecordsByFeeIdResponseBodyDataRecordRoomList> recordRoomList;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetRecordsByFeeIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRecordsByFeeIdResponseBodyData self = new GetRecordsByFeeIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRecordsByFeeIdResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetRecordsByFeeIdResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRecordsByFeeIdResponseBodyData setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetRecordsByFeeIdResponseBodyData setDetectProcessName(String detectProcessName) {
            this.detectProcessName = detectProcessName;
            return this;
        }
        public String getDetectProcessName() {
            return this.detectProcessName;
        }

        public GetRecordsByFeeIdResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetRecordsByFeeIdResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRecordsByFeeIdResponseBodyData setMetaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
            return this;
        }
        public String getMetaUrl() {
            return this.metaUrl;
        }

        public GetRecordsByFeeIdResponseBodyData setOuterBusinessId(String outerBusinessId) {
            this.outerBusinessId = outerBusinessId;
            return this;
        }
        public String getOuterBusinessId() {
            return this.outerBusinessId;
        }

        public GetRecordsByFeeIdResponseBodyData setRecordAt(String recordAt) {
            this.recordAt = recordAt;
            return this;
        }
        public String getRecordAt() {
            return this.recordAt;
        }

        public GetRecordsByFeeIdResponseBodyData setRecordRoomList(java.util.List<GetRecordsByFeeIdResponseBodyDataRecordRoomList> recordRoomList) {
            this.recordRoomList = recordRoomList;
            return this;
        }
        public java.util.List<GetRecordsByFeeIdResponseBodyDataRecordRoomList> getRecordRoomList() {
            return this.recordRoomList;
        }

        public GetRecordsByFeeIdResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetRecordsByFeeIdResponseBodyData setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetRecordsByFeeIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRecordsByFeeIdResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class GetRecordsByFeeIdResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static GetRecordsByFeeIdResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            GetRecordsByFeeIdResponseBodyErrors self = new GetRecordsByFeeIdResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public GetRecordsByFeeIdResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetRecordsByFeeIdResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
