// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("SnapshotGroups")
    @Validation(required = true)
    public DescribeSnapshotGroupsResponseSnapshotGroups snapshotGroups;

    public static DescribeSnapshotGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotGroupsResponse self = new DescribeSnapshotGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSnapshotGroupsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotGroupsResponse setSnapshotGroups(DescribeSnapshotGroupsResponseSnapshotGroups snapshotGroups) {
        this.snapshotGroups = snapshotGroups;
        return this;
    }
    public DescribeSnapshotGroupsResponseSnapshotGroups getSnapshotGroups() {
        return this.snapshotGroups;
    }

    public static class DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot extends TeaModel {
        @NameInMap("SnapshotId")
        @Validation(required = true)
        public String snapshotId;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("SourceDiskId")
        @Validation(required = true)
        public String sourceDiskId;

        @NameInMap("SourceDiskType")
        @Validation(required = true)
        public String sourceDiskType;

        @NameInMap("InstantAccess")
        @Validation(required = true)
        public Boolean instantAccess;

        @NameInMap("InstantAccessRetentionDays")
        @Validation(required = true)
        public Integer instantAccessRetentionDays;

        public static DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot self = new DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }
        public Integer getInstantAccessRetentionDays() {
            return this.instantAccessRetentionDays;
        }

    }

    public static class DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot> snapshot;

        public static DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshots build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshots self = new DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshots();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshots setSnapshot(java.util.List<DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshotsSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("SnapshotGroupId")
        @Validation(required = true)
        public String snapshotGroupId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshots snapshots;

        public static DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup self = new DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup setSnapshotGroupId(String snapshotGroupId) {
            this.snapshotGroupId = snapshotGroupId;
            return this;
        }
        public String getSnapshotGroupId() {
            return this.snapshotGroupId;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup setSnapshots(DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroupSnapshots getSnapshots() {
            return this.snapshots;
        }

    }

    public static class DescribeSnapshotGroupsResponseSnapshotGroups extends TeaModel {
        @NameInMap("SnapshotGroup")
        @Validation(required = true)
        public java.util.List<DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup> snapshotGroup;

        public static DescribeSnapshotGroupsResponseSnapshotGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseSnapshotGroups self = new DescribeSnapshotGroupsResponseSnapshotGroups();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseSnapshotGroups setSnapshotGroup(java.util.List<DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup> snapshotGroup) {
            this.snapshotGroup = snapshotGroup;
            return this;
        }
        public java.util.List<DescribeSnapshotGroupsResponseSnapshotGroupsSnapshotGroup> getSnapshotGroup() {
            return this.snapshotGroup;
        }

    }

}
