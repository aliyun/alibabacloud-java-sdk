// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallManagedPrometheusRequest extends TeaModel {
    // The ID of the ASK cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // 集群名称。ClusterType为ecs时，必填。
    @NameInMap("ClusterName")
    public String clusterName;

    // The type of the cluster. Only ASK clusters are supported.
    @NameInMap("ClusterType")
    public String clusterType;

    // 集群绑定的托管版Grafana工作区Id。为空或"free"时，绑定到共享版Grafana。
    @NameInMap("GrafanaInstanceId")
    public String grafanaInstanceId;

    // The parameter is not supported.
    @NameInMap("KubeConfig")
    public String kubeConfig;

    // The region ID.
    @NameInMap("RegionId")
    public String regionId;

    // The security group to which the ASK cluster belongs.
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // The vSwitch of the ASK cluster.
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // The VPC of the ASK cluster.
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
