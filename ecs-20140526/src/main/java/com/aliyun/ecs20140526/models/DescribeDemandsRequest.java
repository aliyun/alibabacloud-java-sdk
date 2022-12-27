// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsRequest extends TeaModel {
    // The ID of the filing ticket. If this parameter is specified, other optional request parameters are ignored.
    @NameInMap("DemandId")
    public String demandId;

    // The status of the filing ticket or resource usage. Valid values:
    // 
    // *   Creating: The filing ticket is being created.
    // *   Active: The filed resources are being supplied.
    // *   Expired: The filing ticket expires.
    // *   Finished: The filed resources are consumed.
    // *   Refused: The filing request is denied. For reasons why the request is denied, see the `Comment` response parameter.
    // *   Cancelled: The filing request is canceled.
    @NameInMap("DemandStatus")
    public java.util.List<String> demandStatus;

    // The source of the filed instance. Default value: System. Valid values:
    // 
    // *   Custom: filed on your own.
    // *   System: filed by Alibaba Cloud.
    @NameInMap("DemandType")
    public String demandType;

    // Specifies whether to check the validity of the request without actually making the request. Default value: false. Valid values:
    // 
    // *   true: sends a check request, without querying the status of the filing ticket. The system checks whether your AccessKey pair is valid, whether RAM users are authorized, and whether the required parameters are set. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.
    // *   false: sends an API request. If the request succeeds, a 2XX HTTP status code is returned and the status of the filing ticket is queried.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // The billing method of the instance. Valid values:
    // 
    // *   PostPaid: pay-as-you-go
    // *   PrePaid: subscription
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    // The instance type of the filed instance.
    @NameInMap("InstanceType")
    public String instanceType;

    // The instance family of the filed instance.
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values: 1 to 100.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeDemandsRequestTag> tag;

    // The zone ID. You can call the [DescribeZones](~~25610~~) operation to query the most recent zone list.
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeDemandsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDemandsRequest self = new DescribeDemandsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDemandsRequest setDemandId(String demandId) {
        this.demandId = demandId;
        return this;
    }
    public String getDemandId() {
        return this.demandId;
    }

    public DescribeDemandsRequest setDemandStatus(java.util.List<String> demandStatus) {
        this.demandStatus = demandStatus;
        return this;
    }
    public java.util.List<String> getDemandStatus() {
        return this.demandStatus;
    }

    public DescribeDemandsRequest setDemandType(String demandType) {
        this.demandType = demandType;
        return this;
    }
    public String getDemandType() {
        return this.demandType;
    }

    public DescribeDemandsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeDemandsRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeDemandsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeDemandsRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeDemandsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDemandsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDemandsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDemandsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDemandsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDemandsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDemandsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDemandsRequest setTag(java.util.List<DescribeDemandsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDemandsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeDemandsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeDemandsRequestTag extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static DescribeDemandsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsRequestTag self = new DescribeDemandsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDemandsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
