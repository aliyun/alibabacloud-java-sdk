// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlansResponseBody extends TeaModel {
    /**
     * <p>The scaling plans.</p>
     */
    @NameInMap("ElasticPlans")
    public java.util.List<DescribeElasticPlansResponseBodyElasticPlans> elasticPlans;

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
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeElasticPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlansResponseBody self = new DescribeElasticPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlansResponseBody setElasticPlans(java.util.List<DescribeElasticPlansResponseBodyElasticPlans> elasticPlans) {
        this.elasticPlans = elasticPlans;
        return this;
    }
    public java.util.List<DescribeElasticPlansResponseBodyElasticPlans> getElasticPlans() {
        return this.elasticPlans;
    }

    public DescribeElasticPlansResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeElasticPlansResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeElasticPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticPlansResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeElasticPlansResponseBodyElasticPlans extends TeaModel {
        /**
         * <p>Indicates whether <strong>Proportional Default Scaling for EIUs</strong> is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoScale")
        public Boolean autoScale;

        /**
         * <p>The name of the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ElasticPlanName")
        public String elasticPlanName;

        /**
         * <p>Indicates whether the scaling plan was immediately enabled after the plan is created. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time when the next scheduling is performed.</p>
         * <blockquote>
         * <p>The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:01:00Z</p>
         */
        @NameInMap("NextScheduleTime")
        public String nextScheduleTime;

        /**
         * <p>The name of the resource group.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/459446.html">DescribeDBResourceGroup</a> operation to query the name of a resource group within a cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>The amount of elastic resources after scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>32ACU</p>
         */
        @NameInMap("TargetSize")
        public String targetSize;

        /**
         * <p>The type of the scaling plan. Valid values:</p>
         * <ul>
         * <li>EXECUTOR: interactive resource group.</li>
         * <li>WORKER: EIU.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXECUTOR</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeElasticPlansResponseBodyElasticPlans build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticPlansResponseBodyElasticPlans self = new DescribeElasticPlansResponseBodyElasticPlans();
            return TeaModel.build(map, self);
        }

        public DescribeElasticPlansResponseBodyElasticPlans setAutoScale(Boolean autoScale) {
            this.autoScale = autoScale;
            return this;
        }
        public Boolean getAutoScale() {
            return this.autoScale;
        }

        public DescribeElasticPlansResponseBodyElasticPlans setElasticPlanName(String elasticPlanName) {
            this.elasticPlanName = elasticPlanName;
            return this;
        }
        public String getElasticPlanName() {
            return this.elasticPlanName;
        }

        public DescribeElasticPlansResponseBodyElasticPlans setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeElasticPlansResponseBodyElasticPlans setNextScheduleTime(String nextScheduleTime) {
            this.nextScheduleTime = nextScheduleTime;
            return this;
        }
        public String getNextScheduleTime() {
            return this.nextScheduleTime;
        }

        public DescribeElasticPlansResponseBodyElasticPlans setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeElasticPlansResponseBodyElasticPlans setTargetSize(String targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public String getTargetSize() {
            return this.targetSize;
        }

        public DescribeElasticPlansResponseBodyElasticPlans setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
