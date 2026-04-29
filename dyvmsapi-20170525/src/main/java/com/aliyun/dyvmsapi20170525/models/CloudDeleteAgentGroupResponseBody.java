// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteAgentGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudDeleteAgentGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9927CD06-C33A-50CC-A9BB-A3427967A66F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudDeleteAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteAgentGroupResponseBody self = new CloudDeleteAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudDeleteAgentGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudDeleteAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudDeleteAgentGroupResponseBody setData(CloudDeleteAgentGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudDeleteAgentGroupResponseBodyData getData() {
        return this.data;
    }

    public CloudDeleteAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudDeleteAgentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudDeleteAgentGroupResponseBodyData extends TeaModel {
        /**
         * <p>0-成功，其它-失败</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudDeleteAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudDeleteAgentGroupResponseBodyData self = new CloudDeleteAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudDeleteAgentGroupResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
