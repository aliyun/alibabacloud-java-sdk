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

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot extends TeaModel {
        @NameInMap("SourceDiskId")
        public String sourceDiskId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("InstantAccessRetentionDays")
        public Integer instantAccessRetentionDays;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("InstantAccess")
        public Boolean instantAccess;

        @NameInMap("SourceDiskType")
        public String sourceDiskType;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = sourceDiskId;
            return this;
        }
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
            this.instantAccessRetentionDays = instantAccessRetentionDays;
            return this;
        }
        public Integer getInstantAccessRetentionDays() {
            return this.instantAccessRetentionDays;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setInstantAccess(Boolean instantAccess) {
            this.instantAccess = instantAccess;
            return this;
        }
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshotsSnapshot setSourceDiskType(String sourceDiskType) {
            this.sourceDiskType = sourceDiskType;
            return this;
        }
        public String getSourceDiskType() {
            return this.sourceDiskType;
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

    public static class DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SnapshotGroupId")
        public String snapshotGroupId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Snapshots")
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots snapshots;

        public static DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup self = new DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setSnapshotGroupId(String snapshotGroupId) {
            this.snapshotGroupId = snapshotGroupId;
            return this;
        }
        public String getSnapshotGroupId() {
            return this.snapshotGroupId;
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

        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroup setSnapshots(DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public DescribeSnapshotGroupsResponseBodySnapshotGroupsSnapshotGroupSnapshots getSnapshots() {
            return this.snapshots;
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
