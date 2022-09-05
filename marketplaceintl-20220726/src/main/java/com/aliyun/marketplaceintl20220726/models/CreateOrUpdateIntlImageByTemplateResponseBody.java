// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIntlImageByTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateOrUpdateIntlImageByTemplateResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateOrUpdateIntlImageByTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIntlImageByTemplateResponseBody self = new CreateOrUpdateIntlImageByTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIntlImageByTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateOrUpdateIntlImageByTemplateResponseBody setData(CreateOrUpdateIntlImageByTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrUpdateIntlImageByTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateOrUpdateIntlImageByTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOrUpdateIntlImageByTemplateResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateOrUpdateIntlImageByTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateIntlImageByTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrUpdateIntlImageByTemplateResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("TrackId")
        public String trackId;

        public static CreateOrUpdateIntlImageByTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageByTemplateResponseBodyData self = new CreateOrUpdateIntlImageByTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageByTemplateResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateOrUpdateIntlImageByTemplateResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
