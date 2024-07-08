// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class UAIDVerificationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UAIDVerificationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD******177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UAIDVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UAIDVerificationResponseBody self = new UAIDVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public UAIDVerificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UAIDVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UAIDVerificationResponseBody setData(UAIDVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UAIDVerificationResponseBodyData getData() {
        return this.data;
    }

    public UAIDVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UAIDVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UAIDVerificationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>B1E0C1********9F757AF52A035</p>
         */
        @NameInMap("Uaid")
        public String uaid;

        public static UAIDVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UAIDVerificationResponseBodyData self = new UAIDVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UAIDVerificationResponseBodyData setUaid(String uaid) {
            this.uaid = uaid;
            return this;
        }
        public String getUaid() {
            return this.uaid;
        }

    }

}
