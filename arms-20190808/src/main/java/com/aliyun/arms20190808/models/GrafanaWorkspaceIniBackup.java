// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceIniBackup extends TeaModel {
    @NameInMap("ext")
    public String ext;

    /**
     * <strong>example:</strong>
     * <p>1680861352600</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>1680861352600</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <strong>example:</strong>
     * <p>grafana-cn-**********</p>
     */
    @NameInMap("grafanaWorkspaceId")
    public String grafanaWorkspaceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    @NameInMap("msg")
    public String msg;

    @NameInMap("processName")
    public String processName;

    @NameInMap("processStatus")
    public String processStatus;

    /**
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("subType")
    public String subType;

    @NameInMap("userId")
    public String userId;

    public static GrafanaWorkspaceIniBackup build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceIniBackup self = new GrafanaWorkspaceIniBackup();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceIniBackup setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public GrafanaWorkspaceIniBackup setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public GrafanaWorkspaceIniBackup setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public GrafanaWorkspaceIniBackup setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GrafanaWorkspaceIniBackup setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceIniBackup setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GrafanaWorkspaceIniBackup setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public GrafanaWorkspaceIniBackup setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public GrafanaWorkspaceIniBackup setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public GrafanaWorkspaceIniBackup setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
