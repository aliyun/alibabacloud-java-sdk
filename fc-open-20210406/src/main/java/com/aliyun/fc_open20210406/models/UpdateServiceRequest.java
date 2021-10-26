// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
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

    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    @NameInMap("vpcConfig")
    public VPCConfig vpcConfig;

    public static UpdateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRequest self = new UpdateServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateServiceRequest setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public UpdateServiceRequest setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public LogConfig getLogConfig() {
        return this.logConfig;
    }

    public UpdateServiceRequest setNasConfig(NASConfig nasConfig) {
        this.nasConfig = nasConfig;
        return this;
    }
    public NASConfig getNasConfig() {
        return this.nasConfig;
    }

    public UpdateServiceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public UpdateServiceRequest setTracingConfig(TracingConfig tracingConfig) {
        this.tracingConfig = tracingConfig;
        return this;
    }
    public TracingConfig getTracingConfig() {
        return this.tracingConfig;
    }

    public UpdateServiceRequest setVpcConfig(VPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
