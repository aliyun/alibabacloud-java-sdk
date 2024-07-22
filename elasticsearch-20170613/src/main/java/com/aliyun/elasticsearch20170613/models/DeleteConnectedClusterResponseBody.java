// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteConnectedClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return results:</p>
     * <ul>
     * <li>true: remove the interworking instance successfully</li>
     * <li>false: remove the interworking instance failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteConnectedClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConnectedClusterResponseBody self = new DeleteConnectedClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConnectedClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteConnectedClusterResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
