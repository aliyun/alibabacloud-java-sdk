// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyIpControlRequest extends TeaModel {
    /**
     * <p>The description. The description can be up to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the ACL. The ID is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea91319a34d48a09b5c9c871d9768b1</p>
     */
    @NameInMap("IpControlId")
    public String ipControlId;

    /**
     * <p>The name of the ACL. The name must be 4 to 50 characters in length, and can contain letters, digits, and underscores (<em>). The name cannot start with an underscore (</em>).</p>
     * 
     * <strong>example:</strong>
     * <p>testControl11</p>
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
