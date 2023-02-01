// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendRequest extends TeaModel {
    /**
     * <p>The name of the backend service.</p>
     */
    @NameInMap("BackendName")
    public String backendName;

    /**
     * <p>The type of the backend service. Valid values: `HTTP, VPC, FC_EVENT, FC_HTTP, OSS, and MOCK`.</p>
     */
    @NameInMap("BackendType")
    public String backendType;

    /**
     * <p>Specifies whether to create a role associated with EventBridge.</p>
     */
    @NameInMap("CreateEventBridgeServiceLinkedRole")
    public Boolean createEventBridgeServiceLinkedRole;

    /**
     * <p>The description of the backend service.</p>
     */
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
