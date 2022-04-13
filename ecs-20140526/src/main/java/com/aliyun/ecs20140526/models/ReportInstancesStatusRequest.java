// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReportInstancesStatusRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Device")
    public java.util.List<String> device;

    @NameInMap("DiskId")
    public java.util.List<String> diskId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("IssueCategory")
    public String issueCategory;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
