// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainNameCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveTaskForSubmittingDomainNameCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainNameCredentialResponseBody self = new SaveTaskForSubmittingDomainNameCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainNameCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTaskForSubmittingDomainNameCredentialResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
