// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafPolicyRequest extends TeaModel {
    /**
     * <p>The type of the WAF protection policy. Valid values:</p>
     * <ul>
     * <li>waf_group: basic web protection</li>
     * <li>custom_acl: custom protection</li>
     * <li>whitelist: IP address whitelist</li>
     * <li>ip_blacklist: IP address blacklist</li>
     * <li>region_block: region blacklist</li>
     * <li>bot: bot management</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_group</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The name of the protection policy. The name can be up to 64 characters in length and can contain letters, digits, and underscores (_).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>policy_test</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The status of the protection policy. Valid values:</p>
     * <ul>
     * <li>on: The policy is enabled.</li>
     * <li>off: The policy is disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("PolicyStatus")
    public String policyStatus;

    /**
     * <p>Specifies whether to set the current policy as the default policy. Valid values:</p>
     * <ul>
     * <li>default: sets the current policy as the default policy.</li>
     * <li>custom: does not set the current policy as the default policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    public static CreateDcdnWafPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnWafPolicyRequest self = new CreateDcdnWafPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnWafPolicyRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public CreateDcdnWafPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateDcdnWafPolicyRequest setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public CreateDcdnWafPolicyRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

}
