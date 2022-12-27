// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDeletedDomainsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Pages start from page **1**. Valid values: **1** to **100000**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Default value: **20**. Valid values: **1** to **500**. The value must be an integer.
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCdnDeletedDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDeletedDomainsRequest self = new DescribeCdnDeletedDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDeletedDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
