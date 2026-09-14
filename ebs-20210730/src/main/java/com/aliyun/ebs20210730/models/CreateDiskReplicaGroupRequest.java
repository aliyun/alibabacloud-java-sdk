// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDiskReplicaGroupRequest extends TeaModel {
    /**
     * <p>The bandwidth in Kbps.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>A client token to ensure the idempotence of the request. Generate a unique value from your client for this parameter. The \<code>ClientToken\\</code> parameter value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the replication pair-consistent group. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the region where the disaster recovery site is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    /**
     * <p>The ID of the zone where the disaster recovery site is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-e</p>
     */
    @NameInMap("DestinationZoneId")
    public String destinationZoneId;

    /**
     * <p>Specifies whether to enable replication time control (RTC). Valid values:</p>
     * <ul>
     * <li><p>false: Disable RTC.</p>
     * </li>
     * <li><p>true: Enable RTC.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p>If you set this parameter to true, RTC is enabled for the replication pair-consistent group. RTC is also enabled for all asynchronous replication pairs that are added to the group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRtc")
    public Boolean enableRtc;

    /**
     * <p>The name of the replication pair-consistent group. The name must be 2 to 128 characters in length. It must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>myreplicagrouptest</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The recovery point objective (RPO) of the replication pair-consistent group, in seconds. The only supported value is 900.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("RPO")
    public Long RPO;

    /**
     * <p>The ID of the region where the replication pair-consistent group resides. This is the same as the region of the production site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the replication pair-consistent group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmvs*******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the zone where the production site is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-f</p>
     */
    @NameInMap("SourceZoneId")
    public String sourceZoneId;

    /**
     * <p>The tags to add to the resource. You can add up to 20 tags.</p>
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

    public CreateDiskReplicaGroupRequest setEnableRtc(Boolean enableRtc) {
        this.enableRtc = enableRtc;
        return this;
    }
    public Boolean getEnableRtc() {
        return this.enableRtc;
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
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
