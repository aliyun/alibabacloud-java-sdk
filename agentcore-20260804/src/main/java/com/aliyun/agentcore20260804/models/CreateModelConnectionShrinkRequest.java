// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateModelConnectionShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateModelConnectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelConnectionShrinkRequest self = new CreateModelConnectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelConnectionShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateModelConnectionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
