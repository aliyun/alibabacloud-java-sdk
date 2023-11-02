// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigCounterRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAutomateResponseConfigCounterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigCounterRequest self = new DescribeAutomateResponseConfigCounterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigCounterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
