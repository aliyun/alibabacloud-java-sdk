// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateClusterAutoRenewRequest extends TeaModel {
    /**
     * <p>The list of ECS instances for which to enable auto-renewal. This parameter takes effect only when RenewAllInstances is not set to true.</p>
     */
    @NameInMap("AutoRenewInstances")
    public java.util.List<AutoRenewInstance> autoRenewInstances;

    /**
     * <p>Specifies whether to enable auto-renewal for the cluster. Valid values:</p>
     * <ul>
     * <li><p>true: Enables auto-renewal.</p>
     * </li>
     * <li><p>false: Disables auto-renewal.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ClusterAutoRenew")
    public Boolean clusterAutoRenew;

    /**
     * <p>The auto-renewal duration for the cluster. This parameter takes effect only when ClusterAutoRenew is set to true.
     * If ClusterAutoRenewDurationUnit is set to Month, the valid values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, and 36. If ClusterAutoRenewDurationUnit is set to Year, the valid values are 1, 2, and 3.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterAutoRenewDuration")
    public Integer clusterAutoRenewDuration;

    /**
     * <p>The unit of the auto-renewal duration. Valid values:</p>
     * <ul>
     * <li><p>Month</p>
     * </li>
     * <li><p>Year</p>
     * </li>
     * </ul>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Monthly</p>
     */
    @NameInMap("ClusterAutoRenewDurationUnit")
    public String clusterAutoRenewDurationUnit;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-d6661c71139a****</p>
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
     * <p>Specifies whether to enable auto-renewal for all ECS instances in the cluster. Valid values:</p>
     * <ul>
     * <li><p>true: Enables auto-renewal for all ECS instances in the cluster. The default auto-renewal duration is one month.</p>
     * </li>
     * <li><p>false: Does not enable auto-renewal for all ECS instances in the cluster. You can specify the ECS instances for which to enable auto-renewal in the AutoRenewInstances parameter.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
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
