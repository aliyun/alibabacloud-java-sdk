// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnHttpsDomainListRequest extends TeaModel {
    // The keyword used for search.
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Valid values: **1** to **100000**.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The maximum number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCdnHttpsDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnHttpsDomainListRequest self = new DescribeCdnHttpsDomainListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnHttpsDomainListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeCdnHttpsDomainListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnHttpsDomainListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCdnHttpsDomainListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
