// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListPublishedAgentShrinkRequest extends TeaModel {
    @NameInMap("pageNo")
    public Integer pageNo;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("subTypes")
    public String subTypesShrink;

    public static ListPublishedAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAgentShrinkRequest self = new ListPublishedAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedAgentShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListPublishedAgentShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPublishedAgentShrinkRequest setSubTypesShrink(String subTypesShrink) {
        this.subTypesShrink = subTypesShrink;
        return this;
    }
    public String getSubTypesShrink() {
        return this.subTypesShrink;
    }

}
