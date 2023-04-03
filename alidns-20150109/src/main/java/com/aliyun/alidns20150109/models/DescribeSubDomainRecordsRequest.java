// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeSubDomainRecordsRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The resolution line.</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **500**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The subdomain. For example, assume that the SubDomain parameter is set to a.www.example.com.</p>
     * <br>
     * <p>If the DomainName parameter is empty, the DNS records of the subdomain whose domain name is example.com and hostname is "a.www" are queried.</p>
     * <br>
     * <p>If the DomainName parameter is set to www.example.com, the DNS records of the subdomain whose domain name is www.example.com and hostname is "a" are queried.</p>
     * <br>
     * <p>If the DomainName parameter is set to a.www.example.com, the DNS records of the subdomain whose domain name is a.www.example.com and hostname is "@" are queried.</p>
     */
    @NameInMap("SubDomain")
    public String subDomain;

    /**
     * <p>The type of DNS records to query. If you do not specify this parameter, all types of DNS records corresponding to the subdomain are returned.</p>
     * <br>
     * <p>DNS record types include **A, MX, CNAME, TXT, REDIRECT_URL, FORWORD_URL, NS, AAAA, and SRV**. The value is not case-sensitive.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DescribeSubDomainRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubDomainRecordsRequest self = new DescribeSubDomainRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubDomainRecordsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeSubDomainRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSubDomainRecordsRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public DescribeSubDomainRecordsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSubDomainRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSubDomainRecordsRequest setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribeSubDomainRecordsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeSubDomainRecordsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
