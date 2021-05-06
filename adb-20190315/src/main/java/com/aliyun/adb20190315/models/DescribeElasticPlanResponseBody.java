// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ElasticPlanList")
    public java.util.List<DescribeElasticPlanResponseBodyElasticPlanList> elasticPlanList;

    public static DescribeElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanResponseBody self = new DescribeElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticPlanResponseBody setElasticPlanList(java.util.List<DescribeElasticPlanResponseBodyElasticPlanList> elasticPlanList) {
        this.elasticPlanList = elasticPlanList;
        return this;
    }
    public java.util.List<DescribeElasticPlanResponseBodyElasticPlanList> getElasticPlanList() {
        return this.elasticPlanList;
    }

    public static class DescribeElasticPlanResponseBodyElasticPlanList extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("WeeklyRepeat")
        public String weeklyRepeat;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ResourcePoolName")
        public String resourcePoolName;

        @NameInMap("StartDay")
        public String startDay;

        @NameInMap("ElasticNodeNum")
        public Integer elasticNodeNum;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("EndDay")
        public String endDay;

        @NameInMap("PlanName")
        public String planName;

        public static DescribeElasticPlanResponseBodyElasticPlanList build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticPlanResponseBodyElasticPlanList self = new DescribeElasticPlanResponseBodyElasticPlanList();
            return TeaModel.build(map, self);
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setWeeklyRepeat(String weeklyRepeat) {
            this.weeklyRepeat = weeklyRepeat;
            return this;
        }
        public String getWeeklyRepeat() {
            return this.weeklyRepeat;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setResourcePoolName(String resourcePoolName) {
            this.resourcePoolName = resourcePoolName;
            return this;
        }
        public String getResourcePoolName() {
            return this.resourcePoolName;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setStartDay(String startDay) {
            this.startDay = startDay;
            return this;
        }
        public String getStartDay() {
            return this.startDay;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setElasticNodeNum(Integer elasticNodeNum) {
            this.elasticNodeNum = elasticNodeNum;
            return this;
        }
        public Integer getElasticNodeNum() {
            return this.elasticNodeNum;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setEndDay(String endDay) {
            this.endDay = endDay;
            return this;
        }
        public String getEndDay() {
            return this.endDay;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

    }

}
