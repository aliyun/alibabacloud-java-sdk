// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanJobsResponseBody extends TeaModel {
    /**
     * <p>The queried scaling plan jobs.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<DescribeElasticPlanJobsResponseBodyJobs> jobs;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5C433C2-001F-58E3-99F5-3274C14DF8BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of scaling plan jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
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
        /**
         * <p>The amount of elastic resources.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If Type is set to EXECUTOR, ElasticAcu indicates the amount of elastic resources in the current resource group.</li>
         * <li>If Type is set to WORKER, ElasticAcu indicates the total amount of elastic storage resources in the current cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ElasticAcu")
        public String elasticAcu;

        /**
         * <p>The name of the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ElasticPlanName")
        public String elasticPlanName;

        /**
         * <p>The end time of the scaling plan job.</p>
         * <blockquote>
         * <p> The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:01:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The number of compute nodes or storage replica sets.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If Type is set to EXECUTOR, InstanceSize indicates the number of compute nodes in the cluster.</li>
         * <li>If Type is set to EXECUTOR, InstanceSize indicates the number of storage replica sets in the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceSize")
        public Integer instanceSize;

        /**
         * <p>The amount of reserved resources.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If Type is set to EXECUTOR, ReserveAcu indicates the amount of reserved resources in the current resource group.</li>
         * <li>If Type is set to WORKER, ReserveAcu indicates the total amount of reserved storage resources in the current cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16ACU</p>
         */
        @NameInMap("ReserveAcu")
        public String reserveAcu;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The start time of the scaling plan job.</p>
         * <blockquote>
         * <p> The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T11:01:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the scaling plan job. Valid values:</p>
         * <ul>
         * <li>RUNNING</li>
         * <li>SUCCESSFUL</li>
         * <li>FAILED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSFUL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The desired specifications of elastic resources after scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        @NameInMap("TargetSize")
        public String targetSize;

        /**
         * <p>The total amount of resources.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If Type is set to EXECUTOR, TotalAcu indicates the total amount of computing resources in the current resource group.</li>
         * <li>If Type is set to WORKER, TotalAcu indicates the total amount of storage resources in the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        @NameInMap("TotalAcu")
        public String totalAcu;

        /**
         * <p>The type of the scaling plan job. Valid values:</p>
         * <ul>
         * <li>EXECUTOR: the interactive resource group type, which indicates the computing resource type.</li>
         * <li>WORKER: the EIU type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXECUTOR</p>
         */
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
