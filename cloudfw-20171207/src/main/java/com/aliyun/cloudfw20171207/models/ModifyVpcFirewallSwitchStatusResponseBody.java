// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallSwitchStatusResponseBody extends TeaModel {
    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcFirewallSwitchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallSwitchStatusResponseBody self = new ModifyVpcFirewallSwitchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallSwitchStatusResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public ModifyVpcFirewallSwitchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
