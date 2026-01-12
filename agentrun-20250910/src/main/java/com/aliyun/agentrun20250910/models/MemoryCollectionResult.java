// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class MemoryCollectionResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public MemoryCollection data;

    @NameInMap("requestId")
    public String requestId;

    public static MemoryCollectionResult build(java.util.Map<String, ?> map) throws Exception {
        MemoryCollectionResult self = new MemoryCollectionResult();
        return TeaModel.build(map, self);
    }

    public MemoryCollectionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MemoryCollectionResult setData(MemoryCollection data) {
        this.data = data;
        return this;
    }
    public MemoryCollection getData() {
        return this.data;
    }

    public MemoryCollectionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
