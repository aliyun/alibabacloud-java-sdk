// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunClusterCheckResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster check task.</p>
     */
    @NameInMap("check_id")
    public String checkId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static RunClusterCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunClusterCheckResponseBody self = new RunClusterCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public RunClusterCheckResponseBody setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public RunClusterCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
