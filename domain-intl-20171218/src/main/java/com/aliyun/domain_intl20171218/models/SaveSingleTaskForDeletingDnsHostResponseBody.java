// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDeletingDnsHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForDeletingDnsHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDeletingDnsHostResponseBody self = new SaveSingleTaskForDeletingDnsHostResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDeletingDnsHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForDeletingDnsHostResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
