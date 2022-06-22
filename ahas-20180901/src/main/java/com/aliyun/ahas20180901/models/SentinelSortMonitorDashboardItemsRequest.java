// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelSortMonitorDashboardItemsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DashboardId")
    public Long dashboardId;

    @NameInMap("ItemPosition")
    public String itemPosition;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelSortMonitorDashboardItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelSortMonitorDashboardItemsRequest self = new SentinelSortMonitorDashboardItemsRequest();
        return TeaModel.build(map, self);
    }

    public SentinelSortMonitorDashboardItemsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelSortMonitorDashboardItemsRequest setDashboardId(Long dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }
    public Long getDashboardId() {
        return this.dashboardId;
    }

    public SentinelSortMonitorDashboardItemsRequest setItemPosition(String itemPosition) {
        this.itemPosition = itemPosition;
        return this;
    }
    public String getItemPosition() {
        return this.itemPosition;
    }

    public SentinelSortMonitorDashboardItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelSortMonitorDashboardItemsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
