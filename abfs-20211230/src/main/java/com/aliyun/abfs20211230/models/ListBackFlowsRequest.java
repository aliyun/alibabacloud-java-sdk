// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class ListBackFlowsRequest extends TeaModel {
    // 查询回流次数(默认值为1,最大值为10)
    @NameInMap("limit")
    public Long limit;

    public static ListBackFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBackFlowsRequest self = new ListBackFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListBackFlowsRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
