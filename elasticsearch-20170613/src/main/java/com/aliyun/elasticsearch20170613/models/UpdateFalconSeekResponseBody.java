// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateFalconSeekResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFalconSeekResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFalconSeekResponseBody self = new UpdateFalconSeekResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFalconSeekResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
