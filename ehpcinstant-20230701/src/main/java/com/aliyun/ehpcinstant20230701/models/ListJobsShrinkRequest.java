// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobsShrinkRequest extends TeaModel {
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortByShrink;

    public static ListJobsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsShrinkRequest self = new ListJobsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public ListJobsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsShrinkRequest setSortByShrink(String sortByShrink) {
        this.sortByShrink = sortByShrink;
        return this;
    }
    public String getSortByShrink() {
        return this.sortByShrink;
    }

}
