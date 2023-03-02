// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunTriggerNodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RunTriggerNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunTriggerNodeResponseBody self = new RunTriggerNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RunTriggerNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunTriggerNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
