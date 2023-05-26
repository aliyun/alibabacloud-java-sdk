// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertHistoriesRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule. You can call the SearchAlertRules operation and view the `Id` parameter in the response. For more information, see [SearchAlertRules](~~175825~~).</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    /**
     * <p>The type of the alert rule. Valid values:</p>
     * <br>
     * <p>*   `1`: a custom alert rule that is used to monitor drill-down data sets</p>
     * <p>*   `3`: a custom alert rule that is used to monitor tiled data sets</p>
     * <p>*   `4`: an alert rule that is used to monitor web pages, including the default alert rule for browser monitoring</p>
     * <p>*   `5`: an alert rule that is used to monitor applications, including the default alert rule for application monitoring</p>
     * <p>*   `6`: the default alert rule for browser monitoring</p>
     * <p>*   `7`: the default alert rule for application monitoring</p>
     * <p>*   `8`: a Tracing Analysis alert rule</p>
     * <p>*   `101`: a Prometheus alert rule</p>
     */
    @NameInMap("AlertType")
    public Integer alertType;

    /**
     * <p>The number of the page to return. Default value: `1`.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp of the LONG data type. Unit: milliseconds. The default value is the current time.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries to return on each page. Default value: `10`.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region. Default value: `cn-hangzhou`.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp of the LONG data type. Unit: milliseconds. The default value is 10 minutes before the current time.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static SearchAlertHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertHistoriesRequest self = new SearchAlertHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public SearchAlertHistoriesRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public SearchAlertHistoriesRequest setAlertType(Integer alertType) {
        this.alertType = alertType;
        return this;
    }
    public Integer getAlertType() {
        return this.alertType;
    }

    public SearchAlertHistoriesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public SearchAlertHistoriesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchAlertHistoriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchAlertHistoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchAlertHistoriesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
