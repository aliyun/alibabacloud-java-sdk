// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyBackendRequest extends TeaModel {
    @NameInMap("BackendId")
    public String backendId;

    @NameInMap("BackendName")
    public String backendName;

    @NameInMap("BackendType")
    public String backendType;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyBackendRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackendRequest self = new ModifyBackendRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackendRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public ModifyBackendRequest setBackendName(String backendName) {
        this.backendName = backendName;
        return this;
    }
    public String getBackendName() {
        return this.backendName;
    }

    public ModifyBackendRequest setBackendType(String backendType) {
        this.backendType = backendType;
        return this;
    }
    public String getBackendType() {
        return this.backendType;
    }

    public ModifyBackendRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyBackendRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
