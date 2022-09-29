// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyDbsRequest extends TeaModel {
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("Offset")
    public Long offset;

    public static ListBodyDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBodyDbsRequest self = new ListBodyDbsRequest();
        return TeaModel.build(map, self);
    }

    public ListBodyDbsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListBodyDbsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

}
