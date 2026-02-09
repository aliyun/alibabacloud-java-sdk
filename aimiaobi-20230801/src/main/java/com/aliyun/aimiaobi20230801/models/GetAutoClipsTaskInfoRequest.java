// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetAutoClipsTaskInfoRequest extends TeaModel {
    @NameInMap("ShowAnalysisResults")
    public Boolean showAnalysisResults;

    @NameInMap("ShowResourceInfo")
    public Boolean showResourceInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0dbf1055f8a2475d99904c3b76a0ffba</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetAutoClipsTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoClipsTaskInfoRequest self = new GetAutoClipsTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoClipsTaskInfoRequest setShowAnalysisResults(Boolean showAnalysisResults) {
        this.showAnalysisResults = showAnalysisResults;
        return this;
    }
    public Boolean getShowAnalysisResults() {
        return this.showAnalysisResults;
    }

    public GetAutoClipsTaskInfoRequest setShowResourceInfo(Boolean showResourceInfo) {
        this.showResourceInfo = showResourceInfo;
        return this;
    }
    public Boolean getShowResourceInfo() {
        return this.showResourceInfo;
    }

    public GetAutoClipsTaskInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAutoClipsTaskInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
