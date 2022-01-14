// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetScanResultDetailByIdRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetScanResultDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScanResultDetailByIdRequest self = new GetScanResultDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetScanResultDetailByIdRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetScanResultDetailByIdRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GetScanResultDetailByIdRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
