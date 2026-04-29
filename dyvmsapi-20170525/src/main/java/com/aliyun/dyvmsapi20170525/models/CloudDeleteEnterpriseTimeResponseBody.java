// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteEnterpriseTimeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudDeleteEnterpriseTimeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8FA46FC5-24CB-53BE-94F6-30CD8D66751C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudDeleteEnterpriseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteEnterpriseTimeResponseBody self = new CloudDeleteEnterpriseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudDeleteEnterpriseTimeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudDeleteEnterpriseTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudDeleteEnterpriseTimeResponseBody setData(CloudDeleteEnterpriseTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudDeleteEnterpriseTimeResponseBodyData getData() {
        return this.data;
    }

    public CloudDeleteEnterpriseTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudDeleteEnterpriseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudDeleteEnterpriseTimeResponseBodyData extends TeaModel {
        /**
         * <p>结果</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudDeleteEnterpriseTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudDeleteEnterpriseTimeResponseBodyData self = new CloudDeleteEnterpriseTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudDeleteEnterpriseTimeResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
