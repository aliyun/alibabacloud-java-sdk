// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class ListProductVersionsRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("uid")
    public String uid;

    public static ListProductVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsRequest self = new ListProductVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListProductVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductVersionsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
