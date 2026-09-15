// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateUserShrinkRequest extends TeaModel {
    /**
     * <p>The request body for creating a user.</p>
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

    public static CreateUserShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserShrinkRequest self = new CreateUserShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public CreateUserShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
