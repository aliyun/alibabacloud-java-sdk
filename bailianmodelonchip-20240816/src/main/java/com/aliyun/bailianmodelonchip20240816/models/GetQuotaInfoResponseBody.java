// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetQuotaInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetQuotaInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7B0FC4BC-9E4B-5AD7-9D35-6559BDC0788E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static GetQuotaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaInfoResponseBody self = new GetQuotaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQuotaInfoResponseBody setData(GetQuotaInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQuotaInfoResponseBodyData getData() {
        return this.data;
    }

    public GetQuotaInfoResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQuotaInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQuotaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQuotaInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQuotaInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("activeLicenseCount")
        public Long activeLicenseCount;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("durationType")
        public Integer durationType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("licenseCount")
        public Long licenseCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxQps")
        public Integer maxQps;

        /**
         * <strong>example:</strong>
         * <p>el3SzmCU2p0x4RBc</p>
         */
        @NameInMap("productKey")
        public String productKey;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("purchaseModel")
        public Integer purchaseModel;

        /**
         * <strong>example:</strong>
         * <p>51505222</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("tokenNumber")
        public Long tokenNumber;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetQuotaInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaInfoResponseBodyData self = new GetQuotaInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQuotaInfoResponseBodyData setActiveLicenseCount(Long activeLicenseCount) {
            this.activeLicenseCount = activeLicenseCount;
            return this;
        }
        public Long getActiveLicenseCount() {
            return this.activeLicenseCount;
        }

        public GetQuotaInfoResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetQuotaInfoResponseBodyData setDurationType(Integer durationType) {
            this.durationType = durationType;
            return this;
        }
        public Integer getDurationType() {
            return this.durationType;
        }

        public GetQuotaInfoResponseBodyData setLicenseCount(Long licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }
        public Long getLicenseCount() {
            return this.licenseCount;
        }

        public GetQuotaInfoResponseBodyData setMaxQps(Integer maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Integer getMaxQps() {
            return this.maxQps;
        }

        public GetQuotaInfoResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetQuotaInfoResponseBodyData setPurchaseModel(Integer purchaseModel) {
            this.purchaseModel = purchaseModel;
            return this;
        }
        public Integer getPurchaseModel() {
            return this.purchaseModel;
        }

        public GetQuotaInfoResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetQuotaInfoResponseBodyData setTokenNumber(Long tokenNumber) {
            this.tokenNumber = tokenNumber;
            return this;
        }
        public Long getTokenNumber() {
            return this.tokenNumber;
        }

        public GetQuotaInfoResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
