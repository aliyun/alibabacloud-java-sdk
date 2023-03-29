// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCachesResponseBody extends TeaModel {
    /**
     * <p>The ID of the refresh task. If multiple tasks are returned, the IDs are separated by commas (,). The task IDs are merged based on the following rules:</p>
     * <br>
     * <p>*   If the tasks are specified for the same accelerated domain name, submitted within the same second, and run to refresh content based on URLs instead of directories, the task IDs are merged into one task ID.</p>
     * <p>*   If the number of tasks that are specified for the same accelerated domain name, submitted within the same second, and run to refresh content based on URLs instead of directories exceeds 2,000, every 2,000 task IDs are merged into one task ID.</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshObjectCachesResponseBody self = new RefreshObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshObjectCachesResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
