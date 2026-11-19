// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class VerifyConnectorShrinkRequest extends TeaModel {
    /**
     * <p>The validation request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static VerifyConnectorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyConnectorShrinkRequest self = new VerifyConnectorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public VerifyConnectorShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
