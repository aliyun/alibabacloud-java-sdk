// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceRequest extends TeaModel {
    @NameInMap("AllSubClustersSuccess")
    public Boolean allSubClustersSuccess;

    /**
     * <p>The cluster ID. This parameter is required if you set the ClusterType parameter to aliyun-cs��.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster. This parameter is required if you set the ClusterType parameter to remote-write, ecs, or global-view.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The type of the Prometheus instance. The following types are provided: remote-write (Prometheus instance for Remote Write) ecs (Prometheus instance for ECS) cloud-monitor� (Prometheus instance for Alibaba Cloud services in China) cloud-product (Prometheus instance for Alibaba Cloud services outside China) global-view (Prometheus instance for GlobalView) aliyun-cs�� (Prometheus instances for Container Service)</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The ID of the Grafana dedicated instance. This parameter is available if you set the ClusterType parameter to ecs.</p>
     */
    @NameInMap("GrafanaInstanceId")
    public String grafanaInstanceId;

    @NameInMap("ParamJson")
    public String paramJson;

    /**
     * <p>The region ID. If you create a Prometheus instance for cloud services in China, set the value to cn-shanghai.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the custom resource group. You can configure this parameter to bind the instance to the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The security group. This parameter is required if you set the clusterType parameter to ecs or create an ASK managed cluster.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The child instances of the global aggregation instance. The value is a JSON string.</p>
     */
    @NameInMap("SubClustersJson")
    public String subClustersJson;

    /**
     * <p>The tags of the instance. You can configure this parameter to manage tags for the instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreatePrometheusInstanceRequestTags> tags;

    /**
     * <p>The vSwitch. This parameter is required if you set the clusterType parameter to ecs or create an ASK managed cluster.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The virtual private cloud (VPC). This parameter is required if you set the clusterType parameter to ecs or create a serverless Kubernetes (ASK) managed cluster.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreatePrometheusInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusInstanceRequest self = new CreatePrometheusInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusInstanceRequest setAllSubClustersSuccess(Boolean allSubClustersSuccess) {
        this.allSubClustersSuccess = allSubClustersSuccess;
        return this;
    }
    public Boolean getAllSubClustersSuccess() {
        return this.allSubClustersSuccess;
    }

    public CreatePrometheusInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreatePrometheusInstanceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreatePrometheusInstanceRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreatePrometheusInstanceRequest setGrafanaInstanceId(String grafanaInstanceId) {
        this.grafanaInstanceId = grafanaInstanceId;
        return this;
    }
    public String getGrafanaInstanceId() {
        return this.grafanaInstanceId;
    }

    public CreatePrometheusInstanceRequest setParamJson(String paramJson) {
        this.paramJson = paramJson;
        return this;
    }
    public String getParamJson() {
        return this.paramJson;
    }

    public CreatePrometheusInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePrometheusInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePrometheusInstanceRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreatePrometheusInstanceRequest setSubClustersJson(String subClustersJson) {
        this.subClustersJson = subClustersJson;
        return this;
    }
    public String getSubClustersJson() {
        return this.subClustersJson;
    }

    public CreatePrometheusInstanceRequest setTags(java.util.List<CreatePrometheusInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreatePrometheusInstanceRequestTags> getTags() {
        return this.tags;
    }

    public CreatePrometheusInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreatePrometheusInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreatePrometheusInstanceRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreatePrometheusInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusInstanceRequestTags self = new CreatePrometheusInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrometheusInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
