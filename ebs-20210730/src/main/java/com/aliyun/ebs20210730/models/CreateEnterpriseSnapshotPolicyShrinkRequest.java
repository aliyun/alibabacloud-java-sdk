// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyShrinkRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value from your client that is unique across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The snapshot replication information.</p>
     */
    @NameInMap("CrossRegionCopyInfo")
    public String crossRegionCopyInfoShrink;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The Policy Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID. You can call DescribeRegions to query the regions that support asynchronous replication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The retention rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RetainRule")
    public String retainRuleShrink;

    /**
     * <p>The schedule rule.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Schedule")
    public String scheduleShrink;

    /**
     * <p>The special retention rules.</p>
     */
    @NameInMap("SpecialRetainRules")
    public String specialRetainRulesShrink;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>DISABLED</li>
     * <li>ENABLED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The advanced snapshot feature.</p>
     */
    @NameInMap("StorageRule")
    public String storageRuleShrink;

    /**
     * <p>The tag key-value pairs. Valid values of n: 1 to 20.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEnterpriseSnapshotPolicyShrinkRequestTag> tag;

    /**
     * <p>The type. Valid values:</p>
     * <ul>
     * <li>DISK</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DISK</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static CreateEnterpriseSnapshotPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnterpriseSnapshotPolicyShrinkRequest self = new CreateEnterpriseSnapshotPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setCrossRegionCopyInfoShrink(String crossRegionCopyInfoShrink) {
        this.crossRegionCopyInfoShrink = crossRegionCopyInfoShrink;
        return this;
    }
    public String getCrossRegionCopyInfoShrink() {
        return this.crossRegionCopyInfoShrink;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setRetainRuleShrink(String retainRuleShrink) {
        this.retainRuleShrink = retainRuleShrink;
        return this;
    }
    public String getRetainRuleShrink() {
        return this.retainRuleShrink;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setSpecialRetainRulesShrink(String specialRetainRulesShrink) {
        this.specialRetainRulesShrink = specialRetainRulesShrink;
        return this;
    }
    public String getSpecialRetainRulesShrink() {
        return this.specialRetainRulesShrink;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setStorageRuleShrink(String storageRuleShrink) {
        this.storageRuleShrink = storageRuleShrink;
        return this;
    }
    public String getStorageRuleShrink() {
        return this.storageRuleShrink;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setTag(java.util.List<CreateEnterpriseSnapshotPolicyShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEnterpriseSnapshotPolicyShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateEnterpriseSnapshotPolicyShrinkRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class CreateEnterpriseSnapshotPolicyShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEnterpriseSnapshotPolicyShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEnterpriseSnapshotPolicyShrinkRequestTag self = new CreateEnterpriseSnapshotPolicyShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEnterpriseSnapshotPolicyShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEnterpriseSnapshotPolicyShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
