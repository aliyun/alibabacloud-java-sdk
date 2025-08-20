// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CloseChatInstanceSessionsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;8C9F2D4E-7A6B-4F1C-9E53-0B2C8D3F9A4B&quot;]</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("sessionIds")
    public String sessionIdsShrink;

    public static CloseChatInstanceSessionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseChatInstanceSessionsShrinkRequest self = new CloseChatInstanceSessionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloseChatInstanceSessionsShrinkRequest setSessionIdsShrink(String sessionIdsShrink) {
        this.sessionIdsShrink = sessionIdsShrink;
        return this;
    }
    public String getSessionIdsShrink() {
        return this.sessionIdsShrink;
    }

}
