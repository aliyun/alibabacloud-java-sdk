// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceOperateLog extends TeaModel {
    @NameInMap("date")
    public Float date;

    @NameInMap("detail")
    public String detail;

    @NameInMap("grafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("id")
    public Long id;

    @NameInMap("operatorId")
    public String operatorId;

    public static GrafanaWorkspaceOperateLog build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceOperateLog self = new GrafanaWorkspaceOperateLog();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceOperateLog setDate(Float date) {
        this.date = date;
        return this;
    }
    public Float getDate() {
        return this.date;
    }

    public GrafanaWorkspaceOperateLog setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public GrafanaWorkspaceOperateLog setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GrafanaWorkspaceOperateLog setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceOperateLog setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
