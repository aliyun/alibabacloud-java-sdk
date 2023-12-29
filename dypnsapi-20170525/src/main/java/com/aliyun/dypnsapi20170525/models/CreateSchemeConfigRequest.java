// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSchemeConfigRequest extends TeaModel {
    /**
     * <p>The package name. This parameter is required when Platform is set to Android. The name must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (\_), and periods (.).</p>
     */
    @NameInMap("AndroidPackageName")
    public String androidPackageName;

    /**
     * <p>The package signature. This parameter is required when Platform is set to Android. The signature must be 32 characters in length and can contain digits and letters.</p>
     */
    @NameInMap("AndroidPackageSign")
    public String androidPackageSign;

    /**
     * <p>The app name, which can be up to 20 characters in length and can contain letters.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The reserved field. HTML5 apps are not supported.</p>
     */
    @NameInMap("H5Origin")
    public String h5Origin;

    /**
     * <p>The reserved field. HTML5 apps are not supported.</p>
     */
    @NameInMap("H5Url")
    public String h5Url;

    /**
     * <p>The bundle ID. This parameter is required when OsType is set to iOS. The bundle ID must be 1 to 128 characters in length and can contain digits, letters, hyphens (-), underscores (\_), and periods (.).</p>
     */
    @NameInMap("IosBundleId")
    public String iosBundleId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The app platform.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Android</p>
     * <p>*   iOS</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The service name, which can be up to 10 characters in length and can contain letters.</p>
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
