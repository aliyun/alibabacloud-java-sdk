// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopPipelinesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result. Valid values:</p>
     * <br>
     * <p>*   true: The pipelines are stopped.</p>
     * <p>*   false: The pipelines fail to be stopped.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static StopPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopPipelinesResponseBody self = new StopPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopPipelinesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
