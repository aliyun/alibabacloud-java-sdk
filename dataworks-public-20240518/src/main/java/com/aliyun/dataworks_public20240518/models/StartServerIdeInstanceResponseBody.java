// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StartServerIdeInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the personal development environment instance.</p>
     * 
     * <strong>example:</strong>
     * <p>699573</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartServerIdeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartServerIdeInstanceResponseBody self = new StartServerIdeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartServerIdeInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartServerIdeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
