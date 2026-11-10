// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DisassociateTransitRouterPolicyTableRequest extends TeaModel {
    /**
     * <p>The ID of the association between the transit router policy table and the network instance connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pta-123asdfqwe</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
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
     * <p>Specifies whether to perform a dry run on the request. Checks include permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request. If the request passes the check, the transit router policy table association is removed.</li>
     * <li><strong>true</strong>: sends a dry run request. The system only performs the check and does not remove the transit router policy table association. The system checks whether required parameters are specified and whether the request format is valid. If the request fails the check, an error is returned. If the request passes the check, the corresponding request ID is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static DisassociateTransitRouterPolicyTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateTransitRouterPolicyTableRequest self = new DisassociateTransitRouterPolicyTableRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateTransitRouterPolicyTableRequest setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public DisassociateTransitRouterPolicyTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisassociateTransitRouterPolicyTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
