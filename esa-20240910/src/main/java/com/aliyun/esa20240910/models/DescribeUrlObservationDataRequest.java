// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeUrlObservationDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PC</p>
     */
    @NameInMap("ClientPlatform")
    public String clientPlatform;

    /**
     * <strong>example:</strong>
     * <p>2023-04-19T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>TTFB</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>54362329990032</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
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
