// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    /**
     * <p>The description of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>test service</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to allow functions to access the Internet. Valid values:</p>
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
     * <p>The logging configurations. Function execution logs are stored in the specified Logstores.</p>
     */
    @NameInMap("logConfig")
    public LogConfig logConfig;

    /**
     * <p>The configurations of the File Storage NAS (NAS) file system. These configurations allow functions to access the specified NAS resources.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The Object Storage Service (OSS) mounting configurations.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The RAM role that is used to grant required permissions to Function Compute. This role is applicable in the following scenarios:</p>
     * <ul>
     * <li>Send function execution logs to your Logstores.</li>
     * <li>Generate a token for a function to access other Alibaba Cloud resources during function execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/fc-test</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The configurations of Managed Service for OpenTelemetry. After you configure Managed Service for OpenTelemetry for functions in Function Compute, you can record the execution durations of requests and internal processing durations of functions, and view the cold start latencies. For more information, see <a href="https://help.aliyun.com/document_detail/189804.html">Overview</a>.</p>
     */
    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    /**
     * <p>The configurations of virtual private clouds (VPCs). These configurations allow Function Compute to access the specified VPC resources.</p>
     */
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
