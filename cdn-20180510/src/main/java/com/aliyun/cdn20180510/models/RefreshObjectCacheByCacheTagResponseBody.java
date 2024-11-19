// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCacheByCacheTagResponseBody extends TeaModel {
    /**
     * <p>The ID of the refresh task. If multiple tasks are returned, the task IDs are separated by commas (,). The task IDs are merged based on the following rules:</p>
     * <ul>
     * <li>If the tasks are specified for the same accelerated domain name, submitted within the same second, and run to refresh content based on URLs instead of directories, the task IDs are merged into one task ID (RefreshTaskId).</li>
     * <li>If the number of tasks that are specified for the same accelerated domain name, submitted within the same second, and run to refresh content based on URLs instead of directories exceeds 2,000, every 2,000 task IDs are merged into one task ID (RefreshTaskId).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>17772470184</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2E5AD83F-BD7B-462E-8319-2E30E305519A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshObjectCacheByCacheTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshObjectCacheByCacheTagResponseBody self = new RefreshObjectCacheByCacheTagResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshObjectCacheByCacheTagResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshObjectCacheByCacheTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
