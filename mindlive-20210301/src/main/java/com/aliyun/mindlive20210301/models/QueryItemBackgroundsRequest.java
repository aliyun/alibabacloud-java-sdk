// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class QueryItemBackgroundsRequest extends TeaModel {
    @NameInMap("ItemIds")
    public java.util.Map<String, ?> itemIds;

    public static QueryItemBackgroundsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemBackgroundsRequest self = new QueryItemBackgroundsRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemBackgroundsRequest setItemIds(java.util.Map<String, ?> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.Map<String, ?> getItemIds() {
        return this.itemIds;
    }

}
