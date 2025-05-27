// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class ListCoursesRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<Long> id;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListCoursesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCoursesRequest self = new ListCoursesRequest();
        return TeaModel.build(map, self);
    }

    public ListCoursesRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public ListCoursesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListCoursesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
