// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RunPipelinesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result. Valid values:</p>
     * <br>
     * <p>*   true: successful</p>
     * <p>*   false: failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static RunPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunPipelinesResponseBody self = new RunPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public RunPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunPipelinesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
