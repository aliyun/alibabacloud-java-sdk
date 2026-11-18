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
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("BrowserInfo")
    public String browserInfo;

    /**
     * <p>The identifier of the city.</p>
     * 
     * <strong>example:</strong>
     * <p>546</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The device type, which indicates the simulated screen size type.</p>
     * 
     * <strong>example:</strong>
     * <p>laptop</p>
     */
    @NameInMap("Device")
    public String device;

    /**
     * <p>The end time. Supported formats:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</li>
     * <li>UTC format: YYYY-MM-DDThh:mm:ssZ.</li>
     * </ul>
     * <blockquote>
     * <p>Use UNIX timestamps to avoid time zone issues.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1638422475687</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter condition for detection values.</p>
     * <p>Simple expressions are supported. For example, <code>TotalTime&gt;100</code> filters the detection data whose total response time exceeds 100 milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>TotalTime&gt;100</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The identifier of the carrier.</p>
     * 
     * <strong>example:</strong>
     * <p>465</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The number of records to return on each page for paging. Valid values: 1 to 1440.</p>
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
     * <p>The pagination token. If the response is truncated, you can use <code>NextToken</code> to send another request and retrieve the remaining results.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Supported formats:</p>
     * <ul>
     * <li>UNIX timestamp: the number of milliseconds that have elapsed since January 1, 1970.</li>
     * <li>UTC format: YYYY-MM-DDThh:mm:ssZ.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The start time and end time follow the left-open and right-closed interval pattern. The value of StartTime cannot be equal to or greater than the value of EndTime.                                                                                                                   <ul>
     * <li>Use UNIX timestamps to avoid time zone issues.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1638422474389</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The IDs of the detection tasks. Separate multiple IDs with commas (,).</p>
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
