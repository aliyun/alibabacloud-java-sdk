// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribePackageStateRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProductCode")
    public String productCode;

    public static DescribePackageStateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageStateRequest self = new DescribePackageStateRequest();
        return TeaModel.build(map, self);
    }

    public DescribePackageStateRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribePackageStateRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
