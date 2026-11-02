// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestRequest extends TeaModel {
    /**
     * <p>The content of the existing CSR file.<br>The key type of the CSR file must be RSA or ECC. If the RSA algorithm is used, the key length must be greater than or equal to 2048 bits. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/42218.html">How to create a CSR file</a>.  &lt;props=&quot;china&quot;&gt;You can also create a CSR in the <a href="https://yundunnext.console.aliyun.com/?&p=cas">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR</a>.<br>A CSR is digital certificate signing request file that contains your server and company information. When you apply for digital certificate, you must submit the CSR file to the CA for review. After the CA signs the CSR file with the private key of the root certificate, digital certificate public key file (the SSL certificate issued to you) is generated.</p>
     * <blockquote>
     * <p>The <strong>CN</strong> field in the CSR specifies the domain name bound to the certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

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
     * <p>The certificate specification for which you want to apply. Valid values:</p>
     * <ul>
     * <li><p><strong>digicert-free-1-free</strong> (default): a 3-month free DV certificate for individual testing. Available only on the China site.</p>
     * </li>
     * <li><p><strong>symantec-free-1-free</strong>: a 12-month pro DV certificate for individual testing. Available only on the China site.</p>
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
     * <p>digicert-free-1-free</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateCertificateWithCsrRequestRequestTags> tags;

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
     * <p>The validation method for domain name ownership. Valid values:</p>
     * <ul>
     * <li><strong>DNS</strong>: DNS validation. You can validate the ownership of the domain name by adding a TXT DNS record for the domain name on the DNS management platform. You must have the management permissions on DNS resolution to complete the validation.</li>
     * <li><strong>FILE</strong>: file validation. You can validate the ownership of the domain name by creating a specified file on the domain name server. You must have the administrator permissions on the domain name server to complete the validation.</li>
     * </ul>
     * <p>For more information about the two validation methods, see <a href="https://help.aliyun.com/document_detail/48016.html">How do I configure domain name ownership validation?</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    public static CreateCertificateWithCsrRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateWithCsrRequestRequest self = new CreateCertificateWithCsrRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateWithCsrRequestRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateCertificateWithCsrRequestRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCertificateWithCsrRequestRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateCertificateWithCsrRequestRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateCertificateWithCsrRequestRequest setTags(java.util.List<CreateCertificateWithCsrRequestRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateCertificateWithCsrRequestRequestTags> getTags() {
        return this.tags;
    }

    public CreateCertificateWithCsrRequestRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateCertificateWithCsrRequestRequest setValidateType(String validateType) {
        this.validateType = validateType;
        return this;
    }
    public String getValidateType() {
        return this.validateType;
    }

    public static class CreateCertificateWithCsrRequestRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCertificateWithCsrRequestRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateCertificateWithCsrRequestRequestTags self = new CreateCertificateWithCsrRequestRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateCertificateWithCsrRequestRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCertificateWithCsrRequestRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
