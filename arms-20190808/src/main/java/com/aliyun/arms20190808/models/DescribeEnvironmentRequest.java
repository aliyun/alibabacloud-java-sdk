// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvironmentRequest extends TeaModel {
    /**
     * <p>Environment instance ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvironmentRequest self = new DescribeEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnvironmentRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DescribeEnvironmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
