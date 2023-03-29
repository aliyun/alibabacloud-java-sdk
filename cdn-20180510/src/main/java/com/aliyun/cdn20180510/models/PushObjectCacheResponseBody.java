// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PushObjectCacheResponseBody extends TeaModel {
    /**
     * <p>The ID of the prefetch task. If multiple tasks are returned, the IDs are separated by commas (,). The task IDs are merged based on the following rules:</p>
     * <br>
     * <p>*   If the tasks are set for the same accelerated domain name, submitted within the same second, and prefetch content from URLs instead of directories, the tasks IDs are merged into the same task ID (RushTaskId).</p>
     * <p>*   If the number of tasks that are set for the same accelerated domain name, submitted within the same second, and prefetch content from URLs instead of directories exceeds 500, every 500 task IDs are merged into the same task ID (RushTaskId).</p>
     */
    @NameInMap("PushTaskId")
    public String pushTaskId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PushObjectCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushObjectCacheResponseBody self = new PushObjectCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public PushObjectCacheResponseBody setPushTaskId(String pushTaskId) {
        this.pushTaskId = pushTaskId;
        return this;
    }
    public String getPushTaskId() {
        return this.pushTaskId;
    }

    public PushObjectCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
