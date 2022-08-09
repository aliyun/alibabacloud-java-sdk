// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class UploadFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public UploadFileResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UploadFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFileResponseBody self = new UploadFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFileResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UploadFileResponseBody setData(UploadFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadFileResponseBodyData getData() {
        return this.data;
    }

    public UploadFileResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UploadFileResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UploadFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadFileResponseBodyData extends TeaModel {
        @NameInMap("TrackId")
        public String trackId;

        @NameInMap("Url")
        public String url;

        public static UploadFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadFileResponseBodyData self = new UploadFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadFileResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

        public UploadFileResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
