// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("Data")
    public GetPrometheusInstanceResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
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
         * <p>The tag key of the instance.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the instance.</p>
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
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>The ID of the Prometheus instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the monitoring object.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>*   remote-write: Prometheus instance for Remote Write</p>
         * <p>*   ecs: Prometheus instances for ECS</p>
         * <p>*   cloud-monitor: Prometheus instance for cloud services (Chinese mainland)</p>
         * <p>*   cloud-monitor: Prometheus instance for cloud services (regions outside the Chinese mainland)</p>
         * <p>*   global-view: Prometheus instance for GlobalView</p>
         * <p>*   aliyun-cs: Prometheus instance for Container Service</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The ID of the Grafana workspace.</p>
         */
        @NameInMap("GrafanaInstanceId")
        public String grafanaInstanceId;

        @NameInMap("HttpApiInterUrl")
        public String httpApiInterUrl;

        @NameInMap("HttpApiIntraUrl")
        public String httpApiIntraUrl;

        /**
         * <p>The billing method. Valid values:</p>
         * <br>
         * <p>*   PREPAY: subscription</p>
         * <p>*   POSTPAY: pay-as-you-go</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        @NameInMap("PushGatewayInterUrl")
        public String pushGatewayInterUrl;

        @NameInMap("PushGatewayIntraUrl")
        public String pushGatewayIntraUrl;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RemoteReadInterUrl")
        public String remoteReadInterUrl;

        @NameInMap("RemoteReadIntraUrl")
        public String remoteReadIntraUrl;

        @NameInMap("RemoteWriteInterUrl")
        public String remoteWriteInterUrl;

        @NameInMap("RemoteWriteIntraUrl")
        public String remoteWriteIntraUrl;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the resource. Set the value to PROMETHEUS.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The child instances of the Prometheus instance for GlobalView. The value is a JSON string.</p>
         */
        @NameInMap("SubClustersJson")
        public String subClustersJson;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetPrometheusInstanceResponseBodyDataTags> tags;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The virtual private cloud (VPC) where the monitoring object resides.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetPrometheusInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusInstanceResponseBodyData self = new GetPrometheusInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPrometheusInstanceResponseBodyData setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
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

        public GetPrometheusInstanceResponseBodyData setHttpApiInterUrl(String httpApiInterUrl) {
            this.httpApiInterUrl = httpApiInterUrl;
            return this;
        }
        public String getHttpApiInterUrl() {
            return this.httpApiInterUrl;
        }

        public GetPrometheusInstanceResponseBodyData setHttpApiIntraUrl(String httpApiIntraUrl) {
            this.httpApiIntraUrl = httpApiIntraUrl;
            return this;
        }
        public String getHttpApiIntraUrl() {
            return this.httpApiIntraUrl;
        }

        public GetPrometheusInstanceResponseBodyData setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetPrometheusInstanceResponseBodyData setPushGatewayInterUrl(String pushGatewayInterUrl) {
            this.pushGatewayInterUrl = pushGatewayInterUrl;
            return this;
        }
        public String getPushGatewayInterUrl() {
            return this.pushGatewayInterUrl;
        }

        public GetPrometheusInstanceResponseBodyData setPushGatewayIntraUrl(String pushGatewayIntraUrl) {
            this.pushGatewayIntraUrl = pushGatewayIntraUrl;
            return this;
        }
        public String getPushGatewayIntraUrl() {
            return this.pushGatewayIntraUrl;
        }

        public GetPrometheusInstanceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetPrometheusInstanceResponseBodyData setRemoteReadInterUrl(String remoteReadInterUrl) {
            this.remoteReadInterUrl = remoteReadInterUrl;
            return this;
        }
        public String getRemoteReadInterUrl() {
            return this.remoteReadInterUrl;
        }

        public GetPrometheusInstanceResponseBodyData setRemoteReadIntraUrl(String remoteReadIntraUrl) {
            this.remoteReadIntraUrl = remoteReadIntraUrl;
            return this;
        }
        public String getRemoteReadIntraUrl() {
            return this.remoteReadIntraUrl;
        }

        public GetPrometheusInstanceResponseBodyData setRemoteWriteInterUrl(String remoteWriteInterUrl) {
            this.remoteWriteInterUrl = remoteWriteInterUrl;
            return this;
        }
        public String getRemoteWriteInterUrl() {
            return this.remoteWriteInterUrl;
        }

        public GetPrometheusInstanceResponseBodyData setRemoteWriteIntraUrl(String remoteWriteIntraUrl) {
            this.remoteWriteIntraUrl = remoteWriteIntraUrl;
            return this;
        }
        public String getRemoteWriteIntraUrl() {
            return this.remoteWriteIntraUrl;
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
