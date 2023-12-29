// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetSmsAuthTokensRequest extends TeaModel {
    /**
     * <p>The ID of the iOS application. This parameter is required if OsType is set to **iOS**.</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    /**
     * <p>The validity period of the token. Unit: seconds. Valid values: 900 to 43200.</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>The type of the operating system. Valid values: **Android** and **iOS**.</p>
     */
    @NameInMap("OsType")
    public String osType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The package name. This parameter is required if OsType is set to **Android**.</p>
     */
    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The service code.</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The signature. This parameter is required if OsType is set to **Android**.</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The validity period of the SMS verification code. Unit: seconds. Default value: 180.</p>
     */
    @NameInMap("SmsCodeExpire")
    public Integer smsCodeExpire;

    /**
     * <p>The code of the text message template.</p>
     */
    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    public static GetSmsAuthTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSmsAuthTokensRequest self = new GetSmsAuthTokensRequest();
        return TeaModel.build(map, self);
    }

    public GetSmsAuthTokensRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public GetSmsAuthTokensRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public GetSmsAuthTokensRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public GetSmsAuthTokensRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetSmsAuthTokensRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public GetSmsAuthTokensRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetSmsAuthTokensRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetSmsAuthTokensRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public GetSmsAuthTokensRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public GetSmsAuthTokensRequest setSmsCodeExpire(Integer smsCodeExpire) {
        this.smsCodeExpire = smsCodeExpire;
        return this;
    }
    public Integer getSmsCodeExpire() {
        return this.smsCodeExpire;
    }

    public GetSmsAuthTokensRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

}
