// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDeleteClientResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkDeleteClientResponseBodyData data;

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

    public static ClinkDeleteClientResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDeleteClientResponseBody self = new ClinkDeleteClientResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDeleteClientResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDeleteClientResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDeleteClientResponseBody setData(ClinkDeleteClientResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDeleteClientResponseBodyData getData() {
        return this.data;
    }

    public ClinkDeleteClientResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDeleteClientResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDeleteClientResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        public static ClinkDeleteClientResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDeleteClientResponseBodyData self = new ClinkDeleteClientResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDeleteClientResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkDeleteClientResponseBodyData setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

    }

}
