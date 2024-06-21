// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetPrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Data")
    public GetPrometheusInstanceResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>52C422FD-6B43-524D-B8A1-A4693294318C</p>
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
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue1</p>
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
         * <p>权限类型：
         * readWrite、readOnly、httpReadOnly</p>
         * 
         * <strong>example:</strong>
         * <p>readWrite</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The number of days for which data is automatically archived after the storage expires. Valid values: 60, 90, 180, and 365. 0 indicates that the data is not archived.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ArchiveDuration")
        public Integer archiveDuration;

        /**
         * <p>Authorization token.</p>
         * 
         * <strong>example:</strong>
         * <p>GciOiJIUzI1NiJ9***</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>The ID of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c589a1b8db05c4561aefbb898ca8fb1cf</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the monitoring object.</p>
         * 
         * <strong>example:</strong>
         * <p>prom1</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <ul>
         * <li>remote-write: general-purpose Prometheus instance</li>
         * <li>ecs: Prometheus instances for ECS</li>
         * <li>cloud-monitor: Prometheus instance for Alibaba Cloud services in the Chinese mainland</li>
         * <li>cloud-product: Prometheus instance for Alibaba Cloud services outside the Chinese mainland</li>
         * <li>global-view: global aggregation instance</li>
         * <li>aliyun-cs: Prometheus instance for Container Service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remote-write</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The ID of the Grafana workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>grafana-rnggfvhlcdl6m71***</p>
         */
        @NameInMap("GrafanaInstanceId")
        public String grafanaInstanceId;

        /**
         * <p>Http API internet address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-beijing.arms.aliyuncs.com:9443/api/v1/prometheus/xxx">https://cn-beijing.arms.aliyuncs.com:9443/api/v1/prometheus/xxx</a></p>
         */
        @NameInMap("HttpApiInterUrl")
        public String httpApiInterUrl;

        /**
         * <p>Http API intranet address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx">http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx</a></p>
         */
        @NameInMap("HttpApiIntraUrl")
        public String httpApiIntraUrl;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PREPAY: subscription</li>
         * <li>POSTPAY: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>Push gateway internet address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v2">https://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v2</a></p>
         */
        @NameInMap("PushGatewayInterUrl")
        public String pushGatewayInterUrl;

        /**
         * <p>Push gateway intranet address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v2">http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v2</a></p>
         */
        @NameInMap("PushGatewayIntraUrl")
        public String pushGatewayIntraUrl;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Remote read internet address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read">http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read</a></p>
         */
        @NameInMap("RemoteReadInterUrl")
        public String remoteReadInterUrl;

        /**
         * <p>Remote read intranet address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read">http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read</a></p>
         */
        @NameInMap("RemoteReadIntraUrl")
        public String remoteReadIntraUrl;

        /**
         * <p>Remote write internet address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v3/write">https://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v3/write</a></p>
         */
        @NameInMap("RemoteWriteInterUrl")
        public String remoteWriteInterUrl;

        /**
         * <p>Remote write intranet address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v3/write">http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v3/write</a></p>
         */
        @NameInMap("RemoteWriteIntraUrl")
        public String remoteWriteIntraUrl;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2vezare****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the resource. Set the value to PROMETHEUS.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the security group. This parameter is returned only for Prometheus instances for ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-8vbdgmf4nraiqa9bx0jo</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The data storage duration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("StorageDuration")
        public Integer storageDuration;

        /**
         * <p>The child instances of the Prometheus instance for GlobalView. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;headers&quot;:{},&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,&quot;extras&quot;:{},&quot;clusterId&quot;:&quot;c39a1048921e04fceb039db2fbb73\<em>\</em>\<em>&quot;,&quot;sourceName&quot;:&quot;arms-luyao-test&quot;,&quot;dataSource&quot;:&quot;&quot;,&quot;userId&quot;:&quot;167275301789\</em>\<em>\</em>&quot;},{&quot;headers&quot;:{},&quot;regionId&quot;:&quot;cn-beijing&quot;,&quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,&quot;extras&quot;:{},&quot;clusterId&quot;:&quot;c6b6485496d5b400abde22cb47b5\<em>\</em>\<em>\</em>&quot;,&quot;sourceName&quot;:&quot;agent-321-test&quot;,&quot;dataSource&quot;:&quot;&quot;,&quot;userId&quot;:&quot;1672753017899\<em>\</em>\<em>&quot;},{&quot;headers&quot;:{},&quot;regionId&quot;:&quot;cn-zhangjiakou&quot;,&quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,&quot;extras&quot;:{},&quot;clusterId&quot;:&quot;c261a4f3200c446659133f1ade789b15e&quot;,&quot;sourceName&quot;:&quot;zaifeng-cardinality-01&quot;,&quot;dataSource&quot;:&quot;&quot;,&quot;userId&quot;:&quot;167275301789\</em>\<em>\</em>&quot;}]</p>
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
         * 
         * <strong>example:</strong>
         * <p>167275301789****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The vSwitch ID. This parameter is returned only for Prometheus instances for ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-f8z73vcja1tqnw90aav5a</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID. This parameter is returned only for Prometheus instances for ECS.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vb02uk57qbcktqcvqqqj</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetPrometheusInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusInstanceResponseBodyData self = new GetPrometheusInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPrometheusInstanceResponseBodyData setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetPrometheusInstanceResponseBodyData setArchiveDuration(Integer archiveDuration) {
            this.archiveDuration = archiveDuration;
            return this;
        }
        public Integer getArchiveDuration() {
            return this.archiveDuration;
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

        public GetPrometheusInstanceResponseBodyData setStorageDuration(Integer storageDuration) {
            this.storageDuration = storageDuration;
            return this;
        }
        public Integer getStorageDuration() {
            return this.storageDuration;
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
