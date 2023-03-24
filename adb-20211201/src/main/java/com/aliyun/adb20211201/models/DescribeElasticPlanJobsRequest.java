// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanJobsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ElasticPlanName")
    public String elasticPlanName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    public static DescribeElasticPlanJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanJobsRequest self = new DescribeElasticPlanJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanJobsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeElasticPlanJobsRequest setElasticPlanName(String elasticPlanName) {
        this.elasticPlanName = elasticPlanName;
        return this;
    }
    public String getElasticPlanName() {
        return this.elasticPlanName;
    }

    public DescribeElasticPlanJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeElasticPlanJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeElasticPlanJobsRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DescribeElasticPlanJobsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeElasticPlanJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
