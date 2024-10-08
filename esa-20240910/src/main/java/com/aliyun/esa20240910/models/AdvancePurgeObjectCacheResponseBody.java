// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class AdvancePurgeObjectCacheResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static AdvancePurgeObjectCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdvancePurgeObjectCacheResponseBody self = new AdvancePurgeObjectCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public AdvancePurgeObjectCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AdvancePurgeObjectCacheResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
