// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class QueryItemBackgroundsShrinkRequest extends TeaModel {
    @NameInMap("ItemIds")
    public String itemIdsShrink;

    public static QueryItemBackgroundsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemBackgroundsShrinkRequest self = new QueryItemBackgroundsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemBackgroundsShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

}
