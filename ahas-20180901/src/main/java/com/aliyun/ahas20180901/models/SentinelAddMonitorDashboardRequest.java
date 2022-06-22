// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAddMonitorDashboardRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DashboardName")
    public String dashboardName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelAddMonitorDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelAddMonitorDashboardRequest self = new SentinelAddMonitorDashboardRequest();
        return TeaModel.build(map, self);
    }

    public SentinelAddMonitorDashboardRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelAddMonitorDashboardRequest setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }
    public String getDashboardName() {
        return this.dashboardName;
    }

    public SentinelAddMonitorDashboardRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelAddMonitorDashboardRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
