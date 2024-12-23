// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDbsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("sorter")
    public String sorterShrink;

    /**
     * <strong>example:</strong>
     * <p>STARTED</p>
     */
    @NameInMap("status")
    public String status;

    public static ListMmsDbsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsDbsShrinkRequest self = new ListMmsDbsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsDbsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMmsDbsShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsDbsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsDbsShrinkRequest setSorterShrink(String sorterShrink) {
        this.sorterShrink = sorterShrink;
        return this;
    }
    public String getSorterShrink() {
        return this.sorterShrink;
    }

    public ListMmsDbsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
