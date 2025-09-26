// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateDomainInput extends TeaModel {
    @NameInMap("certIdentifier")
    public String certIdentifier;

    @NameInMap("name")
    public String name;

    @NameInMap("protocol")
    public String protocol;

    public static CreateDomainInput build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainInput self = new CreateDomainInput();
        return TeaModel.build(map, self);
    }

    public CreateDomainInput setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public CreateDomainInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDomainInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
