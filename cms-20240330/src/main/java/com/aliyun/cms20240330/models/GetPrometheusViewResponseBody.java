// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPrometheusViewResponseBody extends TeaModel {
    @NameInMap("prometheusView")
    public GetPrometheusViewResponseBodyPrometheusView prometheusView;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPrometheusViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusViewResponseBody self = new GetPrometheusViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusViewResponseBody setPrometheusView(GetPrometheusViewResponseBodyPrometheusView prometheusView) {
        this.prometheusView = prometheusView;
        return this;
    }
    public GetPrometheusViewResponseBodyPrometheusView getPrometheusView() {
        return this.prometheusView;
    }

    public GetPrometheusViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rw-63549e054ff596a4149927961dff</p>
         */
        @NameInMap("prometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-north-2-gov-1</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>122xxxxx</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances self = new GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances();
            return TeaModel.build(map, self);
        }

        public GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetPrometheusViewResponseBodyPrometheusViewTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>global_score_series</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>371293199010092839</p>
         */
        @NameInMap("value")
        public String value;

        public static GetPrometheusViewResponseBodyPrometheusViewTags build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusViewResponseBodyPrometheusViewTags self = new GetPrometheusViewResponseBodyPrometheusViewTags();
            return TeaModel.build(map, self);
        }

        public GetPrometheusViewResponseBodyPrometheusViewTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetPrometheusViewResponseBodyPrometheusViewTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetPrometheusViewResponseBodyPrometheusView extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        @NameInMap("authFreeReadPolicy")
        public String authFreeReadPolicy;

        /**
         * <strong>example:</strong>
         * <p>eJxxxxxx</p>
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
        @NameInMap("enableAuthToken")
        public Boolean enableAuthToken;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxx">https://xxxx</a></p>
         */
        @NameInMap("folderUrl")
        public String folderUrl;

        /**
         * <strong>example:</strong>
         * <p>g-xxx</p>
         */
        @NameInMap("grafanaInstanceId")
        public String grafanaInstanceId;

        /**
         * <strong>example:</strong>
         * <p>gxxx</p>
         */
        @NameInMap("grafanaInstanceName")
        public String grafanaInstanceName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxxx">http://xxxxxxxx</a></p>
         */
        @NameInMap("httpApiInterUrl")
        public String httpApiInterUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxxxxxxx">http://xxxxxxxx</a></p>
         */
        @NameInMap("httpApiIntraUrl")
        public String httpApiIntraUrl;

        /**
         * <strong>example:</strong>
         * <p>prom-view</p>
         */
        @NameInMap("instanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>FREE</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>cms</p>
         */
        @NameInMap("product")
        public String product;

        @NameInMap("prometheusInstances")
        public java.util.List<GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances> prometheusInstances;

        /**
         * <strong>example:</strong>
         * <p>view-xxx</p>
         */
        @NameInMap("prometheusViewId")
        public String prometheusViewId;

        /**
         * <strong>example:</strong>
         * <p>view1</p>
         */
        @NameInMap("prometheusViewName")
        public String prometheusViewName;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxx-cn-hangzhou.cn-hangzhou.log.aliyuncs.com/prometheus/workspace-default-cms-xxx-cn-hangzhou/xxx/api/v1/read">http://workspace-default-cms-xxx-cn-hangzhou.cn-hangzhou.log.aliyuncs.com/prometheus/workspace-default-cms-xxx-cn-hangzhou/xxx/api/v1/read</a></p>
         */
        @NameInMap("remoteReadInterUrl")
        public String remoteReadInterUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://workspace-default-cms-xxx-cn-hangzhou.cn-hangzhou-intranet.log.aliyuncs.com/prometheus/workspace-default-cms-xxx-cn-hangzhou/xxx/api/v1/read">http://workspace-default-cms-xxx-cn-hangzhou.cn-hangzhou-intranet.log.aliyuncs.com/prometheus/workspace-default-cms-xxx-cn-hangzhou/xxx/api/v1/read</a></p>
         */
        @NameInMap("remoteReadIntraUrl")
        public String remoteReadIntraUrl;

        /**
         * <strong>example:</strong>
         * <p>rg-acfm3gn5i6bigbi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>RegistryModule</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>Pending2Running</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("supportAuthTypes")
        public java.util.List<String> supportAuthTypes;

        @NameInMap("tags")
        public java.util.List<GetPrometheusViewResponseBodyPrometheusViewTags> tags;

        /**
         * <strong>example:</strong>
         * <p>11222</p>
         */
        @NameInMap("userId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>cms-monitor-test-aysls-pub-cn-fuzhou-monitor</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetPrometheusViewResponseBodyPrometheusView build(java.util.Map<String, ?> map) throws Exception {
            GetPrometheusViewResponseBodyPrometheusView self = new GetPrometheusViewResponseBodyPrometheusView();
            return TeaModel.build(map, self);
        }

        public GetPrometheusViewResponseBodyPrometheusView setAuthFreeReadPolicy(String authFreeReadPolicy) {
            this.authFreeReadPolicy = authFreeReadPolicy;
            return this;
        }
        public String getAuthFreeReadPolicy() {
            return this.authFreeReadPolicy;
        }

        public GetPrometheusViewResponseBodyPrometheusView setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public GetPrometheusViewResponseBodyPrometheusView setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPrometheusViewResponseBodyPrometheusView setEnableAuthFreeRead(Boolean enableAuthFreeRead) {
            this.enableAuthFreeRead = enableAuthFreeRead;
            return this;
        }
        public Boolean getEnableAuthFreeRead() {
            return this.enableAuthFreeRead;
        }

        public GetPrometheusViewResponseBodyPrometheusView setEnableAuthToken(Boolean enableAuthToken) {
            this.enableAuthToken = enableAuthToken;
            return this;
        }
        public Boolean getEnableAuthToken() {
            return this.enableAuthToken;
        }

        public GetPrometheusViewResponseBodyPrometheusView setFolderUrl(String folderUrl) {
            this.folderUrl = folderUrl;
            return this;
        }
        public String getFolderUrl() {
            return this.folderUrl;
        }

        public GetPrometheusViewResponseBodyPrometheusView setGrafanaInstanceId(String grafanaInstanceId) {
            this.grafanaInstanceId = grafanaInstanceId;
            return this;
        }
        public String getGrafanaInstanceId() {
            return this.grafanaInstanceId;
        }

        public GetPrometheusViewResponseBodyPrometheusView setGrafanaInstanceName(String grafanaInstanceName) {
            this.grafanaInstanceName = grafanaInstanceName;
            return this;
        }
        public String getGrafanaInstanceName() {
            return this.grafanaInstanceName;
        }

        public GetPrometheusViewResponseBodyPrometheusView setHttpApiInterUrl(String httpApiInterUrl) {
            this.httpApiInterUrl = httpApiInterUrl;
            return this;
        }
        public String getHttpApiInterUrl() {
            return this.httpApiInterUrl;
        }

        public GetPrometheusViewResponseBodyPrometheusView setHttpApiIntraUrl(String httpApiIntraUrl) {
            this.httpApiIntraUrl = httpApiIntraUrl;
            return this;
        }
        public String getHttpApiIntraUrl() {
            return this.httpApiIntraUrl;
        }

        public GetPrometheusViewResponseBodyPrometheusView setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetPrometheusViewResponseBodyPrometheusView setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public GetPrometheusViewResponseBodyPrometheusView setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetPrometheusViewResponseBodyPrometheusView setPrometheusInstances(java.util.List<GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances> prometheusInstances) {
            this.prometheusInstances = prometheusInstances;
            return this;
        }
        public java.util.List<GetPrometheusViewResponseBodyPrometheusViewPrometheusInstances> getPrometheusInstances() {
            return this.prometheusInstances;
        }

        public GetPrometheusViewResponseBodyPrometheusView setPrometheusViewId(String prometheusViewId) {
            this.prometheusViewId = prometheusViewId;
            return this;
        }
        public String getPrometheusViewId() {
            return this.prometheusViewId;
        }

        public GetPrometheusViewResponseBodyPrometheusView setPrometheusViewName(String prometheusViewName) {
            this.prometheusViewName = prometheusViewName;
            return this;
        }
        public String getPrometheusViewName() {
            return this.prometheusViewName;
        }

        public GetPrometheusViewResponseBodyPrometheusView setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetPrometheusViewResponseBodyPrometheusView setRemoteReadInterUrl(String remoteReadInterUrl) {
            this.remoteReadInterUrl = remoteReadInterUrl;
            return this;
        }
        public String getRemoteReadInterUrl() {
            return this.remoteReadInterUrl;
        }

        public GetPrometheusViewResponseBodyPrometheusView setRemoteReadIntraUrl(String remoteReadIntraUrl) {
            this.remoteReadIntraUrl = remoteReadIntraUrl;
            return this;
        }
        public String getRemoteReadIntraUrl() {
            return this.remoteReadIntraUrl;
        }

        public GetPrometheusViewResponseBodyPrometheusView setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetPrometheusViewResponseBodyPrometheusView setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetPrometheusViewResponseBodyPrometheusView setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPrometheusViewResponseBodyPrometheusView setSupportAuthTypes(java.util.List<String> supportAuthTypes) {
            this.supportAuthTypes = supportAuthTypes;
            return this;
        }
        public java.util.List<String> getSupportAuthTypes() {
            return this.supportAuthTypes;
        }

        public GetPrometheusViewResponseBodyPrometheusView setTags(java.util.List<GetPrometheusViewResponseBodyPrometheusViewTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetPrometheusViewResponseBodyPrometheusViewTags> getTags() {
            return this.tags;
        }

        public GetPrometheusViewResponseBodyPrometheusView setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetPrometheusViewResponseBodyPrometheusView setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetPrometheusViewResponseBodyPrometheusView setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
