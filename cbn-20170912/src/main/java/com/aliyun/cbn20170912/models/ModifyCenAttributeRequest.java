// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyCenAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The description of the CEN instance.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter or Chinese character and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the CEN instance.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The level of CIDR block overlapping.</p>
     * <br>
     * <p>Set the value to **REDUCED** (default). This value specifies that CIDR blocks can overlap but cannot be the same.</p>
     */
    @NameInMap("ProtectionLevel")
    public String protectionLevel;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyCenAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCenAttributeRequest self = new ModifyCenAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCenAttributeRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ModifyCenAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCenAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCenAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCenAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCenAttributeRequest setProtectionLevel(String protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    public ModifyCenAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCenAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
