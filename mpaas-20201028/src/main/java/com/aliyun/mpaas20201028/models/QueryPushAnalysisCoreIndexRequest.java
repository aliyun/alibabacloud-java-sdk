// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisCoreIndexRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Channel")
    public String channel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Platform")
    public String platform;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryPushAnalysisCoreIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPushAnalysisCoreIndexRequest self = new QueryPushAnalysisCoreIndexRequest();
        return TeaModel.build(map, self);
    }

    public QueryPushAnalysisCoreIndexRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryPushAnalysisCoreIndexRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryPushAnalysisCoreIndexRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryPushAnalysisCoreIndexRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public QueryPushAnalysisCoreIndexRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryPushAnalysisCoreIndexRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryPushAnalysisCoreIndexRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryPushAnalysisCoreIndexRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
