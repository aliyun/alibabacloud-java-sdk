// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateDomainInput extends TeaModel {
    @NameInMap("certIdentifier")
    public String certIdentifier;

    @NameInMap("protocol")
    public String protocol;

    public static UpdateDomainInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainInput self = new UpdateDomainInput();
        return TeaModel.build(map, self);
    }

    public UpdateDomainInput setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public UpdateDomainInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
