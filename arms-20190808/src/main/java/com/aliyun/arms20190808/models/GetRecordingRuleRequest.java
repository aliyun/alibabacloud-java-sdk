// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRecordingRuleRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetRecordingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordingRuleRequest self = new GetRecordingRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordingRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetRecordingRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
