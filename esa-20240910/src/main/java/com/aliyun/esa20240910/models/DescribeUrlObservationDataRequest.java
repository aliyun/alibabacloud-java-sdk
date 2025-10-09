// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUrlObservationDataRequest extends TeaModel {
    /**
     * <p>The platform of the device. If the parameter is left empty, all devices are queried.</p>
     * <ul>
     * <li>PC</li>
     * <li>Mobile</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("ClientPlatform")
    public String clientPlatform;

    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-19T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metric data that is detected.</p>
     * <ul>
     * <li>TTFB: Measures the time between when a resource initiates a request and when the first byte of the response starts to arrive.</li>
     * <li>FCP: Measures the time between when the page is loaded and when any part of the page\&quot;s content is rendered on the screen.</li>
     * <li>LCP: Reports the rendering time of the largest image or text block visible in the viewport.</li>
     * <li>CLS: A metric that measures the maximum layout mutation score for every unexpected layout change that occurs throughout the life of the page.</li>
     * <li>INP: Measures the responsiveness of the page, or how long it takes for the page to respond to user input in a visible way.</li>
     * <li>FID: Measures the time between when the user first interacts with the page and when the browser is actually able to start processing the event handler in response to that interaction.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TTFB</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54362329990032</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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
