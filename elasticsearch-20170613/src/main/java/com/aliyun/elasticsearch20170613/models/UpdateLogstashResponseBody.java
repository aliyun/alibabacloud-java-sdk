// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the instance information is modified. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdateLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashResponseBody self = new UpdateLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLogstashResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
