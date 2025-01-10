// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPagesShrinkRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: <strong>1 to 100000</strong>. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryArgs")
    public String queryArgsShrink;

    public static ListPagesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPagesShrinkRequest self = new ListPagesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPagesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPagesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPagesShrinkRequest setQueryArgsShrink(String queryArgsShrink) {
        this.queryArgsShrink = queryArgsShrink;
        return this;
    }
    public String getQueryArgsShrink() {
        return this.queryArgsShrink;
    }

}
