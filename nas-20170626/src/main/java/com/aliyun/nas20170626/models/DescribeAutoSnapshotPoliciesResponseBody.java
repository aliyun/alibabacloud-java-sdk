// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPoliciesResponseBody extends TeaModel {
    /**
     * <p>The queried automatic snapshot policies.</p>
     */
    @NameInMap("AutoSnapshotPolicies")
    public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPolicies autoSnapshotPolicies;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of automatic snapshot policies.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAutoSnapshotPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPoliciesResponseBody self = new DescribeAutoSnapshotPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPoliciesResponseBody setAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPolicies autoSnapshotPolicies) {
        this.autoSnapshotPolicies = autoSnapshotPolicies;
        return this;
    }
    public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPolicies getAutoSnapshotPolicies() {
        return this.autoSnapshotPolicies;
    }

    public DescribeAutoSnapshotPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoSnapshotPoliciesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy extends TeaModel {
        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-extreme-233e6****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>The name of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("AutoSnapshotPolicyName")
        public String autoSnapshotPolicyName;

        /**
         * <p>The time when the automatic snapshot policy was created.</p>
         * <p>The time follows the <a href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-04-21T12:08:52Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of file systems to which the automatic snapshot policy applies.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FileSystemNums")
        public Integer fileSystemNums;

        /**
         * <p>The type of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The region ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The days of a week on which auto snapshots are created.</p>
         * <p>Auto snapshots are created on a weekly basis.</p>
         * <p>Valid values: 1 to 7. The values from 1 to 7 indicate 7 days in a week from Monday to Sunday.</p>
         * 
         * <strong>example:</strong>
         * <p>1,5</p>
         */
        @NameInMap("RepeatWeekdays")
        public String repeatWeekdays;

        /**
         * <p>The retention period of auto snapshots.</p>
         * <p>Unit: days.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>\-1: Auto snapshots are permanently retained. After the number of auto snapshots exceeds the upper limit, the earliest auto snapshot is automatically deleted.</li>
         * <li>1 to 65536: Auto snapshots are retained for the specified days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RetentionDays")
        public Integer retentionDays;

        /**
         * <p>The status of the automatic snapshot policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Creating: The automatic snapshot policy is being created.</li>
         * <li>Available: The automatic snapshot policy is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The points in time at which auto snapshots are created.</p>
         * <p>Unit: hours.</p>
         * <p>Valid values: <code>0 to 23</code>. The values from 0 to 23 indicate a total of 24 hours from <code>00:00 to 23:00</code>. For example, 1 indicates 01:00. A maximum of 24 points in time can be returned. Multiple points in time are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>4,19</p>
         */
        @NameInMap("TimePoints")
        public String timePoints;

        public static DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy self = new DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }
        public String getAutoSnapshotPolicyName() {
            return this.autoSnapshotPolicyName;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setFileSystemNums(Integer fileSystemNums) {
            this.fileSystemNums = fileSystemNums;
            return this;
        }
        public Integer getFileSystemNums() {
            return this.fileSystemNums;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRepeatWeekdays(String repeatWeekdays) {
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }
        public String getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setTimePoints(String timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public String getTimePoints() {
            return this.timePoints;
        }

    }

    public static class DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPolicies extends TeaModel {
        @NameInMap("AutoSnapshotPolicy")
        public java.util.List<DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy> autoSnapshotPolicy;

        public static DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPolicies self = new DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPolicies setAutoSnapshotPolicy(java.util.List<DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy> autoSnapshotPolicy) {
            this.autoSnapshotPolicy = autoSnapshotPolicy;
            return this;
        }
        public java.util.List<DescribeAutoSnapshotPoliciesResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy> getAutoSnapshotPolicy() {
            return this.autoSnapshotPolicy;
        }

    }

}
