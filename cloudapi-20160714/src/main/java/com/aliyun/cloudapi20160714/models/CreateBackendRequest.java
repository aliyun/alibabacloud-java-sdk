// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackendName")
    public String backendName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackendType")
    public String backendType;

    @NameInMap("CreateEventBridgeServiceLinkedRole")
    public Boolean createEventBridgeServiceLinkedRole;

    @NameInMap("CreateSlr")
    public Boolean createSlr;

    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<CreateBackendRequestTag> tag;

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

    public CreateBackendRequest setCreateSlr(Boolean createSlr) {
        this.createSlr = createSlr;
        return this;
    }
    public Boolean getCreateSlr() {
        return this.createSlr;
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

    public CreateBackendRequest setTag(java.util.List<CreateBackendRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateBackendRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateBackendRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateBackendRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateBackendRequestTag self = new CreateBackendRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateBackendRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBackendRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
