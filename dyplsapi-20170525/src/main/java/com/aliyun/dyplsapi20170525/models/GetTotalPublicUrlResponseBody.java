// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   Other status codes indicate that the request failed. For more information, see [Error codes](https://help.aliyun.com/document_detail/109196.html).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The download URLs of the recording files.</p>
     */
    @NameInMap("Data")
    public GetTotalPublicUrlResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The download URL of the recorded call.</p>
         * <br>
         * <p>>  The download URL of the recorded call is valid for 30 days.</p>
         */
        @NameInMap("PhonePublicUrl")
        public String phonePublicUrl;

        /**
         * <p>The download URL of the recorded ringing tone.</p>
         * <br>
         * <p>>  The download URL of the recorded ringing tone is valid for 30 days.</p>
         */
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
