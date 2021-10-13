// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourcesShrinkRequest extends TeaModel {
    @NameInMap("filter")
    public String filterShrink;

    @NameInMap("isReload")
    public Boolean isReload;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("regionIds")
    public String regionIdsShrink;

    public static ListResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesShrinkRequest self = new ListResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public ListResourcesShrinkRequest setIsReload(Boolean isReload) {
        this.isReload = isReload;
        return this;
    }
    public Boolean getIsReload() {
        return this.isReload;
    }

    public ListResourcesShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListResourcesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
    }

}
