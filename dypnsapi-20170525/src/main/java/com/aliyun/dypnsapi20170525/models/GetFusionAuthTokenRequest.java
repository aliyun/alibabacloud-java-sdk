// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetFusionAuthTokenRequest extends TeaModel {
    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("PackageSign")
    public String packageSign;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
