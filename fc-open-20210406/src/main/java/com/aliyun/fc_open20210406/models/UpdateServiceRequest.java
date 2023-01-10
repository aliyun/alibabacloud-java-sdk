// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    // The description of the service.
    @NameInMap("description")
    public String description;

    // Specifies whether to allow functions to access the Internet. Valid values:
    // 
    // *   **true**: allows functions in the specified service to access the Internet.
    // *   **false**: does not allow functions in the specified service to access the Internet.
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    // The log configuration. Function Compute writes function execution logs to the specified Logstore.
    @NameInMap("logConfig")
    public LogConfig logConfig;

    // The configurations of the NAS file system. The configurations allow functions to access the specified NAS resources.
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    // The OSS mount configurations.
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    // The RAM role that is used to grant required permissions to Function Compute. The RAM role is used in the following scenarios:
    // 
    // *   Sends function execution logs to your Logstore.
    // *   Generates a token for a function to access other cloud resources during function execution.
    @NameInMap("role")
    public String role;

    // The configurations of Tracing Analysis. After you configure Tracing Analysis for a service in Function Compute, you can record the execution duration of a request, view the amount of cold start time for a function, and record the execution duration of a function. For more information, see [Overview](~~189804~~).
    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    // The virtual private cloud (VPC) configuration, which allows functions in the specified service in Function Compute to access the specified VPC.
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

    public UpdateServiceRequest setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
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
