// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallPreCheckResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2122</p>
     */
    @NameInMap("PreCheckId")
    public String preCheckId;

    /**
     * <strong>example:</strong>
     * <p>A426611F-04FA-5205-8D04-4F6DCF09****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNatFirewallPreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallPreCheckResponseBody self = new CreateNatFirewallPreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallPreCheckResponseBody setPreCheckId(String preCheckId) {
        this.preCheckId = preCheckId;
        return this;
    }
    public String getPreCheckId() {
        return this.preCheckId;
    }

    public CreateNatFirewallPreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
