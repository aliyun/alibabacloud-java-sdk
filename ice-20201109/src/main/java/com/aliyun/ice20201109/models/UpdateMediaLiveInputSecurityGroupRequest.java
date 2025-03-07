// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveInputSecurityGroupRequest extends TeaModel {
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
    public java.util.List<String> whitelistRules;

    public static UpdateMediaLiveInputSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveInputSecurityGroupRequest self = new UpdateMediaLiveInputSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveInputSecurityGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMediaLiveInputSecurityGroupRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public UpdateMediaLiveInputSecurityGroupRequest setWhitelistRules(java.util.List<String> whitelistRules) {
        this.whitelistRules = whitelistRules;
        return this;
    }
    public java.util.List<String> getWhitelistRules() {
        return this.whitelistRules;
    }

}
