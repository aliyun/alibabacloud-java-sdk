// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkBindClientTelResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkBindClientTelResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkBindClientTelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkBindClientTelResponseBody self = new ClinkBindClientTelResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkBindClientTelResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkBindClientTelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkBindClientTelResponseBody setData(ClinkBindClientTelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkBindClientTelResponseBodyData getData() {
        return this.data;
    }

    public ClinkBindClientTelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkBindClientTelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkBindClientTelResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkBindClientTelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkBindClientTelResponseBodyData self = new ClinkBindClientTelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkBindClientTelResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
