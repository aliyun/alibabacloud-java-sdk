// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteTaskTelResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudDeleteTaskTelResponseBodyData data;

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

    public static CloudDeleteTaskTelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteTaskTelResponseBody self = new CloudDeleteTaskTelResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudDeleteTaskTelResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudDeleteTaskTelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudDeleteTaskTelResponseBody setData(CloudDeleteTaskTelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudDeleteTaskTelResponseBodyData getData() {
        return this.data;
    }

    public CloudDeleteTaskTelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudDeleteTaskTelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudDeleteTaskTelResponseBodyData extends TeaModel {
        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudDeleteTaskTelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudDeleteTaskTelResponseBodyData self = new CloudDeleteTaskTelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudDeleteTaskTelResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
