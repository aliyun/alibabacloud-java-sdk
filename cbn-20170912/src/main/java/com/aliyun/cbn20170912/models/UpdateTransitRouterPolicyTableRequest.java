// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterPolicyTableRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-4266****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the policy route table.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run on the request, including checks on permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request. If the request passes the check, the policy route table is updated.</li>
     * <li><strong>true</strong>: sends a dry run request. Only the check is performed, and the policy route table is not updated. Check items include whether required parameters are specified and the request format. If the check fails, an error is returned. If the check passes, the request ID is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the policy route table.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The instance ID of the policy routing table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ptbl-abc123xyz</p>
     */
    @NameInMap("PolicyTableId")
    public String policyTableId;

    public static UpdateTransitRouterPolicyTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterPolicyTableRequest self = new UpdateTransitRouterPolicyTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterPolicyTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterPolicyTableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTransitRouterPolicyTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterPolicyTableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTransitRouterPolicyTableRequest setPolicyTableId(String policyTableId) {
        this.policyTableId = policyTableId;
        return this;
    }
    public String getPolicyTableId() {
        return this.policyTableId;
    }

}
