// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUrlObservationDataRequest extends TeaModel {
    /**
     * <p>The device platform. If this parameter is left empty, data for all platforms is queried.</p>
     * <ul>
     * <li><p>PC</p>
     * </li>
     * <li><p>Mobile</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("ClientPlatform")
    public String clientPlatform;

    /**
     * <p>The end time for the data query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-19T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metric to query.</p>
     * <ul>
     * <li>TTFB: Measures the time from when a resource request is initiated to when the first byte of the response begins to arrive.</li>
     * <li>FCP: Measures the time from when the page starts loading to when any part of the page content is rendered on the screen.</li>
     * <li>LCP: Reports the render time of the largest image or text block visible within the viewport.</li>
     * <li>CLS: A metric that measures the largest burst of layout shift scores for every unexpected layout shift that occurs throughout the entire lifecycle of a page.</li>
     * <li>INP: Measures the responsiveness of a page, specifically how long it takes for the page to visibly respond to user input.</li>
     * <li>FID: Measures the time from when a user first interacts with a page to when the browser is actually able to begin processing event handlers in response to that interaction.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TTFB</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54362329990032</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>The start time for the data query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The URL of the web page to monitor.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/test</p>
     */
    @NameInMap("Url")
    public String url;

    public static DescribeUrlObservationDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUrlObservationDataRequest self = new DescribeUrlObservationDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUrlObservationDataRequest setClientPlatform(String clientPlatform) {
        this.clientPlatform = clientPlatform;
        return this;
    }
    public String getClientPlatform() {
        return this.clientPlatform;
    }

    public DescribeUrlObservationDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUrlObservationDataRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeUrlObservationDataRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeUrlObservationDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUrlObservationDataRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
