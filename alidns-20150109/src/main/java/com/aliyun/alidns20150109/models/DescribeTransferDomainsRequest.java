// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeTransferDomainsRequest extends TeaModel {
    /**
     * <p>The domain name. Use this parameter to query the transfer records of a specific domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.top</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the source account. Use this parameter to query the list of domain names transferred from this account to the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>1*******</p>
     */
    @NameInMap("FromUserId")
    public Long fromUserId;

    /**
     * <p>The language of the response.</p>
     * <p>Valid values:</p>
     * <p>zh: Chinese</p>
     * <p>en: English</p>
     * <p>The default value is zh.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. The value starts from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. The maximum value is 100. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the destination account. Use this parameter to query the list of domain names transferred from the current account to this account.</p>
     * 
     * <strong>example:</strong>
     * <p>1*******</p>
     */
    @NameInMap("TargetUserId")
    public Long targetUserId;

    /**
     * <p>The type of transfer. Valid values:</p>
     * <ul>
     * <li><p>IN: The list of domain names transferred to the current account.</p>
     * </li>
     * <li><p>OUT: The list of domain names transferred from the current account.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IN</p>
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
