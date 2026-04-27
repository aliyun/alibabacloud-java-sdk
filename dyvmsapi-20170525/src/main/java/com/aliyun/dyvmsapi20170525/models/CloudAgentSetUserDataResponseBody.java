// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentSetUserDataResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudAgentSetUserDataResponseBodyData data;

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

    public static CloudAgentSetUserDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentSetUserDataResponseBody self = new CloudAgentSetUserDataResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudAgentSetUserDataResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudAgentSetUserDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudAgentSetUserDataResponseBody setData(CloudAgentSetUserDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudAgentSetUserDataResponseBodyData getData() {
        return this.data;
    }

    public CloudAgentSetUserDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudAgentSetUserDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudAgentSetUserDataResponseBodyData extends TeaModel {
        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudAgentSetUserDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudAgentSetUserDataResponseBodyData self = new CloudAgentSetUserDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudAgentSetUserDataResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
