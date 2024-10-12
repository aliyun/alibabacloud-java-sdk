// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>run-1meoz7VJd2C6f****</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRunResponseBody self = new CreateRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public CreateRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
