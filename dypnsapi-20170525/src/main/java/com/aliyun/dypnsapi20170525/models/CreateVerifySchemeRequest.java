// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateVerifySchemeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SchemeName")
    public String schemeName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("PackName")
    public String packName;

    @NameInMap("PackSign")
    public String packSign;

    @NameInMap("BundleId")
    public String bundleId;

    public static CreateVerifySchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySchemeRequest self = new CreateVerifySchemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateVerifySchemeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVerifySchemeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVerifySchemeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVerifySchemeRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public CreateVerifySchemeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateVerifySchemeRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateVerifySchemeRequest setPackName(String packName) {
        this.packName = packName;
        return this;
    }
    public String getPackName() {
        return this.packName;
    }

    public CreateVerifySchemeRequest setPackSign(String packSign) {
        this.packSign = packSign;
        return this;
    }
    public String getPackSign() {
        return this.packSign;
    }

    public CreateVerifySchemeRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

}
