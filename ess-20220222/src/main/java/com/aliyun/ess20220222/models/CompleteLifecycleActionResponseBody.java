// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CompleteLifecycleActionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CompleteLifecycleActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompleteLifecycleActionResponseBody self = new CompleteLifecycleActionResponseBody();
        return TeaModel.build(map, self);
    }

    public CompleteLifecycleActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
