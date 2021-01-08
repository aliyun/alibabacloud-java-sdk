// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListItemsRequest extends TeaModel {
    @NameInMap("Page")
    public Integer page;

    @NameInMap("Size")
    public Integer size;

    public static ListItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListItemsRequest self = new ListItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListItemsRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListItemsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
