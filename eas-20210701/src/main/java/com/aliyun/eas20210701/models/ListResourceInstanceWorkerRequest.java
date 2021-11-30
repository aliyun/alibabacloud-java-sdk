// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstanceWorkerRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListResourceInstanceWorkerRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceInstanceWorkerRequest self = new ListResourceInstanceWorkerRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceInstanceWorkerRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceInstanceWorkerRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
