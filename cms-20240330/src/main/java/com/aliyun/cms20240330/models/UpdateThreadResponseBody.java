// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateThreadResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>thread_id01</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <strong>example:</strong>
     * <p>0.1.0</p>
     */
    @NameInMap("version")
    public Long version;

    public static UpdateThreadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateThreadResponseBody self = new UpdateThreadResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateThreadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateThreadResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public UpdateThreadResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
