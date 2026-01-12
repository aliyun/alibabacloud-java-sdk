// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryCollectionsResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListMemoryCollectionsOutput data;

    @NameInMap("requestId")
    public String requestId;

    public static ListMemoryCollectionsResult build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryCollectionsResult self = new ListMemoryCollectionsResult();
        return TeaModel.build(map, self);
    }

    public ListMemoryCollectionsResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemoryCollectionsResult setData(ListMemoryCollectionsOutput data) {
        this.data = data;
        return this;
    }
    public ListMemoryCollectionsOutput getData() {
        return this.data;
    }

    public ListMemoryCollectionsResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
