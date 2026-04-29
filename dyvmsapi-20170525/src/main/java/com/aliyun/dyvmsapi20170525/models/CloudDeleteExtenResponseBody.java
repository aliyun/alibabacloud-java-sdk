// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteExtenResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudDeleteExtenResponseBodyData data;

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

    public static CloudDeleteExtenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteExtenResponseBody self = new CloudDeleteExtenResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudDeleteExtenResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudDeleteExtenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudDeleteExtenResponseBody setData(CloudDeleteExtenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudDeleteExtenResponseBodyData getData() {
        return this.data;
    }

    public CloudDeleteExtenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudDeleteExtenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudDeleteExtenResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudDeleteExtenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudDeleteExtenResponseBodyData self = new CloudDeleteExtenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudDeleteExtenResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
