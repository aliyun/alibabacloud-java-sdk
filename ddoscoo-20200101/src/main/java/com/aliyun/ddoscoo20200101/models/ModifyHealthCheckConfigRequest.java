// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckConfigRequest extends TeaModel {
    /**
     * <p>The forwarding protocol. Valid values:</p>
     * <br>
     * <p>*   **tcp**</p>
     * <p>*   **udp**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    /**
     * <p>The forwarding port.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FrontendPort")
    public Integer frontendPort;

    /**
     * <p>The details of the health check configuration. This parameter is a JSON string. The string contains the following fields:</p>
     * <br>
     * <p>*   **Type**: the protocol type. This field is required and must be of the STRING type. Valid values: **tcp** (Layer 4) and **http** (Layer 7).</p>
     * <br>
     * <p>*   **Domain**: the domain name, which must be of the STRING type.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**This parameter is returned only when the Layer 7 health check configuration is queried.</p>
     * <br>
     * <p>*   **Uri**: the check path, which must be of the STRING type.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**This parameter is returned only when the Layer 7 health check configuration is queried.</p>
     * <br>
     * <p>*   **Timeout**: the response timeout period, which must be of the INTEGER type. Valid values: **1** to **30**. Unit: seconds.</p>
     * <br>
     * <p>*   **Port**: the port on which you want to perform the health check, which must be of the INTEGER type.</p>
     * <br>
     * <p>*   **Interval**: the health check interval, which must be of the INTEGER type. Valid values: **1** to **30**. Unit: seconds.</p>
     * <br>
     * <p>*   **Up**: the number of consecutive successful health checks that must occur before declaring a port healthy, which must be of the INTEGER type. Valid values: **1** to **10**.</p>
     * <br>
     * <p>*   **Down**: the number of consecutive failed health checks that must occur before declaring a port unhealthy, which must be of the INTEGER type. Valid values: **1** to **10**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("HealthCheck")
    public String healthCheck;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyHealthCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckConfigRequest self = new ModifyHealthCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckConfigRequest setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public ModifyHealthCheckConfigRequest setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public ModifyHealthCheckConfigRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public ModifyHealthCheckConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
