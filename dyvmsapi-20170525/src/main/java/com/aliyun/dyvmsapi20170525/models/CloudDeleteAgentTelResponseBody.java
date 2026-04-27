// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteAgentTelResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudDeleteAgentTelResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudDeleteAgentTelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteAgentTelResponseBody self = new CloudDeleteAgentTelResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudDeleteAgentTelResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudDeleteAgentTelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudDeleteAgentTelResponseBody setData(CloudDeleteAgentTelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudDeleteAgentTelResponseBodyData getData() {
        return this.data;
    }

    public CloudDeleteAgentTelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudDeleteAgentTelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudDeleteAgentTelResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudDeleteAgentTelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudDeleteAgentTelResponseBodyData self = new CloudDeleteAgentTelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudDeleteAgentTelResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
