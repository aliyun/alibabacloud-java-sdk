// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInstanceDomainsResponseBody extends TeaModel {
    @NameInMap("InstanceDomains")
    public java.util.List<DescribeInstanceDomainsResponseBodyInstanceDomains> instanceDomains;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeInstanceDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDomainsResponseBody self = new DescribeInstanceDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDomainsResponseBody setInstanceDomains(java.util.List<DescribeInstanceDomainsResponseBodyInstanceDomains> instanceDomains) {
        this.instanceDomains = instanceDomains;
        return this;
    }
    public java.util.List<DescribeInstanceDomainsResponseBodyInstanceDomains> getInstanceDomains() {
        return this.instanceDomains;
    }

    public DescribeInstanceDomainsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceDomainsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceDomainsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeInstanceDomainsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeInstanceDomainsResponseBodyInstanceDomains extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeInstanceDomainsResponseBodyInstanceDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDomainsResponseBodyInstanceDomains self = new DescribeInstanceDomainsResponseBodyInstanceDomains();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDomainsResponseBodyInstanceDomains setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstanceDomainsResponseBodyInstanceDomains setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeInstanceDomainsResponseBodyInstanceDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
