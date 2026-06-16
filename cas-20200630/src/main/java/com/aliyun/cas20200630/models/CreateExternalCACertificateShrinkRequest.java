// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateExternalCACertificateShrinkRequest extends TeaModel {
    /**
     * <p>Specifies API parameters that override content from the CSR or add information to the CA certificate.</p>
     */
    @NameInMap("ApiPassthrough")
    public String apiPassthroughShrink;

    @NameInMap("CertMaxTime")
    public Integer certMaxTime;

    /**
     * <p>The certificate signing request (CSR). The CSR can contain information such as the SubjectDN and custom extensions for the CA certificate. The CA generates the SubjectKeyIdentifier, AuthorityKeyIdentifier, and CRLDistributionPoints extensions, ignoring any corresponding values in the CSR.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----
     * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
     * ...
     * vbIgMQIhAKHDWD6/WAMbtezAt4bysJ/BZIDz1jPWuUR5GV4TJ/mS
     * -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The ID of the external subordinate CA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_deposit-cn-1234abcd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags to add to the certificate.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateExternalCACertificateShrinkRequestTags> tags;

    /**
     * <p>The certificate validity period. You can specify this using either relative or absolute time.</p>
     * <blockquote>
     * <p>Relative time: Supported units are year, month, and day.</p>
     * </blockquote>
     * <ul>
     * <li><p>y - year</p>
     * </li>
     * <li><p>m - month</p>
     * </li>
     * <li><p>d - day</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Absolute time: Use GMT time in the <code>yyyy-MM-dd\\&quot;T\\&quot;HH:mm:ss\\&quot;Z\\&quot;</code> format.</p>
     * </blockquote>
     * <ul>
     * <li><p>To specify only the expiration time, use <code>$NotAfter</code>.</p>
     * </li>
     * <li><p>To specify both the start and expiration times, use <code>$NotBefore/$NotAfter</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10y</p>
     */
    @NameInMap("Validity")
    public String validity;

    public static CreateExternalCACertificateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalCACertificateShrinkRequest self = new CreateExternalCACertificateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalCACertificateShrinkRequest setApiPassthroughShrink(String apiPassthroughShrink) {
        this.apiPassthroughShrink = apiPassthroughShrink;
        return this;
    }
    public String getApiPassthroughShrink() {
        return this.apiPassthroughShrink;
    }

    public CreateExternalCACertificateShrinkRequest setCertMaxTime(Integer certMaxTime) {
        this.certMaxTime = certMaxTime;
        return this;
    }
    public Integer getCertMaxTime() {
        return this.certMaxTime;
    }

    public CreateExternalCACertificateShrinkRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateExternalCACertificateShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateExternalCACertificateShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateExternalCACertificateShrinkRequest setTags(java.util.List<CreateExternalCACertificateShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateExternalCACertificateShrinkRequestTags> getTags() {
        return this.tags;
    }

    public CreateExternalCACertificateShrinkRequest setValidity(String validity) {
        this.validity = validity;
        return this;
    }
    public String getValidity() {
        return this.validity;
    }

    public static class CreateExternalCACertificateShrinkRequestTags extends TeaModel {
        /**
         * <p>The tag\&quot;s key.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag\&quot;s value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateExternalCACertificateShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalCACertificateShrinkRequestTags self = new CreateExternalCACertificateShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateExternalCACertificateShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExternalCACertificateShrinkRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
