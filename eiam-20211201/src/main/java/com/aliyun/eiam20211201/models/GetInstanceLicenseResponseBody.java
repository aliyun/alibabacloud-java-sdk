// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceLicenseResponseBody extends TeaModel {
    /**
     * <p>The license details.</p>
     */
    @NameInMap("License")
    public GetInstanceLicenseResponseBodyLicense license;

    /**
     * <p>The ID of the request.</p>
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

    public static class GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail extends TeaModel {
        /**
         * <p>The status of the license for the Conditional Access feature.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ConditionalAccessPolicyLicenseStatus")
        public String conditionalAccessPolicyLicenseStatus;

        /**
         * <p>The status of the license for machine-to-machine (M2M) applications.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("M2mApplicationLicenseStatus")
        public String m2mApplicationLicenseStatus;

        /**
         * <p>The quota for machine-to-machine (M2M) applications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("M2mApplicationQuota")
        public Long m2mApplicationQuota;

        /**
         * <p>The machine identity status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("MimApplicationLicenseStatus")
        public String mimApplicationLicenseStatus;

        /**
         * <p>The quota for network access endpoints.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NetworkAccessEndpointQuota")
        public Long networkAccessEndpointQuota;

        /**
         * <p>The number of active subscription accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PrepaidActiveUserNumber")
        public Long prepaidActiveUserNumber;

        /**
         * <p>The user quota included with the license.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UserQuota")
        public Long userQuota;

        public static GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail self = new GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail();
            return TeaModel.build(map, self);
        }

        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail setConditionalAccessPolicyLicenseStatus(String conditionalAccessPolicyLicenseStatus) {
            this.conditionalAccessPolicyLicenseStatus = conditionalAccessPolicyLicenseStatus;
            return this;
        }
        public String getConditionalAccessPolicyLicenseStatus() {
            return this.conditionalAccessPolicyLicenseStatus;
        }

        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail setM2mApplicationLicenseStatus(String m2mApplicationLicenseStatus) {
            this.m2mApplicationLicenseStatus = m2mApplicationLicenseStatus;
            return this;
        }
        public String getM2mApplicationLicenseStatus() {
            return this.m2mApplicationLicenseStatus;
        }

        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail setM2mApplicationQuota(Long m2mApplicationQuota) {
            this.m2mApplicationQuota = m2mApplicationQuota;
            return this;
        }
        public Long getM2mApplicationQuota() {
            return this.m2mApplicationQuota;
        }

        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail setMimApplicationLicenseStatus(String mimApplicationLicenseStatus) {
            this.mimApplicationLicenseStatus = mimApplicationLicenseStatus;
            return this;
        }
        public String getMimApplicationLicenseStatus() {
            return this.mimApplicationLicenseStatus;
        }

        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail setNetworkAccessEndpointQuota(Long networkAccessEndpointQuota) {
            this.networkAccessEndpointQuota = networkAccessEndpointQuota;
            return this;
        }
        public Long getNetworkAccessEndpointQuota() {
            return this.networkAccessEndpointQuota;
        }

        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail setPrepaidActiveUserNumber(Long prepaidActiveUserNumber) {
            this.prepaidActiveUserNumber = prepaidActiveUserNumber;
            return this;
        }
        public Long getPrepaidActiveUserNumber() {
            return this.prepaidActiveUserNumber;
        }

        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail setUserQuota(Long userQuota) {
            this.userQuota = userQuota;
            return this;
        }
        public Long getUserQuota() {
            return this.userQuota;
        }

    }

    public static class GetInstanceLicenseResponseBodyLicense extends TeaModel {
        /**
         * <p>The license edition.</p>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("Edition")
        public String edition;

        /**
         * <p>The UNIX timestamp indicating the end of the license validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>1723996800000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The details of the instance license.</p>
         */
        @NameInMap("InstanceLicenseDetail")
        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail instanceLicenseDetail;

        /**
         * <p>The billing method for the license.</p>
         * 
         * <strong>example:</strong>
         * <p>prepay</p>
         */
        @NameInMap("LicenseChargeType")
        public String licenseChargeType;

        /**
         * <p>The detailed configurations of the license, formatted as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;modules&quot;:[{&quot;features&quot;:[{&quot;name&quot;:&quot;urn:alibaba:idaas:license:module:ud:customField&quot;,&quot;status&quot;:&quot;enabled&quot;}]……{&quot;name&quot;:&quot;urn:alibaba:idaas:license:tag:enterprise&quot;,&quot;status&quot;:&quot;enabled&quot;}],&quot;version&quot;:&quot;1.0&quot;}</p>
         */
        @NameInMap("LicenseConfigJson")
        public String licenseConfigJson;

        /**
         * <p>The UNIX timestamp indicating when the license was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1720509699000</p>
         */
        @NameInMap("LicenseCreateTime")
        public Long licenseCreateTime;

        /**
         * <p>The unique identifier for the license.</p>
         * 
         * <strong>example:</strong>
         * <p>license_1234xxxx</p>
         */
        @NameInMap("LicenseId")
        public String licenseId;

        /**
         * <p>The license status.</p>
         * 
         * <strong>example:</strong>
         * <p>valid</p>
         */
        @NameInMap("LicenseStatus")
        public String licenseStatus;

        /**
         * <p>The channel used to purchase the license.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("PurchaseChannel")
        public String purchaseChannel;

        /**
         * <p>The unique identifier of the external service associated with the license.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-cn-xxxxx</p>
         */
        @NameInMap("PurchaseInstanceId")
        public String purchaseInstanceId;

        /**
         * <p>The UNIX timestamp indicating the start of the license validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>1720509699000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The user quota included with the license.</p>
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

        public GetInstanceLicenseResponseBodyLicense setInstanceLicenseDetail(GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail instanceLicenseDetail) {
            this.instanceLicenseDetail = instanceLicenseDetail;
            return this;
        }
        public GetInstanceLicenseResponseBodyLicenseInstanceLicenseDetail getInstanceLicenseDetail() {
            return this.instanceLicenseDetail;
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
