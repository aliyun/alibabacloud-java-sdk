// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallCenSwitchStatusResponseBody extends TeaModel {
    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcFirewallCenSwitchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallCenSwitchStatusResponseBody self = new ModifyVpcFirewallCenSwitchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallCenSwitchStatusResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public ModifyVpcFirewallCenSwitchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
