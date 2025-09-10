// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusViewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("authFreeReadPolicy")
    public String authFreeReadPolicy;

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
     * <p>This parameter is required.</p>
     */
    @NameInMap("prometheusInstances")
    public java.util.List<CreatePrometheusViewRequestPrometheusInstances> prometheusInstances;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-prom-view-name</p>
     */
    @NameInMap("prometheusViewName")
    public String prometheusViewName;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm3gn5i6bigbi</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("status")
    public String status;

    @NameInMap("tags")
    public java.util.List<CreatePrometheusViewRequestTags> tags;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>V2</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <strong>example:</strong>
     * <p>cms-monitor-test-aysls-pub-cn-zhangjiakou-spe-monitor</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreatePrometheusViewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusViewRequest self = new CreatePrometheusViewRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusViewRequest setAuthFreeReadPolicy(String authFreeReadPolicy) {
        this.authFreeReadPolicy = authFreeReadPolicy;
        return this;
    }
    public String getAuthFreeReadPolicy() {
        return this.authFreeReadPolicy;
    }

    public CreatePrometheusViewRequest setEnableAuthFreeRead(Boolean enableAuthFreeRead) {
        this.enableAuthFreeRead = enableAuthFreeRead;
        return this;
    }
    public Boolean getEnableAuthFreeRead() {
        return this.enableAuthFreeRead;
    }

    public CreatePrometheusViewRequest setEnableAuthToken(Boolean enableAuthToken) {
        this.enableAuthToken = enableAuthToken;
        return this;
    }
    public Boolean getEnableAuthToken() {
        return this.enableAuthToken;
    }

    public CreatePrometheusViewRequest setPrometheusInstances(java.util.List<CreatePrometheusViewRequestPrometheusInstances> prometheusInstances) {
        this.prometheusInstances = prometheusInstances;
        return this;
    }
    public java.util.List<CreatePrometheusViewRequestPrometheusInstances> getPrometheusInstances() {
        return this.prometheusInstances;
    }

    public CreatePrometheusViewRequest setPrometheusViewName(String prometheusViewName) {
        this.prometheusViewName = prometheusViewName;
        return this;
    }
    public String getPrometheusViewName() {
        return this.prometheusViewName;
    }

    public CreatePrometheusViewRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreatePrometheusViewRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreatePrometheusViewRequest setTags(java.util.List<CreatePrometheusViewRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreatePrometheusViewRequestTags> getTags() {
        return this.tags;
    }

    public CreatePrometheusViewRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreatePrometheusViewRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreatePrometheusViewRequestPrometheusInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>arms-1d581fac20a462dcde743d9628</p>
         */
        @NameInMap("prometheusInstanceId")
        public String prometheusInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>167271234567890</p>
         */
        @NameInMap("userId")
        public String userId;

        public static CreatePrometheusViewRequestPrometheusInstances build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusViewRequestPrometheusInstances self = new CreatePrometheusViewRequestPrometheusInstances();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusViewRequestPrometheusInstances setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public CreatePrometheusViewRequestPrometheusInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreatePrometheusViewRequestPrometheusInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreatePrometheusViewRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test-value</p>
         */
        @NameInMap("value")
        public String value;

        public static CreatePrometheusViewRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusViewRequestTags self = new CreatePrometheusViewRequestTags();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusViewRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrometheusViewRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
