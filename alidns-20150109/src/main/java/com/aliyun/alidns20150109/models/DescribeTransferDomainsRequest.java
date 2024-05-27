// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsRequest extends TeaModel {
    /**
     * <p>Specifies the domain name for which you want to view the transfer record.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The user ID from which the domain name was transferred to the current account.</p>
     */
    @NameInMap("FromUserId")
    public Long fromUserId;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The user ID to which the domain name was transferred from the current account.</p>
     */
    @NameInMap("TargetUserId")
    public Long targetUserId;

    /**
     * <p>The transfer type. Valid values:</p>
     * <br>
     * <p>*   IN: The domain name was transferred to the current account.</p>
     * <p>*   OUT: The domain name was transferred from the current account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransferType")
    public String transferType;

    public static DescribeTransferDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferDomainsRequest self = new DescribeTransferDomainsRequest();
        return TeaModel.build(map, self);
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

    public DescribeTransferDomainsRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public DescribeTransferDomainsRequest setTransferType(String transferType) {
        this.transferType = transferType;
        return this;
    }
    public String getTransferType() {
        return this.transferType;
    }

}
