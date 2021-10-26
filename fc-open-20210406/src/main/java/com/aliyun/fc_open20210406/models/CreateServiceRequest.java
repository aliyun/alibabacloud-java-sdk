// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    // 服务描述
    @NameInMap("description")
    public String description;

    // 公网访问设置
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    @NameInMap("logConfig")
    public LogConfig logConfig;

    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    // 服务角色
    @NameInMap("role")
    public String role;

    // 服务名称
    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    @NameInMap("vpcConfig")
    public VPCConfig vpcConfig;

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateServiceRequest setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public CreateServiceRequest setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public CreateServiceRequest setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public CreateServiceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateServiceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateServiceRequest setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    public CreateServiceRequest setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
