// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class BatchDeleteModelsShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static BatchDeleteModelsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteModelsShrinkRequest self = new BatchDeleteModelsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteModelsShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public BatchDeleteModelsShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
