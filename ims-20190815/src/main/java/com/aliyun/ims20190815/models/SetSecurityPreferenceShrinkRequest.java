// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether RAM users can change their passwords. Valid values:</p>
     * <br>
     * <p>*   true: yes. This is the default value.</p>
     * <p>*   false: no.</p>
     */
    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    /**
     * <p>Specifies whether RAM users can manage their AccessKey pairs. Valid values:</p>
     * <br>
     * <p>*   true: yes.</p>
     * <p>*   false: no. This is the default value.</p>
     */
    @NameInMap("AllowUserToManageAccessKeys")
    public Boolean allowUserToManageAccessKeys;

    /**
     * <p>Specifies whether RAM users can manage their MFA devices. Valid values:</p>
     * <br>
     * <p>*   true: yes. This is the default value.</p>
     * <p>*   false: no.</p>
     */
    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    /**
     * <p>Specifies whether RAM users can manage their personal DingTalk accounts, such as binding and unbinding of the accounts. Valid values:</p>
     * <br>
     * <p>*   true: yes. This is the default value.</p>
     * <p>*   false: no.</p>
     */
    @NameInMap("AllowUserToManagePersonalDingTalk")
    public Boolean allowUserToManagePersonalDingTalk;

    /**
     * <p>Specifies whether to remember the MFA devices for seven days. Valid values:</p>
     * <br>
     * <p>*   true: yes.</p>
     * <p>*   false: no. This is the default value.</p>
     */
    @NameInMap("EnableSaveMFATicket")
    public Boolean enableSaveMFATicket;

    /**
     * <p>The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). However, this parameter does not take effect on API calls that are authenticated by using AccessKey pairs.</p>
     * <br>
     * <p>*   If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.</p>
     * <p>*   If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.</p>
     * <br>
     * <p>If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.</p>
     * <br>
     * <p>You can specify up to 25 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.</p>
     */
    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    /**
     * <p>The validity period of the logon session of RAM users.</p>
     * <br>
     * <p>Valid values: 1 to 24. Unit: hours.</p>
     * <br>
     * <p>Default value: 6.</p>
     */
    @NameInMap("LoginSessionDuration")
    public Integer loginSessionDuration;

    /**
     * <p>Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console. This parameter is used to replace the EnforceMFAForLogin parameter. The EnforceMFAForLogin parameter is still valid. However, we recommend that you use the MFAOperationForLogin parameter. Valid values:</p>
     * <br>
     * <p>*   mandatory: MFA is required for all RAM users. If you use the EnforceMFAForLogin parameter, set the value to true.</p>
     * <p>*   independent: User-specific settings are applied. This is the default value. If you use the EnforceMFAForLogin parameter, set the value to false.</p>
     * <p>*   adaptive: MFA is required only for RAM users who initiated unusual logons.</p>
     */
    @NameInMap("MFAOperationForLogin")
    public String MFAOperationForLogin;

    /**
     * <p>Specifies whether to enable MFA for RAM users who initiated unusual logons. Valid values:</p>
     * <br>
     * <p>*   autonomous: yes. MFA is prompted for RAM users who initiated unusual logons. However, the RAM users are allowed to skip MFA. This is the default value.</p>
     * <p>*   enforceVerify: no.</p>
     */
    @NameInMap("OperationForRiskLogin")
    public String operationForRiskLogin;

    @NameInMap("VerificationTypes")
    public String verificationTypesShrink;

    public static SetSecurityPreferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceShrinkRequest self = new SetSecurityPreferenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetSecurityPreferenceShrinkRequest setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
        this.allowUserToChangePassword = allowUserToChangePassword;
        return this;
    }
    public Boolean getAllowUserToChangePassword() {
        return this.allowUserToChangePassword;
    }

    public SetSecurityPreferenceShrinkRequest setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
        this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
        return this;
    }
    public Boolean getAllowUserToManageAccessKeys() {
        return this.allowUserToManageAccessKeys;
    }

    public SetSecurityPreferenceShrinkRequest setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
        this.allowUserToManageMFADevices = allowUserToManageMFADevices;
        return this;
    }
    public Boolean getAllowUserToManageMFADevices() {
        return this.allowUserToManageMFADevices;
    }

    public SetSecurityPreferenceShrinkRequest setAllowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
        this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
        return this;
    }
    public Boolean getAllowUserToManagePersonalDingTalk() {
        return this.allowUserToManagePersonalDingTalk;
    }

    public SetSecurityPreferenceShrinkRequest setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
        this.enableSaveMFATicket = enableSaveMFATicket;
        return this;
    }
    public Boolean getEnableSaveMFATicket() {
        return this.enableSaveMFATicket;
    }

    public SetSecurityPreferenceShrinkRequest setLoginNetworkMasks(String loginNetworkMasks) {
        this.loginNetworkMasks = loginNetworkMasks;
        return this;
    }
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    public SetSecurityPreferenceShrinkRequest setLoginSessionDuration(Integer loginSessionDuration) {
        this.loginSessionDuration = loginSessionDuration;
        return this;
    }
    public Integer getLoginSessionDuration() {
        return this.loginSessionDuration;
    }

    public SetSecurityPreferenceShrinkRequest setMFAOperationForLogin(String MFAOperationForLogin) {
        this.MFAOperationForLogin = MFAOperationForLogin;
        return this;
    }
    public String getMFAOperationForLogin() {
        return this.MFAOperationForLogin;
    }

    public SetSecurityPreferenceShrinkRequest setOperationForRiskLogin(String operationForRiskLogin) {
        this.operationForRiskLogin = operationForRiskLogin;
        return this;
    }
    public String getOperationForRiskLogin() {
        return this.operationForRiskLogin;
    }

    public SetSecurityPreferenceShrinkRequest setVerificationTypesShrink(String verificationTypesShrink) {
        this.verificationTypesShrink = verificationTypesShrink;
        return this;
    }
    public String getVerificationTypesShrink() {
        return this.verificationTypesShrink;
    }

}
