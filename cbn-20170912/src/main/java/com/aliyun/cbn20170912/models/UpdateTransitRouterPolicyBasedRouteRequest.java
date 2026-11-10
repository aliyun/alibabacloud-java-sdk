// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPolicyBasedRouteRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the policy-based routing rule.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Performs only a dry run and does not update the policy-based routing rule. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): Performs a dry run and updates the policy-based routing rule if the request passes the dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the policy-based routing rule.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The instance ID of the policy-based routing rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pbr-123abczcx</p>
     */
    @NameInMap("PolicyBasedRouteId")
    public String policyBasedRouteId;

    public static UpdateTransitRouterPolicyBasedRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterPolicyBasedRouteRequest self = new UpdateTransitRouterPolicyBasedRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterPolicyBasedRouteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterPolicyBasedRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTransitRouterPolicyBasedRouteRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterPolicyBasedRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTransitRouterPolicyBasedRouteRequest setPolicyBasedRouteId(String policyBasedRouteId) {
        this.policyBasedRouteId = policyBasedRouteId;
        return this;
    }
    public String getPolicyBasedRouteId() {
        return this.policyBasedRouteId;
    }

}
