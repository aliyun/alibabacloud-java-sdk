// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateMetricDropRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c3ca36c8e2693403d85c0d9f8bb1d7b6c</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>apiserver_request_duration_seconds_bucket
     * etcd_request_duration_seconds_bucket
     * apiserver_request_total
     * container_tasks_state</p>
     */
    @NameInMap("MetricDrop")
    public String metricDrop;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateMetricDropRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetricDropRequest self = new UpdateMetricDropRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetricDropRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateMetricDropRequest setMetricDrop(String metricDrop) {
        this.metricDrop = metricDrop;
        return this;
    }
    public String getMetricDrop() {
        return this.metricDrop;
    }

    public UpdateMetricDropRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
