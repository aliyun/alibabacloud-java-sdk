// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetMemorySessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1736558346</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>1736561898</p>
     */
    @NameInMap("to")
    public Long to;

    public static GetMemorySessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMemorySessionRequest self = new GetMemorySessionRequest();
        return TeaModel.build(map, self);
    }

    public GetMemorySessionRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public GetMemorySessionRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetMemorySessionRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
