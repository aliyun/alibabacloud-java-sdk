// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyVpcFirewallDefaultIPSConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3B51B5BF-3C26-5009-ADAB-190E58DE4D6E</p>
     */
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
