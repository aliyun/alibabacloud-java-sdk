// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaPairRequest extends TeaModel {
    /**
     * <p>The bandwidth to use to asynchronously replicate data between the primary disk and secondary disk. Unit: Kbit/s. Valid values:</p>
     * <ul>
     * <li>10240 : equal to 10 Mbit/s</li>
     * <li>20480 : equal to 20 Mbit/s</li>
     * <li>51200 : equal to 50 Mbit/s</li>
     * <li>102400 : equal to 100 Mbit/s</li>
     * </ul>
     * <p>Default value: 10240.</p>
     * <p>When you set the ChargeType parameter to POSTPAY, the Bandwidth parameter is automatically set to 0 and cannot be modified. The value 0 indicates that bandwidth is dynamically allocated based on the volume of data that is asynchronously replicated from the primary disk to the secondary disk.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The billing method of the replication pair. Valid values:</p>
     * <ul>
     * <li>PREPAY: subscription</li>
     * <li>POSTPAY: pay-as-you-go</li>
     * </ul>
     * <p>Default value: POSTPAY.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the replication pair. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the secondary disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-sa1f82p58p1tdw9g****</p>
     */
    @NameInMap("DestinationDiskId")
    public String destinationDiskId;

    /**
     * <p>The region ID of the secondary disk. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The zone ID of the secondary disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("DestinationZoneId")
    public String destinationZoneId;

    /**
     * <p>The ID of the primary disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-iq80sgp4d0xbk24q****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The name of the replication pair. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>TestReplicaPair</p>
     */
    @NameInMap("PairName")
    public String pairName;

    /**
     * <p>The subscription duration of the replication pair. This parameter is required when the <code>ChargeType</code> parameter is set to PREPAY. The unit of the subscription duration is specified by the <code>PeriodUnit</code> parameter.</p>
     * <ul>
     * <li>Valid values when the <code>PeriodUnit</code> parameter is set to Week: 1, 2, 3, and 4.</li>
     * <li>Valid values when the <code>PeriodUnit</code> parameter is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The unit of the subscription duration of the replication pair. Valid values:</p>
     * <ul>
     * <li>Week.</li>
     * <li>Month</li>
     * </ul>
     * <p>Default value: Month.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The recovery point objective (RPO) of the replication pair. Unit: seconds. Set the value to 900.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("RPO")
    public Long RPO;

    /**
     * <p>The ID of the region in which to create the replication pair.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the replication group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvs****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The zone ID of the primary disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-f</p>
     */
    @NameInMap("SourceZoneId")
    public String sourceZoneId;

    /**
     * <p>The resource tags. You can specify up to 20 tags.</p>
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
         * <p>The key of tag N to add to the resource. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
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
