// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaPairRequest extends TeaModel {
    /**
     * <p>The bandwidth for asynchronous data replication between disks. The unit is Kbps. Valid values:</p>
     * <ul>
     * <li><p>10240</p>
     * </li>
     * <li><p>20480</p>
     * </li>
     * <li><p>51200</p>
     * </li>
     * <li><p>102400</p>
     * </li>
     * </ul>
     * <p>Default value: 10240.
     * When ChargeType is set to POSTPAY, you cannot specify this parameter. The system uses a value of 0, which means that the bandwidth is dynamically allocated based on data writes.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The billing method of the replication pair. Valid values:</p>
     * <ul>
     * <li><p>PREPAY: subscription.</p>
     * </li>
     * <li><p>POSTPAY: pay-as-you-go.</p>
     * </li>
     * </ul>
     * <p>Default value: POSTPAY.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>A client token to ensure the idempotence of the request. Generate a value from your client to make sure that the value is unique among different requests. The ClientToken parameter can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the replication pair. The description must be 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the destination disk (secondary disk).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-sa1f82p58p1tdw9g****</p>
     */
    @NameInMap("DestinationDiskId")
    public String destinationDiskId;

    /**
     * <p>The region ID of the destination disk (secondary disk). You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the regions that support asynchronous replication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The zone ID of the destination disk (secondary disk).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("DestinationZoneId")
    public String destinationZoneId;

    /**
     * <p>The ID of the source disk (primary disk).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-iq80sgp4d0xbk24q****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>Specifies whether to enable replication time control (RTC). Valid values:</p>
     * <ul>
     * <li><p>false: Disables RTC.</p>
     * </li>
     * <li><p>true: Enables RTC.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If the replication pair is added to a replication group, the setting of this parameter is the same as that of the replication group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRtc")
    public Boolean enableRtc;

    /**
     * <p>The name of the replication pair. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>TestReplicaPair</p>
     */
    @NameInMap("PairName")
    public String pairName;

    /**
     * <p>The subscription duration of the replication pair. This parameter is required when <code>ChargeType</code> is set to PREPAY. The unit of the duration is specified by <code>PeriodUnit</code>. Valid values: 1, 2, 3, 6, 12, 24, 36, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the subscription duration. Valid value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The recovery point objective (RPO) of the replication pair. The unit is seconds. Currently, only 900 is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("RPO")
    public Long RPO;

    /**
     * <p>The region ID of the replication pair.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the replication pair belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvs****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The zone ID of the source disk (primary disk).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-f</p>
     */
    @NameInMap("SourceZoneId")
    public String sourceZoneId;

    /**
     * <p>The list of tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDiskReplicaPairRequestTag> tag;

    public static CreateDiskReplicaPairRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaPairRequest self = new CreateDiskReplicaPairRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaPairRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateDiskReplicaPairRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDiskReplicaPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDiskReplicaPairRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDiskReplicaPairRequest setDestinationDiskId(String destinationDiskId) {
        this.destinationDiskId = destinationDiskId;
        return this;
    }
    public String getDestinationDiskId() {
        return this.destinationDiskId;
    }

    public CreateDiskReplicaPairRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CreateDiskReplicaPairRequest setDestinationZoneId(String destinationZoneId) {
        this.destinationZoneId = destinationZoneId;
        return this;
    }
    public String getDestinationZoneId() {
        return this.destinationZoneId;
    }

    public CreateDiskReplicaPairRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public CreateDiskReplicaPairRequest setEnableRtc(Boolean enableRtc) {
        this.enableRtc = enableRtc;
        return this;
    }
    public Boolean getEnableRtc() {
        return this.enableRtc;
    }

    public CreateDiskReplicaPairRequest setPairName(String pairName) {
        this.pairName = pairName;
        return this;
    }
    public String getPairName() {
        return this.pairName;
    }

    public CreateDiskReplicaPairRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public CreateDiskReplicaPairRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDiskReplicaPairRequest setRPO(Long RPO) {
        this.RPO = RPO;
        return this;
    }
    public Long getRPO() {
        return this.RPO;
    }

    public CreateDiskReplicaPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiskReplicaPairRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDiskReplicaPairRequest setSourceZoneId(String sourceZoneId) {
        this.sourceZoneId = sourceZoneId;
        return this;
    }
    public String getSourceZoneId() {
        return this.sourceZoneId;
    }

    public CreateDiskReplicaPairRequest setTag(java.util.List<CreateDiskReplicaPairRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDiskReplicaPairRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateDiskReplicaPairRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDiskReplicaPairRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDiskReplicaPairRequestTag self = new CreateDiskReplicaPairRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDiskReplicaPairRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDiskReplicaPairRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
