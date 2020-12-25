// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListBodyPersonRequest extends TeaModel {
    // 数据库ID
    @NameInMap("DbId")
    public Long dbId;

    // 起始位置(不含)
    @NameInMap("Offset")
    public Long offset;

    // 分页数量
    @NameInMap("Limit")
    public Long limit;

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

    public ListBodyPersonRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ListBodyPersonRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
