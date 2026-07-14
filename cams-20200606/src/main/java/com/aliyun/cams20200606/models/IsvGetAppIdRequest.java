// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class IsvGetAppIdRequest extends TeaModel {
    /**
     * <p>The version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("IntlVersion")
    public String intlVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Permissions")
    public String permissions;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li>whatsapp: WhatsApp.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>whatsapp</p>
     */
    @NameInMap("Type")
    public String type;

    public static IsvGetAppIdRequest build(java.util.Map<String, ?> map) throws Exception {
        IsvGetAppIdRequest self = new IsvGetAppIdRequest();
        return TeaModel.build(map, self);
    }

    public IsvGetAppIdRequest setIntlVersion(String intlVersion) {
        this.intlVersion = intlVersion;
        return this;
    }
    public String getIntlVersion() {
        return this.intlVersion;
    }

    public IsvGetAppIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public IsvGetAppIdRequest setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public IsvGetAppIdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public IsvGetAppIdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public IsvGetAppIdRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
