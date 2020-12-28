// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricProfilingRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ProfilingId")
    public String profilingId;

    public static GetCloudMetricProfilingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudMetricProfilingRequest self = new GetCloudMetricProfilingRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudMetricProfilingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetCloudMetricProfilingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetCloudMetricProfilingRequest setProfilingId(String profilingId) {
        this.profilingId = profilingId;
        return this;
    }
    public String getProfilingId() {
        return this.profilingId;
    }

}
