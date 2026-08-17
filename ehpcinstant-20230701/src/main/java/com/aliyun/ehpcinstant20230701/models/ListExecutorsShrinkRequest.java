// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListExecutorsShrinkRequest extends TeaModel {
    /**
     * <p>The filter conditions for querying executors.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>The current page number.<br>Start value: 1<br>Default value: 1<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. Default value: 50. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    public ListExecutorsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutorsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
