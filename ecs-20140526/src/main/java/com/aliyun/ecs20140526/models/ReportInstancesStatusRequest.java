// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReportInstancesStatusRequest extends TeaModel {
    /**
     * <p>The detailed description of the exception.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Device")
    public java.util.List<String> device;

    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    /**
     * <p>The end time of the instance exception. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The category of the exception. This parameter is applicable only to ECS bare metal instances. Valid values:</p>
     * <br>
     * <p>*   hardware-cpu-error: CPU failure</p>
     * <p>*   hardware-motherboard-error: motherboard failure</p>
     * <p>*   hardware-mem-error: memory failure</p>
     * <p>*   hardware-power-error: power failure</p>
     * <p>*   hardware-disk-error: disk failure</p>
     * <p>*   hardware-networkcard-error: network interface controller (NIC) failure</p>
     * <p>*   hardware-raidcard-error: SAS/RAID card failure</p>
     * <p>*   hardware-fan-error: fan failure</p>
     * <p>*   others: other failures</p>
     */
    @NameInMap("IssueCategory")
    public String issueCategory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The reason why the exception occurs to the ECS instance. Valid values:</p>
     * <br>
     * <p>*   instance-hang: The instance is unavailable or cannot be connected.</p>
     * <p>*   instance-stuck-in-status: The instance is stuck in a state such as Starting or Stopping.</p>
     * <p>*   abnormal-network: The instance has a network exception.</p>
     * <p>*   abnormal-local-disk: A local disk attached to the instance has an exception.</p>
     * <p>*   abnormal-cloud-disk: A disk or a Shared Block Storage device attached to the instance has an exception.</p>
     * <p>*   others: other exception types. If the exception is not of the preceding types, you can set `Reason` to others and specify the `Description` parameter.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the instance exception. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ReportInstancesStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportInstancesStatusRequest self = new ReportInstancesStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportInstancesStatusRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ReportInstancesStatusRequest setDevice(java.util.List<String> device) {
        this.device = device;
        return this;
    }
    public java.util.List<String> getDevice() {
        return this.device;
    }

    public ReportInstancesStatusRequest setDiskId(java.util.List<String> diskId) {
        this.diskId = diskId;
        return this;
    }
    public java.util.List<String> getDiskId() {
        return this.diskId;
    }

    public ReportInstancesStatusRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ReportInstancesStatusRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public ReportInstancesStatusRequest setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }
    public String getIssueCategory() {
        return this.issueCategory;
    }

    public ReportInstancesStatusRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReportInstancesStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReportInstancesStatusRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ReportInstancesStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReportInstancesStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReportInstancesStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReportInstancesStatusRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
