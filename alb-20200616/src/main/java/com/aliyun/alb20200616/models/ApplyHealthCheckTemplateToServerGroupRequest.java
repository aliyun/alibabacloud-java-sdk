// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ApplyHealthCheckTemplateToServerGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique across different requests and can be up to 64 ASCII characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Prechecks the request without creating the resource. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the health check template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hct-bp1qjwo61pqz3ahltv****</p>
     */
    @NameInMap("HealthCheckTemplateId")
    public String healthCheckTemplateId;

    /**
     * <p>The ID of the backend server group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-n80wyad08u0tox****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    public static ApplyHealthCheckTemplateToServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyHealthCheckTemplateToServerGroupRequest self = new ApplyHealthCheckTemplateToServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public ApplyHealthCheckTemplateToServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApplyHealthCheckTemplateToServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ApplyHealthCheckTemplateToServerGroupRequest setHealthCheckTemplateId(String healthCheckTemplateId) {
        this.healthCheckTemplateId = healthCheckTemplateId;
        return this;
    }
    public String getHealthCheckTemplateId() {
        return this.healthCheckTemplateId;
    }

    public ApplyHealthCheckTemplateToServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

}
