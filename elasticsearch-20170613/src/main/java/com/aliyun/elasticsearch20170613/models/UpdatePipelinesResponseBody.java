// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePipelinesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the pipeline is updated. Valid values:</p>
     * <ul>
     * <li>true: The pipeline is updated.</li>
     * <li>false: The pipeline fails to be updated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static UpdatePipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelinesResponseBody self = new UpdatePipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePipelinesResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
