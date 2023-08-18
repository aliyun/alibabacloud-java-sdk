// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListTaskJobShrinkRequest extends TeaModel {
    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("state")
    public String stateShrink;

    public static ListTaskJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskJobShrinkRequest self = new ListTaskJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskJobShrinkRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskJobShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskJobShrinkRequest setStateShrink(String stateShrink) {
        this.stateShrink = stateShrink;
        return this;
    }
    public String getStateShrink() {
        return this.stateShrink;
    }

}
