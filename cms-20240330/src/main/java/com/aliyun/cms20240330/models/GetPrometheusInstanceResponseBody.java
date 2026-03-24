// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPrometheusInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the Prometheus instance.</p>
     */
    @NameInMap("prometheusInstance")
    public GetPrometheusInstanceResponseBodyPrometheusInstance prometheusInstance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPrometheusInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusInstanceResponseBody self = new GetPrometheusInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusInstanceResponseBody setPrometheusInstance(GetPrometheusInstanceResponseBodyPrometheusInstance prometheusInstance) {
        this.prometheusInstance = prometheusInstance;
        return this;
    }
    public GetPrometheusInstanceResponseBodyPrometheusInstance getPrometheusInstance() {
        return this.prometheusInstance;
    }

    public GetPrometheusInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPrometheusInstanceResponseBodyPrometheusInstanceTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>openStorage</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>130303196111114281</p>
         */
        @NameInMap("value")
        public String value;

        public static GetPrometheusInstanceResponseBodyPrometheusInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusInstanceResponseBodyPrometheusInstanceTags self = new GetPrometheusInstanceResponseBodyPrometheusInstanceTags();
            return TeaModel.build(map, self);
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstanceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstanceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPrometheusInstanceResponseBodyPrometheusInstance extends TeaModel {
        /**
         * <p>The permission type. Valid values: \<code>readWrite\\</code>, \<code>readOnly\\</code>, and \<code>httpReadOnly\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>readOnly</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <p>The number of days to archive data after the storage duration ends. A value of 0 means data is not archived. A value of 3650 means data is permanently archived.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("archiveDuration")
        public Integer archiveDuration;

        /**
         * <p>The password-free read policy. IP address ranges and VPC IDs are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;SourceIp&quot;: [
         *     &quot;192.168.1.0/24&quot;,
         *     &quot;172.168.2.22&quot;
         *   ],
         *   &quot;SourceVpc&quot;: [
         *     &quot;vpc-xx1&quot;,
         *     &quot;vpc-xx2&quot;
         *   ]
         * }</p>
         */
        @NameInMap("authFreeReadPolicy")
        public String authFreeReadPolicy;

        /**
         * <p>The password-free write policy. IP address ranges and VPC IDs are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;SourceIp&quot;: [
         *     &quot;192.168.1.0/24&quot;,
         *     &quot;172.168.2.22&quot;
         *   ],
         *   &quot;SourceVpc&quot;: [
         *     &quot;vpc-xx1&quot;,
         *     &quot;vpc-xx2&quot;
         *   ]
         * }</p>
         */
        @NameInMap("authFreeWritePolicy")
        public String authFreeWritePolicy;

        /**
         * <p>The authentication token.</p>
         * 
         * <strong>example:</strong>
         * <p>eJwixxxxx</p>
         */
        @NameInMap("authToken")
        public String authToken;

        /**
         * <p>The time when the instance was created. The time is in UTC and follows the yyyy-MM-ddTHH:mmZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-10T02:07:53Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Indicates whether password-free read is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableAuthFreeRead")
        public Boolean enableAuthFreeRead;

        /**
         * <p>Indicates whether password-free write is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableAuthFreeWrite")
        public Boolean enableAuthFreeWrite;

        /**
         * <p>Indicates whether the authentication token is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableAuthToken")
        public Boolean enableAuthToken;

        /**
         * <p>The extra information.</p>
         */
        @NameInMap("extraInfo")
        public java.util.Map<String, String> extraInfo;

        /**
         * <p>The URL of the visualization dashboard folder.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gnew.console.aliyun.com/dashboards/f/c49a80d2a551d4a20a8c4b996b0be4e52/xxxxxxx">https://gnew.console.aliyun.com/dashboards/f/c49a80d2a551d4a20a8c4b996b0be4e52/xxxxxxx</a></p>
         */
        @NameInMap("folderUrl")
        public String folderUrl;

        /**
         * <p>The ID of the attached Grafana instance.</p>
         * 
         * <strong>example:</strong>
         * <p>SHARED</p>
         */
        @NameInMap("grafanaInstanceId")
        public String grafanaInstanceId;

        /**
         * <p>The name of the attached Grafana instance.</p>
         * 
         * <strong>example:</strong>
         * <p>共享版</p>
         */
        @NameInMap("grafanaInstanceName")
        public String grafanaInstanceName;

        /**
         * <p>The HTTP endpoint for the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("httpApiInterUrl")
        public String httpApiInterUrl;

        /**
         * <p>The HTTP endpoint for the internal network.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("httpApiIntraUrl")
        public String httpApiIntraUrl;

        /**
         * <p>The type of the Prometheus instance.</p>
         * 
         * <strong>example:</strong>
         * <p>remote-write</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <p>The billing method. Valid values:
         * \<code>POSTPAY\\</code>: pay-as-you-go based on the number of reported metrics.
         * \<code>POSTPAY_GB\\</code>: pay-as-you-go based on the volume of data written.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The time when the billing method of the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-10T02:07:53Z</p>
         */
        @NameInMap("paymentTypeUpdateTime")
        public String paymentTypeUpdateTime;

        /**
         * <p>The Alibaba Cloud service to which the instance belongs. Valid values: \<code>arms\\</code> and \<code>cms\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-524ada714221af267c73122af2e1</p>
         */
        @NameInMap("prometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-prom-name</p>
         */
        @NameInMap("prometheusInstanceName")
        public String prometheusInstanceName;

        /**
         * <p>The Pushgateway endpoint for the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("pushGatewayInterUrl")
        public String pushGatewayInterUrl;

        /**
         * <p>The Pushgateway endpoint for the internal network.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("pushGatewayIntraUrl")
        public String pushGatewayIntraUrl;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The read endpoint for the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("remoteReadInterUrl")
        public String remoteReadInterUrl;

        /**
         * <p>The read endpoint for the internal network.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://workspace-default-cms-1xxxxxxxxxx">https://workspace-default-cms-1xxxxxxxxxx</a></p>
         */
        @NameInMap("remoteReadIntraUrl")
        public String remoteReadIntraUrl;

        /**
         * <p>The write endpoint for the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://workspace-default-cms-xxxxxxxxxx">https://workspace-default-cms-xxxxxxxxxx</a></p>
         */
        @NameInMap("remoteWriteInterUrl")
        public String remoteWriteInterUrl;

        /**
         * <p>The write endpoint for the internal network.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://workspace-default-cms-xxxxxxxxxx">https://workspace-default-cms-xxxxxxxxxx</a></p>
         */
        @NameInMap("remoteWriteIntraUrl")
        public String remoteWriteIntraUrl;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3gn5i6bigbi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>A static field. The value is \<code>PrometheusInstance\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The storage duration in days.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("storageDuration")
        public Integer storageDuration;

        /**
         * <p>The supported authentication and authorization types.</p>
         */
        @NameInMap("supportAuthTypes")
        public java.util.List<String> supportAuthTypes;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<GetPrometheusInstanceResponseBodyPrometheusInstanceTags> tags;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>170731234567</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The workspace to which the Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ws1</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetPrometheusInstanceResponseBodyPrometheusInstance build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusInstanceResponseBodyPrometheusInstance self = new GetPrometheusInstanceResponseBodyPrometheusInstance();
            return TeaModel.build(map, self);
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setArchiveDuration(Integer archiveDuration) {
            this.archiveDuration = archiveDuration;
            return this;
        }
        public Integer getArchiveDuration() {
            return this.archiveDuration;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setAuthFreeReadPolicy(String authFreeReadPolicy) {
            this.authFreeReadPolicy = authFreeReadPolicy;
            return this;
        }
        public String getAuthFreeReadPolicy() {
            return this.authFreeReadPolicy;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setAuthFreeWritePolicy(String authFreeWritePolicy) {
            this.authFreeWritePolicy = authFreeWritePolicy;
            return this;
        }
        public String getAuthFreeWritePolicy() {
            return this.authFreeWritePolicy;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setEnableAuthFreeRead(Boolean enableAuthFreeRead) {
            this.enableAuthFreeRead = enableAuthFreeRead;
            return this;
        }
        public Boolean getEnableAuthFreeRead() {
            return this.enableAuthFreeRead;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setEnableAuthFreeWrite(Boolean enableAuthFreeWrite) {
            this.enableAuthFreeWrite = enableAuthFreeWrite;
            return this;
        }
        public Boolean getEnableAuthFreeWrite() {
            return this.enableAuthFreeWrite;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setEnableAuthToken(Boolean enableAuthToken) {
            this.enableAuthToken = enableAuthToken;
            return this;
        }
        public Boolean getEnableAuthToken() {
            return this.enableAuthToken;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setExtraInfo(java.util.Map<String, String> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public java.util.Map<String, String> getExtraInfo() {
            return this.extraInfo;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setFolderUrl(String folderUrl) {
            this.folderUrl = folderUrl;
            return this;
        }
        public String getFolderUrl() {
            return this.folderUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setGrafanaInstanceId(String grafanaInstanceId) {
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }
        public String getGrafanaInstanceId() {
            return this.grafanaInstanceId;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setGrafanaInstanceName(String grafanaInstanceName) {
            this.grafanaInstanceName = grafanaInstanceName;
            return this;
        }
        public String getGrafanaInstanceName() {
            return this.grafanaInstanceName;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setHttpApiInterUrl(String httpApiInterUrl) {
            this.httpApiInterUrl = httpApiInterUrl;
            return this;
        }
        public String getHttpApiInterUrl() {
            return this.httpApiInterUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setHttpApiIntraUrl(String httpApiIntraUrl) {
            this.httpApiIntraUrl = httpApiIntraUrl;
            return this;
        }
        public String getHttpApiIntraUrl() {
            return this.httpApiIntraUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setPaymentTypeUpdateTime(String paymentTypeUpdateTime) {
            this.paymentTypeUpdateTime = paymentTypeUpdateTime;
            return this;
        }
        public String getPaymentTypeUpdateTime() {
            return this.paymentTypeUpdateTime;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setPrometheusInstanceName(String prometheusInstanceName) {
            this.prometheusInstanceName = prometheusInstanceName;
            return this;
        }
        public String getPrometheusInstanceName() {
            return this.prometheusInstanceName;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setPushGatewayInterUrl(String pushGatewayInterUrl) {
            this.pushGatewayInterUrl = pushGatewayInterUrl;
            return this;
        }
        public String getPushGatewayInterUrl() {
            return this.pushGatewayInterUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setPushGatewayIntraUrl(String pushGatewayIntraUrl) {
            this.pushGatewayIntraUrl = pushGatewayIntraUrl;
            return this;
        }
        public String getPushGatewayIntraUrl() {
            return this.pushGatewayIntraUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setRemoteReadInterUrl(String remoteReadInterUrl) {
            this.remoteReadInterUrl = remoteReadInterUrl;
            return this;
        }
        public String getRemoteReadInterUrl() {
            return this.remoteReadInterUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setRemoteReadIntraUrl(String remoteReadIntraUrl) {
            this.remoteReadIntraUrl = remoteReadIntraUrl;
            return this;
        }
        public String getRemoteReadIntraUrl() {
            return this.remoteReadIntraUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setRemoteWriteInterUrl(String remoteWriteInterUrl) {
            this.remoteWriteInterUrl = remoteWriteInterUrl;
            return this;
        }
        public String getRemoteWriteInterUrl() {
            return this.remoteWriteInterUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setRemoteWriteIntraUrl(String remoteWriteIntraUrl) {
            this.remoteWriteIntraUrl = remoteWriteIntraUrl;
            return this;
        }
        public String getRemoteWriteIntraUrl() {
            return this.remoteWriteIntraUrl;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setStorageDuration(Integer storageDuration) {
            this.storageDuration = storageDuration;
            return this;
        }
        public Integer getStorageDuration() {
            return this.storageDuration;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setSupportAuthTypes(java.util.List<String> supportAuthTypes) {
            this.supportAuthTypes = supportAuthTypes;
            return this;
        }
        public java.util.List<String> getSupportAuthTypes() {
            return this.supportAuthTypes;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setTags(java.util.List<GetPrometheusInstanceResponseBodyPrometheusInstanceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetPrometheusInstanceResponseBodyPrometheusInstanceTags> getTags() {
            return this.tags;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetPrometheusInstanceResponseBodyPrometheusInstance setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
