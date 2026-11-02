// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateRequestRequest extends TeaModel {
    /**
     * <p>The domain name to bind to the certificate. You can specify only one domain name.</p>
     * <blockquote>
     * <p>The domain name must match the specification of the certificate to apply for, which is specified by the <strong>ProductCode</strong> parameter. When you apply for a single-domain certificate, you must specify a single domain name. When you apply for a wildcard certificate, you must specify a wildcard domain name, such as <code>*.aliyundoc.com</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The email address of the contact for the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The mobile phone number of the contact for the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The specification of the certificate to apply for. Valid values:</p>
     * <ul>
     * <li><p><strong>digicert-free-1-free</strong> (default): a free 3-month DV certificate for individual testing. Available only on the Alibaba Cloud China site.</p>
     * </li>
     * <li><p><strong>symantec-free-1-free</strong>: a 12-month DV certificate for individual testing (Pro). Available only on the Alibaba Cloud China site.</p>
     * </li>
     * <li><p><strong>symantec-dv-1-starter</strong>: a DigiCert DV wildcard certificate.</p>
     * </li>
     * <li><p><strong>geotrust-dv-1-starter</strong>: a GeoTrust DV single-domain certificate.</p>
     * </li>
     * <li><p><strong>geotrust-dv-w-starter</strong>: a GeoTrust DV wildcard certificate.</p>
     * </li>
     * <li><p><strong>globalsign-dv-1-personal</strong>: a GlobalSign DV single-domain certificate.</p>
     * </li>
     * <li><p><strong>globalsign-dv-w-advanced</strong>: a GlobalSign DV wildcard certificate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>symantec-dv-1-starter</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateCertificateRequestRequestTags> tags;

    /**
     * <p>The name of the contact for the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tom</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The verification method for domain name ownership. Valid values:</p>
     * <ul>
     * <li><p><strong>DNS</strong>: DNS verification. You can verify the ownership of the domain name by adding a TXT DNS record for the domain name on the DNS management platform. You must have the management permissions on DNS resolution to complete the verification.</p>
     * </li>
     * <li><p><strong>FILE</strong>: file verification. You can verify the ownership of the domain name by creating a specified file on the domain name server. You must have the administrator permissions on the domain name server to complete the verification.</p>
     * </li>
     * </ul>
     * <p>For more information about the two verification methods, see <a href="https://help.aliyun.com/document_detail/48016.html">How do I configure domain name authorization verification?</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    public static CreateCertificateRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequestRequest self = new CreateCertificateRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateRequestRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateCertificateRequestRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCertificateRequestRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateCertificateRequestRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateCertificateRequestRequest setTags(java.util.List<CreateCertificateRequestRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateCertificateRequestRequestTags> getTags() {
        return this.tags;
    }

    public CreateCertificateRequestRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateCertificateRequestRequest setValidateType(String validateType) {
        this.validateType = validateType;
        return this;
    }
    public String getValidateType() {
        return this.validateType;
    }

    public static class CreateCertificateRequestRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:rm:rgId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCertificateRequestRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateCertificateRequestRequestTags self = new CreateCertificateRequestRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateCertificateRequestRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCertificateRequestRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
