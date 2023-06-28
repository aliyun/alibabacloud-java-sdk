// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The cloud desktop ID.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The cloud desktop name.</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The end of the time range to query. The query is performed based on the time when the system stopped creating a snapshot. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-mm-ddthh:mm:ssz format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>*   Valid values: 1 to 100</p>
     * <p>*   Default value: 10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The snapshot ID.</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The snapshot name. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>The name cannot start with `auto` because snapshots whose names start with auto are recognized as automatic snapshots.</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The snapshot type.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   auto: automatic snapshot</p>
     * <p>*   user: manual snapshot</p>
     * <p>*   all (default): all types of snapshots</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The type of the source disk of which you want to query snapshots. Valid values:</p>
     * <br>
     * <p>*   System: system disk</p>
     * <p>*   Data: data disk</p>
     * <br>
     * <p>> The value of this parameter is not case-sensitive.</p>
     */
    @NameInMap("SourceDiskType")
    public String sourceDiskType;

    /**
     * <p>The beginning of the time range to query. The query is performed based on the time when the system created a snapshot. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-mm-ddthh:mm:ssz format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
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
