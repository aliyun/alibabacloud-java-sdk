// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForUpdateProhibitionLockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForUpdateProhibitionLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForUpdateProhibitionLockResponseBody self = new SaveBatchTaskForUpdateProhibitionLockResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForUpdateProhibitionLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForUpdateProhibitionLockResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
