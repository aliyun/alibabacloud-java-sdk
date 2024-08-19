// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class PutEnableAllFwSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PutEnableAllFwSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEnableAllFwSwitchResponseBody self = new PutEnableAllFwSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEnableAllFwSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
