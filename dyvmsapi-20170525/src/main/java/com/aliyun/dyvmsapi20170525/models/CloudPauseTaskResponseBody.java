// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudPauseTaskResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudPauseTaskResponseBodyData data;

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

    public static CloudPauseTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudPauseTaskResponseBody self = new CloudPauseTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudPauseTaskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudPauseTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudPauseTaskResponseBody setData(CloudPauseTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudPauseTaskResponseBodyData getData() {
        return this.data;
    }

    public CloudPauseTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudPauseTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudPauseTaskResponseBodyData extends TeaModel {
        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudPauseTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudPauseTaskResponseBodyData self = new CloudPauseTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudPauseTaskResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
