// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveInputSecurityGroupRequest extends TeaModel {
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
    public java.util.List<String> whitelistRules;

    public static CreateMediaLiveInputSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveInputSecurityGroupRequest self = new CreateMediaLiveInputSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveInputSecurityGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMediaLiveInputSecurityGroupRequest setWhitelistRules(java.util.List<String> whitelistRules) {
        this.whitelistRules = whitelistRules;
        return this;
    }
    public java.util.List<String> getWhitelistRules() {
        return this.whitelistRules;
    }

}
