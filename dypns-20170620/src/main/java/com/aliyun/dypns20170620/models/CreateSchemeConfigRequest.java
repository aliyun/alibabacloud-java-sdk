// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateSchemeConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>com.aliyun.android</p>
     */
    @NameInMap("AndroidPackageName")
    public String androidPackageName;

    /**
     * <strong>example:</strong>
     * <p>dfsfaawklll1*<em><strong>olkweklk</strong></em></p>
     */
    @NameInMap("AndroidPackageSign")
    public String androidPackageSign;

    /**
     * <strong>example:</strong>
     * <p>阿里云通信</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("H5Origin")
    public String h5Origin;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("H5Url")
    public String h5Url;

    /**
     * <strong>example:</strong>
     * <p>com.aliyun.ios</p>
     */
    @NameInMap("IosBundleId")
    public String iosBundleId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Android</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Android APP测试方案</p>
     */
    @NameInMap("SchemeName")
    public String schemeName;

    public static CreateSchemeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemeConfigRequest self = new CreateSchemeConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchemeConfigRequest setAndroidPackageName(String androidPackageName) {
        this.androidPackageName = androidPackageName;
        return this;
    }
    public String getAndroidPackageName() {
        return this.androidPackageName;
    }

    public CreateSchemeConfigRequest setAndroidPackageSign(String androidPackageSign) {
        this.androidPackageSign = androidPackageSign;
        return this;
    }
    public String getAndroidPackageSign() {
        return this.androidPackageSign;
    }

    public CreateSchemeConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateSchemeConfigRequest setH5Origin(String h5Origin) {
        this.h5Origin = h5Origin;
        return this;
    }
    public String getH5Origin() {
        return this.h5Origin;
    }

    public CreateSchemeConfigRequest setH5Url(String h5Url) {
        this.h5Url = h5Url;
        return this;
    }
    public String getH5Url() {
        return this.h5Url;
    }

    public CreateSchemeConfigRequest setIosBundleId(String iosBundleId) {
        this.iosBundleId = iosBundleId;
        return this;
    }
    public String getIosBundleId() {
        return this.iosBundleId;
    }

    public CreateSchemeConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSchemeConfigRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateSchemeConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSchemeConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSchemeConfigRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

}
