// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ResetUserPasswordShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static ResetUserPasswordShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordShrinkRequest self = new ResetUserPasswordShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
