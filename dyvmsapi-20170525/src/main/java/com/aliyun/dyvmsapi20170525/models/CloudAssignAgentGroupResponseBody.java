// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAssignAgentGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudAssignAgentGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudAssignAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudAssignAgentGroupResponseBody self = new CloudAssignAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudAssignAgentGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudAssignAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudAssignAgentGroupResponseBody setData(CloudAssignAgentGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudAssignAgentGroupResponseBodyData getData() {
        return this.data;
    }

    public CloudAssignAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudAssignAgentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudAssignAgentGroupResponseBodyData extends TeaModel {
        /**
         * <p>0-成功，1-失败</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudAssignAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudAssignAgentGroupResponseBodyData self = new CloudAssignAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudAssignAgentGroupResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
