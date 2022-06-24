// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisTaskDetailRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryPushAnalysisTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPushAnalysisTaskDetailRequest self = new QueryPushAnalysisTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryPushAnalysisTaskDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryPushAnalysisTaskDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryPushAnalysisTaskDetailRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
