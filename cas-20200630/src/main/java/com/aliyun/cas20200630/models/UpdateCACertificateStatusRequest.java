// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdateCACertificateStatusRequest extends TeaModel {
    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("Status")
    public String status;

    public static UpdateCACertificateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCACertificateStatusRequest self = new UpdateCACertificateStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCACertificateStatusRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdateCACertificateStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
