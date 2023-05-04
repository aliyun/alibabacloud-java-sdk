// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeletedDomainsRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: **1** to **100000**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of domain names to return per page. Valid values: an integer between **1** and **500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCdnDeletedDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeletedDomainsRequest self = new DescribeCdnDeletedDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeletedDomainsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCdnDeletedDomainsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
