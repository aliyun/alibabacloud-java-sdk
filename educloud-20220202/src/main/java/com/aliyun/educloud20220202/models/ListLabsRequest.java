// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class ListLabsRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<String> id;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListLabsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLabsRequest self = new ListLabsRequest();
        return TeaModel.build(map, self);
    }

    public ListLabsRequest setId(java.util.List<String> id) {
        this.id = id;
        return this;
    }
    public java.util.List<String> getId() {
        return this.id;
    }

    public ListLabsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListLabsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
