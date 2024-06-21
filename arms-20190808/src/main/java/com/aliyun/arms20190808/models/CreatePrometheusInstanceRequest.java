// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceRequest extends TeaModel {
    /**
     * <p>Does it require all child instances to be verified successfully before creating a GlobalView instance. The default is false, which means partial success is possible.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllSubClustersSuccess")
    public Boolean allSubClustersSuccess;

    /**
     * <p>The number of days for automatic archiving after storage expiration (optional values: 60, 90, 180, 365). 0 means not archive.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ArchiveDuration")
    public Integer archiveDuration;

    /**
     * <p>The ID of the ACK cluster. This parameter is required if you set the ClusterType parameter to aliyun-cs.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the created cluster. This parameter is required if you set the ClusterType parameter to remote-write or ecs.</p>
     * 
     * <strong>example:</strong>
     * <p>clusterNameOfTest</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The type of the cluster to which the Prometheus instance belongs. Valid values: </p>
     * <ul>
     * <li>remote-write: Prometheus instance for remote write.</li>
     * <li>ecs(Not supported): Prometheus instance for ECS.</li>
     * <li>cloud-monitor(Not supported): Prometheus instance for Alibaba Cloud services in China.</li>
     * <li>cloud-product(Not supported): Prometheus instance for Alibaba Cloud services outside China.</li>
     * <li>global-view: Prometheus instance for GlobalView.</li>
     * <li>aliyun-cs(Not supported): Prometheus instance for Container Service for Kubernetes (ACK).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>remote-write</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>Data storage duration (in days).</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The ID of the Grafana dedicated instance. This parameter is available if you set the ClusterType parameter to ecs.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-bp1*****</p>
     */
    @NameInMap("GrafanaInstanceId")
    public String grafanaInstanceId;

    /**
     * <p>The ID of the region. If you use a Prometheus instance to monitor an Alibaba Cloud service in China, this parameter must be set to cn-shanghai.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the custom resource group. You can configure this parameter to bind the instance to the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the security group. This parameter is required if you set the ClusterType parameter to ecs.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1********</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>JSON string for child instances of the globalView instance.</p>
     * 
     * <strong>example:</strong>
     * <p>When the clusterType is global view, this parameter needs to be passed: a list of information about the clusters that need to be aggregated.
     * Example:
     * [
     *   {
     *     &quot;Headers&quot;:{</p>
     * <pre><code>},
     * &quot;RegionId&quot;: &quot;cn hangzhou&quot;,
     * &quot;SourceType&quot;: &quot;Alibaba Prometheus&quot;,
     * &quot;Extras&quot;:{
     * 
     * },
     * &quot;ClusterId&quot;: &quot;c39a1048921e04f ****************&quot;,
     * &quot;SourceName&quot;: &quot;test1&quot;,
     * &quot;DataSource&quot;: &quot;&quot;,
     * &quot;UserId&quot;: &quot;1672753 ******************&quot;
     * </code></pre>
     * <p>  },
     *   {
     *     &quot;Headers&quot;:{</p>
     * <pre><code>},
     * &quot;RegionId&quot;: &quot;cn beijing&quot;,
     * &quot;SourceType&quot;: &quot;Alibaba Prometheus&quot;,
     * &quot;Extras&quot;:{
     * 
     * },
     * &quot;ClusterId&quot;: &quot;c6b6485496d5b40 ****************&quot;,
     * &quot;SourceName&quot;: &quot;test2&quot;,
     * &quot;DataSource&quot;: &quot;&quot;,
     * &quot;UserId&quot;: &quot;1672753 ******************&quot;
     * </code></pre>
     * <p>  },
     *   {
     *     &quot;Headers&quot;:{</p>
     * <pre><code>},
     * &quot;RegionId&quot;: &quot;cn zhangjiakou&quot;,
     * &quot;SourceType&quot;: &quot;Alibaba Prometheus&quot;,
     * &quot;Extras&quot;:{
     * 
     * },
     * &quot;ClusterId&quot;: &quot;c261a4f3200c446 ****************&quot;,
     * &quot;SourceName&quot;: &quot;test3&quot;,
     * &quot;DataSource&quot;: &quot;&quot;,
     * &quot;UserId&quot;: &quot;1672753 ******************&quot;
     * </code></pre>
     * <p>  }
     * ]</p>
     */
    @NameInMap("SubClustersJson")
    public String subClustersJson;

    /**
     * <p>The tags of the instance. You can configure this parameter to manage tags for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;labelName&quot;:&quot;labelValue&quot;
     *     },
     *     {
     *         &quot;testName&quot;:&quot;clusterA&quot;
     *     }
     * ]</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreatePrometheusInstanceRequestTags> tags;

    /**
     * <p>The ID of the vSwitch. This parameter is required if you set the ClusterType parameter to ecs.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of virtual private cloud (VPC). This parameter is required if you set the ClusterType parameter to ecs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-rpn**********</p>
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

    public CreatePrometheusInstanceRequest setArchiveDuration(Integer archiveDuration) {
        this.archiveDuration = archiveDuration;
        return this;
    }
    public Integer getArchiveDuration() {
        return this.archiveDuration;
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

    public CreatePrometheusInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreatePrometheusInstanceRequest setGrafanaInstanceId(String grafanaInstanceId) {
        this.grafanaInstanceId = grafanaInstanceId;
        return this;
    }
    public String getGrafanaInstanceId() {
        return this.grafanaInstanceId;
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
