// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyLogisticsSmsMailNoResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public VerifyLogisticsSmsMailNoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static VerifyLogisticsSmsMailNoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyLogisticsSmsMailNoResponseBody self = new VerifyLogisticsSmsMailNoResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyLogisticsSmsMailNoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public VerifyLogisticsSmsMailNoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyLogisticsSmsMailNoResponseBody setData(VerifyLogisticsSmsMailNoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyLogisticsSmsMailNoResponseBodyData getData() {
        return this.data;
    }

    public VerifyLogisticsSmsMailNoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyLogisticsSmsMailNoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyLogisticsSmsMailNoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyLogisticsSmsMailNoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ExpressCompanyCode")
        public String expressCompanyCode;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("MobileSuffix")
        public String mobileSuffix;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VerifyResult")
        public Boolean verifyResult;

        public static VerifyLogisticsSmsMailNoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyLogisticsSmsMailNoResponseBodyData self = new VerifyLogisticsSmsMailNoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyLogisticsSmsMailNoResponseBodyData setExpressCompanyCode(String expressCompanyCode) {
            this.expressCompanyCode = expressCompanyCode;
            return this;
        }
        public String getExpressCompanyCode() {
            return this.expressCompanyCode;
        }

        public VerifyLogisticsSmsMailNoResponseBodyData setMobileSuffix(String mobileSuffix) {
            this.mobileSuffix = mobileSuffix;
            return this;
        }
        public String getMobileSuffix() {
            return this.mobileSuffix;
        }

        public VerifyLogisticsSmsMailNoResponseBodyData setVerifyResult(Boolean verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Boolean getVerifyResult() {
            return this.verifyResult;
        }

    }

}
