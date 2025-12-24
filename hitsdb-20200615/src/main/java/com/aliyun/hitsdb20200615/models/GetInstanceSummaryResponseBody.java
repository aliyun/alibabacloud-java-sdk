// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LockingCount")
    public Integer lockingCount;

    @NameInMap("RegionalSummary")
    public java.util.List<GetInstanceSummaryResponseBodyRegionalSummary> regionalSummary;

    /**
     * <strong>example:</strong>
     * <p>1556DCB0-043A-4444-8BD9-CF4A68E7EE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("RunningCount")
    public Integer runningCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetInstanceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryResponseBody self = new GetInstanceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryResponseBody setLockingCount(Integer lockingCount) {
        this.lockingCount = lockingCount;
        return this;
    }
    public Integer getLockingCount() {
        return this.lockingCount;
    }

    public GetInstanceSummaryResponseBody setRegionalSummary(java.util.List<GetInstanceSummaryResponseBodyRegionalSummary> regionalSummary) {
        this.regionalSummary = regionalSummary;
        return this;
    }
    public java.util.List<GetInstanceSummaryResponseBodyRegionalSummary> getRegionalSummary() {
        return this.regionalSummary;
    }

    public GetInstanceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSummaryResponseBody setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }
    public Integer getRunningCount() {
        return this.runningCount;
    }

    public GetInstanceSummaryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetInstanceSummaryResponseBodyRegionalSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LockingCount")
        public Integer lockingCount;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RunningCount")
        public Integer runningCount;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetInstanceSummaryResponseBodyRegionalSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSummaryResponseBodyRegionalSummary self = new GetInstanceSummaryResponseBodyRegionalSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceSummaryResponseBodyRegionalSummary setLockingCount(Integer lockingCount) {
            this.lockingCount = lockingCount;
            return this;
        }
        public Integer getLockingCount() {
            return this.lockingCount;
        }

        public GetInstanceSummaryResponseBodyRegionalSummary setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceSummaryResponseBodyRegionalSummary setRunningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Integer getRunningCount() {
            return this.runningCount;
        }

        public GetInstanceSummaryResponseBodyRegionalSummary setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
