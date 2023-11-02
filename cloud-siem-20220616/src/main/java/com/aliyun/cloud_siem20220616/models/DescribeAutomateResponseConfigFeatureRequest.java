// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigFeatureRequest extends TeaModel {
    @NameInMap("AutoResponseType")
    public String autoResponseType;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAutomateResponseConfigFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigFeatureRequest self = new DescribeAutomateResponseConfigFeatureRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigFeatureRequest setAutoResponseType(String autoResponseType) {
        this.autoResponseType = autoResponseType;
        return this;
    }
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    public DescribeAutomateResponseConfigFeatureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
