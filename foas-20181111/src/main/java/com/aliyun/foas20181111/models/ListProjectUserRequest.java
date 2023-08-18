// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListProjectUserRequest extends TeaModel {
    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListProjectUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectUserRequest self = new ListProjectUserRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectUserRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListProjectUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
