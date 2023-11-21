// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteTrFirewallV2ResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTrFirewallV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrFirewallV2ResponseBody self = new DeleteTrFirewallV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTrFirewallV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
