// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DescribeOssV2ResultRequest extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RiskLevel")
    public String riskLevel;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TaskName")
    public String taskName;

    public static DescribeOssV2ResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssV2ResultRequest self = new DescribeOssV2ResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssV2ResultRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public DescribeOssV2ResultRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOssV2ResultRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeOssV2ResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOssV2ResultRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public DescribeOssV2ResultRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeOssV2ResultRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
