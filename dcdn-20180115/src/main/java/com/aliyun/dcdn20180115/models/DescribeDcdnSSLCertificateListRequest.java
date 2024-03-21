// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSSLCertificateListRequest extends TeaModel {
    /**
     * <p>The accelerated domain secured by the SSL certificate. HTTPS secure acceleration is enabled for the accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: **1 to 1000**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The keyword that is used to query the certificate.</p>
     */
    @NameInMap("SearchKeyword")
    public String searchKeyword;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDcdnSSLCertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSSLCertificateListRequest self = new DescribeDcdnSSLCertificateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSSLCertificateListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnSSLCertificateListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnSSLCertificateListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnSSLCertificateListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnSSLCertificateListRequest setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
        return this;
    }
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    public DescribeDcdnSSLCertificateListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
