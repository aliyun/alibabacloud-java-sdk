// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Snapshot replication destination information.</p>
     */
    @NameInMap("CrossRegionCopyInfo")
    public String crossRegionCopyInfoShrink;

    /**
     * <p>The description of the policy.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The name of the policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID . You can call the [DescribeRegions](~~354276~~) operation to query the most recent list of regions in which snapshot policy is supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the snapshot policy.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The snapshot retention rule.</p>
     */
    @NameInMap("RetainRule")
    public String retainRuleShrink;

    /**
     * <p>The rule for scheduling.</p>
     */
    @NameInMap("Schedule")
    public String scheduleShrink;

    /**
     * <p>The special snapshot retention rules.</p>
     */
    @NameInMap("SpecialRetainRules")
    public String specialRetainRulesShrink;

    /**
     * <p>The status of the policy. Valid values:</p>
     * <br>
     * <p>- ENABLED: Enable snapshot policy execution.</p>
     * <br>
     * <p>- DISABLED: Disable snapshot policy execution.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Advanced snapshot features.</p>
     */
    @NameInMap("StorageRule")
    public String storageRuleShrink;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateEnterpriseSnapshotPolicyShrinkRequestTag> tag;

    /**
     * <p>Binding target type, valid value:</p>
     * <br>
     * <p>- DISK</p>
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
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
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
