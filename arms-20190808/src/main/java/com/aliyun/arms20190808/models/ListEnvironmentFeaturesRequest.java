// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentFeaturesRequest extends TeaModel {
    @NameInMap("EnvironmentId")
    public String environmentId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListEnvironmentFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentFeaturesRequest self = new ListEnvironmentFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentFeaturesRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListEnvironmentFeaturesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
