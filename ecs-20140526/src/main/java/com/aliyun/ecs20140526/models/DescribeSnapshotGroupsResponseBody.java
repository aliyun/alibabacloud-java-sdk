// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        @NameInMap("InstantAccessRetentionDays")
        public Integer instantAccessRetentionDays;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("SourceDiskType")
        public String sourceDiskType;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProgressStatus")
        public String progressStatus;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SnapshotGroupId")
        public String snapshotGroupId;

        @NameInMap("Snapshots")
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots snapshots;

        @NameInMap("Status")
        public String status;

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
