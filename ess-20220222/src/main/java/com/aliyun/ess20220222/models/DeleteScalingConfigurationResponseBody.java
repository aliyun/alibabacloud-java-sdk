// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DeleteScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. The request ID is returned regardless of whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteScalingConfigurationResponseBody self = new DeleteScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
