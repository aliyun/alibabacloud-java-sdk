// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetOutbounNumListRequest extends TeaModel {
    /**
     * <p>Agent account name (agent logon name).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123@****.com</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Unique ID of the customer request. Used for idempotency validation. You can generate it by using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Instance ID.</p>
     * <p>You can log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a> and view the instance ID in <strong>Instance Management</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetOutbounNumListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOutbounNumListRequest self = new GetOutbounNumListRequest();
        return TeaModel.build(map, self);
    }

    public GetOutbounNumListRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetOutbounNumListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetOutbounNumListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
