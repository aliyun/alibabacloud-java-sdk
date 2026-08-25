// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateModelConnectionShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateModelConnectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelConnectionShrinkRequest self = new UpdateModelConnectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModelConnectionShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateModelConnectionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
