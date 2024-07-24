// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusRemoteWriteRequest extends TeaModel {
    /**
     * <p>The ID of the Prometheus instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b\<em>\</em>\<em>\</em> or vpc-xxxxx</p>
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
     * <p>The details of the remote write configuration item. Specify the value in the YAML format.</p>
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
     * <li>name: rw2
     * url: &quot;<a href="http://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/uid/xx/cn-hangzhou/api/v3/write">http://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/uid/xx/cn-hangzhou/api/v3/write</a>&quot;
     * basic_auth:
     *   username: xxx
     *   password: xxx
     * write_relabel_configs:<ul>
     * <li>source_labels: [ xx ]
     * separator: ;
     * regex: yyy
     * replacement: $1
     * action: keep</li>
     * </ul>
     * </li>
     * </ul>
     */
    @NameInMap("RemoteWriteYaml")
    public String remoteWriteYaml;

    public static AddPrometheusRemoteWriteRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusRemoteWriteRequest self = new AddPrometheusRemoteWriteRequest();
        return TeaModel.build(map, self);
    }

    public AddPrometheusRemoteWriteRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddPrometheusRemoteWriteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddPrometheusRemoteWriteRequest setRemoteWriteYaml(String remoteWriteYaml) {
        this.remoteWriteYaml = remoteWriteYaml;
        return this;
    }
    public String getRemoteWriteYaml() {
        return this.remoteWriteYaml;
    }

}
