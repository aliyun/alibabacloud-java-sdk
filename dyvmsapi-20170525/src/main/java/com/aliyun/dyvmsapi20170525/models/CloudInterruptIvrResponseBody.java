// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudInterruptIvrResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudInterruptIvrResponseBodyData data;

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

    public static CloudInterruptIvrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudInterruptIvrResponseBody self = new CloudInterruptIvrResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudInterruptIvrResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudInterruptIvrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudInterruptIvrResponseBody setData(CloudInterruptIvrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudInterruptIvrResponseBodyData getData() {
        return this.data;
    }

    public CloudInterruptIvrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudInterruptIvrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudInterruptIvrResponseBodyData extends TeaModel {
        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudInterruptIvrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudInterruptIvrResponseBodyData self = new CloudInterruptIvrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudInterruptIvrResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
