// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class QueryChatInstanceSessionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;8C9F2D4E-7A6B-4F1C-9E53-0B2C8D3F9A4B&quot;]</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("sessionIds")
    public java.util.List<String> sessionIds;

    public static QueryChatInstanceSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChatInstanceSessionsRequest self = new QueryChatInstanceSessionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryChatInstanceSessionsRequest setSessionIds(java.util.List<String> sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }
    public java.util.List<String> getSessionIds() {
        return this.sessionIds;
    }

}
