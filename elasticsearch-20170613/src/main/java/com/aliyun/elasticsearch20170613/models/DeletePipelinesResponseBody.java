// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeletePipelinesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the pipeline is deleted. Valid values:</p>
     * <br>
     * <p>*   true: The pipeline is deleted.</p>
     * <p>*   false: The pipeline fails to be deleted.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeletePipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelinesResponseBody self = new DeletePipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePipelinesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
