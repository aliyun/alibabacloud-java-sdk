// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    /**
     * <p>The description of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>service_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to allow functions to access the Internet. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    /**
     * <p>The log configurations. Function Compute writes function execution logs to the specified Logstore.</p>
     */
    @NameInMap("logConfig")
    public LogConfig logConfig;

    /**
     * <p>The File Storage NAS (NAS) configurations. The configurations allow functions to access the specified NAS file system.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The Object Storage Service (OSS) mounting configurations.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is used to grant required permissions to Function Compute. The RAM role is used in the following scenarios:</p>
     * <ul>
     * <li>Send function execution logs to your Logstore.</li>
     * <li>Generate a token for a function to access other cloud resources during function executions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::188077086902****:role/fc-test</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The name of the service. The name can contain only letters, digits, hyphens (-), and underscores (_). It cannot start with a digit or hyphen (-). The name must be 1 to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service_Name</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>The configuration of Managed Service for OpenTelemetry. After Function Compute is integrated with Managed Service for OpenTelemetry, you can record the duration of a request in Function Compute, view the cold start duration of a function, and record the execution duration of a function. For more information, see <a href="https://help.aliyun.com/document_detail/189804.html">Tracing analysis</a>.</p>
     */
    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    /**
     * <p>The Virtual Private Cloud (VPC) configurations. The configurations allow the function to access the specified VPCs.</p>
     */
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
