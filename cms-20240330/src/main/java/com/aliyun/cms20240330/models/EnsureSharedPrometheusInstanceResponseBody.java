// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class EnsureSharedPrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a new instance was created by this call. The value is false if an existing instance is found.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("created")
    public Boolean created;

    /**
     * <p>The details of the shared Prometheus instance. The fields are the same as the prometheusInstance field in GetPrometheusInstance.</p>
     */
    @NameInMap("prometheusInstance")
    public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance prometheusInstance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static EnsureSharedPrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnsureSharedPrometheusInstanceResponseBody self = new EnsureSharedPrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnsureSharedPrometheusInstanceResponseBody setCreated(Boolean created) {
        this.created = created;
        return this;
    }
    public Boolean getCreated() {
        return this.created;
    }

    public EnsureSharedPrometheusInstanceResponseBody setPrometheusInstance(EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance prometheusInstance) {
        this.prometheusInstance = prometheusInstance;
        return this;
    }
    public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance getPrometheusInstance() {
        return this.prometheusInstance;
    }

    public EnsureSharedPrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags extends TeaModel {
        /**
         * <p>The key of the instance tag.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:cms:shareScope</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the instance tag.</p>
         * 
         * <strong>example:</strong>
         * <p>region:cn-hangzhou:team-workspace</p>
         */
        @NameInMap("value")
        public String value;

        public static EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags self = new EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags();
            return TeaModel.build(map, self);
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance extends TeaModel {
        /**
         * <p>The access permissions of the instance. Valid values: readWrite, readOnly, and httpReadOnly.</p>
         * 
         * <strong>example:</strong>
         * <p>readWrite</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <p>The number of days to automatically archive and retain data after the storage expires. A value of 0 indicates no archiving, and 3650 indicates permanent retention.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("archiveDuration")
        public Integer archiveDuration;

        /**
         * <p>The IP address whitelist policy that allows access to the authentication-free read endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("authFreeReadPolicy")
        public String authFreeReadPolicy;

        /**
         * <p>The IP address whitelist policy that allows access to the authentication-free write endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("authFreeWritePolicy")
        public String authFreeWritePolicy;

        /**
         * <p>The authentication token of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>example-auth-token</p>
         */
        @NameInMap("authToken")
        public String authToken;

        /**
         * <p>The time when the instance was created. The time is displayed in UTC+0 in the yyyy-MM-ddTHH:mmZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-11T06:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Specifies whether authentication-free read is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableAuthFreeRead")
        public Boolean enableAuthFreeRead;

        /**
         * <p>Specifies whether authentication-free write is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableAuthFreeWrite")
        public Boolean enableAuthFreeWrite;

        /**
         * <p>Specifies whether authentication token-based authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableAuthToken")
        public Boolean enableAuthToken;

        /**
         * <p>The extended information. This field is returned only for console requests.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;slsProject&quot;:&quot;proj-cms-cn-hangzhou&quot;}</p>
         */
        @NameInMap("extraInfo")
        public java.util.Map<String, String> extraInfo;

        /**
         * <p>The URL of the visualization dashboard associated with the instance.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://g.console.aliyun.com/folders/example">https://g.console.aliyun.com/folders/example</a></p>
         */
        @NameInMap("folderUrl")
        public String folderUrl;

        /**
         * <p>The ID of the bound managed Grafana instance.</p>
         * 
         * <strong>example:</strong>
         * <p>grafana-cn-hangzhou-example</p>
         */
        @NameInMap("grafanaInstanceId")
        public String grafanaInstanceId;

        /**
         * <p>The name of the bound managed Grafana instance.</p>
         * 
         * <strong>example:</strong>
         * <p>shared-grafana</p>
         */
        @NameInMap("grafanaInstanceName")
        public String grafanaInstanceName;

        /**
         * <p>The public endpoint of the Prometheus HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1">https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1</a></p>
         */
        @NameInMap("httpApiInterUrl")
        public String httpApiInterUrl;

        /**
         * <p>The internal endpoint of the Prometheus HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1">http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1</a></p>
         */
        @NameInMap("httpApiInternalUrl")
        public String httpApiInternalUrl;

        /**
         * <p>The internal network endpoint of the Prometheus HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1">https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1</a></p>
         */
        @NameInMap("httpApiIntraUrl")
        public String httpApiIntraUrl;

        /**
         * <p>The instance type. For shared instances, the value is remote-write, which indicates Prometheus for Remote Write.</p>
         * 
         * <strong>example:</strong>
         * <p>remote-write</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The billing method. A value of POSTPAY indicates pay-as-you-go based on the number of reported metrics, and POSTPAY_GB indicates pay-as-you-go based on the volume of written metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY_GB</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The time when the billing method of the instance was last modified. The time is in UTC+0 and formatted as yyyy-MM-ddTHH:mmZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-11T06:00Z</p>
         */
        @NameInMap("paymentTypeUpdateTime")
        public String paymentTypeUpdateTime;

        /**
         * <p>The product to which the instance belongs. Valid values: arms and cms.</p>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The ID of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-8f3c1a2b4d5e6f70</p>
         */
        @NameInMap("prometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <p>The name of the Prometheus instance. For workspace shared instances, the name is generated by the server in the RegionShare:{workspace}:{regionId} format.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionShare:team-workspace:cn-hangzhou</p>
         */
        @NameInMap("prometheusInstanceName")
        public String prometheusInstanceName;

        /**
         * <p>The public endpoint of Pushgateway.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway">https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway</a></p>
         */
        @NameInMap("pushGatewayInterUrl")
        public String pushGatewayInterUrl;

        /**
         * <p>The internal endpoint of Pushgateway.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway">http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway</a></p>
         */
        @NameInMap("pushGatewayInternalUrl")
        public String pushGatewayInternalUrl;

        /**
         * <p>The internal network endpoint of Pushgateway.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway">https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/pushgateway</a></p>
         */
        @NameInMap("pushGatewayIntraUrl")
        public String pushGatewayIntraUrl;

        /**
         * <p>The ID of the region where the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The public endpoint of Remote Read.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/read">https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/read</a></p>
         */
        @NameInMap("remoteReadInterUrl")
        public String remoteReadInterUrl;

        /**
         * <p>The internal endpoint of Remote Read.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/read">http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/read</a></p>
         */
        @NameInMap("remoteReadInternalUrl")
        public String remoteReadInternalUrl;

        /**
         * <p>The internal network endpoint of Remote Read.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/read">https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/read</a></p>
         */
        @NameInMap("remoteReadIntraUrl")
        public String remoteReadIntraUrl;

        /**
         * <p>The public endpoint of Remote Write.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/write">https://cn-hangzhou.arms.aliyuncs.com/prometheus/rw-example/api/v1/write</a></p>
         */
        @NameInMap("remoteWriteInterUrl")
        public String remoteWriteInterUrl;

        /**
         * <p>The internal endpoint of Remote Write.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/write">http://prometheus.cn-hangzhou.aliyuncs.com/prometheus/rw-example/api/v1/write</a></p>
         */
        @NameInMap("remoteWriteInternalUrl")
        public String remoteWriteInternalUrl;

        /**
         * <p>The internal network endpoint of Remote Write.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/write">https://cn-hangzhou-intranet.arms.aliyuncs.com/prometheus/rw-example/api/v1/write</a></p>
         */
        @NameInMap("remoteWriteIntraUrl")
        public String remoteWriteIntraUrl;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyexample</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource type. The value is fixed as PrometheusInstance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrometheusInstance</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The backend data storage status, such as Running.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The metric storage duration in days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("storageDuration")
        public Integer storageDuration;

        /**
         * <p>The query cache and parallel query configurations for Prometheus.</p>
         */
        @NameInMap("storeConfig")
        public PrometheusInstanceStoreConfig storeConfig;

        /**
         * <p>The list of authentication and authorization types supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;BasicAuth&quot;]</p>
         */
        @NameInMap("supportAuthTypes")
        public java.util.List<String> supportAuthTypes;

        /**
         * <p>The instance tags. Workspace shared instances include the system tag acs:cms:shareScope.</p>
         */
        @NameInMap("tags")
        public java.util.List<EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags> tags;

        /**
         * <p>The ID of the Alibaba Cloud account to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The version of the instance, such as V2.</p>
         * 
         * <strong>example:</strong>
         * <p>V2</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The name of the workspace to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>team-workspace</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance build(java.util.Map<String, ?> map) throws Exception {
            EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance self = new EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance();
            return TeaModel.build(map, self);
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setArchiveDuration(Integer archiveDuration) {
            this.archiveDuration = archiveDuration;
            return this;
        }
        public Integer getArchiveDuration() {
            return this.archiveDuration;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setAuthFreeReadPolicy(String authFreeReadPolicy) {
            this.authFreeReadPolicy = authFreeReadPolicy;
            return this;
        }
        public String getAuthFreeReadPolicy() {
            return this.authFreeReadPolicy;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setAuthFreeWritePolicy(String authFreeWritePolicy) {
            this.authFreeWritePolicy = authFreeWritePolicy;
            return this;
        }
        public String getAuthFreeWritePolicy() {
            return this.authFreeWritePolicy;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setEnableAuthFreeRead(Boolean enableAuthFreeRead) {
            this.enableAuthFreeRead = enableAuthFreeRead;
            return this;
        }
        public Boolean getEnableAuthFreeRead() {
            return this.enableAuthFreeRead;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setEnableAuthFreeWrite(Boolean enableAuthFreeWrite) {
            this.enableAuthFreeWrite = enableAuthFreeWrite;
            return this;
        }
        public Boolean getEnableAuthFreeWrite() {
            return this.enableAuthFreeWrite;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setEnableAuthToken(Boolean enableAuthToken) {
            this.enableAuthToken = enableAuthToken;
            return this;
        }
        public Boolean getEnableAuthToken() {
            return this.enableAuthToken;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setExtraInfo(java.util.Map<String, String> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, String> getExtraInfo() {
            return this.extraInfo;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setFolderUrl(String folderUrl) {
            this.folderUrl = folderUrl;
            return this;
        }
        public String getFolderUrl() {
            return this.folderUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setGrafanaInstanceId(String grafanaInstanceId) {
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }
        public String getGrafanaInstanceId() {
            return this.grafanaInstanceId;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setGrafanaInstanceName(String grafanaInstanceName) {
            this.grafanaInstanceName = grafanaInstanceName;
            return this;
        }
        public String getGrafanaInstanceName() {
            return this.grafanaInstanceName;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setHttpApiInterUrl(String httpApiInterUrl) {
            this.httpApiInterUrl = httpApiInterUrl;
            return this;
        }
        public String getHttpApiInterUrl() {
            return this.httpApiInterUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setHttpApiInternalUrl(String httpApiInternalUrl) {
            this.httpApiInternalUrl = httpApiInternalUrl;
            return this;
        }
        public String getHttpApiInternalUrl() {
            return this.httpApiInternalUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setHttpApiIntraUrl(String httpApiIntraUrl) {
            this.httpApiIntraUrl = httpApiIntraUrl;
            return this;
        }
        public String getHttpApiIntraUrl() {
            return this.httpApiIntraUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setPaymentTypeUpdateTime(String paymentTypeUpdateTime) {
            this.paymentTypeUpdateTime = paymentTypeUpdateTime;
            return this;
        }
        public String getPaymentTypeUpdateTime() {
            return this.paymentTypeUpdateTime;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setPrometheusInstanceName(String prometheusInstanceName) {
            this.prometheusInstanceName = prometheusInstanceName;
            return this;
        }
        public String getPrometheusInstanceName() {
            return this.prometheusInstanceName;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setPushGatewayInterUrl(String pushGatewayInterUrl) {
            this.pushGatewayInterUrl = pushGatewayInterUrl;
            return this;
        }
        public String getPushGatewayInterUrl() {
            return this.pushGatewayInterUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setPushGatewayInternalUrl(String pushGatewayInternalUrl) {
            this.pushGatewayInternalUrl = pushGatewayInternalUrl;
            return this;
        }
        public String getPushGatewayInternalUrl() {
            return this.pushGatewayInternalUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setPushGatewayIntraUrl(String pushGatewayIntraUrl) {
            this.pushGatewayIntraUrl = pushGatewayIntraUrl;
            return this;
        }
        public String getPushGatewayIntraUrl() {
            return this.pushGatewayIntraUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setRemoteReadInterUrl(String remoteReadInterUrl) {
            this.remoteReadInterUrl = remoteReadInterUrl;
            return this;
        }
        public String getRemoteReadInterUrl() {
            return this.remoteReadInterUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setRemoteReadInternalUrl(String remoteReadInternalUrl) {
            this.remoteReadInternalUrl = remoteReadInternalUrl;
            return this;
        }
        public String getRemoteReadInternalUrl() {
            return this.remoteReadInternalUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setRemoteReadIntraUrl(String remoteReadIntraUrl) {
            this.remoteReadIntraUrl = remoteReadIntraUrl;
            return this;
        }
        public String getRemoteReadIntraUrl() {
            return this.remoteReadIntraUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setRemoteWriteInterUrl(String remoteWriteInterUrl) {
            this.remoteWriteInterUrl = remoteWriteInterUrl;
            return this;
        }
        public String getRemoteWriteInterUrl() {
            return this.remoteWriteInterUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setRemoteWriteInternalUrl(String remoteWriteInternalUrl) {
            this.remoteWriteInternalUrl = remoteWriteInternalUrl;
            return this;
        }
        public String getRemoteWriteInternalUrl() {
            return this.remoteWriteInternalUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setRemoteWriteIntraUrl(String remoteWriteIntraUrl) {
            this.remoteWriteIntraUrl = remoteWriteIntraUrl;
            return this;
        }
        public String getRemoteWriteIntraUrl() {
            return this.remoteWriteIntraUrl;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setStorageDuration(Integer storageDuration) {
            this.storageDuration = storageDuration;
            return this;
        }
        public Integer getStorageDuration() {
            return this.storageDuration;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setStoreConfig(PrometheusInstanceStoreConfig storeConfig) {
            this.storeConfig = storeConfig;
            return this;
        }
        public PrometheusInstanceStoreConfig getStoreConfig() {
            return this.storeConfig;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setSupportAuthTypes(java.util.List<String> supportAuthTypes) {
            this.supportAuthTypes = supportAuthTypes;
            return this;
        }
        public java.util.List<String> getSupportAuthTypes() {
            return this.supportAuthTypes;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setTags(java.util.List<EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<EnsureSharedPrometheusInstanceResponseBodyPrometheusInstanceTags> getTags() {
            return this.tags;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public EnsureSharedPrometheusInstanceResponseBodyPrometheusInstance setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
