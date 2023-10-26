// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvPodMonitorsRequest extends TeaModel {
    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListEnvPodMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvPodMonitorsRequest self = new ListEnvPodMonitorsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvPodMonitorsRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListEnvPodMonitorsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
