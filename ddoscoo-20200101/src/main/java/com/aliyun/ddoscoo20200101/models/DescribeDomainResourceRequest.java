// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainResourceRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryDomainPattern")
    public String queryDomainPattern;

    public static DescribeDomainResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResourceRequest self = new DescribeDomainResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResourceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDomainResourceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeDomainResourceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDomainResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDomainResourceRequest setQueryDomainPattern(String queryDomainPattern) {
        this.queryDomainPattern = queryDomainPattern;
        return this;
    }
    public String getQueryDomainPattern() {
        return this.queryDomainPattern;
    }

}
