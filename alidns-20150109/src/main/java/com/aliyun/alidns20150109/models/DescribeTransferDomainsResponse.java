// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("DomainTransfers")
    @Validation(required = true)
    public DescribeTransferDomainsResponseDomainTransfers domainTransfers;

    public static DescribeTransferDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferDomainsResponse self = new DescribeTransferDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransferDomainsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransferDomainsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeTransferDomainsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTransferDomainsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeTransferDomainsResponse setDomainTransfers(DescribeTransferDomainsResponseDomainTransfers domainTransfers) {
        this.domainTransfers = domainTransfers;
        return this;
    }
    public DescribeTransferDomainsResponseDomainTransfers getDomainTransfers() {
        return this.domainTransfers;
    }

    public static class DescribeTransferDomainsResponseDomainTransfersDomainTransfer extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("FromUserId")
        @Validation(required = true)
        public Long fromUserId;

        @NameInMap("TargetUserId")
        @Validation(required = true)
        public Long targetUserId;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        public static DescribeTransferDomainsResponseDomainTransfersDomainTransfer build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferDomainsResponseDomainTransfersDomainTransfer self = new DescribeTransferDomainsResponseDomainTransfersDomainTransfer();
            return TeaModel.build(map, self);
        }

        public DescribeTransferDomainsResponseDomainTransfersDomainTransfer setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeTransferDomainsResponseDomainTransfersDomainTransfer setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTransferDomainsResponseDomainTransfersDomainTransfer setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeTransferDomainsResponseDomainTransfersDomainTransfer setFromUserId(Long fromUserId) {
            this.fromUserId = fromUserId;
            return this;
        }
        public Long getFromUserId() {
            return this.fromUserId;
        }

        public DescribeTransferDomainsResponseDomainTransfersDomainTransfer setTargetUserId(Long targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public Long getTargetUserId() {
            return this.targetUserId;
        }

        public DescribeTransferDomainsResponseDomainTransfersDomainTransfer setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class DescribeTransferDomainsResponseDomainTransfers extends TeaModel {
        @NameInMap("DomainTransfer")
        @Validation(required = true)
        public java.util.List<DescribeTransferDomainsResponseDomainTransfersDomainTransfer> domainTransfer;

        public static DescribeTransferDomainsResponseDomainTransfers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferDomainsResponseDomainTransfers self = new DescribeTransferDomainsResponseDomainTransfers();
            return TeaModel.build(map, self);
        }

        public DescribeTransferDomainsResponseDomainTransfers setDomainTransfer(java.util.List<DescribeTransferDomainsResponseDomainTransfersDomainTransfer> domainTransfer) {
            this.domainTransfer = domainTransfer;
            return this;
        }
        public java.util.List<DescribeTransferDomainsResponseDomainTransfersDomainTransfer> getDomainTransfer() {
            return this.domainTransfer;
        }

    }

}
