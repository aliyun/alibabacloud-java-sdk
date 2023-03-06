// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class OpenHttpsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <br>
     * <p>*   true: open the HTTPS protocol successfully</p>
     * <p>*   false: open the HTTPS protocol failed</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static OpenHttpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenHttpsResponseBody self = new OpenHttpsResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenHttpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenHttpsResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
