// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyDbsRequest extends TeaModel {
    // 起始位置(不含)
    @NameInMap("Offset")
    public Long offset;

    // 分页数量
    @NameInMap("Limit")
    public Long limit;

    public static ListBodyDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBodyDbsRequest self = new ListBodyDbsRequest();
        return TeaModel.build(map, self);
    }

    public ListBodyDbsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ListBodyDbsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
