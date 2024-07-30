// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationProvisioningResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableApplicationProvisioningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationProvisioningResponseBody self = new EnableApplicationProvisioningResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableApplicationProvisioningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
