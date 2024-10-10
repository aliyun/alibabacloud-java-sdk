// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class StartInstanceRefreshResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ir-a12ds234fasd*****</p>
     */
    @NameInMap("InstanceRefreshTaskId")
    public String instanceRefreshTaskId;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartInstanceRefreshResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRefreshResponseBody self = new StartInstanceRefreshResponseBody();
        return TeaModel.build(map, self);
    }

    public StartInstanceRefreshResponseBody setInstanceRefreshTaskId(String instanceRefreshTaskId) {
        this.instanceRefreshTaskId = instanceRefreshTaskId;
        return this;
    }
    public String getInstanceRefreshTaskId() {
        return this.instanceRefreshTaskId;
    }

    public StartInstanceRefreshResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
