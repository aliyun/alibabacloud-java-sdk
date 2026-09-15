// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class EnableConnectorShrinkRequest extends TeaModel {
    /**
     * <p>The enable request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static EnableConnectorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableConnectorShrinkRequest self = new EnableConnectorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnableConnectorShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
