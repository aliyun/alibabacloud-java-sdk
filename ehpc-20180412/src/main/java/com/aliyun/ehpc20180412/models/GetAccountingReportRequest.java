// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAccountingReportRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("StartTime")
    public Integer startTime;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("ReportType")
    public String reportType;

    @NameInMap("FilterValue")
    public String filterValue;

    @NameInMap("Dim")
    public String dim;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static GetAccountingReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountingReportRequest self = new GetAccountingReportRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountingReportRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetAccountingReportRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public GetAccountingReportRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetAccountingReportRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public GetAccountingReportRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public GetAccountingReportRequest setDim(String dim) {
        this.dim = dim;
        return this;
    }
    public String getDim() {
        return this.dim;
    }

    public GetAccountingReportRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetAccountingReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAccountingReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

}
