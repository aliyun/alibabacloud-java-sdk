// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsResponseBody extends TeaModel {
    /**
     * <p>The list of domain names that were transferred between accounts.</p>
     */
    @NameInMap("DomainTransfers")
    public DescribeTransferDomainsResponseBodyDomainTransfers domainTransfers;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeTransferDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferDomainsResponseBody self = new DescribeTransferDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransferDomainsResponseBody setDomainTransfers(DescribeTransferDomainsResponseBodyDomainTransfers domainTransfers) {
        this.domainTransfers = domainTransfers;
        return this;
    }
    public DescribeTransferDomainsResponseBodyDomainTransfers getDomainTransfers() {
        return this.domainTransfers;
    }

    public DescribeTransferDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
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

    public DescribeTransferDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer extends TeaModel {
        /**
         * <p>The time when the task for transferring domain names was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The UNIX timestamp representing when the task for transferring domain names was created.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The ID of the user from which the domain name was transferred.</p>
         */
        @NameInMap("FromUserId")
        public Long fromUserId;

        /**
         * <p>The ID of the domain name that was transferred.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the user to which the domain name was transferred.</p>
         */
        @NameInMap("TargetUserId")
        public Long targetUserId;

        public static DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer self = new DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer();
            return TeaModel.build(map, self);
        }

        public DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer setFromUserId(Long fromUserId) {
            this.fromUserId = fromUserId;
            return this;
        }
        public Long getFromUserId() {
            return this.fromUserId;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer setTargetUserId(Long targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public Long getTargetUserId() {
            return this.targetUserId;
        }

    }

    public static class DescribeTransferDomainsResponseBodyDomainTransfers extends TeaModel {
        @NameInMap("DomainTransfer")
        public java.util.List<DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer> domainTransfer;

        public static DescribeTransferDomainsResponseBodyDomainTransfers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferDomainsResponseBodyDomainTransfers self = new DescribeTransferDomainsResponseBodyDomainTransfers();
            return TeaModel.build(map, self);
        }

        public DescribeTransferDomainsResponseBodyDomainTransfers setDomainTransfer(java.util.List<DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer> domainTransfer) {
            this.domainTransfer = domainTransfer;
            return this;
        }
        public java.util.List<DescribeTransferDomainsResponseBodyDomainTransfersDomainTransfer> getDomainTransfer() {
            return this.domainTransfer;
        }

    }

}
