// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallDefaultIPSConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVpcFirewallDefaultIPSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcFirewallDefaultIPSConfigResponseBody self = new ModifyVpcFirewallDefaultIPSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVpcFirewallDefaultIPSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
