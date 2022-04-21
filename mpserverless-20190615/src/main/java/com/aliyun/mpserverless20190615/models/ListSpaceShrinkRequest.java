// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListSpaceShrinkRequest extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SpaceIds")
    public String spaceIdsShrink;

    public static ListSpaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSpaceShrinkRequest self = new ListSpaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListSpaceShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListSpaceShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSpaceShrinkRequest setSpaceIdsShrink(String spaceIdsShrink) {
        this.spaceIdsShrink = spaceIdsShrink;
        return this;
    }
    public String getSpaceIdsShrink() {
        return this.spaceIdsShrink;
    }

}
