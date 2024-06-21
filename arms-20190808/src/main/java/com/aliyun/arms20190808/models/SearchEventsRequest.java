// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchEventsRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule. You can call the SearchAlertRules operation and view the <code>Id</code> parameter in the response. For more information, see <a href="https://help.aliyun.com/document_detail/175825.html">SearchAlertRules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("AlertId")
    public Long alertId;

    /**
     * <p>The type of the alert rule. Valid values:</p>
     * <ul>
     * <li><code>1</code>: custom alert rules to monitor drill-down data sets</li>
     * <li><code>3</code>: custom alert rules to monitor tiled data sets</li>
     * <li><code>4</code>: alert rules to monitor the frontend, including the default frontend alert rules</li>
     * <li><code>5</code>: alert rules to monitor applications, including the default application alert rules</li>
     * <li><code>6</code>: the default frontend alert rules</li>
     * <li><code>7</code>: the default application alert rules</li>
     * <li><code>8</code>: Tracing Analysis alert rules</li>
     * <li><code>101</code>: Prometheus alert rules</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("AlertType")
    public Integer alertType;

    /**
     * <p>The type of the application that is associated with the alert rule. Valid values:</p>
     * <ul>
     * <li><code>TRACE</code>: application monitoring</li>
     * <li><code>RETCODE</code>: frontend monitoring</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TRACE</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>The number of the page to return. Default value: <code>1</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. Specify a UNIX timestamp of the LONG data type, in milliseconds. The default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1595568970000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Specifies whether the alert event is triggered. If you do not set this parameter, all alert events are queried. Valid values:</p>
     * <ul>
     * <li><code>1</code>: The event is triggered.</li>
     * <li><code>0</code>: The event is not triggered.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsTrigger")
    public Integer isTrigger;

    /**
     * <p>The number of entries to return on each page. Default value: <code>10</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The process identifier (PID) of the application that is associated with the alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>atc889zkcf@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify a UNIX timestamp of the LONG data type, in milliseconds. The default value is 10 minutes before the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>1595565300000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static SearchEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchEventsRequest self = new SearchEventsRequest();
        return TeaModel.build(map, self);
    }

    public SearchEventsRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public SearchEventsRequest setAlertType(Integer alertType) {
        this.alertType = alertType;
        return this;
    }
    public Integer getAlertType() {
        return this.alertType;
    }

    public SearchEventsRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SearchEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public SearchEventsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchEventsRequest setIsTrigger(Integer isTrigger) {
        this.isTrigger = isTrigger;
        return this;
    }
    public Integer getIsTrigger() {
        return this.isTrigger;
    }

    public SearchEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchEventsRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
