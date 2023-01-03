// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesRequest extends TeaModel {
    // The type of the application that is associated with the alert rule. Valid values:
    // 
    // *   `TRACE`: application.
    // *   `RETCODE`: browser.
    @NameInMap("AppType")
    public String appType;

    // The page number of the returned page. Default value: `1`.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page. Default value: `10`.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The process identifier (PID) of the application that is associated with the alert rule. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).
    @NameInMap("Pid")
    public String pid;

    // The region ID of the alert data. For more information about the mappings between **RegionId** and **SystemRegionId**, see the detailed description below the table.
    @NameInMap("RegionId")
    public String regionId;

    // The region ID of the alert rule. For more information about the mappings between **RegionId** and **SystemRegionId**, see the detailed description below the table.
    @NameInMap("SystemRegionId")
    public String systemRegionId;

    // The alert rule name.
    @NameInMap("Title")
    public String title;

    // The alert rule type. Valid values:
    // 
    // *   `1`: custom alert rules to monitor drill-down data sets.
    // *   `3`: custom alert rules to monitor tiled data sets.
    // *   `4`: alert rules to monitor the browser, including the default frontend alert rules.
    // *   `5`: alert rules to monitor applications, including the default application alert rules.
    // *   `6`: the default browser alert rules.
    // *   `7`: the default application alert rules.
    // *   `8`: Tracing Analysis alert rules.
    // *   `101`: Prometheus Service alert rules.
    @NameInMap("Type")
    public String type;

    public static SearchAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertRulesRequest self = new SearchAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public SearchAlertRulesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SearchAlertRulesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public SearchAlertRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAlertRulesRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchAlertRulesRequest setSystemRegionId(String systemRegionId) {
        this.systemRegionId = systemRegionId;
        return this;
    }
    public String getSystemRegionId() {
        return this.systemRegionId;
    }

    public SearchAlertRulesRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SearchAlertRulesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
