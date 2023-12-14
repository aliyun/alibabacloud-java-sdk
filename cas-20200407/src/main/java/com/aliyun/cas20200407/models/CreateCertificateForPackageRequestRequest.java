// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateForPackageRequestRequest extends TeaModel {
    /**
     * <p>The company name of the certificate application.</p>
     * <br>
     * <p>> This parameter is available only when you apply for OV certificates. If you want to apply for an OV certificate, you must add a company profile to the **Information Management** module of the [Certificate Management Service console](https://yundun.console.aliyun.com/?p=cas#/). For more information, see [Manage company profiles](~~198289~~). If you want to apply for a DV certificate, you do not need to add a company profile.</p>
     * <br>
     * <p>If you specify a company name, the information about the company that is configured in the **Information Management** module is used. If you do not specify this parameter, the information about the most recent company that is added to the **Information Management** module is used.</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>The content of the certificate signing request (CSR) file that is manually generated for the domain name by using OpenSSL or Keytool. The key algorithm in the CSR file must be Rivest-Shamir-Adleman (RSA) or elliptic-curve cryptography (ECC), and the key length of the RSA algorithm must be greater than or equal to 2,048 characters. For more information about how to create a CSR file, see [Create a CSR file](~~313297~~). If you do not specify this parameter, Certificate Management Service automatically creates a CSR file.</p>
     * <br>
     * <p>A CSR file contains the information about your server and company. When you apply for a certificate, you must submit the CSR file to the CA. The CA signs the CSR file by using the private key of the root certificate and generates a public key file to issue your certificate.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>The **CN** field in the CSR file specifies the domain name that you want to bind to the certificate. You must include the field in the parameter value.</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The domain name that you want to bind to the certificate. The domain name must meet the following requirements:</p>
     * <br>
     * <p>*   The domain name must be a single domain name or a wildcard domain name. Example: `*.aliyundoc.com`.</p>
     * <p>*   You can specify multiple domain names. Separate multiple domain names with commas (,). You can specify a maximum of five domain names.</p>
     * <p>*   If you specify multiple domain names, the domain names must be only single domain names or only wildcard domain names. You cannot specify both single domain names and wildcard domain names.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>If you want to bind multiple domain names to the certificate, you must specify this parameter. You must specify at least one of the Domain parameter and the **Csr** parameter. If you specify both the Domain parameter and the **Csr** parameter, the value of the **CN** field in the **Csr** parameter is used as the domain name that can be bound to the certificate.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The email address of the applicant. After the CA receives your certificate application, the CA sends a verification email to the email address that you specify. You must log on to the mailbox, open the mail, and complete the verification of the domain name ownership based on the steps that are described in the email.</p>
     * <br>
     * <p>If you do not specify this parameter, the information about the most recent contact that is added to the **Information Management** module is used. For more information about how to add a contact to the **Information Management** module, see [Manage contacts](~~198262~~).</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The phone number of the applicant. CA staff can call the phone number to confirm the information in your certificate application.</p>
     * <br>
     * <p>If you do not specify this parameter, the information about the most recent contact that is added to the **Information Management** module is used. For more information about how to add a contact to the **Information Management** module, see [Manage contacts](~~198262~~).</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The specifications of the certificate. Valid values:</p>
     * <br>
     * <p>*   **digicert-free-1-free**: DigiCert single-domain domain validated (DV) certificate in 3 months free trial. This is the default value.</p>
     * <p>*   **symantec-free-1-free**: DigiCert single-domain domain validated (DV) certificate in 1 year free trial.</p>
     * <p>*   **symantec-dv-1-starter**: DigiCert wildcard DV certificate.</p>
     * <p>*   **symantec-ov-1-personal**: DigiCert single-domain organization validated (OV) certificate.</p>
     * <p>*   **symantec-ov-w-personal**: DigiCert wildcard OV certificate.</p>
     * <p>*   **geotrust-dv-1-starter**: GeoTrust single-domain DV certificate.</p>
     * <p>*   **geotrust-dv-w-starter**: GeoTrust wildcard DV certificate.</p>
     * <p>*   **geotrust-ov-1-personal**: GeoTrust single-domain OV certificate.</p>
     * <p>*   **geotrust-ov-w-personal**: GeoTrust wildcard OV certificate.</p>
     * <p>*   **globalsign-dv-1-personal**: GlobalSign single-domain DV certificate.</p>
     * <p>*   **globalsign-dv-w-advanced**: GlobalSign wildcard DV certificate.</p>
     * <p>*   **globalsign-ov-1-personal**: GlobalSign single-domain OV certificate.</p>
     * <p>*   **globalsign-ov-w-advanced**: GlobalSign wildcard OV certificate.</p>
     * <p>*   **cfca-ov-1-personal**: China Financial Certification Authority (CFCA) single-domain OV certificate.</p>
     * <p>*   **cfca-ev-w-advanced**: CFCA wildcard OV certificate.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The name of the applicant.</p>
     * <br>
     * <p>If you do not specify this parameter, the information about the most recent contact that is added to the **Information Management** module is used. For more information about how to add a contact to the **Information Management** module, see [Manage contacts](~~198262~~).</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The verification method of the domain name ownership. Valid values:</p>
     * <br>
     * <p>*   **DNS**: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name. You must have operation permissions on domain name resolution to verify the ownership of the domain name.</p>
     * <p>*   **FILE**: file verification. If you use this method, you must create a specified file on the DNS server. You must have administrative rights on the DNS server to verify the ownership of the domain name.</p>
     * <br>
     * <p>For more information about the verification methods, see [Verify the ownership of a domain name](~~48016~~).</p>
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

}
