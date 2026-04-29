// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteQueueResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudDeleteQueueResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9FF70B74-1B3C-44C1-ACDF-8DF962988F0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudDeleteQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteQueueResponseBody self = new CloudDeleteQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudDeleteQueueResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudDeleteQueueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudDeleteQueueResponseBody setData(CloudDeleteQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudDeleteQueueResponseBodyData getData() {
        return this.data;
    }

    public CloudDeleteQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudDeleteQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudDeleteQueueResponseBodyData extends TeaModel {
        /**
         * <p>0-成功，其它-失败</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudDeleteQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudDeleteQueueResponseBodyData self = new CloudDeleteQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudDeleteQueueResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
