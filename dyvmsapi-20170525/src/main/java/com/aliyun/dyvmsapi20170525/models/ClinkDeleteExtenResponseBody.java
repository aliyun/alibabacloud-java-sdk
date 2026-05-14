// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDeleteExtenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
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
    public ClinkDeleteExtenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkDeleteExtenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDeleteExtenResponseBody self = new ClinkDeleteExtenResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDeleteExtenResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDeleteExtenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDeleteExtenResponseBody setData(ClinkDeleteExtenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDeleteExtenResponseBodyData getData() {
        return this.data;
    }

    public ClinkDeleteExtenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDeleteExtenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDeleteExtenResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>话机号码</p>
         * 
         * <strong>example:</strong>
         * <p>333</p>
         */
        @NameInMap("Exten")
        public String exten;

        public static ClinkDeleteExtenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDeleteExtenResponseBodyData self = new ClinkDeleteExtenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDeleteExtenResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkDeleteExtenResponseBodyData setExten(String exten) {
            this.exten = exten;
            return this;
        }
        public String getExten() {
            return this.exten;
        }

    }

}
