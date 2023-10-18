// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DeleteClientCertificateRequest extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    public static DeleteClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientCertificateRequest self = new DeleteClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
