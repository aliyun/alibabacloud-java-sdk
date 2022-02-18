// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordsByFeeIdResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public java.util.List<GetRecordsByFeeIdResponseBodyData> data;

    // 错误列表
    @NameInMap("Errors")
    public java.util.List<GetRecordsByFeeIdResponseBodyErrors> errors;

    @NameInMap("HttpCode")
    public Integer httpCode;

    // 提示
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // 给 pop 使用的
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

    public static class GetRecordsByFeeIdResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("DetectProcessId")
        public Long detectProcessId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("FeeId")
        public String feeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MetaUrl")
        public String metaUrl;

        @NameInMap("PublicId")
        public String publicId;

        @NameInMap("RecordAt")
        public String recordAt;

        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static GetRecordsByFeeIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRecordsByFeeIdResponseBodyData self = new GetRecordsByFeeIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRecordsByFeeIdResponseBodyData setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public GetRecordsByFeeIdResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRecordsByFeeIdResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetRecordsByFeeIdResponseBodyData setDetectProcessId(Long detectProcessId) {
            this.detectProcessId = detectProcessId;
            return this;
        }
        public Long getDetectProcessId() {
            return this.detectProcessId;
        }

        public GetRecordsByFeeIdResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetRecordsByFeeIdResponseBodyData setFeeId(String feeId) {
            this.feeId = feeId;
            return this;
        }
        public String getFeeId() {
            return this.feeId;
        }

        public GetRecordsByFeeIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRecordsByFeeIdResponseBodyData setMetaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
            return this;
        }
        public String getMetaUrl() {
            return this.metaUrl;
        }

        public GetRecordsByFeeIdResponseBodyData setPublicId(String publicId) {
            this.publicId = publicId;
            return this;
        }
        public String getPublicId() {
            return this.publicId;
        }

        public GetRecordsByFeeIdResponseBodyData setRecordAt(String recordAt) {
            this.recordAt = recordAt;
            return this;
        }
        public String getRecordAt() {
            return this.recordAt;
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

        public GetRecordsByFeeIdResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetRecordsByFeeIdResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRecordsByFeeIdResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetRecordsByFeeIdResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
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
