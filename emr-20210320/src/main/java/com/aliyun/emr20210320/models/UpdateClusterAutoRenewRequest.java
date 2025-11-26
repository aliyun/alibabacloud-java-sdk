// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateClusterAutoRenewRequest extends TeaModel {
    /**
     * <p>自动续费ECS实例列表。</p>
     */
    @NameInMap("AutoRenewInstances")
    public java.util.List<AutoRenewInstance> autoRenewInstances;

    /**
     * <p>集群是否自动续费。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ClusterAutoRenew")
    public Boolean clusterAutoRenew;

    /**
     * <p>集群自动续费时长。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterAutoRenewDuration")
    public Integer clusterAutoRenewDuration;

    /**
     * <p>集群续费时长单位。</p>
     * 
     * <strong>example:</strong>
     * <p>Monthly</p>
     */
    @NameInMap("ClusterAutoRenewDurationUnit")
    public String clusterAutoRenewDurationUnit;

    /**
     * <p>集群ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-d6661c71139a****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>区域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>续费所有ECS实例。</p>
     */
    @NameInMap("RenewAllInstances")
    public Boolean renewAllInstances;

    public static UpdateClusterAutoRenewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAutoRenewRequest self = new UpdateClusterAutoRenewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAutoRenewRequest setAutoRenewInstances(java.util.List<AutoRenewInstance> autoRenewInstances) {
        this.autoRenewInstances = autoRenewInstances;
        return this;
    }
    public java.util.List<AutoRenewInstance> getAutoRenewInstances() {
        return this.autoRenewInstances;
    }

    public UpdateClusterAutoRenewRequest setClusterAutoRenew(Boolean clusterAutoRenew) {
        this.clusterAutoRenew = clusterAutoRenew;
        return this;
    }
    public Boolean getClusterAutoRenew() {
        return this.clusterAutoRenew;
    }

    public UpdateClusterAutoRenewRequest setClusterAutoRenewDuration(Integer clusterAutoRenewDuration) {
        this.clusterAutoRenewDuration = clusterAutoRenewDuration;
        return this;
    }
    public Integer getClusterAutoRenewDuration() {
        return this.clusterAutoRenewDuration;
    }

    public UpdateClusterAutoRenewRequest setClusterAutoRenewDurationUnit(String clusterAutoRenewDurationUnit) {
        this.clusterAutoRenewDurationUnit = clusterAutoRenewDurationUnit;
        return this;
    }
    public String getClusterAutoRenewDurationUnit() {
        return this.clusterAutoRenewDurationUnit;
    }

    public UpdateClusterAutoRenewRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterAutoRenewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateClusterAutoRenewRequest setRenewAllInstances(Boolean renewAllInstances) {
        this.renewAllInstances = renewAllInstances;
        return this;
    }
    public Boolean getRenewAllInstances() {
        return this.renewAllInstances;
    }

}
