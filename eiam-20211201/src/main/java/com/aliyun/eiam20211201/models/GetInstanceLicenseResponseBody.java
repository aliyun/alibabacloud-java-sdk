// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceLicenseResponseBody extends TeaModel {
    /**
     * <p>Returned result.</p>
     */
    @NameInMap("License")
    public GetInstanceLicenseResponseBodyLicense license;

    /**
     * <p>Request ID</p>
     * 
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
         * <p>Edition of the License</p>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("Edition")
        public String edition;

        /**
         * <p>End date of the validity period of the License, timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1723996800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Payment type of the License</p>
         * 
         * <strong>example:</strong>
         * <p>prepay</p>
         */
        @NameInMap("LicenseChargeType")
        public String licenseChargeType;

        /**
         * <p>Detailed configuration JSON string of the License</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;modules&quot;:[{&quot;features&quot;:[{&quot;name&quot;:&quot;urn:alibaba:idaas:license:module:ud:customField&quot;,&quot;status&quot;:&quot;enabled&quot;}]……{&quot;name&quot;:&quot;urn:alibaba:idaas:license:tag:enterprise&quot;,&quot;status&quot;:&quot;enabled&quot;}],&quot;version&quot;:&quot;1.0&quot;}</p>
         */
        @NameInMap("LicenseConfigJson")
        public String licenseConfigJson;

        /**
         * <p>Creation time of the License, timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1720509699000</p>
         */
        @NameInMap("LicenseCreateTime")
        public Long licenseCreateTime;

        /**
         * <p>Unique identifier of the License</p>
         * 
         * <strong>example:</strong>
         * <p>license_1234xxxx</p>
         */
        @NameInMap("LicenseId")
        public String licenseId;

        /**
         * <p>Status of the License</p>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("LicenseStatus")
        public String licenseStatus;

        /**
         * <p>Purchase channel of the License</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("PurchaseChannel")
        public String purchaseChannel;

        /**
         * <p>Unique external product identifier corresponding to the License</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-cn-xxxxx</p>
         */
        @NameInMap("PurchaseInstanceId")
        public String purchaseInstanceId;

        /**
         * <p>Start date of the validity period of the License, timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1720509699000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>User quota of the License</p>
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
