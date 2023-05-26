// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstanceByTagAndResourceGroupIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("GrafanaInstanceId")
        public String grafanaInstanceId;

        @NameInMap("PaymentType")
        public String paymentType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>资源类型</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SubClustersJson")
        public String subClustersJson;

        @NameInMap("Tags")
        public java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstancesTags> tags;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

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
