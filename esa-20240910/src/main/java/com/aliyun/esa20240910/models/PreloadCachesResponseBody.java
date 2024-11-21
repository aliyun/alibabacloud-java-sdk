// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PreloadCachesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The prefetch task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16401427840</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static PreloadCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreloadCachesResponseBody self = new PreloadCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public PreloadCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreloadCachesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
