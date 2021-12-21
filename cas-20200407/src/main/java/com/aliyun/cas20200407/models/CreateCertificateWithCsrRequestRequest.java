// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateWithCsrRequestRequest extends TeaModel {
    @NameInMap("Csr")
    public String csr;

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
