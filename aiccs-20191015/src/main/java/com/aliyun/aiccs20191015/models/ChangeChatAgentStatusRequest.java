// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ChangeChatAgentStatusRequest extends TeaModel {
    /**
     * <p>Agent account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Unique ID for the customer request. Used for idempotency validation. You can generate it using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The target online status to switch to. Currently, only <strong>requestLogout</strong> (request offline) is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>requestLogout</p>
     */
    @NameInMap("Method")
    public String method;

    public static ChangeChatAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeChatAgentStatusRequest self = new ChangeChatAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeChatAgentStatusRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ChangeChatAgentStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ChangeChatAgentStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeChatAgentStatusRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

}
