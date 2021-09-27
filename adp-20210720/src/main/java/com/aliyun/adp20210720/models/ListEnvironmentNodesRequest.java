// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentNodesRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListEnvironmentNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentNodesRequest self = new ListEnvironmentNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentNodesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListEnvironmentNodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
