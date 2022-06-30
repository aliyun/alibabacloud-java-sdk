// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceDbsRequest extends TeaModel {
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("Offset")
    public Long offset;

    public static ListFaceDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFaceDbsRequest self = new ListFaceDbsRequest();
        return TeaModel.build(map, self);
    }

    public ListFaceDbsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListFaceDbsRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

}
