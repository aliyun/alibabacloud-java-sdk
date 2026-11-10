// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPolicyBasedRouteRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must ensure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
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
     * <p>Specifies whether to perform a dry run on the deletion request. The dry run includes permission and instance status checks. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request. After the request passes the dry run, the policy-based route is deleted.</li>
     * <li><strong>true</strong>: sends a dry run request. The system only performs the dry run and does not delete the policy-based route. The system checks whether required parameters are specified and whether the request format is valid. If the request fails the dry run, the system returns an error. If the request passes the dry run, the system returns the <code>DryRunOperation</code> error code.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the policy-based routing rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pbr-123abczcx</p>
     */
    @NameInMap("PolicyBasedRouteId")
    public String policyBasedRouteId;

    public static DeleteTransitRouterPolicyBasedRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPolicyBasedRouteRequest self = new DeleteTransitRouterPolicyBasedRouteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPolicyBasedRouteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteTransitRouterPolicyBasedRouteRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteTransitRouterPolicyBasedRouteRequest setPolicyBasedRouteId(String policyBasedRouteId) {
        this.policyBasedRouteId = policyBasedRouteId;
        return this;
    }
    public String getPolicyBasedRouteId() {
        return this.policyBasedRouteId;
    }

}
