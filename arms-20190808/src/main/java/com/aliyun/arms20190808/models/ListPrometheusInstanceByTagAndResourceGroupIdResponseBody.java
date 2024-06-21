// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstanceByTagAndResourceGroupIdResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>4789C3E9-A85A-524B-B97B-9D2B14BA06BC</p>
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
         * 
         * <strong>example:</strong>
         * <p>ac-cus-tag-3</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-2vc8qq7x89o11rus9uvu</p>
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
         * <p>Auth Token string.</p>
         * 
         * <strong>example:</strong>
         * <p>ad32dxxxx</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>The ID of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c9d5dda1aeca64220853ace304baeb03d</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>prom1</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The type of the cluster. Valid values: remote-write: Prometheus instance for remote write.</p>
         * <ul>
         * <li>ecs: Prometheus instances for ECS.</li>
         * <li>cloud-monitor: Prometheus instance for Alibaba Cloud services in the Chinese mainland.</li>
         * <li>cloud-product: Prometheus instance for Alibaba Cloud services outside China.</li>
         * <li>global-view: Prometheus instance for GlobalView.</li>
         * <li>aliyun-cs: Prometheus instance for Container Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The ID of the Grafana workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>grafana-rnggfvhlcdl6m71l**</p>
         */
        @NameInMap("GrafanaInstanceId")
        public String grafanaInstanceId;

        /**
         * <p>HTTP Api internet url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/cn-beijing">http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/cn-beijing</a></p>
         */
        @NameInMap("HttpApiInterUrl")
        public String httpApiInterUrl;

        /**
         * <p>HTTP Api intranet url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/cn-beijing">http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/cn-beijing</a></p>
         */
        @NameInMap("HttpApiIntraUrl")
        public String httpApiIntraUrl;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PREPAY: subscription.</li>
         * <li>POSTPAY: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>Push Gateway internet url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v2">http://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v2</a></p>
         */
        @NameInMap("PushGatewayInterUrl")
        public String pushGatewayInterUrl;

        /**
         * <p>Push Gateway intranet url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v2">http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v2</a></p>
         */
        @NameInMap("PushGatewayIntraUrl")
        public String pushGatewayIntraUrl;

        /**
         * <p>The region ID of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Remote Read internet url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read">http://cn-beijing.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read</a></p>
         */
        @NameInMap("RemoteReadInterUrl")
        public String remoteReadInterUrl;

        /**
         * <p>Remote Read intranet url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read">http://cn-beijing-intranet.arms.aliyuncs.com:9090/api/v1/prometheus/xxx/api/v1/read</a></p>
         */
        @NameInMap("RemoteReadIntraUrl")
        public String remoteReadIntraUrl;

        /**
         * <p>Remote Write internet url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v3/write">http://cn-beijing.arms.aliyuncs.com/prometheus/xxx/api/v3/write</a></p>
         */
        @NameInMap("RemoteWriteInterUrl")
        public String remoteWriteInterUrl;

        /**
         * <p>Remote Write intranet url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v3/write">http://cn-beijing-intranet.arms.aliyuncs.com/prometheus/xxx/api/v3/write</a></p>
         */
        @NameInMap("RemoteWriteIntraUrl")
        public String remoteWriteIntraUrl;

        /**
         * <p>The ID of the resource group to which the Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmz7nocpeidcy</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-f8zd1toc10wmbi1v5rom</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The child instances of the Prometheus instance for GlobalView instance. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;headers&quot;: {}, &quot;regionId&quot;: &quot;cn-hangzhou&quot;, &quot;sourceType&quot;: &quot;AlibabaPrometheus&quot;, &quot;extras&quot;: {}, &quot;clusterId&quot;: &quot;c39a1048921e04fceb039db2fb\<em>\</em>\<em>\</em>&quot;, &quot;sourceName&quot;: &quot;arms-luyao-test&quot;, &quot;dataSource&quot;: &quot;&quot;, &quot;userId&quot;: &quot;167275301789\<em>\</em>\<em>\</em>&quot; }, { &quot;headers&quot;: {}, &quot;regionId&quot;: &quot;cn-beijing&quot;, &quot;sourceType&quot;: &quot;AlibabaPrometheus&quot;, &quot;extras&quot;: {}, &quot;clusterId&quot;: &quot;c6b6485496d5b400abde22cb47b5\<em>\</em>\<em>\</em>&quot;, &quot;sourceName&quot;: &quot;agent-321-test&quot;, &quot;dataSource&quot;: &quot;&quot;, &quot;userId&quot;: &quot;167275301789\<em>\</em>\<em>\</em>&quot; }, { &quot;headers&quot;: {}, &quot;regionId&quot;: &quot;cn-zhangjiakou&quot;, &quot;sourceType&quot;: &quot;AlibabaPrometheus&quot;, &quot;extras&quot;: {}, &quot;clusterId&quot;: &quot;c261a4f3200c446659133f1ade78\<em>\</em>\<em>\</em>&quot;, &quot;sourceName&quot;: &quot;zaifeng-cardinality-01&quot;, &quot;dataSource&quot;: &quot;&quot;, &quot;userId&quot;: &quot;167275301789\<em>\</em>\<em>\</em>&quot; } ]</p>
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
         * 
         * <strong>example:</strong>
         * <p>1672753017899***</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-f8z73vcja1tqnw90aav5a</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbtp1fsm8mir18l8rl0u</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances self = new ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances();
            return TeaModel.build(map, self);
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
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

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setHttpApiInterUrl(String httpApiInterUrl) {
            this.httpApiInterUrl = httpApiInterUrl;
            return this;
        }
        public String getHttpApiInterUrl() {
            return this.httpApiInterUrl;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setHttpApiIntraUrl(String httpApiIntraUrl) {
            this.httpApiIntraUrl = httpApiIntraUrl;
            return this;
        }
        public String getHttpApiIntraUrl() {
            return this.httpApiIntraUrl;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setPushGatewayInterUrl(String pushGatewayInterUrl) {
            this.pushGatewayInterUrl = pushGatewayInterUrl;
            return this;
        }
        public String getPushGatewayInterUrl() {
            return this.pushGatewayInterUrl;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setPushGatewayIntraUrl(String pushGatewayIntraUrl) {
            this.pushGatewayIntraUrl = pushGatewayIntraUrl;
            return this;
        }
        public String getPushGatewayIntraUrl() {
            return this.pushGatewayIntraUrl;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setRemoteReadInterUrl(String remoteReadInterUrl) {
            this.remoteReadInterUrl = remoteReadInterUrl;
            return this;
        }
        public String getRemoteReadInterUrl() {
            return this.remoteReadInterUrl;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setRemoteReadIntraUrl(String remoteReadIntraUrl) {
            this.remoteReadIntraUrl = remoteReadIntraUrl;
            return this;
        }
        public String getRemoteReadIntraUrl() {
            return this.remoteReadIntraUrl;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setRemoteWriteInterUrl(String remoteWriteInterUrl) {
            this.remoteWriteInterUrl = remoteWriteInterUrl;
            return this;
        }
        public String getRemoteWriteInterUrl() {
            return this.remoteWriteInterUrl;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdResponseBodyDataPrometheusInstances setRemoteWriteIntraUrl(String remoteWriteIntraUrl) {
            this.remoteWriteIntraUrl = remoteWriteIntraUrl;
            return this;
        }
        public String getRemoteWriteIntraUrl() {
            return this.remoteWriteIntraUrl;
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
