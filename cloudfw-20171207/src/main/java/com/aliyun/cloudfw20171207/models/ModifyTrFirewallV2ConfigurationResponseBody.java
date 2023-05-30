// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyTrFirewallV2ConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTrFirewallV2ConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrFirewallV2ConfigurationResponseBody self = new ModifyTrFirewallV2ConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTrFirewallV2ConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
