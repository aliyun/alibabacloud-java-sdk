// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateCredentialShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <strong>example:</strong>
     * <p>暂不支持</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateCredentialShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialShrinkRequest self = new UpdateCredentialShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public UpdateCredentialShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
