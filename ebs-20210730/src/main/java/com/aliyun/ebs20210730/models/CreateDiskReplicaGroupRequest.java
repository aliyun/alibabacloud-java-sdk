// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaGroupRequest extends TeaModel {
    /**
     * <p>The bandwidth value. Unit: Kbit/s.</p>
     * <br>
     * <p>>  This parameter is unavailable.</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the replication pair-consistent group. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The region ID of the secondary site.</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The zone ID of the secondary site.</p>
     */
    @NameInMap("DestinationZoneId")
    public String destinationZoneId;

    /**
     * <p>The name of the replication pair-consistent group. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The RPO of the replication pair-consistent group. Unit: seconds. Set the value to 900.</p>
     */
    @NameInMap("RPO")
    public Long RPO;

    /**
     * <p>The ID of the region in which to create the replication pair-consistent group. The primary site is deployed in this region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the replication group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The zone ID of the primary site.</p>
     */
    @NameInMap("SourceZoneId")
    public String sourceZoneId;

    /**
     * <p>The resource tags. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDiskReplicaGroupRequestTag> tag;

    public static CreateDiskReplicaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskReplicaGroupRequest self = new CreateDiskReplicaGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiskReplicaGroupRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateDiskReplicaGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDiskReplicaGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDiskReplicaGroupRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CreateDiskReplicaGroupRequest setDestinationZoneId(String destinationZoneId) {
        this.destinationZoneId = destinationZoneId;
        return this;
    }
    public String getDestinationZoneId() {
        return this.destinationZoneId;
    }

    public CreateDiskReplicaGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDiskReplicaGroupRequest setRPO(Long RPO) {
        this.RPO = RPO;
        return this;
    }
    public Long getRPO() {
        return this.RPO;
    }

    public CreateDiskReplicaGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDiskReplicaGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDiskReplicaGroupRequest setSourceZoneId(String sourceZoneId) {
        this.sourceZoneId = sourceZoneId;
        return this;
    }
    public String getSourceZoneId() {
        return this.sourceZoneId;
    }

    public CreateDiskReplicaGroupRequest setTag(java.util.List<CreateDiskReplicaGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDiskReplicaGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateDiskReplicaGroupRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the resource. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. It cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with `acs:` or contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDiskReplicaGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDiskReplicaGroupRequestTag self = new CreateDiskReplicaGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDiskReplicaGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDiskReplicaGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
