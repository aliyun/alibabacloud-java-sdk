// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourcePackageQuotaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("UsedCount")
    public Integer usedCount;

    public static DescribeResourcePackageQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackageQuotaResponseBody self = new DescribeResourcePackageQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackageQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackageQuotaResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeResourcePackageQuotaResponseBody setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Integer getUsedCount() {
        return this.usedCount;
    }

}
