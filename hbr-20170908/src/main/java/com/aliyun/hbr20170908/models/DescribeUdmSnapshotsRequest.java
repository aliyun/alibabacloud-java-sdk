// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DescribeUdmSnapshotsRequest extends TeaModel {
    /**
     * <p>The ID of the disk.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1560750pclffpzxy70</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The end of the time range to query. The value must be a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1643092168</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the ECS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp18x2k7sw925ir7ofh8</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the backup job.</p>
     * 
     * <strong>example:</strong>
     * <p>job-*********************</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The list of backup snapshots.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;s-000e3vhhu62xsm6v92r0\&quot;]</p>
     */
    @NameInMap("SnapshotIds")
    public java.util.Map<String, ?> snapshotIds;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>UDM_ECS</strong>: ECS instance backup</li>
     * <li><strong>UDM_ECS_DISK</strong>: disk backup subtask of ECS instance backup</li>
     * <li><strong>UDM_DISK</strong>: disk backup</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UDM_ECS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The beginning of the time range to query. The value must be a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1642057551</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The ID of the region where the ECS instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("UdmRegionId")
    public String udmRegionId;

    public static DescribeUdmSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUdmSnapshotsRequest self = new DescribeUdmSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUdmSnapshotsRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeUdmSnapshotsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeUdmSnapshotsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUdmSnapshotsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeUdmSnapshotsRequest setSnapshotIds(java.util.Map<String, ?> snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }
    public java.util.Map<String, ?> getSnapshotIds() {
        return this.snapshotIds;
    }

    public DescribeUdmSnapshotsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DescribeUdmSnapshotsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeUdmSnapshotsRequest setUdmRegionId(String udmRegionId) {
        this.udmRegionId = udmRegionId;
        return this;
    }
    public String getUdmRegionId() {
        return this.udmRegionId;
    }

}
