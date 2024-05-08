// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UploadReportResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadReportResponseBodyData data;

    @NameInMap("Errors")
    public java.util.List<UploadReportResponseBodyErrors> errors;

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

    public static UploadReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadReportResponseBody self = new UploadReportResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadReportResponseBody setData(UploadReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadReportResponseBodyData getData() {
        return this.data;
    }

    public UploadReportResponseBody setErrors(java.util.List<UploadReportResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<UploadReportResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public UploadReportResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UploadReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadReportResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

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

        @NameInMap("RtcRecordId")
        public String rtcRecordId;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static UploadReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadReportResponseBodyData self = new UploadReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadReportResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UploadReportResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public UploadReportResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UploadReportResponseBodyData setMetaUrl(String metaUrl) {
            this.metaUrl = metaUrl;
            return this;
        }
        public String getMetaUrl() {
            return this.metaUrl;
        }

        public UploadReportResponseBodyData setOuterBusinessId(String outerBusinessId) {
            this.outerBusinessId = outerBusinessId;
            return this;
        }
        public String getOuterBusinessId() {
            return this.outerBusinessId;
        }

        public UploadReportResponseBodyData setRecordAt(String recordAt) {
            this.recordAt = recordAt;
            return this;
        }
        public String getRecordAt() {
            return this.recordAt;
        }

        public UploadReportResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public UploadReportResponseBodyData setRtcRecordId(String rtcRecordId) {
            this.rtcRecordId = rtcRecordId;
            return this;
        }
        public String getRtcRecordId() {
            return this.rtcRecordId;
        }

        public UploadReportResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class UploadReportResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static UploadReportResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            UploadReportResponseBodyErrors self = new UploadReportResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public UploadReportResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public UploadReportResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
