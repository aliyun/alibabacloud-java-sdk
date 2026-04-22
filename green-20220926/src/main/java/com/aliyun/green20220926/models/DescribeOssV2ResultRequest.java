// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DescribeOssV2ResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>buckect_test</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>2024-09-14 16:08:38</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>high</p>
     */
    @NameInMap("RiskLevel")
    public String riskLevel;

    /**
     * <strong>example:</strong>
     * <p>2024-09-14 16:08:38</p>
     */
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
