// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateServiceResponseBody extends TeaModel {
    // 创建时间
    @NameInMap("createdTime")
    public String createdTime;

    // 服务描述
    @NameInMap("description")
    public String description;

    // 公网访问设置
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    // 上次更新时间
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("logConfig")
    public LogConfig logConfig;

    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    // 服务角色
    @NameInMap("role")
    public String role;

    // 服务ID
    @NameInMap("serviceId")
    public String serviceId;

    // 服务名称
    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    @NameInMap("vpcConfig")
    public VPCConfig vpcConfig;

    public static CreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponseBody self = new CreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateServiceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateServiceResponseBody setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public CreateServiceResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CreateServiceResponseBody setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public CreateServiceResponseBody setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public CreateServiceResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateServiceResponseBody setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateServiceResponseBody setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    public CreateServiceResponseBody setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
