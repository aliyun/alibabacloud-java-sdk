// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>Performance</p>
     */
    @NameInMap("DiagnoseType")
    public String diagnoseType;

    /**
     * <strong>example:</strong>
     * <p>2024-08-26T02:06:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>adf8a2534f1c0a23e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>report-asb1s8***</p>
     */
    @NameInMap("ReportIds")
    public java.util.List<String> reportIds;

    /**
     * <strong>example:</strong>
     * <p>d-asb1s8***</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    /**
     * <strong>example:</strong>
     * <p>2024-08-26T01:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDiagnoseReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseReportRequest self = new DescribeDiagnoseReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseReportRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDiagnoseReportRequest setDiagnoseType(String diagnoseType) {
        this.diagnoseType = diagnoseType;
        return this;
    }
    public String getDiagnoseType() {
        return this.diagnoseType;
    }

    public DescribeDiagnoseReportRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiagnoseReportRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDiagnoseReportRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDiagnoseReportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnoseReportRequest setReportIds(java.util.List<String> reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public java.util.List<String> getReportIds() {
        return this.reportIds;
    }

    public DescribeDiagnoseReportRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public DescribeDiagnoseReportRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiagnoseReportRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
