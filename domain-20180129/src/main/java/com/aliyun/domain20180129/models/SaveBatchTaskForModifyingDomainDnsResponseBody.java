// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForModifyingDomainDnsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6A862A8A-E7AB-4C4E-8946-A74122D9CC4B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>35fb2fb7-d4d6-4478-9408-22cb63696b86</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveBatchTaskForModifyingDomainDnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForModifyingDomainDnsResponseBody self = new SaveBatchTaskForModifyingDomainDnsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForModifyingDomainDnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveBatchTaskForModifyingDomainDnsResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
