// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public GetTotalPublicUrlResponseData data;

    public static GetTotalPublicUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTotalPublicUrlResponse self = new GetTotalPublicUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetTotalPublicUrlResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTotalPublicUrlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTotalPublicUrlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTotalPublicUrlResponse setData(GetTotalPublicUrlResponseData data) {
        this.data = data;
        return this;
    }
    public GetTotalPublicUrlResponseData getData() {
        return this.data;
    }

    public static class GetTotalPublicUrlResponseData extends TeaModel {
        @NameInMap("PhonePublicUrl")
        @Validation(required = true)
        public String phonePublicUrl;

        @NameInMap("RingPublicUrl")
        @Validation(required = true)
        public String ringPublicUrl;

        public static GetTotalPublicUrlResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetTotalPublicUrlResponseData self = new GetTotalPublicUrlResponseData();
            return TeaModel.build(map, self);
        }

        public GetTotalPublicUrlResponseData setPhonePublicUrl(String phonePublicUrl) {
            this.phonePublicUrl = phonePublicUrl;
            return this;
        }
        public String getPhonePublicUrl() {
            return this.phonePublicUrl;
        }

        public GetTotalPublicUrlResponseData setRingPublicUrl(String ringPublicUrl) {
            this.ringPublicUrl = ringPublicUrl;
            return this;
        }
        public String getRingPublicUrl() {
            return this.ringPublicUrl;
        }

    }

}
