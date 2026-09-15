// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateConnectorShrinkRequest extends TeaModel {
    /**
     * <p>The update request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static UpdateConnectorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectorShrinkRequest self = new UpdateConnectorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectorShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
