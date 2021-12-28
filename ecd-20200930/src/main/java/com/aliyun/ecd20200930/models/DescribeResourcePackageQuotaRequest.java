// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourcePackageQuotaRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeResourcePackageQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackageQuotaRequest self = new DescribeResourcePackageQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackageQuotaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
