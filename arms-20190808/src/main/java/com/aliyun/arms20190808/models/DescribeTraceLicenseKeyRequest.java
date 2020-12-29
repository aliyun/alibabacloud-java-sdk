// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeTraceLicenseKeyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeTraceLicenseKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLicenseKeyRequest self = new DescribeTraceLicenseKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLicenseKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
