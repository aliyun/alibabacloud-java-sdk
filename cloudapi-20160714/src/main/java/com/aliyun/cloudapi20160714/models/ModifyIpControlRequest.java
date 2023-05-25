// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIpControlRequest extends TeaModel {
    /**
     * <p>*   This operation is intended for API providers.</p>
     * <p>*   This operation allows you to modify only the name and description of an ACL. You cannot modify the type of the ACL.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The description. The description can be up to 200 characters in length.</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("IpControlName")
    public String ipControlName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyIpControlRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpControlRequest self = new ModifyIpControlRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpControlRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyIpControlRequest setIpControlId(String ipControlId) {
        this.ipControlId = ipControlId;
        return this;
    }
    public String getIpControlId() {
        return this.ipControlId;
    }

    public ModifyIpControlRequest setIpControlName(String ipControlName) {
        this.ipControlName = ipControlName;
        return this;
    }
    public String getIpControlName() {
        return this.ipControlName;
    }

    public ModifyIpControlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
