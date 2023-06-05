// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListExtensionsRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListExtensionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExtensionsRequest self = new ListExtensionsRequest();
        return TeaModel.build(map, self);
    }

    public ListExtensionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExtensionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
