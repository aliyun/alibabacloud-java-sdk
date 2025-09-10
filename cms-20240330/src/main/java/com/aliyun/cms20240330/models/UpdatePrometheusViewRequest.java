// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusViewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
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
     * <p>false</p>
     */
    @NameInMap("enableAuthToken")
    public Boolean enableAuthToken;

    @NameInMap("prometheusInstances")
    public java.util.List<UpdatePrometheusViewRequestPrometheusInstances> prometheusInstances;

    /**
     * <strong>example:</strong>
     * <p>test-prom-view-name</p>
     */
    @NameInMap("prometheusViewName")
    public String prometheusViewName;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>default-cms-108490012345-cn-heyuan</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static UpdatePrometheusViewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusViewRequest self = new UpdatePrometheusViewRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusViewRequest setAuthFreeReadPolicy(String authFreeReadPolicy) {
        this.authFreeReadPolicy = authFreeReadPolicy;
        return this;
    }
    public String getAuthFreeReadPolicy() {
        return this.authFreeReadPolicy;
    }

    public UpdatePrometheusViewRequest setEnableAuthFreeRead(Boolean enableAuthFreeRead) {
        this.enableAuthFreeRead = enableAuthFreeRead;
        return this;
    }
    public Boolean getEnableAuthFreeRead() {
        return this.enableAuthFreeRead;
    }

    public UpdatePrometheusViewRequest setEnableAuthToken(Boolean enableAuthToken) {
        this.enableAuthToken = enableAuthToken;
        return this;
    }
    public Boolean getEnableAuthToken() {
        return this.enableAuthToken;
    }

    public UpdatePrometheusViewRequest setPrometheusInstances(java.util.List<UpdatePrometheusViewRequestPrometheusInstances> prometheusInstances) {
        this.prometheusInstances = prometheusInstances;
        return this;
    }
    public java.util.List<UpdatePrometheusViewRequestPrometheusInstances> getPrometheusInstances() {
        return this.prometheusInstances;
    }

    public UpdatePrometheusViewRequest setPrometheusViewName(String prometheusViewName) {
        this.prometheusViewName = prometheusViewName;
        return this;
    }
    public String getPrometheusViewName() {
        return this.prometheusViewName;
    }

    public UpdatePrometheusViewRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrometheusViewRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class UpdatePrometheusViewRequestPrometheusInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c7ba84651c71e442c8d0653085d862164</p>
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
         * <p>16727123456789</p>
         */
        @NameInMap("userId")
        public String userId;

        public static UpdatePrometheusViewRequestPrometheusInstances build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrometheusViewRequestPrometheusInstances self = new UpdatePrometheusViewRequestPrometheusInstances();
            return TeaModel.build(map, self);
        }

        public UpdatePrometheusViewRequestPrometheusInstances setPrometheusInstanceId(String prometheusInstanceId) {
            this.prometheusInstanceId = prometheusInstanceId;
            return this;
        }
        public String getPrometheusInstanceId() {
            return this.prometheusInstanceId;
        }

        public UpdatePrometheusViewRequestPrometheusInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdatePrometheusViewRequestPrometheusInstances setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
