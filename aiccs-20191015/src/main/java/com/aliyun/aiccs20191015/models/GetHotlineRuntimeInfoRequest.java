// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineRuntimeInfoRequest extends TeaModel {
    /**
     * <p>The agent account name. It is unique within the instance (logon name).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123@****.com</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The instance ID.  </p>
     * <p>You can log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a> and view the instance ID in <strong>Instance Management</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetHotlineRuntimeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineRuntimeInfoRequest self = new GetHotlineRuntimeInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineRuntimeInfoRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetHotlineRuntimeInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
