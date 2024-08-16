// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstancesRequest extends TeaModel {
    /**
     * <p>The cluster type. If you do not specify this parameter, all cluster types are queried. Valid values:</p>
     * <ul>
     * <li>cloud-product-prometheus: Prometheus instance for cloud services</li>
     * <li>ManagedKubernetes: ACK managed cluster</li>
     * <li>satellite: Prometheus instance for ARMS OpenTelemetry</li>
     * <li>Ask: ACK Serverless cluster</li>
     * <li>remote-write-prometheus: general-purpose Prometheus instance</li>
     * <li>cloud-monitor-cmee: Hybrid Cloud Monitoring</li>
     * <li>ExternalKubernetes: external Kubernetes cluster registered in ACK</li>
     * <li>vpc-prometheus: Prometheus instance for ECS</li>
     * <li>cloud-monitor-direct: cloud service self-monitoring</li>
     * <li>Edge Kubernetes: ACK Edge cluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud-product-prometheus</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

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
     * <p>Specifies whether to obtain global aggregation instances. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowGlobalView")
    public Boolean showGlobalView;

    public static ListPrometheusInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstancesRequest self = new ListPrometheusInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstancesRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListPrometheusInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPrometheusInstancesRequest setShowGlobalView(Boolean showGlobalView) {
        this.showGlobalView = showGlobalView;
        return this;
    }
    public Boolean getShowGlobalView() {
        return this.showGlobalView;
    }

}
