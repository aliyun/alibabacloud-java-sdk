// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class RunWorkflowResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RunWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunWorkflowResponseBody self = new RunWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public RunWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
