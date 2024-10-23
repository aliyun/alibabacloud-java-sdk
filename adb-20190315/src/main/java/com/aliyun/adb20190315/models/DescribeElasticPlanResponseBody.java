// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticPlanResponseBody extends TeaModel {
    /**
     * <p>The queried scaling plans.</p>
     */
    @NameInMap("ElasticPlanList")
    public java.util.List<DescribeElasticPlanResponseBodyElasticPlanList> elasticPlanList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElasticPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticPlanResponseBody self = new DescribeElasticPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticPlanResponseBody setElasticPlanList(java.util.List<DescribeElasticPlanResponseBodyElasticPlanList> elasticPlanList) {
        this.elasticPlanList = elasticPlanList;
        return this;
    }
    public java.util.List<DescribeElasticPlanResponseBodyElasticPlanList> getElasticPlanList() {
        return this.elasticPlanList;
    }

    public DescribeElasticPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeElasticPlanResponseBodyElasticPlanList extends TeaModel {
        /**
         * <p>The number of nodes that are involved in the scaling plan.</p>
         * <ul>
         * <li>If ElasticPlanType is set to <strong>worker</strong>, a value of 0 or null is returned.</li>
         * <li>If ElasticPlanType is set to <strong>executorcombineworker</strong> or <strong>executor</strong>, a value greater than 0 is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ElasticNodeNum")
        public Integer elasticNodeNum;

        /**
         * <p>The type of the scaling plan. Valid values:</p>
         * <ul>
         * <li><strong>worker</strong>: scales only elastic I/O resources.</li>
         * <li><strong>executor</strong>: scales only computing resources.</li>
         * <li><strong>executorcombineworker</strong> (default): scales both elastic I/O resources and computing resources by proportion.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>worker</p>
         */
        @NameInMap("ElasticPlanType")
        public String elasticPlanType;

        /**
         * <p>The resource specifications that can be scaled up by the scaling plan. Valid values:</p>
         * <ul>
         * <li>8 Core 64 GB (default)</li>
         * <li>16 Core 64 GB</li>
         * <li>32 Core 64 GB</li>
         * <li>64 Core 128 GB</li>
         * <li>12 Core 96 GB</li>
         * <li>24 Core 96 GB</li>
         * <li>52 Core 86 GB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16 Core 64 GB</p>
         */
        @NameInMap("ElasticPlanWorkerSpec")
        public String elasticPlanWorkerSpec;

        /**
         * <p>Indicates whether the scaling plan takes effect. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default)</li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The end date of the scaling plan. This parameter is returned only if the end date of the scaling plan is set. The date is in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-09</p>
         */
        @NameInMap("EndDay")
        public String endDay;

        /**
         * <p>The restoration time of the scaling plan. The interval between the scale-up time and the restoration time cannot be more than 24 hours. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>10:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The days of the month when the scaling plan was executed. A value indicates a day of the month. Multiple values are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1,15,25</p>
         */
        @NameInMap("MonthlyRepeat")
        public String monthlyRepeat;

        /**
         * <p>The name of the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>realtime</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFAULT</p>
         */
        @NameInMap("ResourcePoolName")
        public String resourcePoolName;

        /**
         * <p>The start date of the scaling plan. This parameter is returned only if the start date of the scaling plan is set. The date is in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02</p>
         */
        @NameInMap("StartDay")
        public String startDay;

        /**
         * <p>The scale-up time of the scaling plan. The time is in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The days of the week when the scaling plan was executed. Valid values: 0 to 6, which indicate Sunday to Saturday. Multiple values are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>3,4,5,6</p>
         */
        @NameInMap("WeeklyRepeat")
        public String weeklyRepeat;

        public static DescribeElasticPlanResponseBodyElasticPlanList build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticPlanResponseBodyElasticPlanList self = new DescribeElasticPlanResponseBodyElasticPlanList();
            return TeaModel.build(map, self);
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setElasticNodeNum(Integer elasticNodeNum) {
            this.elasticNodeNum = elasticNodeNum;
            return this;
        }
        public Integer getElasticNodeNum() {
            return this.elasticNodeNum;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setElasticPlanType(String elasticPlanType) {
            this.elasticPlanType = elasticPlanType;
            return this;
        }
        public String getElasticPlanType() {
            return this.elasticPlanType;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setElasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
            this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
            return this;
        }
        public String getElasticPlanWorkerSpec() {
            return this.elasticPlanWorkerSpec;
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

        public DescribeElasticPlanResponseBodyElasticPlanList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setMonthlyRepeat(String monthlyRepeat) {
            this.monthlyRepeat = monthlyRepeat;
            return this;
        }
        public String getMonthlyRepeat() {
            return this.monthlyRepeat;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
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

        public DescribeElasticPlanResponseBodyElasticPlanList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeElasticPlanResponseBodyElasticPlanList setWeeklyRepeat(String weeklyRepeat) {
            this.weeklyRepeat = weeklyRepeat;
            return this;
        }
        public String getWeeklyRepeat() {
            return this.weeklyRepeat;
        }

    }

}
