// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateCredentialShrinkRequest extends TeaModel {
    /**
     * <p>The request body for creating a credential.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not supported</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateCredentialShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialShrinkRequest self = new CreateCredentialShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCredentialShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateCredentialShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
