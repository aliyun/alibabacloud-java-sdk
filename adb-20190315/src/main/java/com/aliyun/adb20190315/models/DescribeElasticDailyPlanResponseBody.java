// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticDailyPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ElasticDailyPlanList")
    public java.util.List<DescribeElasticDailyPlanResponseBodyElasticDailyPlanList> elasticDailyPlanList;

    public static DescribeElasticDailyPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticDailyPlanResponseBody self = new DescribeElasticDailyPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticDailyPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticDailyPlanResponseBody setElasticDailyPlanList(java.util.List<DescribeElasticDailyPlanResponseBodyElasticDailyPlanList> elasticDailyPlanList) {
        this.elasticDailyPlanList = elasticDailyPlanList;
        return this;
    }
    public java.util.List<DescribeElasticDailyPlanResponseBodyElasticDailyPlanList> getElasticDailyPlanList() {
        return this.elasticDailyPlanList;
    }

    public static class DescribeElasticDailyPlanResponseBodyElasticDailyPlanList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Day")
        public String day;

        @NameInMap("ResourcePoolName")
        public String resourcePoolName;

        @NameInMap("StartTs")
        public String startTs;

        @NameInMap("PlanEndTs")
        public String planEndTs;

        @NameInMap("PlanStartTs")
        public String planStartTs;

        @NameInMap("ElasticNodeNum")
        public Integer elasticNodeNum;

        @NameInMap("EndTs")
        public String endTs;

        @NameInMap("PlanName")
        public String planName;

        public static DescribeElasticDailyPlanResponseBodyElasticDailyPlanList build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticDailyPlanResponseBodyElasticDailyPlanList self = new DescribeElasticDailyPlanResponseBodyElasticDailyPlanList();
            return TeaModel.build(map, self);
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setResourcePoolName(String resourcePoolName) {
            this.resourcePoolName = resourcePoolName;
            return this;
        }
        public String getResourcePoolName() {
            return this.resourcePoolName;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setStartTs(String startTs) {
            this.startTs = startTs;
            return this;
        }
        public String getStartTs() {
            return this.startTs;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setPlanEndTs(String planEndTs) {
            this.planEndTs = planEndTs;
            return this;
        }
        public String getPlanEndTs() {
            return this.planEndTs;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setPlanStartTs(String planStartTs) {
            this.planStartTs = planStartTs;
            return this;
        }
        public String getPlanStartTs() {
            return this.planStartTs;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setElasticNodeNum(Integer elasticNodeNum) {
            this.elasticNodeNum = elasticNodeNum;
            return this;
        }
        public Integer getElasticNodeNum() {
            return this.elasticNodeNum;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setEndTs(String endTs) {
            this.endTs = endTs;
            return this;
        }
        public String getEndTs() {
            return this.endTs;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

    }

}
