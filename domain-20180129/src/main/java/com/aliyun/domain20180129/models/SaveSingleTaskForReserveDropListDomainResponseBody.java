// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForReserveDropListDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForReserveDropListDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForReserveDropListDomainResponseBody self = new SaveSingleTaskForReserveDropListDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForReserveDropListDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForReserveDropListDomainResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
