// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForAddingDSRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForAddingDSRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForAddingDSRecordResponseBody self = new SaveSingleTaskForAddingDSRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForAddingDSRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForAddingDSRecordResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
