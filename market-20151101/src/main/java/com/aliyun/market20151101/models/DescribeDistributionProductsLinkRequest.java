// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsLinkRequest extends TeaModel {
    @NameInMap("Codes")
    public java.util.List<String> codes;

    public static DescribeDistributionProductsLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributionProductsLinkRequest self = new DescribeDistributionProductsLinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDistributionProductsLinkRequest setCodes(java.util.List<String> codes) {
        this.codes = codes;
        return this;
    }
    public java.util.List<String> getCodes() {
        return this.codes;
    }

}
