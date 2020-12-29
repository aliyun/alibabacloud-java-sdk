// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Csr")
    public String csr;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Username")
    public String username;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Email")
    public String email;

    @NameInMap("ValidateType")
    public String validateType;

    public static CreateCertificateWithCsrRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateWithCsrRequestRequest self = new CreateCertificateWithCsrRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateWithCsrRequestRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateCertificateWithCsrRequestRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
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

    public CreateCertificateWithCsrRequestRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateCertificateWithCsrRequestRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateCertificateWithCsrRequestRequest setValidateType(String validateType) {
        this.validateType = validateType;
        return this;
    }
    public String getValidateType() {
        return this.validateType;
    }

}
