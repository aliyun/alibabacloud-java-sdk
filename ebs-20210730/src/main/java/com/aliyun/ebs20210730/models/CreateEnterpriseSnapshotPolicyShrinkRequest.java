// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateEnterpriseSnapshotPolicyShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CrossRegionCopyInfo")
    public String crossRegionCopyInfoShrink;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RetainRule")
    public String retainRuleShrink;

    @NameInMap("Schedule")
    public String scheduleShrink;

    @NameInMap("SpecialRetainRules")
    public String specialRetainRulesShrink;

    @NameInMap("State")
    public String state;

    @NameInMap("StorageRule")
    public String storageRuleShrink;

    @NameInMap("Tag")
    public java.util.List<CreateEnterpriseSnapshotPolicyShrinkRequestTag> tag;

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
        @NameInMap("Key")
        public String key;

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
