// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetMemoryEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1758273080</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <strong>example:</strong>
     * <p>1758273680</p>
     */
    @NameInMap("to")
    public Long to;

    public static GetMemoryEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryEventRequest self = new GetMemoryEventRequest();
        return TeaModel.build(map, self);
    }

    public GetMemoryEventRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetMemoryEventRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
