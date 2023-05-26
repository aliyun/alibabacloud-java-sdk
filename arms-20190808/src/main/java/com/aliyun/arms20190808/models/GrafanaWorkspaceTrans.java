// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceTrans extends TeaModel {
    @NameInMap("apiUrl")
    public String apiUrl;

    @NameInMap("authType")
    public String authType;

    @NameInMap("gmtCreate")
    public Float gmtCreate;

    @NameInMap("gmtModified")
    public Float gmtModified;

    @NameInMap("grafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("id")
    public Long id;

    @NameInMap("msg")
    public String msg;

    @NameInMap("processStatus")
    public String processStatus;

    @NameInMap("transDetails")
    public java.util.List<GrafanaWorkspaceTransDetail> transDetails;

    @NameInMap("userId")
    public String userId;

    public static GrafanaWorkspaceTrans build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceTrans self = new GrafanaWorkspaceTrans();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceTrans setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
        return this;
    }
    public String getApiUrl() {
        return this.apiUrl;
    }

    public GrafanaWorkspaceTrans setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public GrafanaWorkspaceTrans setGmtCreate(Float gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Float getGmtCreate() {
        return this.gmtCreate;
    }

    public GrafanaWorkspaceTrans setGmtModified(Float gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Float getGmtModified() {
        return this.gmtModified;
    }

    public GrafanaWorkspaceTrans setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GrafanaWorkspaceTrans setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceTrans setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GrafanaWorkspaceTrans setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public GrafanaWorkspaceTrans setTransDetails(java.util.List<GrafanaWorkspaceTransDetail> transDetails) {
        this.transDetails = transDetails;
        return this;
    }
    public java.util.List<GrafanaWorkspaceTransDetail> getTransDetails() {
        return this.transDetails;
    }

    public GrafanaWorkspaceTrans setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
