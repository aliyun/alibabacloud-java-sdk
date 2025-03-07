// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveInputSecurityGroupShrinkRequest extends TeaModel {
    /**
     * <p>The name of the security group. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysg</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the security group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The security group rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WhitelistRules")
    public String whitelistRulesShrink;

    public static UpdateMediaLiveInputSecurityGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveInputSecurityGroupShrinkRequest self = new UpdateMediaLiveInputSecurityGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveInputSecurityGroupShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMediaLiveInputSecurityGroupShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public UpdateMediaLiveInputSecurityGroupShrinkRequest setWhitelistRulesShrink(String whitelistRulesShrink) {
        this.whitelistRulesShrink = whitelistRulesShrink;
        return this;
    }
    public String getWhitelistRulesShrink() {
        return this.whitelistRulesShrink;
    }

}
