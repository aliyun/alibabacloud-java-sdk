// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAuthModeResponseBody extends TeaModel {
    /**
     * <p>Specifies whether to enable authentication to allow access within a VPC. Valid values:</p>
     * <br>
     * <p>*   **Open**: enables password-free access.</p>
     * <p>*   **Close**: disables password-free access.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceVpcAuthModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAuthModeResponseBody self = new ModifyInstanceVpcAuthModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAuthModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
