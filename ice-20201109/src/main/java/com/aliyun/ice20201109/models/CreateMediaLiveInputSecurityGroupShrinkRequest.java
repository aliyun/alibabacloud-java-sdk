// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveInputSecurityGroupShrinkRequest extends TeaModel {
    /**
     * <p>The name of the security group. Letters, digits, hyphens (-), and underscores (_) are supported. The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysg</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The security group rules.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;10.1.1.0/24&quot;, &quot;11.11.11.11/0&quot;]</p>
     */
    @NameInMap("WhitelistRules")
    public String whitelistRulesShrink;

    public static CreateMediaLiveInputSecurityGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveInputSecurityGroupShrinkRequest self = new CreateMediaLiveInputSecurityGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveInputSecurityGroupShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMediaLiveInputSecurityGroupShrinkRequest setWhitelistRulesShrink(String whitelistRulesShrink) {
        this.whitelistRulesShrink = whitelistRulesShrink;
        return this;
    }
    public String getWhitelistRulesShrink() {
        return this.whitelistRulesShrink;
    }

}
