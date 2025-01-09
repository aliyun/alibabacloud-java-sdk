// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceLicenseResponseBody extends TeaModel {
    @NameInMap("License")
    public GetInstanceLicenseResponseBodyLicense license;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLicenseResponseBody self = new GetInstanceLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceLicenseResponseBody setLicense(GetInstanceLicenseResponseBodyLicense license) {
        this.license = license;
        return this;
    }
    public GetInstanceLicenseResponseBodyLicense getLicense() {
        return this.license;
    }

    public GetInstanceLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceLicenseResponseBodyLicense extends TeaModel {
        /**
         * <p>License 的版本型号,free-免费版，trail-试用版，enterprise-企业版</p>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("Edition")
        public String edition;

        /**
         * <p>License 的有效期终止日期</p>
         * 
         * <strong>example:</strong>
         * <p>1723996800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>License 的付费类型，prepay-预付费，postpay-后付费</p>
         * 
         * <strong>example:</strong>
         * <p>prepay</p>
         */
        @NameInMap("LicenseChargeType")
        public String licenseChargeType;

        /**
         * <p>License 详细配置JSON</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;modules&quot;:[{&quot;features&quot;:[{&quot;name&quot;:&quot;urn:alibaba:idaas:license:module:ud:customField&quot;,&quot;status&quot;:&quot;enabled&quot;}]……{&quot;name&quot;:&quot;urn:alibaba:idaas:license:tag:enterprise&quot;,&quot;status&quot;:&quot;enabled&quot;}],&quot;version&quot;:&quot;1.0&quot;}</p>
         */
        @NameInMap("LicenseConfigJson")
        public String licenseConfigJson;

        /**
         * <p>License 的创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1720509699000</p>
         */
        @NameInMap("LicenseCreateTime")
        public Long licenseCreateTime;

        /**
         * <p>License 的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>license_1234xxxx</p>
         */
        @NameInMap("LicenseId")
        public String licenseId;

        /**
         * <p>License 的状态，valid-有效，expired-已过期，released-已释放</p>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("LicenseStatus")
        public String licenseStatus;

        /**
         * <p>License 的购买渠道</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("PurchaseChannel")
        public String purchaseChannel;

        /**
         * <p>License 对应的外部商品唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-cn-xxxxx</p>
         */
        @NameInMap("PurchaseInstanceId")
        public String purchaseInstanceId;

        /**
         * <p>License 的有效期开始日期</p>
         * 
         * <strong>example:</strong>
         * <p>1720509699000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>License 的用户配额</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UserQuota")
        public Long userQuota;

        public static GetInstanceLicenseResponseBodyLicense build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceLicenseResponseBodyLicense self = new GetInstanceLicenseResponseBodyLicense();
            return TeaModel.build(map, self);
        }

        public GetInstanceLicenseResponseBodyLicense setEdition(String edition) {
            this.edition = edition;
            return this;
        }
        public String getEdition() {
            return this.edition;
        }

        public GetInstanceLicenseResponseBodyLicense setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetInstanceLicenseResponseBodyLicense setLicenseChargeType(String licenseChargeType) {
            this.licenseChargeType = licenseChargeType;
            return this;
        }
        public String getLicenseChargeType() {
            return this.licenseChargeType;
        }

        public GetInstanceLicenseResponseBodyLicense setLicenseConfigJson(String licenseConfigJson) {
            this.licenseConfigJson = licenseConfigJson;
            return this;
        }
        public String getLicenseConfigJson() {
            return this.licenseConfigJson;
        }

        public GetInstanceLicenseResponseBodyLicense setLicenseCreateTime(Long licenseCreateTime) {
            this.licenseCreateTime = licenseCreateTime;
            return this;
        }
        public Long getLicenseCreateTime() {
            return this.licenseCreateTime;
        }

        public GetInstanceLicenseResponseBodyLicense setLicenseId(String licenseId) {
            this.licenseId = licenseId;
            return this;
        }
        public String getLicenseId() {
            return this.licenseId;
        }

        public GetInstanceLicenseResponseBodyLicense setLicenseStatus(String licenseStatus) {
            this.licenseStatus = licenseStatus;
            return this;
        }
        public String getLicenseStatus() {
            return this.licenseStatus;
        }

        public GetInstanceLicenseResponseBodyLicense setPurchaseChannel(String purchaseChannel) {
            this.purchaseChannel = purchaseChannel;
            return this;
        }
        public String getPurchaseChannel() {
            return this.purchaseChannel;
        }

        public GetInstanceLicenseResponseBodyLicense setPurchaseInstanceId(String purchaseInstanceId) {
            this.purchaseInstanceId = purchaseInstanceId;
            return this;
        }
        public String getPurchaseInstanceId() {
            return this.purchaseInstanceId;
        }

        public GetInstanceLicenseResponseBodyLicense setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetInstanceLicenseResponseBodyLicense setUserQuota(Long userQuota) {
            this.userQuota = userQuota;
            return this;
        }
        public Long getUserQuota() {
            return this.userQuota;
        }

    }

}
