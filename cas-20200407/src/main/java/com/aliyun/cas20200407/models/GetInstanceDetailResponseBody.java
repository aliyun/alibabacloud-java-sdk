// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetInstanceDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("AutoReissue")
    public String autoReissue;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("AverageWaitingTime")
    public String averageWaitingTime;

    /**
     * <strong>example:</strong>
     * <p>DigiCert</p>
     */
    @NameInMap("Brand")
    public String brand;

    /**
     * <strong>example:</strong>
     * <p>22783111-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("CertificateId")
    public Integer certificateId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CertificateName")
    public String certificateName;

    /**
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("CertificateNotAfter")
    public Long certificateNotAfter;

    /**
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("CertificateRevokeTime")
    public Long certificateRevokeTime;

    /**
     * <strong>example:</strong>
     * <p>issued</p>
     */
    @NameInMap("CertificateStatus")
    public String certificateStatus;

    /**
     * <strong>example:</strong>
     * <p>DV</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>47305</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    @NameInMap("ContactIdList")
    public java.util.List<Long> contactIdList;

    /**
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----   ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    @NameInMap("DingGroupList")
    public java.util.List<GetInstanceDetailResponseBodyDingGroupList> dingGroupList;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("DomainValidationList")
    public java.util.List<GetInstanceDetailResponseBodyDomainValidationList> domainValidationList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FullDomainCount")
    public Integer fullDomainCount;

    /**
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("GenerateCsrMethod")
    public String generateCsrMethod;

    /**
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("InstanceEndTime")
    public Long instanceEndTime;

    /**
     * <strong>example:</strong>
     * <p>cas_dv-cn-123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("InstanceStartTime")
    public Long instanceStartTime;

    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    /**
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("OrderEndTime")
    public Long orderEndTime;

    /**
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("OrderStartTime")
    public Long orderStartTime;

    /**
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("PendingResult")
    public String pendingResult;

    /**
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <strong>example:</strong>
     * <p>B2CE1D02-6D5E-56E5-A9BD-EE288255C7F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-aek****wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>ss.dv.t</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <strong>example:</strong>
     * <p>inactive</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<GetInstanceDetailResponseBodyTags> tags;

    /**
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ValidationMethod")
    public String validationMethod;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("WildcardDomainCount")
    public Integer wildcardDomainCount;

    public static GetInstanceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDetailResponseBody self = new GetInstanceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceDetailResponseBody setAutoReissue(String autoReissue) {
        this.autoReissue = autoReissue;
        return this;
    }
    public String getAutoReissue() {
        return this.autoReissue;
    }

    public GetInstanceDetailResponseBody setAverageWaitingTime(String averageWaitingTime) {
        this.averageWaitingTime = averageWaitingTime;
        return this;
    }
    public String getAverageWaitingTime() {
        return this.averageWaitingTime;
    }

    public GetInstanceDetailResponseBody setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public GetInstanceDetailResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public GetInstanceDetailResponseBody setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Integer getCertificateId() {
        return this.certificateId;
    }

    public GetInstanceDetailResponseBody setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public GetInstanceDetailResponseBody setCertificateNotAfter(Long certificateNotAfter) {
        this.certificateNotAfter = certificateNotAfter;
        return this;
    }
    public Long getCertificateNotAfter() {
        return this.certificateNotAfter;
    }

    public GetInstanceDetailResponseBody setCertificateRevokeTime(Long certificateRevokeTime) {
        this.certificateRevokeTime = certificateRevokeTime;
        return this;
    }
    public Long getCertificateRevokeTime() {
        return this.certificateRevokeTime;
    }

    public GetInstanceDetailResponseBody setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
        return this;
    }
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    public GetInstanceDetailResponseBody setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public GetInstanceDetailResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public GetInstanceDetailResponseBody setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public GetInstanceDetailResponseBody setContactIdList(java.util.List<Long> contactIdList) {
        this.contactIdList = contactIdList;
        return this;
    }
    public java.util.List<Long> getContactIdList() {
        return this.contactIdList;
    }

    public GetInstanceDetailResponseBody setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public GetInstanceDetailResponseBody setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public GetInstanceDetailResponseBody setDingGroupList(java.util.List<GetInstanceDetailResponseBodyDingGroupList> dingGroupList) {
        this.dingGroupList = dingGroupList;
        return this;
    }
    public java.util.List<GetInstanceDetailResponseBodyDingGroupList> getDingGroupList() {
        return this.dingGroupList;
    }

    public GetInstanceDetailResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetInstanceDetailResponseBody setDomainValidationList(java.util.List<GetInstanceDetailResponseBodyDomainValidationList> domainValidationList) {
        this.domainValidationList = domainValidationList;
        return this;
    }
    public java.util.List<GetInstanceDetailResponseBodyDomainValidationList> getDomainValidationList() {
        return this.domainValidationList;
    }

    public GetInstanceDetailResponseBody setFullDomainCount(Integer fullDomainCount) {
        this.fullDomainCount = fullDomainCount;
        return this;
    }
    public Integer getFullDomainCount() {
        return this.fullDomainCount;
    }

    public GetInstanceDetailResponseBody setGenerateCsrMethod(String generateCsrMethod) {
        this.generateCsrMethod = generateCsrMethod;
        return this;
    }
    public String getGenerateCsrMethod() {
        return this.generateCsrMethod;
    }

    public GetInstanceDetailResponseBody setInstanceEndTime(Long instanceEndTime) {
        this.instanceEndTime = instanceEndTime;
        return this;
    }
    public Long getInstanceEndTime() {
        return this.instanceEndTime;
    }

    public GetInstanceDetailResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceDetailResponseBody setInstanceStartTime(Long instanceStartTime) {
        this.instanceStartTime = instanceStartTime;
        return this;
    }
    public Long getInstanceStartTime() {
        return this.instanceStartTime;
    }

    public GetInstanceDetailResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public GetInstanceDetailResponseBody setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    public GetInstanceDetailResponseBody setOrderEndTime(Long orderEndTime) {
        this.orderEndTime = orderEndTime;
        return this;
    }
    public Long getOrderEndTime() {
        return this.orderEndTime;
    }

    public GetInstanceDetailResponseBody setOrderStartTime(Long orderStartTime) {
        this.orderStartTime = orderStartTime;
        return this;
    }
    public Long getOrderStartTime() {
        return this.orderStartTime;
    }

    public GetInstanceDetailResponseBody setPendingResult(String pendingResult) {
        this.pendingResult = pendingResult;
        return this;
    }
    public String getPendingResult() {
        return this.pendingResult;
    }

    public GetInstanceDetailResponseBody setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public GetInstanceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceDetailResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetInstanceDetailResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public GetInstanceDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetInstanceDetailResponseBody setTags(java.util.List<GetInstanceDetailResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetInstanceDetailResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetInstanceDetailResponseBody setValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
        return this;
    }
    public String getValidationMethod() {
        return this.validationMethod;
    }

    public GetInstanceDetailResponseBody setWildcardDomainCount(Integer wildcardDomainCount) {
        this.wildcardDomainCount = wildcardDomainCount;
        return this;
    }
    public Integer getWildcardDomainCount() {
        return this.wildcardDomainCount;
    }

    public static class GetInstanceDetailResponseBodyDingGroupList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DingGroupInstanceId")
        public String dingGroupInstanceId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DingGroupName")
        public String dingGroupName;

        /**
         * <strong>example:</strong>
         * <p>remote</p>
         */
        @NameInMap("DingGroupType")
        public String dingGroupType;

        /**
         * <strong>example:</strong>
         * <p><a href="https://123.com">https://123.com</a></p>
         */
        @NameInMap("DingGroupUrl")
        public String dingGroupUrl;

        public static GetInstanceDetailResponseBodyDingGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyDingGroupList self = new GetInstanceDetailResponseBodyDingGroupList();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyDingGroupList setDingGroupInstanceId(String dingGroupInstanceId) {
            this.dingGroupInstanceId = dingGroupInstanceId;
            return this;
        }
        public String getDingGroupInstanceId() {
            return this.dingGroupInstanceId;
        }

        public GetInstanceDetailResponseBodyDingGroupList setDingGroupName(String dingGroupName) {
            this.dingGroupName = dingGroupName;
            return this;
        }
        public String getDingGroupName() {
            return this.dingGroupName;
        }

        public GetInstanceDetailResponseBodyDingGroupList setDingGroupType(String dingGroupType) {
            this.dingGroupType = dingGroupType;
            return this;
        }
        public String getDingGroupType() {
            return this.dingGroupType;
        }

        public GetInstanceDetailResponseBodyDingGroupList setDingGroupUrl(String dingGroupUrl) {
            this.dingGroupUrl = dingGroupUrl;
            return this;
        }
        public String getDingGroupUrl() {
            return this.dingGroupUrl;
        }

    }

    public static class GetInstanceDetailResponseBodyDomainValidationList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("RootDomain")
        public String rootDomain;

        /**
         * <strong>example:</strong>
         * <p>@</p>
         */
        @NameInMap("ValidationKey")
        public String validationKey;

        /**
         * <strong>example:</strong>
         * <p>TXT</p>
         */
        @NameInMap("ValidationType")
        public String validationType;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ValidationValue")
        public String validationValue;

        public static GetInstanceDetailResponseBodyDomainValidationList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyDomainValidationList self = new GetInstanceDetailResponseBodyDomainValidationList();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyDomainValidationList setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public GetInstanceDetailResponseBodyDomainValidationList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetInstanceDetailResponseBodyDomainValidationList setRootDomain(String rootDomain) {
            this.rootDomain = rootDomain;
            return this;
        }
        public String getRootDomain() {
            return this.rootDomain;
        }

        public GetInstanceDetailResponseBodyDomainValidationList setValidationKey(String validationKey) {
            this.validationKey = validationKey;
            return this;
        }
        public String getValidationKey() {
            return this.validationKey;
        }

        public GetInstanceDetailResponseBodyDomainValidationList setValidationType(String validationType) {
            this.validationType = validationType;
            return this;
        }
        public String getValidationType() {
            return this.validationType;
        }

        public GetInstanceDetailResponseBodyDomainValidationList setValidationValue(String validationValue) {
            this.validationValue = validationValue;
            return this;
        }
        public String getValidationValue() {
            return this.validationValue;
        }

    }

    public static class GetInstanceDetailResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetInstanceDetailResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceDetailResponseBodyTags self = new GetInstanceDetailResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceDetailResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetInstanceDetailResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
