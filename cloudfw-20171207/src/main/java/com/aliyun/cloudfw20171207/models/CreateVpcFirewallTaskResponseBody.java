// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ips_server</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <strong>example:</strong>
     * <p>53252B14-BF7C-5A2D-9750-56F827EB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVpcFirewallTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallTaskResponseBody self = new CreateVpcFirewallTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallTaskResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public CreateVpcFirewallTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
