// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SwitchSecurityProxyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F1E55690-3ABA-58FA-90E3-593EF05B73ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchSecurityProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchSecurityProxyResponseBody self = new SwitchSecurityProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchSecurityProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
