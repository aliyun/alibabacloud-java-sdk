// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    // The description of the service.
    @NameInMap("description")
    public String description;

    // Specifies whether to allow functions to access the Internet. Valid values:
    // 
    // - **true**: allows functions in the specified service to access the Internet. Default value: true.
    // - **false**: does not allow functions in the specified service to access the Internet.
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    // The log configuration. Function Compute writes function execution logs to the specified Logstore.
    @NameInMap("logConfig")
    public LogConfig logConfig;

    // The configuration of the Apsara File Storage NAS (NAS) file system. The configurations allow functions in the specified service to access the NAS file system.
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

    // The name of the service. The name contains only letters, digits, hyphens (-), and underscores (_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).
    @NameInMap("serviceName")
    public String serviceName;

    // The configurations of Tracing Analysis. After Function Compute is integrated with Tracing Analysis, you can record the duration of a request in Function Compute, view the cold start time of a function, and record the execution duration of a function. For more information, see [Tracing Analysis](~~189804~~).
    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    // The VPC configurations. The configurations allow functions in the specified service to access the specified VPC.
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

    public CreateServiceRequest setOssMountConfig(OSSMountConfig ossMountConfig) {
        this.ossMountConfig = ossMountConfig;
        return this;
    }
    public OSSMountConfig getOssMountConfig() {
        return this.ossMountConfig;
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
