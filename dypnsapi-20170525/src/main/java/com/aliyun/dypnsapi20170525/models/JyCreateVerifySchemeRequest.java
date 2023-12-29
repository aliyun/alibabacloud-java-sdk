// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class JyCreateVerifySchemeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("CmApiCode")
    public Long cmApiCode;

    @NameInMap("CtApiCode")
    public Long ctApiCode;

    @NameInMap("CuApiCode")
    public Long cuApiCode;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PackName")
    public String packName;

    @NameInMap("PackSign")
    public String packSign;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SchemeName")
    public String schemeName;

    public static JyCreateVerifySchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        JyCreateVerifySchemeRequest self = new JyCreateVerifySchemeRequest();
        return TeaModel.build(map, self);
    }

    public JyCreateVerifySchemeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public JyCreateVerifySchemeRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public JyCreateVerifySchemeRequest setCmApiCode(Long cmApiCode) {
        this.cmApiCode = cmApiCode;
        return this;
    }
    public Long getCmApiCode() {
        return this.cmApiCode;
    }

    public JyCreateVerifySchemeRequest setCtApiCode(Long ctApiCode) {
        this.ctApiCode = ctApiCode;
        return this;
    }
    public Long getCtApiCode() {
        return this.ctApiCode;
    }

    public JyCreateVerifySchemeRequest setCuApiCode(Long cuApiCode) {
        this.cuApiCode = cuApiCode;
        return this;
    }
    public Long getCuApiCode() {
        return this.cuApiCode;
    }

    public JyCreateVerifySchemeRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public JyCreateVerifySchemeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public JyCreateVerifySchemeRequest setPackName(String packName) {
        this.packName = packName;
        return this;
    }
    public String getPackName() {
        return this.packName;
    }

    public JyCreateVerifySchemeRequest setPackSign(String packSign) {
        this.packSign = packSign;
        return this;
    }
    public String getPackSign() {
        return this.packSign;
    }

    public JyCreateVerifySchemeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public JyCreateVerifySchemeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public JyCreateVerifySchemeRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

}
