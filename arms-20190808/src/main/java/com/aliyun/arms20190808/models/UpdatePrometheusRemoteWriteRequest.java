// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusRemoteWriteRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
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
     * <p>The name of the remote write configuration item.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rw1</p>
     */
    @NameInMap("RemoteWriteName")
    public String remoteWriteName;

    /**
     * <p>The remote write configuration. Specify the value in the YAML format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>remote_write:</p>
     * <ul>
     * <li>name: rw1
     * url: &quot;<a href="http://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/uid/xx/cn-hangzhou/api/v3/write">http://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/uid/xx/cn-hangzhou/api/v3/write</a>&quot;
     * basic_auth:
     *   username: xxx
     *   password: xxx
     * write_relabel_configs:<ul>
     * <li>source_labels: [ instance_id ]
     * separator: ;
     * regex: si
     * replacement: $1
     * action: keep</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("RemoteWriteYaml")
    public String remoteWriteYaml;

    public static UpdatePrometheusRemoteWriteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusRemoteWriteRequest self = new UpdatePrometheusRemoteWriteRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusRemoteWriteRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdatePrometheusRemoteWriteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePrometheusRemoteWriteRequest setRemoteWriteName(String remoteWriteName) {
        this.remoteWriteName = remoteWriteName;
        return this;
    }
    public String getRemoteWriteName() {
        return this.remoteWriteName;
    }

    public UpdatePrometheusRemoteWriteRequest setRemoteWriteYaml(String remoteWriteYaml) {
        this.remoteWriteYaml = remoteWriteYaml;
        return this;
    }
    public String getRemoteWriteYaml() {
        return this.remoteWriteYaml;
    }

}
