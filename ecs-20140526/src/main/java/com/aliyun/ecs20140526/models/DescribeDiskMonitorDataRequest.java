// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDiskMonitorDataRequest extends TeaModel {
    /**
     * <p>The ID of the disk to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp1bq5g3dxxo1x4o****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The end time of the data. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of seconds (ss) is not 00, the end time is automatically set to the beginning of the next minute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-07-23T12:09:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The granularity of the data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><ol start="60">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="600">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="3600">
     * <li></li>
     * </ol>
     * </li>
     * </ul>
     * <p>Default value: 60.</p>
     * <blockquote>
     * <p>The value of (EndTime – StartTime) / Period must be less than or equal to 400. A maximum of 400 data entries can be returned at a time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the data. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If the value of seconds (ss) is not 00, the start time is automatically set to the beginning of the next minute.</p>
     * <blockquote>
     * <p>You can query the monitoring information of up to the last 30 days. The <code>StartTime</code> parameter cannot be more than 30 days earlier than the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2014-07-23T12:07:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDiskMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskMonitorDataRequest self = new DescribeDiskMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiskMonitorDataRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeDiskMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiskMonitorDataRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDiskMonitorDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDiskMonitorDataRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeDiskMonitorDataRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDiskMonitorDataRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDiskMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
