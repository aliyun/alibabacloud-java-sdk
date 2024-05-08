// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateSignatureResponseBody extends TeaModel {
    /**
     * <p>code</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSignatureResponseBodyData data;

    @NameInMap("Errors")
    public java.util.List<CreateSignatureResponseBodyErrors> errors;

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

    public static CreateSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSignatureResponseBody self = new CreateSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSignatureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSignatureResponseBody setData(CreateSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSignatureResponseBodyData getData() {
        return this.data;
    }

    public CreateSignatureResponseBody setErrors(java.util.List<CreateSignatureResponseBodyErrors> errors) {
        this.errors = errors;
        return this;
    }
    public java.util.List<CreateSignatureResponseBodyErrors> getErrors() {
        return this.errors;
    }

    public CreateSignatureResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateSignatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSignatureResponseBodyData extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("RtcAppId")
        public String rtcAppId;

        @NameInMap("RtcBizName")
        public String rtcBizName;

        @NameInMap("RtcSign")
        public String rtcSign;

        @NameInMap("RtcWorkspaceId")
        public String rtcWorkspaceId;

        public static CreateSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSignatureResponseBodyData self = new CreateSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSignatureResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public CreateSignatureResponseBodyData setRtcAppId(String rtcAppId) {
            this.rtcAppId = rtcAppId;
            return this;
        }
        public String getRtcAppId() {
            return this.rtcAppId;
        }

        public CreateSignatureResponseBodyData setRtcBizName(String rtcBizName) {
            this.rtcBizName = rtcBizName;
            return this;
        }
        public String getRtcBizName() {
            return this.rtcBizName;
        }

        public CreateSignatureResponseBodyData setRtcSign(String rtcSign) {
            this.rtcSign = rtcSign;
            return this;
        }
        public String getRtcSign() {
            return this.rtcSign;
        }

        public CreateSignatureResponseBodyData setRtcWorkspaceId(String rtcWorkspaceId) {
            this.rtcWorkspaceId = rtcWorkspaceId;
            return this;
        }
        public String getRtcWorkspaceId() {
            return this.rtcWorkspaceId;
        }

    }

    public static class CreateSignatureResponseBodyErrors extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Message")
        public String message;

        public static CreateSignatureResponseBodyErrors build(java.util.Map<String, ?> map) throws Exception {
            CreateSignatureResponseBodyErrors self = new CreateSignatureResponseBodyErrors();
            return TeaModel.build(map, self);
        }

        public CreateSignatureResponseBodyErrors setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateSignatureResponseBodyErrors setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
