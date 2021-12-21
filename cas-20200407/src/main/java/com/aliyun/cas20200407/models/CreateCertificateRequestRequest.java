// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCertificateRequestRequest extends TeaModel {
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
