// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallSyncTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3E048D45-A563-5F81-9D97-536B4A84****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNatFirewallSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallSyncTaskResponseBody self = new CreateNatFirewallSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
