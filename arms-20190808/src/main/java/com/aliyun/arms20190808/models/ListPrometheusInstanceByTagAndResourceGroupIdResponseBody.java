// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstanceByTagAndResourceGroupIdResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusInstanceByTagAndResourceGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstanceByTagAndResourceGroupIdResponseBody self = new ListPrometheusInstanceByTagAndResourceGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody setData(ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData getData() {
        return this.data;
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags self = new ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances extends TeaModel {
        /**
         * <p>The ID of the Prometheus instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the Prometheus instance.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values: remote-write: Prometheus instance for remote write.</p>
         * <br>
         * <p>*   ecs: Prometheus instances for ECS.</p>
         * <p>*   cloud-monitor: Prometheus instance for Alibaba Cloud services in the Chinese mainland.</p>
         * <p>*   cloud-product: Prometheus instance for Alibaba Cloud services outside China.</p>
         * <p>*   global-view: Prometheus instance for GlobalView.</p>
         * <p>*   aliyun-cs: Prometheus instance for Container Service.</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The ID of the Grafana workspace.</p>
         */
        @NameInMap("GrafanaInstanceId")
        public String grafanaInstanceId;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   PREPAY: subscription.</p>
         * <p>*   POSTPAY: pay-as-you-go.</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The region ID of the Prometheus instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the Prometheus instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>资源类型</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The child instances of the Prometheus instance for GlobalView instance. The value is a JSON string.</p>
         */
        @NameInMap("SubClustersJson")
        public String subClustersJson;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags> tags;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances self = new ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances();
            return TeaModel.build(map, self);
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setGrafanaInstanceId(String grafanaInstanceId) {
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }
        public String getGrafanaInstanceId() {
            return this.grafanaInstanceId;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setSubClustersJson(String subClustersJson) {
            this.subClustersJson = subClustersJson;
            return this;
        }
        public String getSubClustersJson() {
            return this.subClustersJson;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setTags(java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags> getTags() {
            return this.tags;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData extends TeaModel {
        /**
         * <p>The queried Prometheus instances.</p>
         */
        @NameInMap("PrometheusInstances")
        public java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances> prometheusInstances;

        public static ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData self = new ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData setPrometheusInstances(java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances> prometheusInstances) {
            this.prometheusInstances = prometheusInstances;
            return this;
        }
        public java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances> getPrometheusInstances() {
            return this.prometheusInstances;
        }

    }

}
