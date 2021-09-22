// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourcesShrinkRequest extends TeaModel {
    @NameInMap("regionIds")
    public String regionIdsShrink;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("isReload")
    public Boolean isReload;

    public static ListResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesShrinkRequest self = new ListResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesShrinkRequest setRegionIdsShrink(String regionIdsShrink) {
        this.regionIdsShrink = regionIdsShrink;
        return this;
    }
    public String getRegionIdsShrink() {
        return this.regionIdsShrink;
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

    public ListResourcesShrinkRequest setIsReload(Boolean isReload) {
        this.isReload = isReload;
        return this;
    }
    public Boolean getIsReload() {
        return this.isReload;
    }

}
