// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class TransferDomainResponseBody extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("RequestId")
    public String requestId;

    public static TransferDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferDomainResponseBody self = new TransferDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferDomainResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public TransferDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
