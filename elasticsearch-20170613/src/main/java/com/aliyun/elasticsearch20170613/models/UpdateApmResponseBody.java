// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateApmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>18061926-CC50-5F9B-9600-034C29F1D5B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApmResponseBody self = new UpdateApmResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApmResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
