// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceDashboardReport extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1680861352600</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

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

    /**
     * <strong>example:</strong>
     * <p>1680861352600</p>
     */
    @NameInMap("lastSendTime")
    public Long lastSendTime;

    @NameInMap("msg")
    public String msg;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>******@aliyun.com</p>
     */
    @NameInMap("reportChannelTarget")
    public String reportChannelTarget;

    /**
     * <strong>example:</strong>
     * <p>Email</p>
     */
    @NameInMap("reportChannelType")
    public String reportChannelType;

    /**
     * <strong>example:</strong>
     * <p>Grid,Simple</p>
     */
    @NameInMap("reportStyle")
    public String reportStyle;

    /**
     * <strong>example:</strong>
     * <p>Image</p>
     */
    @NameInMap("reportType")
    public String reportType;

    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("triggerDay")
    public String triggerDay;

    /**
     * <strong>example:</strong>
     * <p>12:25</p>
     */
    @NameInMap("triggerTime")
    public String triggerTime;

    /**
     * <strong>example:</strong>
     * <p>ByWeek</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    /**
     * <strong>example:</strong>
     * <p>Dashboard URL</p>
     */
    @NameInMap("url")
    public String url;

    @NameInMap("userId")
    public String userId;

    public static GrafanaWorkspaceDashboardReport build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceDashboardReport self = new GrafanaWorkspaceDashboardReport();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceDashboardReport setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public GrafanaWorkspaceDashboardReport setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public GrafanaWorkspaceDashboardReport setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GrafanaWorkspaceDashboardReport setLastSendTime(Long lastSendTime) {
        this.lastSendTime = lastSendTime;
        return this;
    }
    public Long getLastSendTime() {
        return this.lastSendTime;
    }

    public GrafanaWorkspaceDashboardReport setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GrafanaWorkspaceDashboardReport setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GrafanaWorkspaceDashboardReport setReportChannelTarget(String reportChannelTarget) {
        this.reportChannelTarget = reportChannelTarget;
        return this;
    }
    public String getReportChannelTarget() {
        return this.reportChannelTarget;
    }

    public GrafanaWorkspaceDashboardReport setReportChannelType(String reportChannelType) {
        this.reportChannelType = reportChannelType;
        return this;
    }
    public String getReportChannelType() {
        return this.reportChannelType;
    }

    public GrafanaWorkspaceDashboardReport setReportStyle(String reportStyle) {
        this.reportStyle = reportStyle;
        return this;
    }
    public String getReportStyle() {
        return this.reportStyle;
    }

    public GrafanaWorkspaceDashboardReport setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public GrafanaWorkspaceDashboardReport setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GrafanaWorkspaceDashboardReport setTriggerDay(String triggerDay) {
        this.triggerDay = triggerDay;
        return this;
    }
    public String getTriggerDay() {
        return this.triggerDay;
    }

    public GrafanaWorkspaceDashboardReport setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }
    public String getTriggerTime() {
        return this.triggerTime;
    }

    public GrafanaWorkspaceDashboardReport setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public GrafanaWorkspaceDashboardReport setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GrafanaWorkspaceDashboardReport setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
