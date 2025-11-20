// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCredentialRequest extends TeaModel {
    @NameInMap("body")
    public CreateCredentialInput body;

    public static CreateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialRequest self = new CreateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialRequest setBody(CreateCredentialInput body) {
        this.body = body;
        return this;
    }
    public CreateCredentialInput getBody() {
        return this.body;
    }

}
