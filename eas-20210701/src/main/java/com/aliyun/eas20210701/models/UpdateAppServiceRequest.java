// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateAppServiceRequest extends TeaModel {
    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("Config")
    public java.util.Map<String, ?> config;

    @NameInMap("Replicas")
    public String replicas;

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
