// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForUpdatingContactByTempateIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveTaskForUpdatingContactByTempateIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForUpdatingContactByTempateIdResponseBody self = new SaveTaskForUpdatingContactByTempateIdResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTaskForUpdatingContactByTempateIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTaskForUpdatingContactByTempateIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveTaskForUpdatingContactByTempateIdResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
