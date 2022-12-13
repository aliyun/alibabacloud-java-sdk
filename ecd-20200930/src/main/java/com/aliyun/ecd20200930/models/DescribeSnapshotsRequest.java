// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    // The ID of the cloud desktop.
    @NameInMap("DesktopId")
    public String desktopId;

    // The name of the cloud desktop.
    @NameInMap("DesktopName")
    public String desktopName;

    // The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
    // 
    // If you do not specify a value for this parameter, the current time is used.
    @NameInMap("EndTime")
    public String endTime;

    // The number of entries to return on each page.
    // 
    // *   Maximum value: 100
    // *   Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that determines the start point of the query. Set the value to the NextToken value that is returned from the last call.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the snapshot.
    @NameInMap("SnapshotId")
    public String snapshotId;

    // The name of the snapshot.
    @NameInMap("SnapshotName")
    public String snapshotName;

    @NameInMap("SnapshotType")
    public String snapshotType;

    // The type of the disk for which to create a snapshot. Valid values:
    // 
    // *   system: system disk
    // *   data: data disk
    @NameInMap("SourceDiskType")
    public String sourceDiskType;

    // The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
    // 
    // If you do not specify a value for this parameter, all events that occurred before the point in time that you specify for `EndTime` are queried.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeSnapshotsRequest setDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }
    public String getDesktopName() {
        return this.desktopName;
    }

    public DescribeSnapshotsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSnapshotsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSnapshotsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSnapshotsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnapshotsRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public DescribeSnapshotsRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public DescribeSnapshotsRequest setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }
    public String getSnapshotType() {
        return this.snapshotType;
    }

    public DescribeSnapshotsRequest setSourceDiskType(String sourceDiskType) {
        this.sourceDiskType = sourceDiskType;
        return this;
    }
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    public DescribeSnapshotsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
