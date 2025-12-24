// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeInstanceCreateAndDeleteStatisticsResponseBody extends TeaModel {
    @NameInMap("InstanceCreateAndDeleteStatistics")
    public DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatistics instanceCreateAndDeleteStatistics;

    /**
     * <strong>example:</strong>
     * <p>086EFCD4-C76F-4DC6-9EE9-0D9B711E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceCreateAndDeleteStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCreateAndDeleteStatisticsResponseBody self = new DescribeInstanceCreateAndDeleteStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCreateAndDeleteStatisticsResponseBody setInstanceCreateAndDeleteStatistics(DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatistics instanceCreateAndDeleteStatistics) {
        this.instanceCreateAndDeleteStatistics = instanceCreateAndDeleteStatistics;
        return this;
    }
    public DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatistics getInstanceCreateAndDeleteStatistics() {
        return this.instanceCreateAndDeleteStatistics;
    }

    public DescribeInstanceCreateAndDeleteStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("CreatedVmCount")
        public Integer createdVmCount;

        /**
         * <strong>example:</strong>
         * <p>34</p>
         */
        @NameInMap("DestroyedVmCount")
        public Integer destroyedVmCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("StartedVmCount")
        public Integer startedVmCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StoppedVmCount")
        public Integer stoppedVmCount;

        /**
         * <strong>example:</strong>
         * <p>2025121623</p>
         */
        @NameInMap("Time")
        public String time;

        public static DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic self = new DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic setCreatedVmCount(Integer createdVmCount) {
            this.createdVmCount = createdVmCount;
            return this;
        }
        public Integer getCreatedVmCount() {
            return this.createdVmCount;
        }

        public DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic setDestroyedVmCount(Integer destroyedVmCount) {
            this.destroyedVmCount = destroyedVmCount;
            return this;
        }
        public Integer getDestroyedVmCount() {
            return this.destroyedVmCount;
        }

        public DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic setStartedVmCount(Integer startedVmCount) {
            this.startedVmCount = startedVmCount;
            return this;
        }
        public Integer getStartedVmCount() {
            return this.startedVmCount;
        }

        public DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic setStoppedVmCount(Integer stoppedVmCount) {
            this.stoppedVmCount = stoppedVmCount;
            return this;
        }
        public Integer getStoppedVmCount() {
            return this.stoppedVmCount;
        }

        public DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatistics extends TeaModel {
        @NameInMap("Statistic")
        public java.util.List<DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic> statistic;

        public static DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatistics self = new DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatistics setStatistic(java.util.List<DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic> statistic) {
            this.statistic = statistic;
            return this;
        }
        public java.util.List<DescribeInstanceCreateAndDeleteStatisticsResponseBodyInstanceCreateAndDeleteStatisticsStatistic> getStatistic() {
            return this.statistic;
        }

    }

}
