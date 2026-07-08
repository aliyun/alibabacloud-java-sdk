// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class UpdateFlowResponseBody extends TeaModel {
    /**
     * <p>The data returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A053FC9D-AB9D-5258-9355-8FA57EE888C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowResponseBody self = new UpdateFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFlowResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
