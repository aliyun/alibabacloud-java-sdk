// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificateListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("SearchValue")
    public String searchValue;

    @NameInMap("ShowSize")
    public Integer showSize;

    public static DescribeSSLCertificateListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificateListRequest self = new DescribeSSLCertificateListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificateListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSSLCertificateListRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

    public DescribeSSLCertificateListRequest setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

}
