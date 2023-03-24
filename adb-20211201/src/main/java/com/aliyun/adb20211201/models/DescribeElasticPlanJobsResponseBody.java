// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<DescribeElasticPlanJobsResponseBodyJobs> jobs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeElasticPlanJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanJobsResponseBody self = new DescribeElasticPlanJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanJobsResponseBody setJobs(java.util.List<DescribeElasticPlanJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<DescribeElasticPlanJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public DescribeElasticPlanJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeElasticPlanJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeElasticPlanJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticPlanJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeElasticPlanJobsResponseBodyJobs extends TeaModel {
        @NameInMap("ElasticAcu")
        public String elasticAcu;

        @NameInMap("ElasticPlanName")
        public String elasticPlanName;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceSize")
        public Integer instanceSize;

        @NameInMap("ReserveAcu")
        public String reserveAcu;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetSize")
        public String targetSize;

        @NameInMap("TotalAcu")
        public String totalAcu;

        @NameInMap("Type")
        public String type;

        public static DescribeElasticPlanJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticPlanJobsResponseBodyJobs self = new DescribeElasticPlanJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public DescribeElasticPlanJobsResponseBodyJobs setElasticAcu(String elasticAcu) {
            this.elasticAcu = elasticAcu;
            return this;
        }
        public String getElasticAcu() {
            return this.elasticAcu;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setElasticPlanName(String elasticPlanName) {
            this.elasticPlanName = elasticPlanName;
            return this;
        }
        public String getElasticPlanName() {
            return this.elasticPlanName;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setInstanceSize(Integer instanceSize) {
            this.instanceSize = instanceSize;
            return this;
        }
        public Integer getInstanceSize() {
            return this.instanceSize;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setReserveAcu(String reserveAcu) {
            this.reserveAcu = reserveAcu;
            return this;
        }
        public String getReserveAcu() {
            return this.reserveAcu;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setTargetSize(String targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public String getTargetSize() {
            return this.targetSize;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setTotalAcu(String totalAcu) {
            this.totalAcu = totalAcu;
            return this;
        }
        public String getTotalAcu() {
            return this.totalAcu;
        }

        public DescribeElasticPlanJobsResponseBodyJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
