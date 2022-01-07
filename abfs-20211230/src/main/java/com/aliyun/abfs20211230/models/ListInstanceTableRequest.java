// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class ListInstanceTableRequest extends TeaModel {
    // 起始页
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 页码大小
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListInstanceTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTableRequest self = new ListInstanceTableRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceTableRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceTableRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
