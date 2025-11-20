// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateCredentialRequest extends TeaModel {
    @NameInMap("body")
    public UpdateCredentialInput body;

    public static UpdateCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialRequest self = new UpdateCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialRequest setBody(UpdateCredentialInput body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialInput getBody() {
        return this.body;
    }

}
