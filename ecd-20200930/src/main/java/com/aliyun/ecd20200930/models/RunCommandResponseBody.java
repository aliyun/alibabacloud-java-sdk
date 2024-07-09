// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandResponseBody extends TeaModel {
    /**
     * <p>The ID of the command execution.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz01qgsqj2n****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
