// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AssumeRoleChainNode extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>This parameter is required.</p>
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
