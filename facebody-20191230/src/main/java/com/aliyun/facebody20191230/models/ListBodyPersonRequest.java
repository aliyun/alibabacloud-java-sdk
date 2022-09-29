// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyPersonRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("Offset")
    public Long offset;

    public static ListBodyPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBodyPersonRequest self = new ListBodyPersonRequest();
        return TeaModel.build(map, self);
    }

    public ListBodyPersonRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ListBodyPersonRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListBodyPersonRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

}
