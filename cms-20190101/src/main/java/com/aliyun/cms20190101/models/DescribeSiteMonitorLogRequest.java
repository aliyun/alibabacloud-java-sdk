// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorLogRequest extends TeaModel {
    /**
     * <p>The type of the browser.</p>
     * 
     * <strong>example:</strong>
     * <p>Chrome</p>
     */
    @NameInMap("Browser")
    public String browser;

    /**
     * <p>This parameter is deprecated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("BrowserInfo")
    public String browserInfo;

    /**
     * <p>The city ID.</p>
     * 
     * <strong>example:</strong>
     * <p>546</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The type of the device. This parameter specifies the screen size for impersonation.</p>
     * 
     * <strong>example:</strong>
     * <p>laptop</p>
     */
    @NameInMap("Device")
    public String device;

    /**
     * <p>The end of the time range to query. The following formats are supported:</p>
     * <ul>
     * <li><p>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</p>
     * </li>
     * <li><p>UTC format: YYYY-MM-DDThh:mm:ssZ.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Use UNIX timestamps to prevent time zone-related issues.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1638422475687</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter expression for detection results.</p>
     * <p>Simple expressions are supported. For example, you can use the <code>TotalTime&gt;100</code> expression to query the detection data whose total response time exceeds 100 milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>TotalTime&gt;100</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The carrier ID.</p>
     * 
     * <strong>example:</strong>
     * <p>465</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The number of entries to return on each page for a paged query. Valid values: 1 to 1440.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The metric.</p>
     * <p>Only the <code>ProbeLog</code> metric is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ProbeLog</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>If the response is truncated, use the <code>NextToken</code> parameter to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. The following formats are supported:</p>
     * <ul>
     * <li><p>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</p>
     * </li>
     * <li><p>UTC format: YYYY-MM-DDThh:mm:ssZ.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The start time and end time follow the (StartTime, EndTime] pattern. The value of StartTime cannot be the same as or later than the value of EndTime.<br> - Use UNIX timestamps to prevent time zone-related issues.<br></li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1638422474389</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the detection task. You can specify multiple task IDs. Separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>afa5c3ce-f944-4363-9edb-ce919a29****</p>
     */
    @NameInMap("TaskIds")
    public String taskIds;

    public static DescribeSiteMonitorLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorLogRequest self = new DescribeSiteMonitorLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorLogRequest setBrowser(String browser) {
        this.browser = browser;
        return this;
    }
    public String getBrowser() {
        return this.browser;
    }

    public DescribeSiteMonitorLogRequest setBrowserInfo(String browserInfo) {
        this.browserInfo = browserInfo;
        return this;
    }
    public String getBrowserInfo() {
        return this.browserInfo;
    }

    public DescribeSiteMonitorLogRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeSiteMonitorLogRequest setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public DescribeSiteMonitorLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteMonitorLogRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DescribeSiteMonitorLogRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeSiteMonitorLogRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public DescribeSiteMonitorLogRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeSiteMonitorLogRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSiteMonitorLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSiteMonitorLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSiteMonitorLogRequest setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
