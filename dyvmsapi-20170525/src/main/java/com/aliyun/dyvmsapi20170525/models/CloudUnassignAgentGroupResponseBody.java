// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudUnassignAgentGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudUnassignAgentGroupResponseBodyData data;

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

    public static CloudUnassignAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudUnassignAgentGroupResponseBody self = new CloudUnassignAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudUnassignAgentGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudUnassignAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudUnassignAgentGroupResponseBody setData(CloudUnassignAgentGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudUnassignAgentGroupResponseBodyData getData() {
        return this.data;
    }

    public CloudUnassignAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudUnassignAgentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudUnassignAgentGroupResponseBodyData extends TeaModel {
        /**
         * <p>0-成功，其它-失败</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudUnassignAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudUnassignAgentGroupResponseBodyData self = new CloudUnassignAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudUnassignAgentGroupResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
