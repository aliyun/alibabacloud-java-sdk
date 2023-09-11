// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateClientKeyRequest extends TeaModel {
    @NameInMap("AapName")
    public String aapName;

    @NameInMap("NotAfter")
    public String notAfter;

    @NameInMap("NotBefore")
    public String notBefore;

    @NameInMap("Password")
    public String password;

    public static CreateClientKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClientKeyRequest self = new CreateClientKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateClientKeyRequest setAapName(String aapName) {
        this.aapName = aapName;
        return this;
    }
    public String getAapName() {
        return this.aapName;
    }

    public CreateClientKeyRequest setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public CreateClientKeyRequest setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public CreateClientKeyRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
