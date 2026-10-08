// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetInstanceDetailResponseBody extends TeaModel {
    /**
     * <p>Specifies whether automatic hosting is enabled. Valid values:</p>
     * <ul>
     * <li>enable: Enabled.</li>
     * <li>disable: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("AutoReissue")
    public String autoReissue;

    /**
     * <p>Specifies whether the current version includes automatic hosting. Valid values:</p>
     * <ul>
     * <li>1: Included.</li>
     * <li>0: Not included.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoReissueFlag")
    public Integer autoReissueFlag;

    /**
     * <p>The average waiting time for issuing a certificate of this specification, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("AverageWaitingTime")
    public String averageWaitingTime;

    /**
     * <p>The CA brand. Valid values: WoSign, CFCA, DigiCert, GeoTrust, GlobalSign, vTrus, and Alibaba.</p>
     * 
     * <strong>example:</strong>
     * <p>DigiCert</p>
     */
    @NameInMap("Brand")
    public String brand;

    /**
     * <p>The global certificate ID. The format is Certificate ID + &quot;-&quot; + Site region ID. This ID is commonly used across Alibaba Cloud services.</p>
     * <ul>
     * <li>For the Chinese site, the format is Certificate ID + &quot;-cn-hangzhou&quot;.</li>
     * <li>For the international site, the format is Certificate ID + &quot;-ap-southeast-1&quot;.
     * For example, if the certificate ID is 123, the CertIdentifier for the Chinese site is &quot;123-cn-hangzhou&quot;, and for the international site, it is &quot;123-ap-southeast-1&quot;.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>22783111-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The ID of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("CertificateId")
    public Integer certificateId;

    /**
     * <p>The name of the instance. When a certificate is issued, this name is used as the default name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CertificateName")
    public String certificateName;

    /**
     * <p>The expiration time of the latest certificate. The value is a UNIX timestamp accurate to seconds. If no certificate is issued, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("CertificateNotAfter")
    public Long certificateNotAfter;

    /**
     * <p>The start time of the latest certificate. The value is a UNIX timestamp accurate to seconds. If no certificate is issued, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1781568000000</p>
     */
    @NameInMap("CertificateNotBefore")
    public Long certificateNotBefore;

    /**
     * <p>The revocation time of the latest certificate. The value is a UNIX timestamp accurate to seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("CertificateRevokeTime")
    public Long certificateRevokeTime;

    /**
     * <p>The status of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>issued</strong>: Issued.</li>
     * <li><strong>revoked</strong>: Revoked.</li>
     * <li><strong>willExpire</strong>: Expiring soon.</li>
     * <li><strong>expired</strong>: Expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>issued</p>
     */
    @NameInMap("CertificateStatus")
    public String certificateStatus;

    /**
     * <p>The type of the certificate. Valid values: DV, OV, and EV.</p>
     * 
     * <strong>example:</strong>
     * <p>DV</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>The city where the company or organization of the user who purchased the certificate is located. This field is required when generating a CSR. Default value: Beijing.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The ID of the company information.</p>
     * 
     * <strong>example:</strong>
     * <p>47305</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    /**
     * <p>The list of contact IDs.</p>
     */
    @NameInMap("ContactIdList")
    public java.util.List<Long> contactIdList;

    /**
     * <p>The code of the country or region where the organization specified in the certificate is located. For example, CN indicates China, and US indicates the United States. This field is required when generating a CSR. Default value: CN.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The certificate signing request in PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----   ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The number of deployed cloud service resources.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("DeploymentResourceCount")
    public Integer deploymentResourceCount;

    /**
     * <p>The used quota for deployment to cloud servers.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("DeploymentUseCount")
    public Integer deploymentUseCount;

    /**
     * <p>The list of associated DingTalk groups for expert services.</p>
     */
    @NameInMap("DingGroupList")
    public java.util.List<GetInstanceDetailResponseBodyDingGroupList> dingGroupList;

    /**
     * <p>The domain name bound to the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The list of domain names to be validated.</p>
     */
    @NameInMap("DomainValidationList")
    public java.util.List<GetInstanceDetailResponseBodyDomainValidationList> domainValidationList;

    /**
     * <p>The number of exact domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FullDomainCount")
    public Integer fullDomainCount;

    /**
     * <p>The method used to generate the CSR. Valid values:</p>
     * <ul>
     * <li>online: Generated by the system. The Csr field is ignored.</li>
     * <li>upload: Uploaded by the user. The Csr field is required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("GenerateCsrMethod")
    public String generateCsrMethod;

    /**
     * <p>The expiration time of the instance. The value is a UNIX timestamp accurate to seconds. If no certificate has been issued, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("InstanceEndTime")
    public Long instanceEndTime;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_dv-cn-123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The start time of the instance. The value is a UNIX timestamp accurate to seconds. If no certificate has been issued, this parameter is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("InstanceStartTime")
    public Long instanceStartTime;

    /**
     * <p>The type of the instance. Valid values:</p>
     * <ul>
     * <li>BUY: Official certificate.</li>
     * <li>TEST: Test certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The algorithm of the certificate. Valid values:</p>
     * <ul>
     * <li><strong>RSA_2048</strong></li>
     * <li><strong>RSA_3072</strong></li>
     * <li><strong>RSA_4096</strong></li>
     * <li><strong>ECC_256</strong></li>
     * <li><strong>SM2</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    /**
     * <p>Specifies whether the quota for domain name monitoring can be expanded. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>0: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MonitorExpandFlag")
    public Integer monitorExpandFlag;

    /**
     * <p>The used quota for domain name monitoring.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MonitorUseCount")
    public Integer monitorUseCount;

    /**
     * <p>The end time of the instance purchase. The value is a UNIX timestamp used to determine the purchase duration of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("OrderEndTime")
    public Long orderEndTime;

    /**
     * <p>The progress of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;orderProgress&quot;: [
     *     {
     *       &quot;certificateId&quot;: 12345,
     *       &quot;certificateName&quot;: &quot;example.com&quot;,
     *       &quot;notBefore&quot;: 1727000000000,
     *       &quot;notAfter&quot;: 1735000000000,
     *       &quot;stages&quot;: [
     *         { &quot;name&quot;: &quot;apply&quot;, &quot;title&quot;: &quot;apply&quot;, &quot;status&quot;: &quot;completed&quot;, &quot;time&quot;: 1726990000000 },
     *         { &quot;name&quot;: &quot;domainValidation&quot;, &quot;title&quot;: &quot;domainValidation&quot;, &quot;status&quot;: &quot;completed&quot;, &quot;time&quot;: 1727000000000 },
     *         { &quot;name&quot;: &quot;issue&quot;, &quot;title&quot;: &quot;issue&quot;, &quot;status&quot;: &quot;completed&quot;, &quot;time&quot;: 1727000000000 }
     *       ]
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("OrderProgress")
    public String orderProgress;

    /**
     * <p>The start time of the instance purchase. The value is a UNIX timestamp accurate to seconds, used to determine the time limit for refunds.</p>
     * 
     * <strong>example:</strong>
     * <p>1801324800000</p>
     */
    @NameInMap("OrderStartTime")
    public Long orderStartTime;

    /**
     * <p>The result returned by the CA during the last operation on the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("PendingResult")
    public String pendingResult;

    /**
     * <p>The province or region where the company is located. This field is required when generating a CSR. Default value: Beijing.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The ID of the request. It is a unique identifier generated by Alibaba Cloud for the request and can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>B2CE1D02-6D5E-56E5-A9BD-EE288255C7F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek****wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The specifications of the purchased instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ss.dv.t</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>inactive</strong>: Pending use.</li>
     * <li><strong>pending</strong>: Under review. The latest certificate is committed for review.</li>
     * <li><strong>willExpire</strong>: Expiring soon.</li>
     * <li><strong>expired</strong>: Expired.</li>
     * <li><strong>refund</strong>: Refunded.</li>
     * <li><strong>normal</strong>: Normal.</li>
     * <li><strong>closed</strong>: Shutdown and unavailable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inactive</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetInstanceDetailResponseBodyTags> tags;

    /**
     * <p>The total quota for deployment to cloud servers.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TotalDeploymentCount")
    public Integer totalDeploymentCount;

    /**
     * <p>The total quota for domain name monitoring.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("TotalMonitorCount")
    public Integer totalMonitorCount;

    /**
     * <p>The upgrade status of the instance. Valid values:</p>
     * <ul>
     * <li>none: The instance is not upgraded.</li>
     * <li>payed: The instance upgrade is paid.</li>
     * <li>issued: The latest certificate is issued for the instance upgrade.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("UpgradeStatus")
    public String upgradeStatus;

    /**
     * <p>The validation method for the certificate application. Valid values:</p>
     * <ul>
     * <li>DNS: DNS validation, using TXT or CNAME records.</li>
     * <li>HTTP: File validation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ValidationMethod")
    public String validationMethod;

    /**
     * <p>The version type. Valid values:</p>
     * <ul>
     * <li>FOTA: System upgrade.</li>
     * <li>APP: Application upgrade.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VersionType")
    public String versionType;

    /**
     * <p>The number of wildcard domain names.</p>
     * 
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

    public GetInstanceDetailResponseBody setAutoReissueFlag(Integer autoReissueFlag) {
        this.autoReissueFlag = autoReissueFlag;
        return this;
    }
    public Integer getAutoReissueFlag() {
        return this.autoReissueFlag;
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

    public GetInstanceDetailResponseBody setCertificateNotBefore(Long certificateNotBefore) {
        this.certificateNotBefore = certificateNotBefore;
        return this;
    }
    public Long getCertificateNotBefore() {
        return this.certificateNotBefore;
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

    public GetInstanceDetailResponseBody setDeploymentResourceCount(Integer deploymentResourceCount) {
        this.deploymentResourceCount = deploymentResourceCount;
        return this;
    }
    public Integer getDeploymentResourceCount() {
        return this.deploymentResourceCount;
    }

    public GetInstanceDetailResponseBody setDeploymentUseCount(Integer deploymentUseCount) {
        this.deploymentUseCount = deploymentUseCount;
        return this;
    }
    public Integer getDeploymentUseCount() {
        return this.deploymentUseCount;
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

    public GetInstanceDetailResponseBody setMonitorExpandFlag(Integer monitorExpandFlag) {
        this.monitorExpandFlag = monitorExpandFlag;
        return this;
    }
    public Integer getMonitorExpandFlag() {
        return this.monitorExpandFlag;
    }

    public GetInstanceDetailResponseBody setMonitorUseCount(Integer monitorUseCount) {
        this.monitorUseCount = monitorUseCount;
        return this;
    }
    public Integer getMonitorUseCount() {
        return this.monitorUseCount;
    }

    public GetInstanceDetailResponseBody setOrderEndTime(Long orderEndTime) {
        this.orderEndTime = orderEndTime;
        return this;
    }
    public Long getOrderEndTime() {
        return this.orderEndTime;
    }

    public GetInstanceDetailResponseBody setOrderProgress(String orderProgress) {
        this.orderProgress = orderProgress;
        return this;
    }
    public String getOrderProgress() {
        return this.orderProgress;
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

    public GetInstanceDetailResponseBody setTotalDeploymentCount(Integer totalDeploymentCount) {
        this.totalDeploymentCount = totalDeploymentCount;
        return this;
    }
    public Integer getTotalDeploymentCount() {
        return this.totalDeploymentCount;
    }

    public GetInstanceDetailResponseBody setTotalMonitorCount(Integer totalMonitorCount) {
        this.totalMonitorCount = totalMonitorCount;
        return this;
    }
    public Integer getTotalMonitorCount() {
        return this.totalMonitorCount;
    }

    public GetInstanceDetailResponseBody setUpgradeStatus(String upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
        return this;
    }
    public String getUpgradeStatus() {
        return this.upgradeStatus;
    }

    public GetInstanceDetailResponseBody setValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
        return this;
    }
    public String getValidationMethod() {
        return this.validationMethod;
    }

    public GetInstanceDetailResponseBody setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
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
         * <p>The instance ID of the DingTalk group for expert services.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DingGroupInstanceId")
        public String dingGroupInstanceId;

        /**
         * <p>The name of the DingTalk group for expert services.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DingGroupName")
        public String dingGroupName;

        /**
         * <p>The type of the DingTalk group for expert services. Valid values:</p>
         * <ul>
         * <li>expedite: Application assistance.</li>
         * <li>remote: Offline deployment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remote</p>
         */
        @NameInMap("DingGroupType")
        public String dingGroupType;

        /**
         * <p>The link to join the DingTalk group for expert services.</p>
         * 
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
         * <p>The CNAME record value for verification-free authorization. This parameter may be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>123.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The prefix used for CNAME validation.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("CnameKey")
        public String cnameKey;

        /**
         * <p>The domain name to be validated.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The root domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("RootDomain")
        public String rootDomain;

        /**
         * <p>The host record.</p>
         * 
         * <strong>example:</strong>
         * <p>@</p>
         */
        @NameInMap("ValidationKey")
        public String validationKey;

        /**
         * <p>The validation type. Valid values: TXT, HTTP, and CNAME.</p>
         * 
         * <strong>example:</strong>
         * <p>TXT</p>
         */
        @NameInMap("ValidationType")
        public String validationType;

        /**
         * <p>The value of the host record for validation.</p>
         * 
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

        public GetInstanceDetailResponseBodyDomainValidationList setCnameKey(String cnameKey) {
            this.cnameKey = cnameKey;
            return this;
        }
        public String getCnameKey() {
            return this.cnameKey;
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
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
