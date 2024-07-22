// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopCollectorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static StopCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopCollectorResponseBody self = new StopCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public StopCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopCollectorResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
