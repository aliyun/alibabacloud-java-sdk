// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeElasticPlansResponseBody extends TeaModel {
    @NameInMap("ElasticPlans")
    public java.util.List<DescribeElasticPlansResponseBodyElasticPlans> elasticPlans;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AutoScale")
        public Boolean autoScale;

        @NameInMap("ElasticPlanName")
        public String elasticPlanName;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("NextScheduleTime")
        public String nextScheduleTime;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("TargetSize")
        public String targetSize;

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
