// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetMonitorDashboardItemsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("DashboardId")
    public Long dashboardId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static SentinelGetMonitorDashboardItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetMonitorDashboardItemsRequest self = new SentinelGetMonitorDashboardItemsRequest();
        return TeaModel.build(map, self);
    }

    public SentinelGetMonitorDashboardItemsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelGetMonitorDashboardItemsRequest setDashboardId(Long dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }
    public Long getDashboardId() {
        return this.dashboardId;
    }

    public SentinelGetMonitorDashboardItemsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelGetMonitorDashboardItemsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelGetMonitorDashboardItemsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SentinelGetMonitorDashboardItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
