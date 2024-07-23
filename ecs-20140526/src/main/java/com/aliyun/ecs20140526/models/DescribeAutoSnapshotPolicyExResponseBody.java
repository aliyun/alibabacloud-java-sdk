// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoSnapshotPolicyExResponseBody extends TeaModel {
    /**
     * <p>Details about the automatic snapshot policies.</p>
     */
    @NameInMap("AutoSnapshotPolicies")
    public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies autoSnapshotPolicies;

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
     * <p>The total number of automatic snapshot policies</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAutoSnapshotPolicyExResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoSnapshotPolicyExResponseBody self = new DescribeAutoSnapshotPolicyExResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoSnapshotPolicyExResponseBody setAutoSnapshotPolicies(DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies autoSnapshotPolicies) {
        this.autoSnapshotPolicies = autoSnapshotPolicies;
        return this;
    }
    public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPolicies getAutoSnapshotPolicies() {
        return this.autoSnapshotPolicies;
    }

    public DescribeAutoSnapshotPolicyExResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeAutoSnapshotPolicyExResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration extends TeaModel {
        /**
         * <p>Whether to enable encryption for cross-region snapshot replication. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the Key Management Service (KMS) key used to encrypt snapshots in cross-region snapshot replication.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        public static DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration self = new DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

    }

    public static class DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag extends TeaModel {
        /**
         * <p>The tag key of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag self = new DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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
        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp67acfmxazb4ph****</p>
         */
        @NameInMap("AutoSnapshotPolicyId")
        public String autoSnapshotPolicyId;

        /**
         * <p>The name of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>testAutoSnapshotPolicyName</p>
         */
        @NameInMap("AutoSnapshotPolicyName")
        public String autoSnapshotPolicyName;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CopiedSnapshotsRetentionDays")
        public Integer copiedSnapshotsRetentionDays;

        /**
         * <p>Encryption configurations for cross-region snapshot replication.</p>
         */
        @NameInMap("CopyEncryptionConfiguration")
        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration copyEncryptionConfiguration;

        /**
         * <p>The time when the automatic snapshot policy was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-10T16:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The number of disks to which the automatic snapshot policy is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiskNums")
        public Integer diskNums;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableCrossRegionCopy")
        public Boolean enableCrossRegionCopy;

        /**
         * <p>The region ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The days of the week on which to create automatic snapshots. Valid values: 1 to 7, which correspond to the days of the week. For example, 1 indicates Monday. One or more days can be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;6&quot;]</p>
         */
        @NameInMap("RepeatWeekdays")
        public String repeatWeekdays;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2kkmhmhs****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The retention period of the automatic snapshots. Unit: days. Valid values:</p>
         * <ul>
         * <li>\-1: Automatic snapshots are retained until they are deleted.</li>
         * <li>1 to 65536: Auto snapshots are retained for the specified number of days. After the retention period of auto snapshots expires, the auto snapshots are automatically deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("RetentionDays")
        public Integer retentionDays;

        /**
         * <p>The status of the automatic snapshot policy. Valid values:</p>
         * <ul>
         * <li>Normal: The automatic snapshot policy is normal.</li>
         * <li>Expire: The automatic snapshot policy cannot be used because your account has overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the automatic snapshot policy.</p>
         */
        @NameInMap("Tags")
        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags tags;

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TargetCopyRegions")
        public String targetCopyRegions;

        /**
         * <p>The points in time of the day at which to create automatic snapshots.</p>
         * <p>The time is displayed in UTC+8. Unit: hours. Valid values: 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. For example, 1 indicates 01:00:00. Multiple points in time can be specified.</p>
         * <p>The parameter value is a JSON array that contains up to 24 points in time separated by commas (,). Example: <code>[&quot;0&quot;, &quot;1&quot;, ... &quot;23&quot;]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1&quot;]</p>
         */
        @NameInMap("TimePoints")
        public String timePoints;

        /**
         * <p>The type of the automatic snapshot policy. Valid values:</p>
         * <ul>
         * <li>Custom: user-defined snapshot policy.</li>
         * <li>System: system-defined snapshot policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The number of extended volumes to which the automatic snapshot policy is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VolumeNums")
        public Integer volumeNums;

        public static DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy self = new DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
            this.autoSnapshotPolicyId = autoSnapshotPolicyId;
            return this;
        }
        public String getAutoSnapshotPolicyId() {
            return this.autoSnapshotPolicyId;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
            this.autoSnapshotPolicyName = autoSnapshotPolicyName;
            return this;
        }
        public String getAutoSnapshotPolicyName() {
            return this.autoSnapshotPolicyName;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setCopiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
            this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
            return this;
        }
        public Integer getCopiedSnapshotsRetentionDays() {
            return this.copiedSnapshotsRetentionDays;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setCopyEncryptionConfiguration(DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration copyEncryptionConfiguration) {
            this.copyEncryptionConfiguration = copyEncryptionConfiguration;
            return this;
        }
        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyCopyEncryptionConfiguration getCopyEncryptionConfiguration() {
            return this.copyEncryptionConfiguration;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRepeatWeekdays(String repeatWeekdays) {
            this.repeatWeekdays = repeatWeekdays;
            return this;
        }
        public String getRepeatWeekdays() {
            return this.repeatWeekdays;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setRetentionDays(Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Integer getRetentionDays() {
            return this.retentionDays;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setTags(DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicyTags getTags() {
            return this.tags;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setTargetCopyRegions(String targetCopyRegions) {
            this.targetCopyRegions = targetCopyRegions;
            return this;
        }
        public String getTargetCopyRegions() {
            return this.targetCopyRegions;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setTimePoints(String timePoints) {
            this.timePoints = timePoints;
            return this;
        }
        public String getTimePoints() {
            return this.timePoints;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAutoSnapshotPolicyExResponseBodyAutoSnapshotPoliciesAutoSnapshotPolicy setVolumeNums(Integer volumeNums) {
            this.volumeNums = volumeNums;
            return this;
        }
        public Integer getVolumeNums() {
            return this.volumeNums;
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
