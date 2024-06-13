// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateRequestRequest extends TeaModel {
    /**
     * <p>The domain name that you want to bind to the certificate. You can specify only one domain name.</p>
     * <br>
     * <p>> The domain name must match the certificate specifications that you specify for the **ProductCode** parameter. If you apply for a single-domain certificate, you must specify a single domain name for this parameter. If you apply for a wildcard certificate, you must specify a wildcard domain name such as `*.aliyundoc.com` for this parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The email address of the applicant.</p>
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
     * <p>The verification method of the domain name ownership. Valid values:</p>
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

}
