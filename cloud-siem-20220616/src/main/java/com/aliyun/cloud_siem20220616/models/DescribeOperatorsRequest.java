// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeOperatorsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SceneType")
    public String sceneType;

    public static DescribeOperatorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorsRequest self = new DescribeOperatorsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOperatorsRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

}
