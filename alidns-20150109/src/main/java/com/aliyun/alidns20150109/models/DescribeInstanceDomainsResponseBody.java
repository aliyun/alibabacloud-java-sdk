// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInstanceDomainsResponseBody extends TeaModel {
    /**
     * <p>A list of domain names attached to the instance.</p>
     */
    @NameInMap("InstanceDomains")
    public java.util.List<DescribeInstanceDomainsResponseBodyInstanceDomains> instanceDomains;

    /**
     * <p>The page number. The value starts from <strong>1</strong>. Default: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68386699-8B9E-4D5B-BC4C-75A28F6C2A00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-03-09T02:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The UNIX timestamp that indicates when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1583720154000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.top</p>
         */
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
