// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240501.models;

import com.aliyun.tea.*;

public class AISearchResult extends TeaModel {
    @NameInMap("header")
    public EventHeader header;

    @NameInMap("payload")
    public String payload;

    @NameInMap("requestId")
    public String requestId;

    public static AISearchResult build(java.util.Map<String, ?> map) throws Exception {
        AISearchResult self = new AISearchResult();
        return TeaModel.build(map, self);
    }

    public AISearchResult setHeader(EventHeader header) {
        this.header = header;
        return this;
    }
    public EventHeader getHeader() {
        return this.header;
    }

    public AISearchResult setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public AISearchResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
