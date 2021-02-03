// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TransferType")
    @Validation(required = true)
    public String transferType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FromUserId")
    public Long fromUserId;

    @NameInMap("TargetUserId")
    public Long targetUserId;

    public static DescribeTransferDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferDomainsRequest self = new DescribeTransferDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransferDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTransferDomainsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTransferDomainsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeTransferDomainsRequest setTransferType(String transferType) {
        this.transferType = transferType;
        return this;
    }
    public String getTransferType() {
        return this.transferType;
    }

    public DescribeTransferDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeTransferDomainsRequest setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
        return this;
    }
    public Long getFromUserId() {
        return this.fromUserId;
    }

    public DescribeTransferDomainsRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

}
