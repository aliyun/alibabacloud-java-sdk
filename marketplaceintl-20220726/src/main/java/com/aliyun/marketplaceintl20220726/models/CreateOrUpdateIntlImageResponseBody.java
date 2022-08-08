// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIntlImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateOrUpdateIntlImageResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateOrUpdateIntlImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIntlImageResponseBody self = new CreateOrUpdateIntlImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIntlImageResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateOrUpdateIntlImageResponseBody setData(CreateOrUpdateIntlImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrUpdateIntlImageResponseBodyData getData() {
        return this.data;
    }

    public CreateOrUpdateIntlImageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOrUpdateIntlImageResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CreateOrUpdateIntlImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateIntlImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrUpdateIntlImageResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("TrackId")
        public String trackId;

        public static CreateOrUpdateIntlImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateIntlImageResponseBodyData self = new CreateOrUpdateIntlImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateIntlImageResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateOrUpdateIntlImageResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
