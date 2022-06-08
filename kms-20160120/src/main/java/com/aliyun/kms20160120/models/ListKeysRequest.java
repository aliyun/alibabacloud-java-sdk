// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ListKeysRequest extends TeaModel {
    @NameInMap("Filters")
    public String filters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKeysRequest self = new ListKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListKeysRequest setFilters(String filters) {
        this.filters = filters;
        return this;
    }
    public String getFilters() {
        return this.filters;
    }

    public ListKeysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
