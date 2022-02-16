// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class DescribeSSLCertificateCountRequest extends TeaModel {
    @NameInMap("SearchValue")
    public String searchValue;

    public static DescribeSSLCertificateCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSSLCertificateCountRequest self = new DescribeSSLCertificateCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSSLCertificateCountRequest setSearchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }
    public String getSearchValue() {
        return this.searchValue;
    }

}
