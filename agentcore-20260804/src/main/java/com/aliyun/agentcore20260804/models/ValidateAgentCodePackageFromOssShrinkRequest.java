// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ValidateAgentCodePackageFromOssShrinkRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    public static ValidateAgentCodePackageFromOssShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateAgentCodePackageFromOssShrinkRequest self = new ValidateAgentCodePackageFromOssShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ValidateAgentCodePackageFromOssShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
