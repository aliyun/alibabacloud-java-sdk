// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnReportRequest extends TeaModel {
    /**
     * <p>The region. You can call the <a href="https://help.aliyun.com/document_detail/207199.html">DescribeDcdnRegionAndIsp</a> operation to query regions.</p>
     * <ul>
     * <li>If you do not specify a region, data in all regions is queried.</li>
     * <li>If you specify a region, data in the specified region is returned. You can specify one or more regions. Separate regions with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shanghai</p>
     */
    @NameInMap("Area")
    public String area;

    /**
     * <p>The domain names that you want to query. Separate domain names with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com,www.example.org">www.example.com,www.example.org</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-02T01:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: HTTP 2xx status codes</li>
     * <li><strong>3xx</strong>: HTTP 3xx status codes</li>
     * <li><strong>4xx</strong>: HTTP 4xx status codes</li>
     * <li><strong>5xx</strong>: HTTP 5xx status codes</li>
     * </ul>
     * <p>If you do not specify an HTTP status code, data for all preceding HTTP status codes is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2xx</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>Specify whether the region is outside the Chinese mainland. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: outside the Chinese mainland</li>
     * <li><strong>0</strong>: inside the Chinese mainland</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsOverseas")
    public String isOverseas;

    /**
     * <p>The ID of the operations report that you want to query. You can enter only one ID in each call. You can call the <a href="https://help.aliyun.com/document_detail/270075.html">DescribeDcdnSubList</a> operation to query report IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-02T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnReportRequest self = new DescribeDcdnReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnReportRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeDcdnReportRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnReportRequest setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public DescribeDcdnReportRequest setIsOverseas(String isOverseas) {
        this.isOverseas = isOverseas;
        return this;
    }
    public String getIsOverseas() {
        return this.isOverseas;
    }

    public DescribeDcdnReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeDcdnReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
