// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class TempOssUrlIntlResponseBody extends TeaModel {
    /**
     * <p>Return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Result.</p>
     */
    @NameInMap("Data")
    public TempOssUrlIntlResponseBodyData data;

    /**
     * <p>Return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EFA11401-C961-5E89-A2D3-BF9883E5CC3D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TempOssUrlIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TempOssUrlIntlResponseBody self = new TempOssUrlIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public TempOssUrlIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TempOssUrlIntlResponseBody setData(TempOssUrlIntlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TempOssUrlIntlResponseBodyData getData() {
        return this.data;
    }

    public TempOssUrlIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TempOssUrlIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TempOssUrlIntlResponseBodyData extends TeaModel {
        /**
         * <p>File URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://bzxh.cdn.weijin365.com/assets/index-55338127.png">http://bzxh.cdn.weijin365.com/assets/index-55338127.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static TempOssUrlIntlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TempOssUrlIntlResponseBodyData self = new TempOssUrlIntlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TempOssUrlIntlResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
