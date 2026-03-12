// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingContactByTemplateIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveTaskForUpdatingContactByTemplateIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingContactByTemplateIdResponseBody self = new SaveTaskForUpdatingContactByTemplateIdResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingContactByTemplateIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTaskForUpdatingContactByTemplateIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveTaskForUpdatingContactByTemplateIdResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
