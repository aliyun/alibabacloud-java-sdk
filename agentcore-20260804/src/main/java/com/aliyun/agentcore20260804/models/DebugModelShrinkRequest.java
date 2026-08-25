// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DebugModelShrinkRequest extends TeaModel {
    @NameInMap("body")
    public String bodyShrink;

    public static DebugModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugModelShrinkRequest self = new DebugModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DebugModelShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
