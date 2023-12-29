// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetFusionAuthTokenRequest extends TeaModel {
    /**
     * <p>The bundle ID of the app. This parameter is required when Platform is set to iOS.</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The validity period of the token. Unit: seconds. Valid values: 900 to 43200.</p>
     */
    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The package name of the app. This parameter is required when Platform is set to Android.</p>
     */
    @NameInMap("PackageName")
    public String packageName;

    /**
     * <p>The package signature of the app. This parameter is required when Platform is set to Android.</p>
     */
    @NameInMap("PackageSign")
    public String packageSign;

    /**
     * <p>The platform type. Valid values: Android and iOS.</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The service code.</p>
     */
    @NameInMap("SchemeCode")
    public String schemeCode;

    public static GetFusionAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFusionAuthTokenRequest self = new GetFusionAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetFusionAuthTokenRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public GetFusionAuthTokenRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public GetFusionAuthTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetFusionAuthTokenRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public GetFusionAuthTokenRequest setPackageSign(String packageSign) {
        this.packageSign = packageSign;
        return this;
    }
    public String getPackageSign() {
        return this.packageSign;
    }

    public GetFusionAuthTokenRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetFusionAuthTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetFusionAuthTokenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetFusionAuthTokenRequest setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
        return this;
    }
    public String getSchemeCode() {
        return this.schemeCode;
    }

}
