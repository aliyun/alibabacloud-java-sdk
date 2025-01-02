// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class RunCommandResponseBody extends TeaModel {
    /**
     * <p>ID of the command execution.</p>
     * 
     * <strong>example:</strong>
     * <p>t-7d2a745b412b4601b2d47f6a768d*</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2FE2B22C-CF9D-59DE-BF63-DC9B9B33A9D1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponseBody self = new RunCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCommandResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public RunCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
