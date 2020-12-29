// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("DomainTransfers")
    public java.util.List<DescribeTransferDomainsResponseBodyDomainTransfers> domainTransfers;

    public static DescribeTransferDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferDomainsResponseBody self = new DescribeTransferDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransferDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeTransferDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeTransferDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransferDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTransferDomainsResponseBody setDomainTransfers(java.util.List<DescribeTransferDomainsResponseBodyDomainTransfers> domainTransfers) {
        this.domainTransfers = domainTransfers;
        return this;
    }
    public java.util.List<DescribeTransferDomainsResponseBodyDomainTransfers> getDomainTransfers() {
        return this.domainTransfers;
    }

    public static class DescribeTransferDomainsResponseBodyDomainTransfers extends TeaModel {
        @NameInMap("FromUserId")
        public Long fromUserId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TargetUserId")
        public Long targetUserId;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeTransferDomainsResponseBodyDomainTransfers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferDomainsResponseBodyDomainTransfers self = new DescribeTransferDomainsResponseBodyDomainTransfers();
            return TeaModel.build(map, self);
        }

        public DescribeTransferDomainsResponseBodyDomainTransfers setFromUserId(Long fromUserId) {
            this.fromUserId = fromUserId;
            return this;
        }
        public Long getFromUserId() {
            return this.fromUserId;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfers setTargetUserId(Long targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public Long getTargetUserId() {
            return this.targetUserId;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfers setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfers setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
