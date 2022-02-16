// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificateMatchDomainListRequest extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("MatchType")
    public String matchType;

    @NameInMap("ShowSize")
    public Integer showSize;

    public static DescribeSSLCertificateMatchDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificateMatchDomainListRequest self = new DescribeSSLCertificateMatchDomainListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificateMatchDomainListRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public DescribeSSLCertificateMatchDomainListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSSLCertificateMatchDomainListRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeSSLCertificateMatchDomainListRequest setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public DescribeSSLCertificateMatchDomainListRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
