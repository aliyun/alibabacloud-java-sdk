// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoSyncTaskByRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SyncTaskId")
    public String syncTaskId;

    public static CreateRepoSyncTaskByRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoSyncTaskByRuleResponseBody self = new CreateRepoSyncTaskByRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRepoSyncTaskByRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRepoSyncTaskByRuleResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public CreateRepoSyncTaskByRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRepoSyncTaskByRuleResponseBody setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }
    public String getSyncTaskId() {
        return this.syncTaskId;
    }

}
