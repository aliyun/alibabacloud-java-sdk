// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsRequest extends TeaModel {
    /**
     * <p>The ID of the filing ticket. If this parameter is specified, other optional request parameters are ignored.</p>
     */
    @NameInMap("DemandId")
    public String demandId;

    /**
     * <p>The status of the filing ticket or resource consumption. Valid values:</p>
     * <br>
     * <p>*   Creating: The filing ticket is being created.</p>
     * <p>*   Active: The filed resources are being supplied.</p>
     * <p>*   Expired: The filing ticket expires.</p>
     * <p>*   Finished: The filed resources are consumed.</p>
     * <p>*   Refused: The filing request is denied. To view the reason for denial, see the `Comment` parameter in the response.</p>
     * <p>*   Cancelled: The filing request is canceled.</p>
     */
    @NameInMap("DemandStatus")
    public java.util.List<String> demandStatus;

    /**
     * <p>The source of the filed instance. Default value: System. Valid values:</p>
     * <br>
     * <p>*   Custom: filed on your own.</p>
     * <p>*   System: filed by Alibaba Cloud.</p>
     */
    @NameInMap("DemandType")
    public String demandType;

    /**
     * <p>Specifies whether to perform a dry run. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true: performs a dry run. The system checks whether your AccessKey pair is valid, whether RAM users are granted required permissions, and whether the required parameters are set. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * <p>*   false: performs a dry run and sends the request . If the request passes the dry run, a 2XX HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <p>*   PrePaid: subscription</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The instance type of the filed instance.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The instance family of the filed instance.</p>
     */
    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return. Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region for which to query resources. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDemandsRequestTag> tag;

    /**
     * <p>The ID of the zone for which to query resources. You can call the [DescribeZones](~~25610~~) operation to query the most recent list of zones.</p>
     */
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
        /**
         * <p>> This parameter is unavailable.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>> This parameter is unavailable.</p>
         */
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
