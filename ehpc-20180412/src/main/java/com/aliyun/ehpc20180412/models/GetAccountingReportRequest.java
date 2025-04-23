// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAccountingReportRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The layers at which you want to query the bandwidth and traffic data. Valid values:</p>
     * <ul>
     * <li>user: Query by user.</li>
     * <li>queue: Query by queue.</li>
     * <li>instance: Query by instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Dim")
    public String dim;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1577441873</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The actual name of the dimension to be queried. Valid values:</p>
     * <ul>
     * <li>If you set the value of the parameter Dim to user, the value of FilterValue is the name of the specified user.</li>
     * <li>If you set the value of the parameter Dim to queue, the value of FilterValue is the name of the specified queue.</li>
     * <li>If you set the value of the parameter Dim to instance, the value of FilterValue is the instance name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>userNo1</p>
     */
    @NameInMap("FilterValue")
    public String filterValue;

    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>[{Id: 1.scheduler}]</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the returned page.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query type. Valid values:</p>
     * <ul>
     * <li>total_report: Queries the number of CPU cores in different dimensions.</li>
     * <li>job_report: Collects the historical node data of a node.</li>
     * <li>number_report: Queries job information in different dimensions.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job_report</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1576922873</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

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

    public GetAccountingReportRequest setDim(String dim) {
        this.dim = dim;
        return this;
    }
    public String getDim() {
        return this.dim;
    }

    public GetAccountingReportRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public GetAccountingReportRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public GetAccountingReportRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetAccountingReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetAccountingReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAccountingReportRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public GetAccountingReportRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
