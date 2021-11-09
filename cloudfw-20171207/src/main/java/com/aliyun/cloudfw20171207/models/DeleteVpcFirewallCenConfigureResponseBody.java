// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteVpcFirewallCenConfigureResponseBody extends TeaModel {
    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpcFirewallCenConfigureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcFirewallCenConfigureResponseBody self = new DeleteVpcFirewallCenConfigureResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpcFirewallCenConfigureResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DeleteVpcFirewallCenConfigureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
