// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPrometheusInstanceResponseBody extends TeaModel {
    @NameInMap("prometheusInstance")
    public GetPrometheusInstanceResponseBodyPrometheusInstance prometheusInstance;

    /**
     * <p>Id of the request</p>
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
         * <strong>example:</strong>
         * <p>openStorage</p>
         */
        @NameInMap("key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>readOnly</p>
         */
        @NameInMap("accessType")
        public String accessType;

        /**
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("archiveDuration")
        public Integer archiveDuration;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("authFreeReadPolicy")
        public String authFreeReadPolicy;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("authFreeWritePolicy")
        public String authFreeWritePolicy;

        /**
         * <strong>example:</strong>
         * <p>eJwixxxxx</p>
         */
        @NameInMap("authToken")
        public String authToken;

        /**
         * <strong>example:</strong>
         * <p>2025-08-10T02:07:53Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableAuthFreeRead")
        public Boolean enableAuthFreeRead;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableAuthFreeWrite")
        public Boolean enableAuthFreeWrite;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableAuthToken")
        public Boolean enableAuthToken;

        @NameInMap("extraInfo")
        public java.util.Map<String, String> extraInfo;

        /**
         * <strong>example:</strong>
         * <p><a href="https://gnew.console.aliyun.com/dashboards/f/c49a80d2a551d4a20a8c4b996b0be4e52/xxxxxxx">https://gnew.console.aliyun.com/dashboards/f/c49a80d2a551d4a20a8c4b996b0be4e52/xxxxxxx</a></p>
         */
        @NameInMap("folderUrl")
        public String folderUrl;

        /**
         * <strong>example:</strong>
         * <p>SHARED</p>
         */
        @NameInMap("grafanaInstanceId")
        public String grafanaInstanceId;

        @NameInMap("grafanaInstanceName")
        public String grafanaInstanceName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("httpApiInterUrl")
        public String httpApiInterUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("httpApiIntraUrl")
        public String httpApiIntraUrl;

        /**
         * <p>remote-write（Prometheus for Remote Write）</p>
         * 
         * <strong>example:</strong>
         * <p>e1</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>prepaid</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("paymentTypeUpdateTime")
        public String paymentTypeUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>NAS</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>rw-524ada714221af267c73122af2e1</p>
         */
        @NameInMap("prometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test-prom-name</p>
         */
        @NameInMap("prometheusInstanceName")
        public String prometheusInstanceName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("pushGatewayInterUrl")
        public String pushGatewayInterUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("pushGatewayIntraUrl")
        public String pushGatewayIntraUrl;

        /**
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxxxxxx">http://workspace-default-cms-xxxxxxx</a></p>
         */
        @NameInMap("remoteReadInterUrl")
        public String remoteReadInterUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://workspace-default-cms-1xxxxxxxxxx">https://workspace-default-cms-1xxxxxxxxxx</a></p>
         */
        @NameInMap("remoteReadIntraUrl")
        public String remoteReadIntraUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://workspace-default-cms-xxxxxxxxxx">https://workspace-default-cms-xxxxxxxxxx</a></p>
         */
        @NameInMap("remoteWriteInterUrl")
        public String remoteWriteInterUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://workspace-default-cms-xxxxxxxxxx">https://workspace-default-cms-xxxxxxxxxx</a></p>
         */
        @NameInMap("remoteWriteIntraUrl")
        public String remoteWriteIntraUrl;

        /**
         * <strong>example:</strong>
         * <p>rg-acfm3gn5i6bigbi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("storageDuration")
        public Integer storageDuration;

        @NameInMap("supportAuthTypes")
        public java.util.List<String> supportAuthTypes;

        @NameInMap("tags")
        public java.util.List<GetPrometheusInstanceResponseBodyPrometheusInstanceTags> tags;

        /**
         * <strong>example:</strong>
         * <p>170731234567</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>rum-monitor-test-aysls-pub-cn-qingdao-monitor</p>
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
