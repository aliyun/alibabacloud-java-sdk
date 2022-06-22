// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDeleteMonitorDashboardItemsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DashboardItemIds")
    public String dashboardItemIds;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelDeleteMonitorDashboardItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelDeleteMonitorDashboardItemsRequest self = new SentinelDeleteMonitorDashboardItemsRequest();
        return TeaModel.build(map, self);
    }

    public SentinelDeleteMonitorDashboardItemsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelDeleteMonitorDashboardItemsRequest setDashboardItemIds(String dashboardItemIds) {
        this.dashboardItemIds = dashboardItemIds;
        return this;
    }
    public String getDashboardItemIds() {
        return this.dashboardItemIds;
    }

    public SentinelDeleteMonitorDashboardItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelDeleteMonitorDashboardItemsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
