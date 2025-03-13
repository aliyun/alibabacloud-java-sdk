// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallManagedPrometheusRequest extends TeaModel {
    /**
     * <p>The ID of the ASK cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster. This parameter is required if the ClusterType parameter is set to ecs.</p>
     * 
     * <strong>example:</strong>
     * <p>prd-ecs</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The cluster type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ecs: ECS</li>
     * <li>one: ACK One</li>
     * <li>ask: ASK</li>
     * <li>pro: Container Monitoring Pro</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ask</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The ID of the managed Grafana workspace that is associated with the cluster. If you set this parameter to free or leave this parameter empty, the cluster is associated with a shared Grafana workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-bp1*****</p>
     */
    @NameInMap("GrafanaInstanceId")
    public String grafanaInstanceId;

    /**
     * <p>This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("KubeConfig")
    public String kubeConfig;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group to which the cluster belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1********</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the vSwitch that is used by the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VcExtraInfo")
    public String vcExtraInfo;

    /**
     * <p>The virtual private cloud (VPC) where the cluster resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static InstallManagedPrometheusRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallManagedPrometheusRequest self = new InstallManagedPrometheusRequest();
        return TeaModel.build(map, self);
    }

    public InstallManagedPrometheusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InstallManagedPrometheusRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public InstallManagedPrometheusRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public InstallManagedPrometheusRequest setGrafanaInstanceId(String grafanaInstanceId) {
        this.grafanaInstanceId = grafanaInstanceId;
        return this;
    }
    public String getGrafanaInstanceId() {
        return this.grafanaInstanceId;
    }

    public InstallManagedPrometheusRequest setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
        return this;
    }
    public String getKubeConfig() {
        return this.kubeConfig;
    }

    public InstallManagedPrometheusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InstallManagedPrometheusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public InstallManagedPrometheusRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public InstallManagedPrometheusRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public InstallManagedPrometheusRequest setVcExtraInfo(String vcExtraInfo) {
        this.vcExtraInfo = vcExtraInfo;
        return this;
    }
    public String getVcExtraInfo() {
        return this.vcExtraInfo;
    }

    public InstallManagedPrometheusRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
