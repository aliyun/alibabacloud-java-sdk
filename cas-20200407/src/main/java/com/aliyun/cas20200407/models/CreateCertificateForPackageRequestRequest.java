// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateForPackageRequestRequest extends TeaModel {
    @NameInMap("CompanyName")
    public String companyName;

    @NameInMap("Csr")
    public String csr;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Email")
    public String email;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Username")
    public String username;

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
