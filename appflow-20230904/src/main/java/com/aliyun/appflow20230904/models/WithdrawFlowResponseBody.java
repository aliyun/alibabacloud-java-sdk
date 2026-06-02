// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class WithdrawFlowResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>39B608FB-906F-51CF-AD82-7EFE46C0D56A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static WithdrawFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WithdrawFlowResponseBody self = new WithdrawFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public WithdrawFlowResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public WithdrawFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
