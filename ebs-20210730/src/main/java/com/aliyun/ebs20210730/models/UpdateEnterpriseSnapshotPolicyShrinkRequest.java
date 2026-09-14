// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseSnapshotPolicyShrinkRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests. The ClientToken value supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cross-region copy destination information.</p>
     */
    @NameInMap("CrossRegionCopyInfo")
    public String crossRegionCopyInfoShrink;

    /**
     * <p>The description of the snapshot policy.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The ID of the policy to modify.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The snapshot policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp-xxx</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The retention rule.</p>
     */
    @NameInMap("RetainRule")
    public String retainRuleShrink;

    /**
     * <p>The schedule rule.</p>
     */
    @NameInMap("Schedule")
    public String scheduleShrink;

    /**
     * <p>The special retention rules.</p>
     */
    @NameInMap("SpecialRetainRules")
    public String specialRetainRulesShrink;

    /**
     * <p>The status of the snapshot policy. Valid values:</p>
     * <ul>
     * <li>ENABLED</li>
     * <li>DISABLED</li>
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

    public static UpdateEnterpriseSnapshotPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseSnapshotPolicyShrinkRequest self = new UpdateEnterpriseSnapshotPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setCrossRegionCopyInfoShrink(String crossRegionCopyInfoShrink) {
        this.crossRegionCopyInfoShrink = crossRegionCopyInfoShrink;
        return this;
    }
    public String getCrossRegionCopyInfoShrink() {
        return this.crossRegionCopyInfoShrink;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setRetainRuleShrink(String retainRuleShrink) {
        this.retainRuleShrink = retainRuleShrink;
        return this;
    }
    public String getRetainRuleShrink() {
        return this.retainRuleShrink;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setSpecialRetainRulesShrink(String specialRetainRulesShrink) {
        this.specialRetainRulesShrink = specialRetainRulesShrink;
        return this;
    }
    public String getSpecialRetainRulesShrink() {
        return this.specialRetainRulesShrink;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateEnterpriseSnapshotPolicyShrinkRequest setStorageRuleShrink(String storageRuleShrink) {
        this.storageRuleShrink = storageRuleShrink;
        return this;
    }
    public String getStorageRuleShrink() {
        return this.storageRuleShrink;
    }

}
