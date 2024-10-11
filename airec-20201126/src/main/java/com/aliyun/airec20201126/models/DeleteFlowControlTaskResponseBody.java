// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteFlowControlTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6E427B10-30FC-1873-922F-FC176D3398D4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the task was deleted. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static DeleteFlowControlTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowControlTaskResponseBody self = new DeleteFlowControlTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowControlTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFlowControlTaskResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
