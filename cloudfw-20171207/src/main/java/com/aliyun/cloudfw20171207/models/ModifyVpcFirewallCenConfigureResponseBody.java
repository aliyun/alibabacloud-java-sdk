// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallCenConfigureResponseBody extends TeaModel {
    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcFirewallCenConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallCenConfigureResponseBody self = new ModifyVpcFirewallCenConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallCenConfigureResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public ModifyVpcFirewallCenConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
