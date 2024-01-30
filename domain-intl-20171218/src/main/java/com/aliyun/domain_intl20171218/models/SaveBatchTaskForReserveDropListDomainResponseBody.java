// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForReserveDropListDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForReserveDropListDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForReserveDropListDomainResponseBody self = new SaveBatchTaskForReserveDropListDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForReserveDropListDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForReserveDropListDomainResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
