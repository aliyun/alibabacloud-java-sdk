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

    }

    public static class DescribeTransferDomainsResponseDomainTransfers extends TeaModel {
        @NameInMap("DomainTransfer")
        @Validation(required = true)
        public java.util.List<DescribeTransferDomainsResponseDomainTransfersDomainTransfer> domainTransfer;

        public static DescribeTransferDomainsResponseDomainTransfers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransferDomainsResponseDomainTransfers self = new DescribeTransferDomainsResponseDomainTransfers();
            return TeaModel.build(map, self);
        }

    }

}
