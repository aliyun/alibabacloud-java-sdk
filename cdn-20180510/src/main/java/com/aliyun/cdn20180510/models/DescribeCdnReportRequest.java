// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ReportId")
    public Long reportId;

    @NameInMap("Area")
    public String area;

    @NameInMap("IsOverseas")
    public String isOverseas;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeCdnReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportRequest self = new DescribeCdnReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnReportRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeCdnReportRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public DescribeCdnReportRequest setIsOverseas(String isOverseas) {
        this.isOverseas = isOverseas;
        return this;
    }
    public String getIsOverseas() {
        return this.isOverseas;
    }

    public DescribeCdnReportRequest setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public DescribeCdnReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCdnReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
