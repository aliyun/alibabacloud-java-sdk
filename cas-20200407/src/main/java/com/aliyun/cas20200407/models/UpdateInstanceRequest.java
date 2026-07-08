// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>Whether to enable automatic management.</p>
     * <ul>
     * <li><p>enable: enabled</p>
     * </li>
     * <li><p>disable: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("AutoReissue")
    public String autoReissue;

    /**
     * <p>The name of the instance. When issuing a certificate, this value serves as the default certificate name.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CertificateName")
    public String certificateName;

    /**
     * <p>The city where the company or organization of the certificate requester is located. Required when generating a CSR for a DV certificate. Default value: Beijing.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The company information ID. Required for OV and EV certificates. Otherwise, you cannot call ApplyCertificate to request a certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>44211</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    /**
     * <p>The list of contact IDs. You must specify at least one contact. Otherwise, you cannot call ApplyCertificate to request a certificate.</p>
     */
    @NameInMap("ContactIdList")
    public java.util.List<Long> contactIdList;

    /**
     * <p>The country or region code of the certificate organization. For example, CN represents China, and US represents the United States. Required when generating a CSR for a DV certificate. Default value: CN.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The CSR content. You can generate a CSR using OpenSSL or Keytool. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">How to create a CSR file</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The domain name to bind to the certificate. Requirements are as follows:</p>
     * <ul>
     * <li><p>Supports single domain names or wildcard domain names (for example, <code>*.aliyundoc.com</code>).</p>
     * </li>
     * <li><p>Supports multiple domain names. Separate multiple domain names with commas (,). The first domain determines whether a free domain is included.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>If you bind multiple domain names to the certificate, this parameter is required. This parameter and the <strong>Csr</strong> parameter cannot both be empty. If you set both parameters, the system uses the <strong>CN</strong> field value from the <strong>Csr</strong> as the domain name for the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The CSR generation method. Default value: online.</p>
     * <ul>
     * <li><p>online: The system generates the CSR. The Csr field is ignored.</p>
     * </li>
     * <li><p>upload: You upload the CSR. The Csr field is required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("GenerateCsrMethod")
    public String generateCsrMethod;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-cn-68n1mm16****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The certificate algorithm. Default value: RSA_2048.</p>
     * <ul>
     * <li><p><strong>RSA_2048</strong></p>
     * </li>
     * <li><p><strong>RSA_3072</strong></p>
     * </li>
     * <li><p><strong>RSA_4096</strong></p>
     * </li>
     * <li><p><strong>ECC_256</strong></p>
     * </li>
     * <li><p><strong>SM2</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    /**
     * <p>The province or region where the company is located. Required when generating a CSR for a DV certificate. Default value: Beijing.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******4wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>A list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdateInstanceRequestTags> tags;

    /**
     * <p>The certificate validation method.</p>
     * <ul>
     * <li><p>DNS: DNS validation using TXT or CNAME records.</p>
     * </li>
     * <li><p>HTTP: File-based validation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ValidationMethod")
    public String validationMethod;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setAutoReissue(String autoReissue) {
        this.autoReissue = autoReissue;
        return this;
    }
    public String getAutoReissue() {
        return this.autoReissue;
    }

    public UpdateInstanceRequest setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public UpdateInstanceRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public UpdateInstanceRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public UpdateInstanceRequest setContactIdList(java.util.List<Long> contactIdList) {
        this.contactIdList = contactIdList;
        return this;
    }
    public java.util.List<Long> getContactIdList() {
        return this.contactIdList;
    }

    public UpdateInstanceRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public UpdateInstanceRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public UpdateInstanceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateInstanceRequest setGenerateCsrMethod(String generateCsrMethod) {
        this.generateCsrMethod = generateCsrMethod;
        return this;
    }
    public String getGenerateCsrMethod() {
        return this.generateCsrMethod;
    }

    public UpdateInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceRequest setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
        return this;
    }
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    public UpdateInstanceRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public UpdateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateInstanceRequest setTags(java.util.List<UpdateInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateInstanceRequestTags> getTags() {
        return this.tags;
    }

    public UpdateInstanceRequest setValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
        return this;
    }
    public String getValidationMethod() {
        return this.validationMethod;
    }

    public static class UpdateInstanceRequestTags extends TeaModel {
        /**
         * <p>The tag key of the instance. Valid values for N: <strong>1</strong> to <strong>20</strong>. If you specify this value, it cannot be an empty string.</p>
         * <p>It can contain up to 64 characters. It cannot start with <code>aliyun</code> or <code>acs:</code>, and it cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the instance. Valid values for N: <strong>1</strong> to <strong>20</strong>. If you specify this value, it can be an empty string.</p>
         * <p>It can contain up to 128 characters. It cannot start with <code>aliyun</code> or <code>acs:</code>, and it cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static UpdateInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateInstanceRequestTags self = new UpdateInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateInstanceRequestTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateInstanceRequestTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
