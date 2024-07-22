// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeletePipelinesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the pipeline is deleted. Valid values:</p>
     * <ul>
     * <li>true: The pipeline is deleted.</li>
     * <li>false: The pipeline fails to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
