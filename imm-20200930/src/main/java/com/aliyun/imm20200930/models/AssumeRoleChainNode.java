// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AssumeRoleChainNode extends TeaModel {
    /**
     * <p>The UID of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10232100********</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-role</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The type of the account. Valid values:</p>
     * <ul>
     * <li>user: Alibaba Cloud account.</li>
     * <li>service: Alibaba Cloud service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Type")
    public String type;

    public static AssumeRoleChainNode build(java.util.Map<String, ?> map) throws Exception {
        AssumeRoleChainNode self = new AssumeRoleChainNode();
        return TeaModel.build(map, self);
    }

    public AssumeRoleChainNode setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public AssumeRoleChainNode setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public AssumeRoleChainNode setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
