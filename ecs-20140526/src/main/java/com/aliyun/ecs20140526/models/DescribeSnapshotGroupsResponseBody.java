// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotGroupsResponseBody extends TeaModel {
    // The token used to start the next query.
    // 
    // >  If this parameter is empty, no more data is returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Details of the snapshot-consistent groups.
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
        // The tag key of each snapshot in the snapshot-consistent group. The default values of Key and Value contain the details of the instance to which the snapshot-consistent group belongs.
        @NameInMap("Key")
        public String key;

        // The tag value of each snapshot in the snapshot-consistent group. The default values of Key and Value contain the details of the instance to which the snapshot-consistent group belongs.
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
        // Indicates whether the instant access feature is enabled. Valid values:
        // 
        // - true: The instant access feature is enabled. This feature can be enabled only for enhanced SSDs (ESSDs).
        // - false: The instant access feature is disabled. The snapshot is a normal snapshot for which the instant access feature is disabled.
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        // The retention period of the instant access feature. After the retention period ends, the snapshot is automatically released.
        @NameInMap("InstantAccessRetentionDays")
        public Integer instantAccessRetentionDays;

        // The progress of the snapshot creation task. Unit: percent (%).
        @NameInMap("Progress")
        public String progress;

        // The ID of the snapshot.
        @NameInMap("SnapshotId")
        public String snapshotId;

        // The ID of the source disk. This parameter is retained even after the source disk of the snapshot is released.
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        // The type of the source disk. Valid values:
        // 
        // - system: system disk
        // - data: data disk
        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        // The tags of the snapshots in the snapshot-consistent group. The default value contains the details of the instance to which the snapshot-consistent group belongs.
        @NameInMap("Tags")
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshotTags tags;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot();
            return TeaModel.build(map, self);
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
        // The tag key of the snapshot-consistent group.
        @NameInMap("Key")
        public String key;

        // The tag value of the snapshot-consistent group.
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
        // The time when the snapshot-consistent group was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the snapshot-consistent group.
        @NameInMap("Description")
        public String description;

        // The ID of the instance to which the snapshot-consistent group belongs. This parameter has a value only when all disk snapshots in the snapshot-consistent group belong to the same instance. If disk snapshots in the snapshot-consistent group belong to different instances, you can use parameters starting with `Snapshots.Snapshot.Tags.` in the response to view the ID of the instance to which each snapshot in the snapshot-consistent group belongs.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the snapshot-consistent group.
        @NameInMap("Name")
        public String name;

        // >  This parameter is unavailable.
        @NameInMap("ProgressStatus")
        public String progressStatus;

        // The ID of the resource group to which the snapshot-consistent group belongs.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The ID of the snapshot-consistent group.
        @NameInMap("SnapshotGroupId")
        public String snapshotGroupId;

        // Details of the snapshots in the snapshot-consistent group.
        @NameInMap("Snapshots")
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots snapshots;

        // The state of the snapshot-consistent group. Valid values:
        // 
        // *   progressing: The snapshot-consistent group is being created.
        // *   accomplished: The snapshot-consistent group is created.
        // *   failed: The snapshot-consistent group fails to be created.
        @NameInMap("Status")
        public String status;

        // The tags of the snapshot-consistent group.
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
