// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAsrResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudCreateAsrResponseBodyData data;

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

    public static CloudCreateAsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAsrResponseBody self = new CloudCreateAsrResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudCreateAsrResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudCreateAsrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudCreateAsrResponseBody setData(CloudCreateAsrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudCreateAsrResponseBodyData getData() {
        return this.data;
    }

    public CloudCreateAsrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudCreateAsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudCreateAsrResponseBodyData extends TeaModel {
        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudCreateAsrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateAsrResponseBodyData self = new CloudCreateAsrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudCreateAsrResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
