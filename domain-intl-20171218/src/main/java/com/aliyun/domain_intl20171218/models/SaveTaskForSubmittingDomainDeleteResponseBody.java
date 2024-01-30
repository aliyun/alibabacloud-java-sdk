// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainDeleteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveTaskForSubmittingDomainDeleteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainDeleteResponseBody self = new SaveTaskForSubmittingDomainDeleteResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainDeleteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTaskForSubmittingDomainDeleteResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
