// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeElasticDailyPlanResponseBody extends TeaModel {
    /**
     * <p>Details of the current-day scaling plans.</p>
     */
    @NameInMap("ElasticDailyPlanList")
    public java.util.List<DescribeElasticDailyPlanResponseBodyElasticDailyPlanList> elasticDailyPlanList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElasticDailyPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticDailyPlanResponseBody self = new DescribeElasticDailyPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticDailyPlanResponseBody setElasticDailyPlanList(java.util.List<DescribeElasticDailyPlanResponseBodyElasticDailyPlanList> elasticDailyPlanList) {
        this.elasticDailyPlanList = elasticDailyPlanList;
        return this;
    }
    public java.util.List<DescribeElasticDailyPlanResponseBodyElasticDailyPlanList> getElasticDailyPlanList() {
        return this.elasticDailyPlanList;
    }

    public DescribeElasticDailyPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeElasticDailyPlanResponseBodyElasticDailyPlanList extends TeaModel {
        /**
         * <p>The start date of the current-day scaling plan. The date is in the yyyy-MM-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02</p>
         */
        @NameInMap("Day")
        public String day;

        /**
         * <p>The number of nodes involved in the scaling plan.</p>
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
         * <p>The type of the scaling plan. Default value: executorcombineworker. Valid values:</p>
         * <ul>
         * <li><strong>worker</strong>: scales only elastic I/O resources.</li>
         * <li><strong>executor</strong>: scales only computing resources.</li>
         * <li><strong>executorcombineworker</strong>: scales both elastic I/O resources and computing resources by proportion.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>worker</p>
         */
        @NameInMap("ElasticPlanType")
        public String elasticPlanType;

        /**
         * <p>The resource specifications that can be scaled up by the scaling plan. Default value: 8 Core 64 GB. Valid values:</p>
         * <ul>
         * <li>8 Core 64 GB</li>
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
         * <p>The actual restoration time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02 16:00:00</p>
         */
        @NameInMap("EndTs")
        public String endTs;

        /**
         * <p>The scheduled restoration time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02 16:00:00</p>
         */
        @NameInMap("PlanEndTs")
        public String planEndTs;

        /**
         * <p>The name of the scaling plan.</p>
         * 
         * <strong>example:</strong>
         * <p>realtimeplan</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The scheduled scale-up time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02 15:00:00</p>
         */
        @NameInMap("PlanStartTs")
        public String planStartTs;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ResourcePoolName")
        public String resourcePoolName;

        /**
         * <p>The actual scale-up time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-02 16:00:00</p>
         */
        @NameInMap("StartTs")
        public String startTs;

        /**
         * <p>The execution state of the current-day scaling plan. Multiple values are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The scaling plan is not executed.</li>
         * <li><strong>2</strong>: The scaling plan is being executed.</li>
         * <li><strong>3</strong>: The scaling plan is executed.</li>
         * <li><strong>4</strong>: The scaling plan fails to be executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeElasticDailyPlanResponseBodyElasticDailyPlanList build(java.util.Map<String, ?> map) throws Exception {
            DescribeElasticDailyPlanResponseBodyElasticDailyPlanList self = new DescribeElasticDailyPlanResponseBodyElasticDailyPlanList();
            return TeaModel.build(map, self);
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setElasticNodeNum(Integer elasticNodeNum) {
            this.elasticNodeNum = elasticNodeNum;
            return this;
        }
        public Integer getElasticNodeNum() {
            return this.elasticNodeNum;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setElasticPlanType(String elasticPlanType) {
            this.elasticPlanType = elasticPlanType;
            return this;
        }
        public String getElasticPlanType() {
            return this.elasticPlanType;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setElasticPlanWorkerSpec(String elasticPlanWorkerSpec) {
            this.elasticPlanWorkerSpec = elasticPlanWorkerSpec;
            return this;
        }
        public String getElasticPlanWorkerSpec() {
            return this.elasticPlanWorkerSpec;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setEndTs(String endTs) {
            this.endTs = endTs;
            return this;
        }
        public String getEndTs() {
            return this.endTs;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setPlanEndTs(String planEndTs) {
            this.planEndTs = planEndTs;
            return this;
        }
        public String getPlanEndTs() {
            return this.planEndTs;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setPlanStartTs(String planStartTs) {
            this.planStartTs = planStartTs;
            return this;
        }
        public String getPlanStartTs() {
            return this.planStartTs;
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

        public DescribeElasticDailyPlanResponseBodyElasticDailyPlanList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
