// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value on your client. Make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: sends a check request without modifying the property of the application load balancing instance. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the check, an <code>HTTP_2xx</code> status code is returned and the operation is directly performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the application load balancing instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hgn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the Application Load Balancer instance. The name must be 2 to 128 characters in length and start with a letter, Chinese character, or digit. It can contain digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-instance-test</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The modification protection configuration.</p>
     */
    @NameInMap("ModificationProtectionConfig")
    public UpdateLoadBalancerAttributeRequestModificationProtectionConfig modificationProtectionConfig;

    public static UpdateLoadBalancerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAttributeRequest self = new UpdateLoadBalancerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerAttributeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public UpdateLoadBalancerAttributeRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public UpdateLoadBalancerAttributeRequest setModificationProtectionConfig(UpdateLoadBalancerAttributeRequestModificationProtectionConfig modificationProtectionConfig) {
        this.modificationProtectionConfig = modificationProtectionConfig;
        return this;
    }
    public UpdateLoadBalancerAttributeRequestModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    public static class UpdateLoadBalancerAttributeRequestModificationProtectionConfig extends TeaModel {
        /**
         * <p>The reason for enabling modification protection. The value must be 2 to 128 characters in length. It must start with a letter or Chinese character and can contain digits, periods (.), underscores (_), and hyphens (-). This parameter is valid only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed Instance</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The modification protection status of the application load balancing instance. Valid values:</p>
         * <ul>
         * <li><p><strong>NonProtection</strong>: disables modification protection. If <strong>Reason</strong> is specified, it is forcibly cleared.</p>
         * </li>
         * <li><p><strong>ConsoleProtection</strong>: enables console modification protection. If <strong>Reason</strong> is specified, it takes effect.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is set to <strong>ConsoleProtection</strong>, modification protection is enabled. In this case, you cannot modify the instance configurations in the load balancing console, but you can invoke API operations to modify the instance configurations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateLoadBalancerAttributeRequestModificationProtectionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoadBalancerAttributeRequestModificationProtectionConfig self = new UpdateLoadBalancerAttributeRequestModificationProtectionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateLoadBalancerAttributeRequestModificationProtectionConfig setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public UpdateLoadBalancerAttributeRequestModificationProtectionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
