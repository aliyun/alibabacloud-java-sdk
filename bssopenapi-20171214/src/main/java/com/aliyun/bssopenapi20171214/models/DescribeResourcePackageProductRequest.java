// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeResourcePackageProductRequest extends TeaModel {
    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeResourcePackageProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackageProductRequest self = new DescribeResourcePackageProductRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackageProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
