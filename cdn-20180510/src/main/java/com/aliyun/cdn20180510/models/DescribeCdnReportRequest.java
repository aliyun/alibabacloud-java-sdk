// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportRequest extends TeaModel {
    /**
     * <p>The region. You can call the [DescribeCdnRegionAndIsp](https://help.aliyun.com/document_detail/91077.html) operation to query regions.</p>
     * <br>
     * <p>*   If you do not specify a region, data in all regions is queried.</p>
     * <p>*   If you specify a region, data in the specified region is queried. You can specify one or more regions. If you specify multiple regions, separate the regions with commas (,).</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The domain name that you want to query. Separate domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**</p>
     * <p>*   **3xx**</p>
     * <p>*   **4xx**</p>
     * <p>*   **5xx**</p>
     * <br>
     * <p>If you do not specify this parameter, all HTTP status codes are queried.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>Specifies whether the region is outside the Chinese mainland. Valid values:</p>
     * <br>
     * <p>*   **1**: outside the Chinese mainland</p>
     * <p>*   **0**: inside the Chinese mainland</p>
     */
    @NameInMap("IsOverseas")
    public String isOverseas;

    /**
     * <p>The ID of the operations report that you want to query. You can specify only one ID in each request. You can call the [DescribeCdnSubList](https://help.aliyun.com/document_detail/271655.html) operation to query report IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>This parameter is required.</p>
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
