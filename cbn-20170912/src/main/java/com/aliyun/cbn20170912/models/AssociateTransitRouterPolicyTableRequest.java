// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class AssociateTransitRouterPolicyTableRequest extends TeaModel {
    /**
     * <p>The ID of the network instance connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-2nalp6yksc805w****</p>
     */
    @NameInMap("AttachmentId")
    public String attachmentId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client. Make sure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the request. The dry run includes checks on permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request. The system performs the check and directly associates the policy route table if the check passes.</li>
     * <li><strong>true</strong>: sends a dry run request. The system only performs the check and does not associate the policy route table. Check items include whether required parameters are specified and the request format. If the check fails, an error is returned. If the check passes, the request ID is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the policy routing table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ptbl-abc123xyz</p>
     */
    @NameInMap("PolicyTableId")
    public String policyTableId;

    public static AssociateTransitRouterPolicyTableRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateTransitRouterPolicyTableRequest self = new AssociateTransitRouterPolicyTableRequest();
        return TeaModel.build(map, self);
    }

    public AssociateTransitRouterPolicyTableRequest setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }
    public String getAttachmentId() {
        return this.attachmentId;
    }

    public AssociateTransitRouterPolicyTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateTransitRouterPolicyTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateTransitRouterPolicyTableRequest setPolicyTableId(String policyTableId) {
        this.policyTableId = policyTableId;
        return this;
    }
    public String getPolicyTableId() {
        return this.policyTableId;
    }

}
