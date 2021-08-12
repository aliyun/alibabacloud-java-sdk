// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordNodesRequest extends TeaModel {
    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    public static ListEnvChangeRecordNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordNodesRequest self = new ListEnvChangeRecordNodesRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordNodesRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListEnvChangeRecordNodesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
