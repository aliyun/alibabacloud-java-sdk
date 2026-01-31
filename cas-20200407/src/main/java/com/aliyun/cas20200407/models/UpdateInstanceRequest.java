// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("AutoReissue")
    public String autoReissue;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("CertificateName")
    public String certificateName;

    /**
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>44211</p>
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
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("GenerateCsrMethod")
    public String generateCsrMethod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-cn-68n1mm16****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("KeyAlgorithm")
    public String keyAlgorithm;

    /**
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <strong>example:</strong>
     * <p>rg-ae******4wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<UpdateInstanceRequestTags> tags;

    /**
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
