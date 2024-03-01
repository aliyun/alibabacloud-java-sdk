// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDNSSLBSubDomainsRequest extends TeaModel {
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
     * <p>The page number. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: **1 to 100**. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The hostname.</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The IP address of the client.</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DescribeDNSSLBSubDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSSLBSubDomainsRequest self = new DescribeDNSSLBSubDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDNSSLBSubDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDNSSLBSubDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDNSSLBSubDomainsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDNSSLBSubDomainsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDNSSLBSubDomainsRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public DescribeDNSSLBSubDomainsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
