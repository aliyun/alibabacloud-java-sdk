// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeCrossAccountsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCrossAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossAccountsRequest self = new DescribeCrossAccountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCrossAccountsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossAccountsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
