// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInstanceDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("InstanceDomains")
    @Validation(required = true)
    public java.util.List<DescribeInstanceDomainsResponseInstanceDomains> instanceDomains;

    public static DescribeInstanceDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDomainsResponse self = new DescribeInstanceDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceDomainsResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeInstanceDomainsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceDomainsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceDomainsResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeInstanceDomainsResponse setInstanceDomains(java.util.List<DescribeInstanceDomainsResponseInstanceDomains> instanceDomains) {
        this.instanceDomains = instanceDomains;
        return this;
    }
    public java.util.List<DescribeInstanceDomainsResponseInstanceDomains> getInstanceDomains() {
        return this.instanceDomains;
    }

    public static class DescribeInstanceDomainsResponseInstanceDomains extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        public static DescribeInstanceDomainsResponseInstanceDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDomainsResponseInstanceDomains self = new DescribeInstanceDomainsResponseInstanceDomains();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDomainsResponseInstanceDomains setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeInstanceDomainsResponseInstanceDomains setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstanceDomainsResponseInstanceDomains setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
