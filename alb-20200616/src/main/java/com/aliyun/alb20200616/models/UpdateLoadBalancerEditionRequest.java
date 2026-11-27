// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerEditionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client and make sure that the value is unique across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run and does not modify the application load balancing edition. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, the system returns an error. If the request passes the dry run, the system returns the <code>DryRunOperation</code> error code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. If the request passes the dry run, the system returns an <code>HTTP_2xx</code> status code and modifies the edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The edition of the application load balancing. Different editions have different feature limits and billing policy.</p>
     * <ul>
     * <li><p><strong>Basic</strong>: Basic Edition.</p>
     * </li>
     * <li><p><strong>Standard</strong>: Standard Edition.</p>
     * </li>
     * <li><p><strong>StandardWithWaf</strong>: WAF-enhanced Edition.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("LoadBalancerEdition")
    public String loadBalancerEdition;

    /**
     * <p>The application load balancing instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-bp1b6c719dfa08ex****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static UpdateLoadBalancerEditionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerEditionRequest self = new UpdateLoadBalancerEditionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerEditionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateLoadBalancerEditionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateLoadBalancerEditionRequest setLoadBalancerEdition(String loadBalancerEdition) {
        this.loadBalancerEdition = loadBalancerEdition;
        return this;
    }
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    public UpdateLoadBalancerEditionRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
