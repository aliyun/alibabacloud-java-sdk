// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("Data")
    public GetPrometheusInstanceResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusInstanceResponseBody self = new GetPrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetPrometheusInstanceResponseBody setData(GetPrometheusInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPrometheusInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetPrometheusInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPrometheusInstanceResponseBodyDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetPrometheusInstanceResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusInstanceResponseBodyDataTags self = new GetPrometheusInstanceResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetPrometheusInstanceResponseBodyDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetPrometheusInstanceResponseBodyDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetPrometheusInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Prometheus instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>*   The instance type. Valid values: remote-write (Prometheus instance for Remote Write),</p>
         * <p>*   ecs (Prometheus instance for ECS),</p>
         * <p>*   cloud-monitor (Prometheus instance for Alibaba Cloud services in the Chinese mainland),</p>
         * <p>*   cloud-product (Prometheus instance for Alibaba Cloud services outside China),</p>
         * <p>*   global-view (global aggregation instance), and</p>
         * <p>*   aliyun-cs (Prometheus instance for Container Service).</p>
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
         * <p>*   PREPAY: subscription</p>
         * <p>*   POSTPAY: pay-as-you-go</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the resource. Valid value: PROMETHEUS.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The child instances of the global aggregation instance. The value is a JSON string.</p>
         */
        @NameInMap("SubClustersJson")
        public String subClustersJson;

        /**
         * <p>The tags that are bound to the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetPrometheusInstanceResponseBodyDataTags> tags;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the instance resides.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetPrometheusInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusInstanceResponseBodyData self = new GetPrometheusInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPrometheusInstanceResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetPrometheusInstanceResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetPrometheusInstanceResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public GetPrometheusInstanceResponseBodyData setGrafanaInstanceId(String grafanaInstanceId) {
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }
        public String getGrafanaInstanceId() {
            return this.grafanaInstanceId;
        }

        public GetPrometheusInstanceResponseBodyData setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetPrometheusInstanceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetPrometheusInstanceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetPrometheusInstanceResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetPrometheusInstanceResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetPrometheusInstanceResponseBodyData setSubClustersJson(String subClustersJson) {
            this.subClustersJson = subClustersJson;
            return this;
        }
        public String getSubClustersJson() {
            return this.subClustersJson;
        }

        public GetPrometheusInstanceResponseBodyData setTags(java.util.List<GetPrometheusInstanceResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetPrometheusInstanceResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetPrometheusInstanceResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetPrometheusInstanceResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetPrometheusInstanceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
