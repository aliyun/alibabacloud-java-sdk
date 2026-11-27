// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteLoadBalancerRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value from your client to ensure that the value is unique among different requests. The ClientToken parameter supports only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run on the request and does not delete the application load balancing instance. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a Normal request. If the request passes the dry run, the <code>HTTP 2xx</code> status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The application load balancing instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-o9ulmq5hgn68jk****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The type of resources that are of automatic creation and attach by application load balancing and need to be retained. When you release an Internet-facing application load balancing instance, you can configure the Settings to eip to retain the EIP that is of automatic creation and attach by application load balancing. Anycast EIPs are not supported for retention, and EIPs that users manually attach are automatically retained.</p>
     */
    @NameInMap("RetainResourceType")
    public java.util.List<String> retainResourceType;

    public static DeleteLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLoadBalancerRequest self = new DeleteLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteLoadBalancerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteLoadBalancerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DeleteLoadBalancerRequest setRetainResourceType(java.util.List<String> retainResourceType) {
        this.retainResourceType = retainResourceType;
        return this;
    }
    public java.util.List<String> getRetainResourceType() {
        return this.retainResourceType;
    }

}
