// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeApiMeteringRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("productCode")
    public String productCode;

    @NameInMap("type")
    public Integer type;

    public static DescribeApiMeteringRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMeteringRequest self = new DescribeApiMeteringRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiMeteringRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeApiMeteringRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeApiMeteringRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
