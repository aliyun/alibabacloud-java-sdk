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
         */
        @NameInMap("Day")
        public String day;

        /**
         * <p>The number of nodes involved in the scaling plan.</p>
         * <br>
         * <p>*   If ElasticPlanType is set to **worker**, a value of 0 or null is returned.</p>
         * <p>*   If ElasticPlanType is set to **executorcombineworker** or **executor**, a value greater than 0 is returned.</p>
         */
        @NameInMap("ElasticNodeNum")
        public Integer elasticNodeNum;

        /**
         * <p>The type of the scaling plan. Default value: executorcombineworker. Valid values:</p>
         * <br>
         * <p>*   **worker**: scales only elastic I/O resources.</p>
         * <p>*   **executor**: scales only computing resources.</p>
         * <p>*   **executorcombineworker**: scales both elastic I/O resources and computing resources by proportion.</p>
         */
        @NameInMap("ElasticPlanType")
        public String elasticPlanType;

        /**
         * <p>The resource specifications that can be scaled up by the scaling plan. Default value: 8 Core 64 GB. Valid values:</p>
         * <br>
         * <p>*   8 Core 64 GB</p>
         * <p>*   16 Core 64 GB</p>
         * <p>*   32 Core 64 GB</p>
         * <p>*   64 Core 128 GB</p>
         * <p>*   12 Core 96 GB</p>
         * <p>*   24 Core 96 GB</p>
         * <p>*   52 Core 86 GB</p>
         */
        @NameInMap("ElasticPlanWorkerSpec")
        public String elasticPlanWorkerSpec;

        /**
         * <p>The actual restoration time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndTs")
        public String endTs;

        /**
         * <p>The scheduled restoration time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("PlanEndTs")
        public String planEndTs;

        /**
         * <p>The name of the scaling plan.</p>
         */
        @NameInMap("PlanName")
        public String planName;

        /**
         * <p>The scheduled scale-up time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("PlanStartTs")
        public String planStartTs;

        /**
         * <p>The name of the resource group.</p>
         */
        @NameInMap("ResourcePoolName")
        public String resourcePoolName;

        /**
         * <p>The actual scale-up time. The time is in the yyyy-MM-dd hh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartTs")
        public String startTs;

        /**
         * <p>The execution state of the current-day scaling plan. Multiple values are separated by commas (,). Valid values:</p>
         * <br>
         * <p>*   **1**: The scaling plan is not executed.</p>
         * <p>*   **2**: The scaling plan is being executed.</p>
         * <p>*   **3**: The scaling plan is executed.</p>
         * <p>*   **4**: The scaling plan fails to be executed.</p>
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
