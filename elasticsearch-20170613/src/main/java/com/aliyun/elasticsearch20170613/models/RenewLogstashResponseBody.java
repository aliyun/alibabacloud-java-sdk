// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RenewLogstashResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result. Valid values:</p>
     * <br>
     * <p>*   true: The cluster is renewed.</p>
     * <p>*   false: The cluster fails to be renewed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static RenewLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewLogstashResponseBody self = new RenewLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RenewLogstashResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
