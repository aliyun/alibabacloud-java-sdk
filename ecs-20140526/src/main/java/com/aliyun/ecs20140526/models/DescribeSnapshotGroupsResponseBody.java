// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotGroupsResponseBody extends TeaModel {
    /**
     * <p>The token used to start the next query.</p>
     * <blockquote>
     * <p>If the return value is empty, no more data exists.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3F9A4CC4-362F-469A-B9EF-B3204EF8AA3A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the snapshot-consistent groups.</p>
     */
    @NameInMap("SnapshotGroups")
    public DescribeSnapshotGroupsResponseBodySnapshotGroups snapshotGroups;

    public static DescribeSnapshotGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotGroupsResponseBody self = new DescribeSnapshotGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotGroupsResponseBody setSnapshotGroups(DescribeSnapshotGroupsResponseBodySnapshotGroups snapshotGroups) {
        this.snapshotGroups = snapshotGroups;
        return this;
    }
    public DescribeSnapshotGroupsResponseBodySnapshotGroups getSnapshotGroups() {
        return this.snapshotGroups;
    }

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag extends TeaModel {
        /**
         * <p>The tag key of the snapshot. The default values of Key and Value contain snapshot source information.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:createFrom</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the snapshot. The default values of Key and Value contain snapshot source information.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp11qm0o3dk4iuc****</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag> tag;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags setTag(java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot extends TeaModel {
        /**
         * <p>Indicates whether the snapshot can be shared and be used to create or roll back a disk. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Available")
        public Boolean available;

        /**
         * <p>Indicates whether the instant access feature is enabled. Valid values:</p>
         * <ul>
         * <li>true: The instant access feature is enabled. By default, the instant access feature is enabled for ESSDs.</li>
         * <li>false: The instant access feature is disabled. The snapshot is a standard snapshot for which the instant access feature is disabled.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is no longer used. By default, standard snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        /**
         * <p>The validity period of the instant access feature. When the validity period ends, the instant access snapshot is automatically released.</p>
         * <blockquote>
         * <p> This parameter is no longer used. By default, standard snapshots of ESSDs are upgraded to instant access snapshots free of charge without the need for additional configurations. For more information, see <a href="https://help.aliyun.com/document_detail/193667.html">Use the instant access feature</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("InstantAccessRetentionDays")
        public Integer instantAccessRetentionDays;

        /**
         * <p>The progress of the snapshot creation task. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-j6cbzmrlbf09w72q****</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The ID of the source disk. This parameter is retained even after the source disk of the snapshot is released.</p>
         * 
         * <strong>example:</strong>
         * <p>d-j6c3ogynmvpi6wy7****</p>
         */
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        /**
         * <p>The type of the source disk. Valid values:</p>
         * <ul>
         * <li>system: system disk</li>
         * <li>data: data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        /**
         * <p>The tags of the snapshot. The default values contain snapshot source information.</p>
         */
        @NameInMap("Tags")
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags tags;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }
        public Integer getInstantAccessRetentionDays() {
            return this.instantAccessRetentionDays;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setTags(DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot> snapshot;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots setSnapshot(java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag extends TeaModel {
        /**
         * <p>The tag key of the snapshot-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the snapshot-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag> tag;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTags self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTags();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTags setTag(java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup extends TeaModel {
        /**
         * <p>The time when the snapshot-consistent group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-23T10:58:48Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the snapshot-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the instance to which the snapshot-consistent group belongs. This parameter has a value only when all disk snapshots in the snapshot-consistent group belong to the same instance. If disk snapshots in the snapshot-consistent group belong to different instances, you can check the response parameters that start with <code>Snapshots.Snapshot.Tags.</code> to determine the ID of the instance to which each snapshot in the snapshot-consistent group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6ca469urv8ei629****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the snapshot-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProgressStatus")
        public String progressStatus;

        /**
         * <p>The ID of the resource group to which the snapshot-consistent group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the snapshot-consistent group.</p>
         * 
         * <strong>example:</strong>
         * <p>ssg-j6ciyh3k52qp7ovm****</p>
         */
        @NameInMap("SnapshotGroupId")
        public String snapshotGroupId;

        /**
         * <p>The information about the snapshots in the snapshot-consistent group.</p>
         */
        @NameInMap("Snapshots")
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots snapshots;

        /**
         * <p>The state of the snapshot-consistent group. Valid values:</p>
         * <ul>
         * <li>progressing: The snapshot-consistent group was being created.</li>
         * <li>accomplished: The snapshot-consistent group was created.</li>
         * <li>failed: The snapshot-consistent group failed to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accomplished</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the snapshot-consistent group.</p>
         */
        @NameInMap("Tags")
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTags tags;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setProgressStatus(String progressStatus) {
            this.progressStatus = progressStatus;
            return this;
        }
        public String getProgressStatus() {
            return this.progressStatus;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setSnapshotGroupId(String snapshotGroupId) {
            this.snapshotGroupId = snapshotGroupId;
            return this;
        }
        public String getSnapshotGroupId() {
            return this.snapshotGroupId;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setSnapshots(DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots getSnapshots() {
            return this.snapshots;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setTags(DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroups extends TeaModel {
        @NameInMap("SnapshotGroup")
        public java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup> snapshotGroup;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroups self = new DescribeSnapshotGroupsResponseBodySnapshotGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroups setSnapshotGroup(java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup> snapshotGroup) {
            this.snapshotGroup = snapshotGroup;
            return this;
        }
        public java.util.List<DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup> getSnapshotGroup() {
            return this.snapshotGroup;
        }

    }

}
