// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForModifyingDomainDnsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveTaskForModifyingDomainDnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForModifyingDomainDnsResponseBody self = new SaveTaskForModifyingDomainDnsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskForModifyingDomainDnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTaskForModifyingDomainDnsResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
