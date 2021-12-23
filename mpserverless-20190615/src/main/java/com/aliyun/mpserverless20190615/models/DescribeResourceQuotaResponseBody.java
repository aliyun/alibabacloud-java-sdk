// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeResourceQuotaResponseBody extends TeaModel {
    @NameInMap("CloudStorageDataSizeQuota")
    public Double cloudStorageDataSizeQuota;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StaticWebDataSizeQuota")
    public Double staticWebDataSizeQuota;

    public static DescribeResourceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceQuotaResponseBody self = new DescribeResourceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceQuotaResponseBody setCloudStorageDataSizeQuota(Double cloudStorageDataSizeQuota) {
        this.cloudStorageDataSizeQuota = cloudStorageDataSizeQuota;
        return this;
    }
    public Double getCloudStorageDataSizeQuota() {
        return this.cloudStorageDataSizeQuota;
    }

    public DescribeResourceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceQuotaResponseBody setStaticWebDataSizeQuota(Double staticWebDataSizeQuota) {
        this.staticWebDataSizeQuota = staticWebDataSizeQuota;
        return this;
    }
    public Double getStaticWebDataSizeQuota() {
        return this.staticWebDataSizeQuota;
    }

}
