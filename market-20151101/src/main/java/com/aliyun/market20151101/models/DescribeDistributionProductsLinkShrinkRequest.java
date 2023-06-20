// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeDistributionProductsLinkShrinkRequest extends TeaModel {
    @NameInMap("Codes")
    public String codesShrink;

    public static DescribeDistributionProductsLinkShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistributionProductsLinkShrinkRequest self = new DescribeDistributionProductsLinkShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDistributionProductsLinkShrinkRequest setCodesShrink(String codesShrink) {
        this.codesShrink = codesShrink;
        return this;
    }
    public String getCodesShrink() {
        return this.codesShrink;
    }

}
