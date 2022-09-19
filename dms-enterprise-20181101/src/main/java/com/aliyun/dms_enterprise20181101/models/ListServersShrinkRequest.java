// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListServersShrinkRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Sorter")
    public String sorter;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("body")
    public String bodyShrink;

    public static ListServersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServersShrinkRequest self = new ListServersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListServersShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListServersShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListServersShrinkRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListServersShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServersShrinkRequest setSorter(String sorter) {
        this.sorter = sorter;
        return this;
    }
    public String getSorter() {
        return this.sorter;
    }

    public ListServersShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListServersShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

}
