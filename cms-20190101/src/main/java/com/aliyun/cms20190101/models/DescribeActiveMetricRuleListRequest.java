// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeActiveMetricRuleListRequest extends TeaModel {
    /**
     * <p>The abbreviation of the cloud service that supports initiative alert rules.</p>
     * <p>For more information about how to obtain the name of a cloud service, see <a href="https://help.aliyun.com/document_detail/114930.html">DescribeProductsOfActiveMetricRule</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    public static DescribeActiveMetricRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveMetricRuleListRequest self = new DescribeActiveMetricRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveMetricRuleListRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
