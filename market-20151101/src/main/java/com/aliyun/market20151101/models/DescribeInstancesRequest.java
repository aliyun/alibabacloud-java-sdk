// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    @NameInMap("Codes")
    public String codes;

    @NameInMap("ExceptCodes")
    public String exceptCodes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductType")
    public String productType;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setCodes(String codes) {
        this.codes = codes;
        return this;
    }
    public String getCodes() {
        return this.codes;
    }

    public DescribeInstancesRequest setExceptCodes(String exceptCodes) {
        this.exceptCodes = exceptCodes;
        return this;
    }
    public String getExceptCodes() {
        return this.exceptCodes;
    }

    public DescribeInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
