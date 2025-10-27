// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeMapRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Concurrency")
    public Long concurrency;

    /**
     * <strong>example:</strong>
     * <p>my_exec_name</p>
     */
    @NameInMap("ExecutionName")
    public String executionName;

    @NameInMap("ItemCounts")
    public DescribeMapRunResponseBodyItemCounts itemCounts;

    /**
     * <strong>example:</strong>
     * <p>c39142f1345b196d678333c41f113000</p>
     */
    @NameInMap("MapRunName")
    public String mapRunName;

    /**
     * <strong>example:</strong>
     * <p>3A44E113-9962-5B0B-AB92-14060EFE3164</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2025-10-24T14:11:26+08:00</p>
     */
    @NameInMap("StartedTime")
    public String startedTime;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>2025-10-24T14:11:28+08:00</p>
     */
    @NameInMap("StoppedTime")
    public String stoppedTime;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ToleratedFailedCount")
    public Long toleratedFailedCount;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ToleratedFailedPercentage")
    public Float toleratedFailedPercentage;

    public static DescribeMapRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMapRunResponseBody self = new DescribeMapRunResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMapRunResponseBody setConcurrency(Long concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Long getConcurrency() {
        return this.concurrency;
    }

    public DescribeMapRunResponseBody setExecutionName(String executionName) {
        this.executionName = executionName;
        return this;
    }
    public String getExecutionName() {
        return this.executionName;
    }

    public DescribeMapRunResponseBody setItemCounts(DescribeMapRunResponseBodyItemCounts itemCounts) {
        this.itemCounts = itemCounts;
        return this;
    }
    public DescribeMapRunResponseBodyItemCounts getItemCounts() {
        return this.itemCounts;
    }

    public DescribeMapRunResponseBody setMapRunName(String mapRunName) {
        this.mapRunName = mapRunName;
        return this;
    }
    public String getMapRunName() {
        return this.mapRunName;
    }

    public DescribeMapRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMapRunResponseBody setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public DescribeMapRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMapRunResponseBody setStoppedTime(String stoppedTime) {
        this.stoppedTime = stoppedTime;
        return this;
    }
    public String getStoppedTime() {
        return this.stoppedTime;
    }

    public DescribeMapRunResponseBody setToleratedFailedCount(Long toleratedFailedCount) {
        this.toleratedFailedCount = toleratedFailedCount;
        return this;
    }
    public Long getToleratedFailedCount() {
        return this.toleratedFailedCount;
    }

    public DescribeMapRunResponseBody setToleratedFailedPercentage(Float toleratedFailedPercentage) {
        this.toleratedFailedPercentage = toleratedFailedPercentage;
        return this;
    }
    public Float getToleratedFailedPercentage() {
        return this.toleratedFailedPercentage;
    }

    public static class DescribeMapRunResponseBodyItemCounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Aborted")
        public Long aborted;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Pending")
        public Long pending;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Running")
        public Long running;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Succeed")
        public Long succeed;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeMapRunResponseBodyItemCounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeMapRunResponseBodyItemCounts self = new DescribeMapRunResponseBodyItemCounts();
            return TeaModel.build(map, self);
        }

        public DescribeMapRunResponseBodyItemCounts setAborted(Long aborted) {
            this.aborted = aborted;
            return this;
        }
        public Long getAborted() {
            return this.aborted;
        }

        public DescribeMapRunResponseBodyItemCounts setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public DescribeMapRunResponseBodyItemCounts setPending(Long pending) {
            this.pending = pending;
            return this;
        }
        public Long getPending() {
            return this.pending;
        }

        public DescribeMapRunResponseBodyItemCounts setRunning(Long running) {
            this.running = running;
            return this;
        }
        public Long getRunning() {
            return this.running;
        }

        public DescribeMapRunResponseBodyItemCounts setSucceed(Long succeed) {
            this.succeed = succeed;
            return this;
        }
        public Long getSucceed() {
            return this.succeed;
        }

        public DescribeMapRunResponseBodyItemCounts setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
