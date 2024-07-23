// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReportInstancesStatusRequest extends TeaModel {
    /**
     * <p>The description of the exception.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The local disk is unavailable, the mount point is inaccessible, or files cannot be loaded.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The device names of disks on an instance that have the exception. You can specify to 100 device names in a single request.</p>
     * <p>If you are using an ECS bare metal instance, enter the slot numbers of disks on the instance.</p>
     * <blockquote>
     * <p>For ECS bare metal instances, this parameter is required when the value of the <code>Reason</code> parameter is <code>abnormal-local-disk</code> or <code>abnormal-cloud-disk</code> or when the value of the <code>IssueCategory</code> parameter is <code>hardware-disk-error</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/dev/xvdb</p>
     */
    @NameInMap("Device")
    public java.util.List<String> device;

    /**
     * <p>The IDs of disks on an instance that have the exception. You can specify up to 100 disk IDs in a single request. If you are using an ECS bare metal instance, enter the serial numbers of disks on the instance.</p>
     * <blockquote>
     * <p>This parameter is required when the value of the <code>Reason</code> parameter is <code>abnormal-local-disk</code> or <code>abnormal-cloud-disk</code> or when the value of the <code>IssueCategory</code> parameter is <code>hardware-disk-error</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp1aeljlfad7x6u1****</p>
     */
    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    /**
     * <p>The end time of the instance exception. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-11-31T06:32:31Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IDs of instances. You can specify up to 100 instance IDs in a single request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp165p6xk2tmdhj0****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The category of the exception. This parameter is applicable only to ECS bare metal instances. Valid values:</p>
     * <ul>
     * <li>hardware-cpu-error: CPU failure</li>
     * <li>hardware-motherboard-error: motherboard failure</li>
     * <li>hardware-mem-error: memory failure</li>
     * <li>hardware-power-error: power failure</li>
     * <li>hardware-disk-error: disk failure</li>
     * <li>hardware-networkcard-error: network interface controller (NIC) failure</li>
     * <li>hardware-raidcard-error: SAS/RAID card failure</li>
     * <li>hardware-fan-error: fan failure</li>
     * <li>others: other failures</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hardware-cpu-error</p>
     */
    @NameInMap("IssueCategory")
    public String issueCategory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The impact of the exception on the instance. Valid values:</p>
     * <ul>
     * <li>instance-hang: The instance is unavailable or cannot be connected.</li>
     * <li>instance-stuck-in-status: The instance is stuck in a state such as Starting or Stopping.</li>
     * <li>abnormal-network: The instance has a network exception.</li>
     * <li>abnormal-local-disk: A local disk attached to the instance has an exception.</li>
     * <li>abnormal-cloud-disk: A disk or a Shared Block Storage device attached to the instance has an exception.</li>
     * <li>others: other exception types. If the impact is not of the preceding types, you can set <code>Reason</code> to others and specify the <code>Description</code> parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>abnormal-local-disk</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the instance exception. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-11-30T06:32:31Z</p>
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
