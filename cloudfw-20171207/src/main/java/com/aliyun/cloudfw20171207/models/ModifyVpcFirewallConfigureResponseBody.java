// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallConfigureResponseBody extends TeaModel {
    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcFirewallConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallConfigureResponseBody self = new ModifyVpcFirewallConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallConfigureResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public ModifyVpcFirewallConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
