// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDeleteMonitorDashboardRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DashboardId")
    public Long dashboardId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelDeleteMonitorDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelDeleteMonitorDashboardRequest self = new SentinelDeleteMonitorDashboardRequest();
        return TeaModel.build(map, self);
    }

    public SentinelDeleteMonitorDashboardRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelDeleteMonitorDashboardRequest setDashboardId(Long dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }
    public Long getDashboardId() {
        return this.dashboardId;
    }

    public SentinelDeleteMonitorDashboardRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelDeleteMonitorDashboardRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
