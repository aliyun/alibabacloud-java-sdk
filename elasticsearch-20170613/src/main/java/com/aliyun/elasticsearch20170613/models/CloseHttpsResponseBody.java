// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CloseHttpsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: HTTPS protocol closed successfully</p>
     * <p>*   false: HTTPS protocol closed failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CloseHttpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseHttpsResponseBody self = new CloseHttpsResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseHttpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseHttpsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
