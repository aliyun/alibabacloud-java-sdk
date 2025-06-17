// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomDomainSampleRateRequest extends TeaModel {
    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeCustomDomainSampleRateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDomainSampleRateRequest self = new DescribeCustomDomainSampleRateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDomainSampleRateRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public DescribeCustomDomainSampleRateRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomDomainSampleRateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
