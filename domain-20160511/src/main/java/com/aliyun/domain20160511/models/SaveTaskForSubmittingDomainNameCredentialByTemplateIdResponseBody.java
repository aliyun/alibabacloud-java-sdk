// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody self = new SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
