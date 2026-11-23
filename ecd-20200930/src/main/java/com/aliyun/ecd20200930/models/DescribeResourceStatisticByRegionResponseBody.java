// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeResourceStatisticByRegionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics information.</p>
     */
    @NameInMap("Statistic")
    public DescribeResourceStatisticByRegionResponseBodyStatistic statistic;

    public static DescribeResourceStatisticByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceStatisticByRegionResponseBody self = new DescribeResourceStatisticByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceStatisticByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceStatisticByRegionResponseBody setStatistic(DescribeResourceStatisticByRegionResponseBodyStatistic statistic) {
        this.statistic = statistic;
        return this;
    }
    public DescribeResourceStatisticByRegionResponseBodyStatistic getStatistic() {
        return this.statistic;
    }

    public static class DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics extends TeaModel {
        /**
         * <p>The number of assigned users in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssignedEndUserCount")
        public Long assignedEndUserCount;

        /**
         * <p>The number of connected users in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ConnectedEndUserCount")
        public Long connectedEndUserCount;

        /**
         * <p>The number of cloud desktops in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DesktopCount")
        public Long desktopCount;

        /**
         * <p>The number of shared cloud desktops in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DesktopGroupCount")
        public Long desktopGroupCount;

        /**
         * <p>The number of network packages in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetworkPackageCount")
        public Long networkPackageCount;

        /**
         * <p>The number of policy groups in the current region.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PolicyGroupCount")
        public Long policyGroupCount;

        /**
         * <p>The region ID. You can call the <a href="https://next.api.aliyun.com/document/ecd/2020-09-30/DescribeRegions">DescribeRegions</a> operation to query the regions supported by WUYING Workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics self = new DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics setAssignedEndUserCount(Long assignedEndUserCount) {
            this.assignedEndUserCount = assignedEndUserCount;
            return this;
        }
        public Long getAssignedEndUserCount() {
            return this.assignedEndUserCount;
        }

        public DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics setConnectedEndUserCount(Long connectedEndUserCount) {
            this.connectedEndUserCount = connectedEndUserCount;
            return this;
        }
        public Long getConnectedEndUserCount() {
            return this.connectedEndUserCount;
        }

        public DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics setDesktopCount(Long desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public Long getDesktopCount() {
            return this.desktopCount;
        }

        public DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics setDesktopGroupCount(Long desktopGroupCount) {
            this.desktopGroupCount = desktopGroupCount;
            return this;
        }
        public Long getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        public DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics setNetworkPackageCount(Long networkPackageCount) {
            this.networkPackageCount = networkPackageCount;
            return this;
        }
        public Long getNetworkPackageCount() {
            return this.networkPackageCount;
        }

        public DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics setPolicyGroupCount(Long policyGroupCount) {
            this.policyGroupCount = policyGroupCount;
            return this;
        }
        public Long getPolicyGroupCount() {
            return this.policyGroupCount;
        }

        public DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeResourceStatisticByRegionResponseBodyStatistic extends TeaModel {
        /**
         * <p>The statistics by region.</p>
         */
        @NameInMap("RegionStatistics")
        public java.util.List<DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics> regionStatistics;

        public static DescribeResourceStatisticByRegionResponseBodyStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceStatisticByRegionResponseBodyStatistic self = new DescribeResourceStatisticByRegionResponseBodyStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeResourceStatisticByRegionResponseBodyStatistic setRegionStatistics(java.util.List<DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics> regionStatistics) {
            this.regionStatistics = regionStatistics;
            return this;
        }
        public java.util.List<DescribeResourceStatisticByRegionResponseBodyStatisticRegionStatistics> getRegionStatistics() {
            return this.regionStatistics;
        }

    }

}
