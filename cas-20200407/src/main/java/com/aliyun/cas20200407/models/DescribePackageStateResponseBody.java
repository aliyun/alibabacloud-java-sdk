// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribePackageStateResponseBody extends TeaModel {
    @NameInMap("IssuedCount")
    public Long issuedCount;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("UsedCount")
    public Long usedCount;

    public static DescribePackageStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageStateResponseBody self = new DescribePackageStateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackageStateResponseBody setIssuedCount(Long issuedCount) {
        this.issuedCount = issuedCount;
        return this;
    }
    public Long getIssuedCount() {
        return this.issuedCount;
    }

    public DescribePackageStateResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribePackageStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackageStateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribePackageStateResponseBody setUsedCount(Long usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Long getUsedCount() {
        return this.usedCount;
    }

}
