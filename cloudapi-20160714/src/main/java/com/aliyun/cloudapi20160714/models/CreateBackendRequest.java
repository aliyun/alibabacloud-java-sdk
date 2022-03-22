// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendRequest extends TeaModel {
    @NameInMap("BackendName")
    public String backendName;

    @NameInMap("BackendType")
    public String backendType;

    @NameInMap("CreateEventBridgeServiceLinkedRole")
    public Boolean createEventBridgeServiceLinkedRole;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateBackendRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendRequest self = new CreateBackendRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackendRequest setBackendName(String backendName) {
        this.backendName = backendName;
        return this;
    }
    public String getBackendName() {
        return this.backendName;
    }

    public CreateBackendRequest setBackendType(String backendType) {
        this.backendType = backendType;
        return this;
    }
    public String getBackendType() {
        return this.backendType;
    }

    public CreateBackendRequest setCreateEventBridgeServiceLinkedRole(Boolean createEventBridgeServiceLinkedRole) {
        this.createEventBridgeServiceLinkedRole = createEventBridgeServiceLinkedRole;
        return this;
    }
    public Boolean getCreateEventBridgeServiceLinkedRole() {
        return this.createEventBridgeServiceLinkedRole;
    }

    public CreateBackendRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBackendRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
