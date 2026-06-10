// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    /**
     * <p>The creator.</p>
     * 
     * <strong>example:</strong>
     * <p>Administrator</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The ID of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>ecd-gx2x1dhsmucyy****</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The name of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("DesktopName")
    public String desktopName;

    /**
     * <p>The end time to query for snapshots. The time follows the <a href="t10049.xdita#">ISO 8601</a> standard and is in UTC. The format is <code>yyyy-mm-ddthh:mm:ssz</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-31T06:32:31Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li><p>Maximum value: 100.</p>
     * </li>
     * <li><p>Default value: 10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results. This is the NextToken value from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>8051af8d01b5479bec9f5ddf02e4a8fbd0ab6e7e43f8****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The operating system type.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The ID of the region. Call <a href="t2167755.xdita#"></a>to get a list of regions that support Elastic Desktop Service (EDS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>s-2ze81owrnv9pity4****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The display name of the snapshot. The name must be 2 to 127 characters long. It must start with a letter. It can contain digits, underscores (_), and hyphens (-). The name cannot start with <code>auto</code> to avoid naming conflicts with automatic snapshots.</p>
     * 
     * <strong>example:</strong>
     * <p>Test data disk</p>
     */
    @NameInMap("SnapshotName")
    public String snapshotName;

    /**
     * <p>The snapshot type.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("SnapshotType")
    public String snapshotType;

    /**
     * <p>The disk from which to create the snapshot.</p>
     * <blockquote>
     * <p>The value is case-insensitive.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("SourceDiskType")
    public String sourceDiskType;

    /**
     * <p>The start time to query for snapshots. The time follows the <a href="t10049.xdita#">ISO 8601</a> standard and is in UTC. The format is <code>yyyy-mm-ddthh:mm:ssz</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-30T06:32:31Z</p>
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

    public DescribeSnapshotsRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
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
