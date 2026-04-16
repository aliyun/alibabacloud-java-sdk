// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudStartTaskResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudStartTaskResponseBodyData data;

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

    public static CloudStartTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudStartTaskResponseBody self = new CloudStartTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudStartTaskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudStartTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudStartTaskResponseBody setData(CloudStartTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudStartTaskResponseBodyData getData() {
        return this.data;
    }

    public CloudStartTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudStartTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudStartTaskResponseBodyData extends TeaModel {
        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudStartTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudStartTaskResponseBodyData self = new CloudStartTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudStartTaskResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
