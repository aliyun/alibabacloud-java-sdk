// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether all sub-instances must pass validation before the GlobalView instance is created. Default value: false, which indicates that partial success is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllSubClustersSuccess")
    public Boolean allSubClustersSuccess;

    /**
     * <p>The number of days to automatically archive data after the storage period expires. Valid values: 60, 90, 180, and 365. A value of 0 indicates that data is not archived.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ArchiveDuration")
    public Integer archiveDuration;

    /**
     * <p>The Container Service cluster ID. This parameter is required when ClusterType is set to aliyun-cs.</p>
     * 
     * <strong>example:</strong>
     * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster to create. This parameter is required when ClusterType is set to remote-write, ecs, or global-view.</p>
     * <p>For ecs instances, the ClusterName must follow the format &quot;name-vpc-id&quot;, and the name part cannot exceed 24 characters. Example: &quot;mytest1-vpc-xxxxxxxxxxx&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>clusterNameOfTest</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The instance type. Valid values: </p>
     * <ul>
     * <li>remote-write: Prometheus for Remote Write.</li>
     * <li>ecs (no longer supported): Prometheus for ECS.</li>
     * <li>global-view: Prometheus for GlobalView.</li>
     * <li>aliyun-cs (no longer supported): Prometheus for Container Service.</li>
     * <li>cloud-product (no longer supported): Prometheus for Cloud Service.</li>
     * <li>cloud-monitor (no longer supported): Prometheus for Hybrid Cloud Monitoring.</li>
     * <li>flink (no longer supported): Prometheus for Flink.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>remote-write</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The data storage duration, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The ID of the bound Grafana workspace. Set this parameter to &quot;free&quot; when you use the shared Grafana edition.</p>
     * 
     * <strong>example:</strong>
     * <p>grafana-bp1*****</p>
     */
    @NameInMap("GrafanaInstanceId")
    public String grafanaInstanceId;

    /**
     * <p>The Billable methods. Valid values:
     * POSTPAY: pay-as-you-go based on the number of reported metrics.
     * POSTPAY_GB: pay-as-you-go based on the volume of written metrics.
     * Empty: uses the default billing method configured by the user. If no default is configured, the system defaults to billing based on the number of reported metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The actual region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Network Security group ID. This parameter is required when ClusterType is set to ecs or aliyun-cs for a managed ASK cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp1********</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The JSON string of sub-instances for the GlobalView instance.</p>
     * 
     * <strong>example:</strong>
     * <p>当clusterType为global-view时，需要传此参数：需要聚合的集群的信息列表；示例：
     * [
     *     {
     *         &quot;headers&quot;:{</p>
     * <pre><code>    },
     *     &quot;regionId&quot;:&quot;cn-hangzhou&quot;,
     *     &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,
     *     &quot;extras&quot;:{
     * 
     *     },
     *     &quot;clusterId&quot;:&quot;c39a1048921e04f***********&quot;,
     *     &quot;sourceName&quot;:&quot;arms-luyao-test&quot;,
     *     &quot;dataSource&quot;:&quot;&quot;,
     *     &quot;userId&quot;:&quot;1672753***********&quot;
     * },
     * {
     *     &quot;headers&quot;:{
     * 
     *     },
     *     &quot;regionId&quot;:&quot;cn-beijing&quot;,
     *     &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,
     *     &quot;extras&quot;:{
     * 
     *     },
     *     &quot;clusterId&quot;:&quot;c6b6485496d5b40***********&quot;,
     *     &quot;sourceName&quot;:&quot;agent-321-测试&quot;,
     *     &quot;dataSource&quot;:&quot;&quot;,
     *     &quot;userId&quot;:&quot;1672753***********&quot;
     * },
     * {
     *     &quot;headers&quot;:{
     * 
     *     },
     *     &quot;regionId&quot;:&quot;cn-zhangjiakou&quot;,
     *     &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,
     *     &quot;extras&quot;:{
     * 
     *     },
     *     &quot;clusterId&quot;:&quot;c261a4f3200c446***********&quot;,
     *     &quot;sourceName&quot;:&quot;zaifeng-cardinality-01&quot;,
     *     &quot;dataSource&quot;:&quot;&quot;,
     *     &quot;userId&quot;:&quot;1672753***********&quot;
     * }
     * </code></pre>
     * <p>]</p>
     */
    @NameInMap("SubClustersJson")
    public String subClustersJson;

    /**
     * <p>The custom tags.</p>
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
     * <p>The vSwitch ID. This parameter is required when ClusterType is set to ecs or aliyun-cs for a managed ASK cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID. This parameter is required when ClusterType is set to ecs or aliyun-cs for a managed ASK cluster.</p>
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

    public CreatePrometheusInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
