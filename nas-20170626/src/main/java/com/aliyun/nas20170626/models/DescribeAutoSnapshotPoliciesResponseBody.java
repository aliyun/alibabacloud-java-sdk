// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPoliciesResponseBody extends TeaModel {
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
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("AutoSnapshotPolicyName")
        public String autoSnapshotPolicyName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FileSystemNums")
        public Integer fileSystemNums;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RepeatWeekdays")
        public String repeatWeekdays;

        @NameInMap("RetentionDays")
        public Integer retentionDays;

        @NameInMap("Status")
        public String status;

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
