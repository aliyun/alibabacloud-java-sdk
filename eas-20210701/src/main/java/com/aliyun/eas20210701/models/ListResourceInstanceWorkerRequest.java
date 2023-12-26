// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourceInstanceWorkerRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     */
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
