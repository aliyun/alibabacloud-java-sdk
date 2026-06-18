// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartCallV2Request extends TeaModel {
    /**
     * <p>Agent account name (agent logon name).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123@123.com">123@123.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Callee number for hotline outbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>136****1111</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>Caller number for hotline outbound calls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9065****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>Call type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Inbound</li>
     * <li><strong>2</strong>: Outbound</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CallerType")
    public Integer callerType;

    /**
     * <p>Unique customer request ID. Used for idempotency validation. You can generate it using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>AICCS instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static StartCallV2Request build(java.util.Map<String, ?> map) throws Exception {
        StartCallV2Request self = new StartCallV2Request();
        return TeaModel.build(map, self);
    }

    public StartCallV2Request setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StartCallV2Request setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartCallV2Request setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartCallV2Request setCallerType(Integer callerType) {
        this.callerType = callerType;
        return this;
    }
    public Integer getCallerType() {
        return this.callerType;
    }

    public StartCallV2Request setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartCallV2Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
