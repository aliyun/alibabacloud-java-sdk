// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether RAM users can change their own passwords. Valid values:</p>
     * <ul>
     * <li><p>true (default): Allowed.</p>
     * </li>
     * <li><p>false: Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    /**
     * <p>Specifies whether RAM users can use passkeys to log on to the console. Valid values:</p>
     * <ul>
     * <li><p>true (default): Allowed.</p>
     * </li>
     * <li><p>false: Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToLoginWithPasskey")
    public Boolean allowUserToLoginWithPasskey;

    /**
     * <p>Specifies whether RAM users can manage their own AccessKeys. Valid values:</p>
     * <ul>
     * <li><p>true: Allowed.</p>
     * </li>
     * <li><p>false (default): Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowUserToManageAccessKeys")
    public Boolean allowUserToManageAccessKeys;

    /**
     * <p>Specifies whether RAM users can manage their own MFA devices. Valid values:</p>
     * <ul>
     * <li><p>true (default): Allowed.</p>
     * </li>
     * <li><p>false: Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    /**
     * <p>Specifies whether RAM users can link or unlink their personal DingTalk accounts. Valid values:</p>
     * <ul>
     * <li><p>true (default): Allowed.</p>
     * </li>
     * <li><p>false: Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToManagePersonalDingTalk")
    public Boolean allowUserToManagePersonalDingTalk;

    /**
     * <p>Specifies whether RAM users can manage their own API keys. Valid values:</p>
     * <ul>
     * <li><p>true: Allowed.</p>
     * </li>
     * <li><p>false: Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowUserToManageServiceCredentials")
    public Boolean allowUserToManageServiceCredentials;

    /**
     * <p>Specifies whether a RAM user who logs on with multi-factor authentication (MFA) can skip MFA for the next seven days. Valid values:</p>
     * <ul>
     * <li><p>true: Allowed.</p>
     * </li>
     * <li><p>false (default): Not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSaveMFATicket")
    public Boolean enableSaveMFATicket;

    /**
     * <p>The IP address mask that is used to log on to the console. This mask applies to password-based logons and single sign-on (SSO) logons, but does not affect API calls that are initiated by using an AccessKey pair.</p>
     * <ul>
     * <li><p>If you specify a mask, RAM users can log on to the console only from the specified IP addresses.</p>
     * </li>
     * <li><p>If you do not specify a mask, RAM users can log on to the console from all IP addresses.</p>
     * </li>
     * </ul>
     * <p>If you need to specify multiple masks, separate them with semicolons (<code>;</code>). Example: <code>192.168.0.0/16;10.0.0.0/8</code>.</p>
     * <p>You can specify up to 40 masks. The total length cannot exceed 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    /**
     * <p>The session duration of a RAM user who logs on to the console. Unit: hours.</p>
     * <p>Valid values: 1 to 24.</p>
     * <p>Default value: 6.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("LoginSessionDuration")
    public Integer loginSessionDuration;

    /**
     * <p>Specifies the MFA policy for user logon. This parameter replaces <code>EnforceMFAForLogin</code>. We recommend that you use this parameter. <code>EnforceMFAForLogin</code> is still valid. Valid values:</p>
     * <ul>
     * <li><p><code>mandatory</code>: enforces MFA for all RAM users. This is equivalent to setting <code>EnforceMFAForLogin</code> to <code>true</code>.</p>
     * </li>
     * <li><p><code>independent</code> (default): The MFA settings for each RAM user are not affected. This is equivalent to setting <code>EnforceMFAForLogin</code> to <code>false</code>.</p>
     * </li>
     * <li><p><code>adaptive</code>: enforces MFA only for unusual logons.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>adaptive</p>
     */
    @NameInMap("MFAOperationForLogin")
    public String MFAOperationForLogin;

    /**
     * <p>The maximum idle period of the AccessKey pairs of RAM users. An AccessKey pair that is not used for the specified period of time is automatically disabled on the next day. You can set the value to one of the following numbers:</p>
     * <ul>
     * <li><p>90</p>
     * </li>
     * <li><p>180</p>
     * </li>
     * <li><p>365</p>
     * </li>
     * <li><p>730 (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("MaxIdleDaysForAccessKeys")
    public Integer maxIdleDaysForAccessKeys;

    /**
     * <p>The maximum idle period of RAM users. If a RAM user who can log on to the console does not log on to the console for the specified period of time (SSO logons are not included), the console logon feature of the RAM user is disabled on the next day. You can set the value to one of the following numbers:</p>
     * <ul>
     * <li><p>90</p>
     * </li>
     * <li><p>180</p>
     * </li>
     * <li><p>365</p>
     * </li>
     * <li><p>730 (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("MaxIdleDaysForUsers")
    public Integer maxIdleDaysForUsers;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>autonomous</p>
     */
    @NameInMap("OperationForRiskLogin")
    @Deprecated
    public String operationForRiskLogin;

    /**
     * <p>The MFA methods.</p>
     */
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

    public SetSecurityPreferenceShrinkRequest setAllowUserToLoginWithPasskey(Boolean allowUserToLoginWithPasskey) {
        this.allowUserToLoginWithPasskey = allowUserToLoginWithPasskey;
        return this;
    }
    public Boolean getAllowUserToLoginWithPasskey() {
        return this.allowUserToLoginWithPasskey;
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

    public SetSecurityPreferenceShrinkRequest setAllowUserToManageServiceCredentials(Boolean allowUserToManageServiceCredentials) {
        this.allowUserToManageServiceCredentials = allowUserToManageServiceCredentials;
        return this;
    }
    public Boolean getAllowUserToManageServiceCredentials() {
        return this.allowUserToManageServiceCredentials;
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

    public SetSecurityPreferenceShrinkRequest setMaxIdleDaysForAccessKeys(Integer maxIdleDaysForAccessKeys) {
        this.maxIdleDaysForAccessKeys = maxIdleDaysForAccessKeys;
        return this;
    }
    public Integer getMaxIdleDaysForAccessKeys() {
        return this.maxIdleDaysForAccessKeys;
    }

    public SetSecurityPreferenceShrinkRequest setMaxIdleDaysForUsers(Integer maxIdleDaysForUsers) {
        this.maxIdleDaysForUsers = maxIdleDaysForUsers;
        return this;
    }
    public Integer getMaxIdleDaysForUsers() {
        return this.maxIdleDaysForUsers;
    }

    @Deprecated
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
