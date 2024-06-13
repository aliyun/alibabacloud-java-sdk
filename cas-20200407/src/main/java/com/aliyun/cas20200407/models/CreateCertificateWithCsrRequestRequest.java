// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestRequest extends TeaModel {
    /**
     * <p>The content of the existing CSR file.\\</p>
     * <p>The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see [How do I create a CSR file?](https://help.aliyun.com/document_detail/42218.html) You can also create a CSR in the [Certificate Management Service console](https://yundunnext.console.aliyun.com/?\\&p=cas). For more information, see [Create a CSR](https://help.aliyun.com/document_detail/313297.html).\\</p>
     * <p>A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.</p>
     * <br>
     * <p>>  The **CN** field in the CSR file specifies the domain name that is bound to the certificate.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The contact email address of the applicant.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The phone number of the applicant.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The specifications of the certificate. Valid values:</p>
     * <br>
     * <p>*   **digicert-free-1-free**: DigiCert single-domain DV certificate in 3 months free trial. This is the default value.</p>
     * <p>*   **symantec-free-1-free**: DigiCert single-domain DV certificate in 1 year free trial.</p>
     * <p>*   **symantec-dv-1-starter**: DigiCert wildcard DV certificate.</p>
     * <p>*   **geotrust-dv-1-starter**: GeoTrust single-domain DV certificate.</p>
     * <p>*   **geotrust-dv-w-starter**: GeoTrust wildcard DV certificate.</p>
     * <p>*   **globalsign-dv-1-personal**: GlobalSign single-domain DV certificate.</p>
     * <p>*   **globalsign-dv-w-advanced**: GlobalSign wildcard DV certificate.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The name of the applicant.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The method to verify the ownership of a domain name. Valid values:</p>
     * <br>
     * <p>*   **DNS**: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name. You must have operation permissions on domain name resolution to verify the ownership of the domain name.</p>
     * <p>*   **FILE**: file verification. If you use this method, you must create a specified file on the DNS server. You must have administrative rights on the DNS server to verify the ownership of the domain name.</p>
     * <br>
     * <p>For more information about the verification methods, see [Verify the ownership of a domain name](https://help.aliyun.com/document_detail/48016.html).</p>
     * <br>
     * <p>This parameter is required.</p>
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

}
