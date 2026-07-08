// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class LaunchFlowResponseBody extends TeaModel {
    /**
     * <p>The returned object.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>965C0149-B68B-5A0C-AEA8-48DAEC7779BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LaunchFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LaunchFlowResponseBody self = new LaunchFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public LaunchFlowResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public LaunchFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
