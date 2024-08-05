// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateBackendRequest extends TeaModel {
    /**
     * <p>The name of the backend service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testBackendService</p>
     */
    @NameInMap("BackendName")
    public String backendName;

    /**
     * <p>The type of the backend service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("BackendType")
    public String backendType;

    /**
     * <p>Specifies to create a EventBridge service-linked role.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreateEventBridgeServiceLinkedRole")
    public Boolean createEventBridgeServiceLinkedRole;

    /**
     * <p>Specifies to create a service-linked role.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CreateSlr")
    public Boolean createSlr;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>release data api 411055691504981</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     */
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
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
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
