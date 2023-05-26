// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeletePrometheusRemoteWriteRequest extends TeaModel {
    /**
     * <p>__null__</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>success=false</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
