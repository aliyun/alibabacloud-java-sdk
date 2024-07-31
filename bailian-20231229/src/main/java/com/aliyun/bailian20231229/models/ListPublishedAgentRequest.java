// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListPublishedAgentRequest extends TeaModel {
    @NameInMap("pageNo")
    public Integer pageNo;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListPublishedAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishedAgentRequest self = new ListPublishedAgentRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishedAgentRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListPublishedAgentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
