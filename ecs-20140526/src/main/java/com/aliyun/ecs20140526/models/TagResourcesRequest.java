// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource IDs. You can specify up to 50 resource IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The type of the resource to which the tags are added. Valid values:</p>
     * <ul>
     * <li>instance: ECS instance</li>
     * <li>disk: disk</li>
     * <li>snapshot: snapshot</li>
     * <li>image: image</li>
     * <li>securitygroup: security group</li>
     * <li>volume: storage volume</li>
     * <li>eni: ENI</li>
     * <li>ddh: dedicated host</li>
     * <li>ddhcluster: dedicated host cluster</li>
     * <li>keypair: SSH key pair</li>
     * <li>launchtemplate: launch template</li>
     * <li>reservedinstance</li>
     * <li>snapshotpolicy: automatic snapshot policy</li>
     * <li>elasticityassurance: elasticity assurance</li>
     * <li>capacityreservation: capacity reservation</li>
     * <li>command: Cloud Assistant command</li>
     * <li>invocation: Cloud Assistant command execution result or file delivery result</li>
     * <li>activation: activation code for a Cloud Assistant managed instance</li>
     * <li>managedinstance: Cloud Assistant managed instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags of the reserved instance. You can specify up to 20 tags. If you specify multiple tags, the tag keys cannot be duplicated.``</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public TagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key cannot be null or an empty string. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. The tag value cannot be null and can be an empty string. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
