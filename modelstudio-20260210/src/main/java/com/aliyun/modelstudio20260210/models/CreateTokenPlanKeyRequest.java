// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateTokenPlanKeyRequest extends TeaModel {
    /**
     * <p>The account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acc_123456789</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The account ID of the caller that identifies the initiator of this call.</p>
     * 
     * <strong>example:</strong>
     * <p>acc_123456789</p>
     */
    @NameInMap("CallerUacAccountId")
    public String callerUacAccountId;

    /**
     * <p>The description of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>APIKEY描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The product namespace ID. For the TokenPlan product, this field is fixed to namespace-1.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace-1</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws_123456789</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateTokenPlanKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenPlanKeyRequest self = new CreateTokenPlanKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreateTokenPlanKeyRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateTokenPlanKeyRequest setCallerUacAccountId(String callerUacAccountId) {
        this.callerUacAccountId = callerUacAccountId;
        return this;
    }
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    public CreateTokenPlanKeyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTokenPlanKeyRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateTokenPlanKeyRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
