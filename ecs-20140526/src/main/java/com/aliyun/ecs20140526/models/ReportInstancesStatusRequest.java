// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReportInstancesStatusRequest extends TeaModel {
    /**
     * <p>The detailed description of the anomalous issue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>本地盘不可用，挂载点拒绝访问，无法加载文件。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of device names of the disks that have the same anomalous issue and are attached to the instance. You can specify up to 100 device names.</p>
     * <p>If you are using an ECS Bare Metal server instance, specify the SLOT information list of the disk devices.</p>
     * <blockquote>
     * <p>For ECS bare metal instances, this parameter is required when the <code>Reason</code> parameter is set to <code>abnormal-local-disk</code> or <code>abnormal-cloud-disk</code>, or when the <code>IssueCategory</code> parameter is set to <code>hardware-disk-error</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/dev/xvdb</p>
     */
    @NameInMap("Device")
    public java.util.List<String> device;

    /**
     * <p>The list of IDs of the disks that have the same anomalous issue. You can specify up to 100 disk IDs. If you are using an ECS Bare Metal server instance, specify the SN list of the disk devices.</p>
     * <blockquote>
     * <p>This parameter is required when the <code>Reason</code> parameter is set to <code>abnormal-local-disk</code> or <code>abnormal-cloud-disk</code>, or when the <code>IssueCategory</code> parameter is set to <code>hardware-disk-error</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d-bp1aeljlfad7x6u1****</p>
     */
    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    /**
     * <p>The time when the instance failures ended. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-11-31T06:32:31Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of ECS instance IDs. You can specify up to 100 instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp165p6xk2tmdhj0****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    /**
     * <p>The category of the anomalous issue. This parameter is applicable only to Elastic Compute Service Bare Metal Instance instances. Valid values:</p>
     * <ul>
     * <li>hardware-cpu-error: CPU failure.</li>
     * <li>hardware-motherboard-error: Motherboard failure.</li>
     * <li>hardware-mem-error: Memory failure.</li>
     * <li>hardware-power-error: Power failure.</li>
     * <li>hardware-disk-error: Disk failure.</li>
     * <li>hardware-networkcard-error: Network interface controller (NIC) failure.</li>
     * <li>hardware-raidcard-error: SAS/RAID card failure.</li>
     * <li>hardware-fan-error: Fan failure.</li>
     * <li>others: Other failures.</li>
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
     * <p>The impact of the anomalous issue on the ECS instance. Valid values:</p>
     * <ul>
     * <li>instance-hang: The ECS instance is unavailable or cannot be connected to.</li>
     * <li>instance-stuck-in-status: The ECS instance is stuck in a specific state, such as Starting or Stopping, for an extended period of time.</li>
     * <li>abnormal-network: A network exception occurred on the ECS instance.</li>
     * <li>abnormal-local-disk: A local disk attached to the ECS instance is abnormal.</li>
     * <li>abnormal-cloud-disk: A cloud disk or Shared Block Storage device attached to the ECS instance is abnormal.</li>
     * <li>others: Other exception types. If none of the preceding values apply, set <code>Reason=others</code> and provide more information in <code>Description</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>abnormal-local-disk</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent list of Alibaba Cloud regions.</p>
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
     * <p>The time when the instance failures started. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
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
