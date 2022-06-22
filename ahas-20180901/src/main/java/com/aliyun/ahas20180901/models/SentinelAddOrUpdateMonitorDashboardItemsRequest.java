// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAddOrUpdateMonitorDashboardItemsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DashboardItems")
    public String dashboardItems;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelAddOrUpdateMonitorDashboardItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelAddOrUpdateMonitorDashboardItemsRequest self = new SentinelAddOrUpdateMonitorDashboardItemsRequest();
        return TeaModel.build(map, self);
    }

    public SentinelAddOrUpdateMonitorDashboardItemsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelAddOrUpdateMonitorDashboardItemsRequest setDashboardItems(String dashboardItems) {
        this.dashboardItems = dashboardItems;
        return this;
    }
    public String getDashboardItems() {
        return this.dashboardItems;
    }

    public SentinelAddOrUpdateMonitorDashboardItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelAddOrUpdateMonitorDashboardItemsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
