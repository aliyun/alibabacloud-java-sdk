// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: performs a dry run and sends the request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed. This is the default value.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the ALB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The name of the ALB instance. The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The configuration read-only mode.</p>
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
         * <p>It must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
         * <br>
         * <p>This parameter takes effect only when **ModificationProtectionStatus** is set to **ConsoleProtection**.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The status of the configuration read-only mode. Valid values:</p>
         * <br>
         * <p>*   **NonProtection**: disables the configuration read-only mode. In this case, you cannot specify **ModificationProtectionReason**. If you specify **ModificationProtectionReason**, the value of the parameter is cleared.</p>
         * <p>*   **ConsoleProtection**: enables the configuration read-only mode. In this case, you can specify **ModificationProtectionReason**.</p>
         * <br>
         * <p>> If you set this parameter to **ConsoleProtection**, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
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
