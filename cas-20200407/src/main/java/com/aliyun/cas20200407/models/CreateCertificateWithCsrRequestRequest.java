// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestRequest extends TeaModel {
    /**
     * <p>The content of the CSR file.\
     * The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see <a href="https://help.aliyun.com/document_detail/42218.html">How do I create a CSR file?</a>\
     * A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.</p>
     * <blockquote>
     * <p> The <strong>CN</strong> field in the CSR file specifies the domain name that is bound to the certificate.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The contact email address of the applicant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The phone number of the applicant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1390000****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The specifications of the certificate that you want to apply for. Valid values:</p>
     * <ul>
     * <li><strong>digicert-free-1-free</strong> (default): DigiCert single-domain DV certificate in a three-month free trial, available only on the China site (aliyun.com).</li>
     * <li><strong>symantec-free-1-free</strong>: DigiCert single-domain DV certificate in a one-year free trial, available only on the China site (aliyun.com).</li>
     * <li><strong>symantec-dv-1-starter</strong>: DigiCert wildcard DV certificate.</li>
     * <li><strong>geotrust-dv-1-starter</strong>: GeoTrust single-domain DV certificate.</li>
     * <li><strong>geotrust-dv-w-starter</strong>: GeoTrust wildcard DV certificate.</li>
     * <li><strong>globalsign-dv-1-personal</strong>: GlobalSign single-domain DV certificate.</li>
     * <li><strong>globalsign-dv-w-advanced</strong>: GlobalSign wildcard DV certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>symantec-free-1-free</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Tags")
    public java.util.List<CreateCertificateWithCsrRequestRequestTags> tags;

    /**
     * <p>The name of the applicant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Tom</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The method to verify the ownership of a domain name. Valid values:</p>
     * <ul>
     * <li><strong>DNS</strong>: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name. You must have operation permissions on domain name resolution to verify the ownership of the domain name.</li>
     * <li><strong>FILE</strong>: file verification. If you use this method, you must create a specified file on the DNS server. You must have administrative rights on the DNS server to verify the ownership of the domain name.</li>
     * </ul>
     * <p>For more information about the verification methods, see <a href="https://help.aliyun.com/document_detail/48016.html">Verify the ownership of a domain name</a>.</p>
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
        @NameInMap("Key")
        public String key;

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
