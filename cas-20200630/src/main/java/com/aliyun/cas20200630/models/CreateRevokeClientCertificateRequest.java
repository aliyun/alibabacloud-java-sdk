// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRevokeClientCertificateRequest extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    public static CreateRevokeClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRevokeClientCertificateRequest self = new CreateRevokeClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateRevokeClientCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
