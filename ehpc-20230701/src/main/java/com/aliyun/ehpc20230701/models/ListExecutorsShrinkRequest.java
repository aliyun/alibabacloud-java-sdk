// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class ListExecutorsShrinkRequest extends TeaModel {
    @NameInMap("Filter")
    public String filterShrink;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListExecutorsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorsShrinkRequest self = new ListExecutorsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutorsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public ListExecutorsShrinkRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutorsShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
