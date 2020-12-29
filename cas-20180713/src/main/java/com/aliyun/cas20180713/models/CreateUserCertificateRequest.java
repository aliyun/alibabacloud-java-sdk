// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class CreateUserCertificateRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Cert")
    public String cert;

    @NameInMap("Key")
    public String key;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    public static CreateUserCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserCertificateRequest self = new CreateUserCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserCertificateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUserCertificateRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public CreateUserCertificateRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public CreateUserCertificateRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateUserCertificateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
