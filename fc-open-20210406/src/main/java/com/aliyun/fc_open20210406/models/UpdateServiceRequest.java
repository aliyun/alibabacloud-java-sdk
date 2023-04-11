// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateServiceRequest extends TeaModel {
    /**
     * <p>The description of the service.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to allow functions to access the Internet. Valid values:</p>
     * <br>
     * <p>*   **true**: allows functions in the specified service to access the Internet.</p>
     * <p>*   **false**: does not allow functions to access the Internet.</p>
     */
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    /**
     * <p>The log configuration. Function Compute writes function execution logs to the specified Logstore.</p>
     */
    @NameInMap("logConfig")
    public LogConfig logConfig;

    /**
     * <p>The configurations of the NAS file system. The configurations allow functions to access the specified NAS resources.</p>
     */
    @NameInMap("nasConfig")
    public NASConfig nasConfig;

    /**
     * <p>The OSS mount configurations.</p>
     */
    @NameInMap("ossMountConfig")
    public OSSMountConfig ossMountConfig;

    /**
     * <p>The RAM role that is used to grant required permissions to Function Compute. The RAM role is used in the following scenarios:</p>
     * <br>
     * <p>*   Sends function execution logs to your Logstore.</p>
     * <p>*   Generates a token for a function to access other cloud resources during function execution.</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The configurations of Tracing Analysis. After you configure Tracing Analysis for a service in Function Compute, you can record the execution duration of a request, view the amount of cold start time for a function, and record the execution duration of a function. For more information, see [Overview](~~189804~~).</p>
     */
    @NameInMap("tracingConfig")
    public TracingConfig tracingConfig;

    /**
     * <p>The virtual private cloud (VPC) configuration, which allows functions in the specified service in Function Compute to access the specified VPC.</p>
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
