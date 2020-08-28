// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyExResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("AutoSnapshotPolicies")
    @Validation(required = true)
    public DescribeAutoSnapshotPolicyExResponseAutoSnapshotPolicies autoSnapshotPolicies;

    public static DescribeAutoSnapshotPolicyExResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyExResponse self = new DescribeAutoSnapshotPolicyExResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag self = new DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag> tag;

        public static DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTags self = new DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicy extends TeaModel {
        @NameInMap("AutoSnapshotPolicyId")
        @Validation(required = true)
        public String autoSnapshotPolicyId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("AutoSnapshotPolicyName")
        @Validation(required = true)
        public String autoSnapshotPolicyName;

        @NameInMap("TimePoints")
        @Validation(required = true)
        public String timePoints;

        @NameInMap("RepeatWeekdays")
        @Validation(required = true)
        public String repeatWeekdays;

        @NameInMap("RetentionDays")
        @Validation(required = true)
        public Integer retentionDays;

        @NameInMap("DiskNums")
        @Validation(required = true)
        public Integer diskNums;

        @NameInMap("VolumeNums")
        @Validation(required = true)
        public Integer volumeNums;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("EnableCrossRegionCopy")
        @Validation(required = true)
        public Boolean enableCrossRegionCopy;

        @NameInMap("TargetCopyRegions")
        @Validation(required = true)
        public String targetCopyRegions;

        @NameInMap("CopiedSnapshotsRetentionDays")
        @Validation(required = true)
        public Integer copiedSnapshotsRetentionDays;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicyTags tags;

        public static DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicy self = new DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicy();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoSnapshotPolicyExResponseAutoSnapshotPolicies extends TeaModel {
        @NameInMap("AutoSnapshotPolicy")
        @Validation(required = true)
        public java.util.List<DescribeAutoSnapshotPolicyExResponseAutoSnapshotPoliciesAutoSnapshotPolicy> autoSnapshotPolicy;

        public static DescribeAutoSnapshotPolicyExResponseAutoSnapshotPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseAutoSnapshotPolicies self = new DescribeAutoSnapshotPolicyExResponseAutoSnapshotPolicies();
            return TeaModel.build(map, self);
        }

    }

}
