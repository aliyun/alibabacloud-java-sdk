// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeRequest extends TeaModel {
    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. Make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <p>Generate a value from your client and make sure that the value is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
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
     * <li><p><strong>true</strong>: Performs a dry run. The system checks for required parameters, the request format, and business limits. If the request fails the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned. No properties of the Application Load Balancer instance are modified.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request. After the request passes the check, a <code>2xx</code> status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The Application Load Balancer instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hgn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the Application Load Balancer instance must be 2 to 128 characters in length. It must start with a letter, a Chinese character, or a number. The name can contain numbers, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-instance-test</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The modification protection settings.</p>
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
         * <p>The reason for enabling modification protection.</p>
         * <p>The reason must be 2 to 128 characters long. It must start with a letter and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is valid only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed Instance</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The modification protection status of the Application Load Balancer instance. Valid values:</p>
         * <ul>
         * <li><p><strong>NonProtection</strong>: Disables modification protection. If you specify a value for <strong>Reason</strong>, the value is cleared.</p>
         * </li>
         * <li><p><strong>ConsoleProtection</strong>: Enables modification protection in the console. If you specify a value for <strong>Reason</strong>, the value takes effect.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you set the value to <strong>ConsoleProtection</strong>, you cannot modify the instance configuration in the Application Load Balancer console. However, you can still modify the instance configuration by calling API operations.</p>
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
