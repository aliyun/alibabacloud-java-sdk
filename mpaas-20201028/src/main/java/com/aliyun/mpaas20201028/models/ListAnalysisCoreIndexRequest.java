// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListAnalysisCoreIndexRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListAnalysisCoreIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnalysisCoreIndexRequest self = new ListAnalysisCoreIndexRequest();
        return TeaModel.build(map, self);
    }

    public ListAnalysisCoreIndexRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAnalysisCoreIndexRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ListAnalysisCoreIndexRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAnalysisCoreIndexRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListAnalysisCoreIndexRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListAnalysisCoreIndexRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListAnalysisCoreIndexRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListAnalysisCoreIndexRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListAnalysisCoreIndexRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
