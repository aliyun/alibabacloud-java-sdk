// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateAppServiceRequest extends TeaModel {
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
    public Integer replicas;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceSpec")
    public String serviceSpec;

    public static CreateAppServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppServiceRequest self = new CreateAppServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppServiceRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public CreateAppServiceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateAppServiceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateAppServiceRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreateAppServiceRequest setConfig(java.util.Map<String, ?> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    public CreateAppServiceRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateAppServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateAppServiceRequest setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public String getServiceSpec() {
        return this.serviceSpec;
    }

}
