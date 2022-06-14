// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeKmsKeysRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeKmsKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeysRequest self = new DescribeKmsKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
