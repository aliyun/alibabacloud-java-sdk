// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartCallRequest extends TeaModel {
    /**
     * <p>Agent account name, which is the phone number or mailbox entered during account registration. It is unique within the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Callee number for the hotline outbound call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1360987****</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>Caller number for the hotline outbound call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>906****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>Unique customer request ID. Used for idempotency validation. You can generate it using a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCallRequest self = new StartCallRequest();
        return TeaModel.build(map, self);
    }

    public StartCallRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StartCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartCallRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
