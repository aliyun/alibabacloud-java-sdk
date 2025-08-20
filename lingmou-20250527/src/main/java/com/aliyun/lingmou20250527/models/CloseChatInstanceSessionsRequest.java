// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CloseChatInstanceSessionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;8C9F2D4E-7A6B-4F1C-9E53-0B2C8D3F9A4B&quot;]</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("sessionIds")
    public java.util.List<String> sessionIds;

    public static CloseChatInstanceSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseChatInstanceSessionsRequest self = new CloseChatInstanceSessionsRequest();
        return TeaModel.build(map, self);
    }

    public CloseChatInstanceSessionsRequest setSessionIds(java.util.List<String> sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }
    public java.util.List<String> getSessionIds() {
        return this.sessionIds;
    }

}
