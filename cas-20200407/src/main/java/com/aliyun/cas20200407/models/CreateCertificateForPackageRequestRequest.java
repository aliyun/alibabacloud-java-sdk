// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateForPackageRequestRequest extends TeaModel {
    /**
     * <p>The name of the company that applies for the certificate.</p>
     * <blockquote>
     * <p>This parameter applies only to OV certificates. When you apply for an OV certificate, you must first add the company information in the <strong>Information Management</strong> module of the <a href="https://yundun.console.aliyun.com/?p=cas#/">Certificate Management Service console</a>. For more information, see <a href="https://help.aliyun.com/document_detail/198289.html">Manage company information</a>. When you apply for a DV certificate, you do not need to add company information.</p>
     * </blockquote>
     * <p>When you apply for an OV certificate, if you specify the company name here, the corresponding company information in the <strong>Information Management</strong> module is used. If you do not specify this parameter, the latest company information added in the <strong>Information Management</strong> module is used.</p>
     * 
     * <strong>example:</strong>
     * <p>Example Company</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>The content of the certificate signing request (CSR) file that you manually generated for the domain name by using OpenSSL or Keytool. The key type of the CSR file must be RSA or ECC, and the key length of the RSA algorithm must be greater than or equal to 2048 bits. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/313297.html">Create a CSR</a>. If you do not specify this parameter, Certificate Management Service automatically creates a CSR for you.</p>
     * <p>A CSR is a certificate signing request file that contains your server and company information. When you apply for a certificate, you must submit the CSR file to the certificate authority (CA) for review. After the CA signs the CSR file by using the private key of the root certificate, a certificate public key file (the SSL certificate issued to you) is generated.</p>
     * <blockquote>
     * <p>Notice:  </p>
     * </blockquote>
     * <p>The <strong>CN</strong> field in the CSR indicates the domain name bound to the certificate. This field is required when you specify the CSR parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The domain name to be bound to the certificate. Requirements:</p>
     * <ul>
     * <li>You can specify a single domain name or a wildcard domain name, such as <code>*.aliyundoc.com</code>.</li>
     * <li>You can specify multiple domain names. Separate multiple domain names with commas (,). You can specify up to five domain names.</li>
     * <li>If you specify multiple domain names, all the domain names must be single domain names or wildcard domain names. You cannot specify both single domain names and wildcard domain names at the same time.</li>
     * </ul>
     * <blockquote>
     * <p>Notice:  </p>
     * </blockquote>
     * <p>If you bind multiple domain names to the certificate, this parameter is required. This parameter and the <strong>Csr</strong> parameter cannot be left empty at the same time. If you specify both this parameter and the <strong>Csr</strong> parameter, the value of the <strong>CN</strong> field in the <strong>Csr</strong> parameter is used as the domain name bound to the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The email address of the contact for the application. After the CA receives your certificate application, the CA sends a certificate application verification email to this email address. You must log on to the email account, check the email, and complete the verification as prompted in the email.</p>
     * <p>If you do not specify this parameter, the latest contact information added in the <strong>Information Management</strong> module is used. For more information about how to add a contact in the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The mobile phone number of the contact for the application. The CA staff may contact you at this phone number to verify your certificate application information.</p>
     * <p>If you do not specify this parameter, the latest contact information added in the <strong>Information Management</strong> module is used. For more information about how to add a contact in the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The specifications of the certificate for which you want to apply. Valid values:</p>
     * <ul>
     * <li><p><strong>digicert-free-1-free</strong> (default): a 3-month personal test certificate (free edition). Available only on the China site.</p>
     * </li>
     * <li><p><strong>symantec-free-1-free</strong>: a 12-month personal test certificate (pro). Available only on the China site.</p>
     * </li>
     * <li><p><strong>symantec-dv-1-starter</strong>: a DigiCert DV wildcard certificate.</p>
     * </li>
     * <li><p><strong>symantec-ov-1-personal</strong>: a DigiCert OV single-domain certificate.</p>
     * </li>
     * <li><p><strong>symantec-ov-w-personal</strong>: a DigiCert OV wildcard certificate.</p>
     * </li>
     * <li><p><strong>geotrust-dv-1-starter</strong>: a GeoTrust DV single-domain certificate.</p>
     * </li>
     * <li><p><strong>geotrust-dv-w-starter</strong>: a GeoTrust DV wildcard certificate.</p>
     * </li>
     * <li><p><strong>geotrust-ov-1-personal</strong>: a GeoTrust OV single-domain certificate.</p>
     * </li>
     * <li><p><strong>geotrust-ov-w-personal</strong>: a GeoTrust OV wildcard certificate.</p>
     * </li>
     * <li><p><strong>globalsign-dv-1-personal</strong>: a GlobalSign DV single-domain certificate.</p>
     * </li>
     * <li><p><strong>globalsign-dv-w-advanced</strong>: a GlobalSign DV wildcard certificate.</p>
     * </li>
     * <li><p><strong>globalsign-ov-1-personal</strong>: a GlobalSign OV single-domain certificate.</p>
     * </li>
     * <li><p><strong>globalsign-ov-w-advanced</strong>: a GlobalSign OV wildcard certificate.</p>
     * </li>
     * <li><p><strong>cfca-ov-1-personal</strong>: a CFCA OV single-domain certificate (available only on the China site).</p>
     * </li>
     * <li><p><strong>cfca-ev-w-advanced</strong>: a CFCA OV wildcard certificate (available only on the China site).</p>
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
    public java.util.List<CreateCertificateForPackageRequestRequestTags> tags;

    /**
     * <p>The name of the contact for the application.</p>
     * <p>If you do not specify this parameter, the latest contact information added in the <strong>Information Management</strong> module is used. For more information about how to add a contact in the <strong>Information Management</strong> module, see <a href="https://help.aliyun.com/document_detail/198262.html">Manage contacts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Tom</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The verification method for domain name ownership. Valid values:</p>
     * <ul>
     * <li><p><strong>DNS</strong>: DNS verification. You can verify the ownership of the domain name by adding a TXT record for the domain name on the DNS management platform. You must have the management permissions on DNS resolution to complete the verification.</p>
     * </li>
     * <li><p><strong>FILE</strong>: file verification. You can verify the ownership of the domain name by creating a specified file on the domain name server. You must have the administrator permissions on the domain name server to complete the verification.</p>
     * </li>
     * </ul>
     * <p>For more information about the two verification methods, see <a href="https://help.aliyun.com/document_detail/48016.html">How do I configure domain name authorization verification?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>DNS</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    public static CreateCertificateForPackageRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateForPackageRequestRequest self = new CreateCertificateForPackageRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateForPackageRequestRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateCertificateForPackageRequestRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateCertificateForPackageRequestRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateCertificateForPackageRequestRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCertificateForPackageRequestRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateCertificateForPackageRequestRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CreateCertificateForPackageRequestRequest setTags(java.util.List<CreateCertificateForPackageRequestRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateCertificateForPackageRequestRequestTags> getTags() {
        return this.tags;
    }

    public CreateCertificateForPackageRequestRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public CreateCertificateForPackageRequestRequest setValidateType(String validateType) {
        this.validateType = validateType;
        return this;
    }
    public String getValidateType() {
        return this.validateType;
    }

    public static class CreateCertificateForPackageRequestRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>runtime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can query multiple tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCertificateForPackageRequestRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateCertificateForPackageRequestRequestTags self = new CreateCertificateForPackageRequestRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateCertificateForPackageRequestRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCertificateForPackageRequestRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
