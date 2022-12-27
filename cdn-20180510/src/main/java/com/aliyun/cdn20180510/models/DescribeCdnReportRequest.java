// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportRequest extends TeaModel {
    // The region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent region list.
    // 
    // *   If you do not specify a region, all regions are queried.
    // *   If you specify a region, data in the specified region is returned. You can specify one or more regions. Separate regions with commas (,).
    @NameInMap("Area")
    public String area;

    // The domain names that you want to query. Separate domain names with commas (,).
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    @NameInMap("EndTime")
    public String endTime;

    // The HTTP status code. Valid values:
    // 
    // *   **2xx**: HTTP 2xx status codes
    // *   **3xx**: HTTP 3xx status codes
    // *   **4xx**: HTTP 4xx status codes
    // *   **5xx**: HTTP 5xx status codes
    // 
    // If you do not specify an HTTP status code, all HTTP status codes are queried.
    @NameInMap("HttpCode")
    public String httpCode;

    // Specify whether the region is outside the Chinese mainland. Valid values:
    // 
    // *   **1**: outside the Chinese mainland
    // *   **0**: inside the Chinese mainland
    @NameInMap("IsOverseas")
    public String isOverseas;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the operations report that you want to query. You can enter only one ID in each call. You can call the [DescribeCdnSubList](~~271655~~) operation to query the report ID.
    @NameInMap("ReportId")
    public Long reportId;

    // The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
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

    public DescribeCdnReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
