// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeAdvisorChecksRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("Product")
    public String product;

    public static DescribeAdvisorChecksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorChecksRequest self = new DescribeAdvisorChecksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorChecksRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeAdvisorChecksRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
