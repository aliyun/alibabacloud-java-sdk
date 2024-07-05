// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>387-1DAPFFZplUZhuCuhnB6I9H****</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>8F93E6D9-5AC0-49F9-914D-E02678A3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchIndexFileMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchIndexFileMetaResponseBody self = new BatchIndexFileMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchIndexFileMetaResponseBody setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public BatchIndexFileMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
