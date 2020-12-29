// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDNSSLBSubDomainsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeDNSSLBSubDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSSLBSubDomainsRequest self = new DescribeDNSSLBSubDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDNSSLBSubDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDNSSLBSubDomainsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeDNSSLBSubDomainsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
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

}
