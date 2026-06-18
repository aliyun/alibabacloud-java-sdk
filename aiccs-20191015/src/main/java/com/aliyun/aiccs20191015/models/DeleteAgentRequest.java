// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteAgentRequest extends TeaModel {
    /**
     * <p>Agent account name, which is the phone number or mailbox specified during account registration. It is unique within the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Unique ID for the customer request. Used for idempotency validation. You can generate it using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>AICCS instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentRequest self = new DeleteAgentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DeleteAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteAgentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
