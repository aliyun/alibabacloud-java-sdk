// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ProbeMcpOriginShrinkRequest extends TeaModel {
    /**
     * <p>The scope of the origin server configuration must not exceed that of the creation interface. The control fields for this validation only restrict the validation scope and do not extend the origin server access configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static ProbeMcpOriginShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ProbeMcpOriginShrinkRequest self = new ProbeMcpOriginShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ProbeMcpOriginShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
