// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceMoveProcess extends TeaModel {
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    @NameInMap("gmtModified")
    public Long gmtModified;

    @NameInMap("grafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("id")
    public Long id;

    @NameInMap("msg")
    public String msg;

    @NameInMap("processName")
    public String processName;

    @NameInMap("processStatus")
    public String processStatus;

    @NameInMap("subType")
    public String subType;

    @NameInMap("userId")
    public String userId;

    public static GrafanaWorkspaceMoveProcess build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceMoveProcess self = new GrafanaWorkspaceMoveProcess();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceMoveProcess setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public GrafanaWorkspaceMoveProcess setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public GrafanaWorkspaceMoveProcess setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GrafanaWorkspaceMoveProcess setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceMoveProcess setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GrafanaWorkspaceMoveProcess setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public GrafanaWorkspaceMoveProcess setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public GrafanaWorkspaceMoveProcess setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public GrafanaWorkspaceMoveProcess setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
