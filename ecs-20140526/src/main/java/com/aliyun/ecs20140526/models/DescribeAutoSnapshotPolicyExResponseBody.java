// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyExResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("AutoSnapshotPolicies")
    public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies autoSnapshotPolicies;

    public static DescribeAutoSnapshotPolicyExResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyExResponseBody self = new DescribeAutoSnapshotPolicyExResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyExResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoSnapshotPolicyExResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoSnapshotPolicyExResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoSnapshotPolicyExResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAutoSnapshotPolicyExResponseBody setAutoSnapshotPolicies(DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies autoSnapshotPolicies) {
        this.autoSnapshotPolicies = autoSnapshotPolicies;
        return this;
    }
    public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies getAutoSnapshotPolicies() {
        return this.autoSnapshotPolicies;
    }

    public static class DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag self = new DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag> tag;

        public static DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags self = new DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags setTag(java.util.List<DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy extends TeaModel {
        @NameInMap("TimePoints")
        public String timePoints;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("AutoSnapshotPolicyName")
        public String autoSnapshotPolicyName;

        @NameInMap("TargetCopyRegions")
        public String targetCopyRegions;

        @NameInMap("CopiedSnapshotsRetentionDays")
        public Integer copiedSnapshotsRetentionDays;

        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        @NameInMap("RetentionDays")
        public Integer retentionDays;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DiskNums")
        public Integer diskNums;

        @NameInMap("EnableCrossRegionCopy")
        public Boolean enableCrossRegionCopy;

        @NameInMap("RepeatWeekdays")
        public String repeatWeekdays;

        @NameInMap("VolumeNums")
        public Integer volumeNums;

        @NameInMap("Tags")
        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags tags;

        public static DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy self = new DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setTimePoints(String timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public String getTimePoints() {
            return this.timePoints;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }
        public String getAutoSnapshotPolicyName() {
            return this.autoSnapshotPolicyName;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setTargetCopyRegions(String targetCopyRegions) {
            this.targetCopyRegions = targetCopyRegions;
            return this;
        }
        public String getTargetCopyRegions() {
            return this.targetCopyRegions;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setCopiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
            this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
            return this;
        }
        public Integer getCopiedSnapshotsRetentionDays() {
            return this.copiedSnapshotsRetentionDays;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setDiskNums(Integer diskNums) {
            this.diskNums = diskNums;
            return this;
        }
        public Integer getDiskNums() {
            return this.diskNums;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setEnableCrossRegionCopy(Boolean enableCrossRegionCopy) {
            this.enableCrossRegionCopy = enableCrossRegionCopy;
            return this;
        }
        public Boolean getEnableCrossRegionCopy() {
            return this.enableCrossRegionCopy;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRepeatWeekdays(String repeatWeekdays) {
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }
        public String getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setVolumeNums(Integer volumeNums) {
            this.volumeNums = volumeNums;
            return this;
        }
        public Integer getVolumeNums() {
            return this.volumeNums;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setTags(DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies extends TeaModel {
        @NameInMap("AutoSnapshotPolicy")
        public java.util.List<DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy> autoSnapshotPolicy;

        public static DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies self = new DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies setAutoSnapshotPolicy(java.util.List<DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy> autoSnapshotPolicy) {
            this.autoSnapshotPolicy = autoSnapshotPolicy;
            return this;
        }
        public java.util.List<DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy> getAutoSnapshotPolicy() {
            return this.autoSnapshotPolicy;
        }

    }

}
