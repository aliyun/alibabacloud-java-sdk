// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30F-1D8FxFzDXKJH9YQdve4CjR****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>6E93D6C9-5AC0-49F9-914D-E02678D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static IndexFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IndexFileMetaResponseBody self = new IndexFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public IndexFileMetaResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public IndexFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
