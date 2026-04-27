// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentUnlinkResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudAgentUnlinkResponseBodyData data;

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

    public static CloudAgentUnlinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentUnlinkResponseBody self = new CloudAgentUnlinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudAgentUnlinkResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudAgentUnlinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudAgentUnlinkResponseBody setData(CloudAgentUnlinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudAgentUnlinkResponseBodyData getData() {
        return this.data;
    }

    public CloudAgentUnlinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudAgentUnlinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudAgentUnlinkResponseBodyData extends TeaModel {
        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudAgentUnlinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudAgentUnlinkResponseBodyData self = new CloudAgentUnlinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudAgentUnlinkResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
