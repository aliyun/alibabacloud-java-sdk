// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusRemoteWriteRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b\<em>\</em>\<em>\</em> or vpc-xxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The names of the remote write configuration items that you want to delete. Separate configuration items with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name1,name2</p>
     */
    @NameInMap("RemoteWriteNames")
    public String remoteWriteNames;

    public static DeletePrometheusRemoteWriteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrometheusRemoteWriteRequest self = new DeletePrometheusRemoteWriteRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrometheusRemoteWriteRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeletePrometheusRemoteWriteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeletePrometheusRemoteWriteRequest setRemoteWriteNames(String remoteWriteNames) {
        this.remoteWriteNames = remoteWriteNames;
        return this;
    }
    public String getRemoteWriteNames() {
        return this.remoteWriteNames;
    }

}
