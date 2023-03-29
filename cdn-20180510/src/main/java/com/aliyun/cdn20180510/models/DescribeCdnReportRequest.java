// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportRequest extends TeaModel {
    /**
     * <p>The region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent region list.</p>
     * <br>
     * <p>*   If you do not specify a region, all regions are queried.</p>
     * <p>*   If you specify a region, data in the specified region is returned. You can specify one or more regions. Separate regions with commas (,).</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The domain names that you want to query. Separate domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: HTTP 2xx status codes</p>
     * <p>*   **3xx**: HTTP 3xx status codes</p>
     * <p>*   **4xx**: HTTP 4xx status codes</p>
     * <p>*   **5xx**: HTTP 5xx status codes</p>
     * <br>
     * <p>If you do not specify an HTTP status code, all HTTP status codes are queried.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>Specify whether the region is outside the Chinese mainland. Valid values:</p>
     * <br>
     * <p>*   **1**: outside the Chinese mainland</p>
     * <p>*   **0**: inside the Chinese mainland</p>
     */
    @NameInMap("IsOverseas")
    public String isOverseas;

    /**
     * <p>The ID of the operations report that you want to query. You can enter only one ID in each call. You can call the [DescribeCdnSubList](~~271655~~) operation to query the report ID.</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeCdnReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportRequest self = new DescribeCdnReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeCdnReportRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCdnReportRequest setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public DescribeCdnReportRequest setIsOverseas(String isOverseas) {
        this.isOverseas = isOverseas;
        return this;
    }
    public String getIsOverseas() {
        return this.isOverseas;
    }

    public DescribeCdnReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeCdnReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
