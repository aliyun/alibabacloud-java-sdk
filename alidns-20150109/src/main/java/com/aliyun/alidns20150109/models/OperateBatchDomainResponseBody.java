// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class OperateBatchDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static OperateBatchDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateBatchDomainResponseBody self = new OperateBatchDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateBatchDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateBatchDomainResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
