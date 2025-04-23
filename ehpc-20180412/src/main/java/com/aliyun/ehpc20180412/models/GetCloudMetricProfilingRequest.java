// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricProfilingRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-jeJki6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The profiling ID. You can call the <a href="https://help.aliyun.com/document_detail/188711.html">ListCloudMetricProfilings</a> operation to obtain the profiling ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-i-bplukzqgl****_21687_2019-09-09-02-37-40</p>
     */
    @NameInMap("ProfilingId")
    public String profilingId;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetCloudMetricProfilingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudMetricProfilingRequest self = new GetCloudMetricProfilingRequest();
        return TeaModel.build(map, self);
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

    public GetCloudMetricProfilingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
