// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordsRequest extends TeaModel {
    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    public static ListEnvChangeRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordsRequest self = new ListEnvChangeRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordsRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListEnvChangeRecordsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
