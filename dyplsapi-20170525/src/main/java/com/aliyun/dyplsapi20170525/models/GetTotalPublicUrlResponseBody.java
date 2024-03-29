// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTotalPublicUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTotalPublicUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTotalPublicUrlResponseBody self = new GetTotalPublicUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTotalPublicUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTotalPublicUrlResponseBody setData(GetTotalPublicUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTotalPublicUrlResponseBodyData getData() {
        return this.data;
    }

    public GetTotalPublicUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTotalPublicUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTotalPublicUrlResponseBodyData extends TeaModel {
        @NameInMap("PhonePublicUrl")
        public String phonePublicUrl;

        @NameInMap("RingPublicUrl")
        public String ringPublicUrl;

        public static GetTotalPublicUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTotalPublicUrlResponseBodyData self = new GetTotalPublicUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTotalPublicUrlResponseBodyData setPhonePublicUrl(String phonePublicUrl) {
            this.phonePublicUrl = phonePublicUrl;
            return this;
        }
        public String getPhonePublicUrl() {
            return this.phonePublicUrl;
        }

        public GetTotalPublicUrlResponseBodyData setRingPublicUrl(String ringPublicUrl) {
            this.ringPublicUrl = ringPublicUrl;
            return this;
        }
        public String getRingPublicUrl() {
            return this.ringPublicUrl;
        }

    }

}
