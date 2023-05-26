// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallManagedPrometheusRequest extends TeaModel {
    /**
     * <p>The response object.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The response content. In most cases, the installation status of the Prometheus agent is returned.</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>success=false</p>
     */
    @NameInMap("GrafanaInstanceId")
    public String grafanaInstanceId;

    /**
     * <p>__null__</p>
     */
    @NameInMap("KubeConfig")
    public String kubeConfig;

    /**
     * <p>The parameter is not supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Prometheus实例的资源组ID。</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The error message returned if the Prometheus agent failed to be installed.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Indicates whether the Prometheus agent was installed.</p>
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

    public InstallManagedPrometheusRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
