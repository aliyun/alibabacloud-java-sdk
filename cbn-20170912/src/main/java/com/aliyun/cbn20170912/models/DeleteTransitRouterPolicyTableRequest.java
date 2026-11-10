// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPolicyTableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>02fb3da4****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ptbl-abc123xyz</p>
     */
    @NameInMap("PolicyTableId")
    public String policyTableId;

    public static DeleteTransitRouterPolicyTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPolicyTableRequest self = new DeleteTransitRouterPolicyTableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPolicyTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteTransitRouterPolicyTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteTransitRouterPolicyTableRequest setPolicyTableId(String policyTableId) {
        this.policyTableId = policyTableId;
        return this;
    }
    public String getPolicyTableId() {
        return this.policyTableId;
    }

}
