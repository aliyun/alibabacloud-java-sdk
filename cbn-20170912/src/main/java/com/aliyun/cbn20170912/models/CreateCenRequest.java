// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenRequest extends TeaModel {
    /**
     * <p>The tag keys of the resources.</p>
     * <br>
     * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
     * <br>
     * <p>You can specify at most 20 tag keys.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The operation that you want to perform. Set the value to **CreateCen**.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Creates a Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCenRequestTag> tag;

    public static CreateCenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenRequest self = new CreateCenRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCenRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCenRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCenRequest setProtectionLevel(String protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    public CreateCenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCenRequest setTag(java.util.List<CreateCenRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCenRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateCenRequestTag extends TeaModel {
        /**
         * <p>CreateCen</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>WB656982</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCenRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCenRequestTag self = new CreateCenRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCenRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCenRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
