// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateAppServiceRequest extends TeaModel {
    /**
     * <p>The quota ID.</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The workspace ID.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The application type.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   LLM</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    the large language model (LLM) application</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The application version.</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <p>Additional configurations that are required for the service deployment.</p>
     */
    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    /**
     * <p>The number of instances.</p>
     */
    @NameInMap("Replicas")
    public String replicas;

    /**
     * <p>The service specifications.</p>
     */
    @NameInMap("ServiceSpec")
    public String serviceSpec;

    public static UpdateAppServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppServiceRequest self = new UpdateAppServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppServiceRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public UpdateAppServiceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateAppServiceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public UpdateAppServiceRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UpdateAppServiceRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public UpdateAppServiceRequest setReplicas(String replicas) {
        this.replicas = replicas;
        return this;
    }
    public String getReplicas() {
        return this.replicas;
    }

    public UpdateAppServiceRequest setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

}
