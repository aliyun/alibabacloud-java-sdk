// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeUserCertificateListRequest extends TeaModel {
    @NameInMap("ShowSize")
    public Integer showSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    public static DescribeUserCertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCertificateListRequest self = new DescribeUserCertificateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserCertificateListRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public DescribeUserCertificateListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUserCertificateListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUserCertificateListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
