// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeImportedLogCountRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeImportedLogCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportedLogCountRequest self = new DescribeImportedLogCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImportedLogCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
