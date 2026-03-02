// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceRequest extends TeaModel {
    /**
     * <p>Specifies whether RAM users can manage their own passwords. Valid values:</p>
     * <ul>
     * <li><p>true (default)</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    /**
     * <p>Specifies whether RAM users can log on using passkeys. Valid values:</p>
     * <ul>
     * <li><p>true (default)</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToLoginWithPasskey")
    public Boolean allowUserToLoginWithPasskey;

    /**
     * <p>Specifies whether RAM users can manage their own AccessKey pairs. Valid values:</p>
     * <ul>
     * <li><p>true:</p>
     * </li>
     * <li><p>false (default)</p>
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
     * <li><p>true (default)</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    /**
     * <p>Specifies whether RAM users can attach or detach their personal DingTalk accounts. Valid values:</p>
     * <ul>
     * <li><p>true (default)</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToManagePersonalDingTalk")
    public Boolean allowUserToManagePersonalDingTalk;

    /**
     * <p>Specifies whether to save the multi-factor authentication (MFA) status for seven days after a RAM user logs on using MFA. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSaveMFATicket")
    public Boolean enableSaveMFATicket;

    /**
     * <p>Specifies the IP addresses or CIDR blocks from which RAM users are allowed to sign in to the Alibaba Cloud console.</p>
     * <ul>
     * <li><p>This restriction applies to both password-based and single sign-on (SSO) logons.</p>
     * </li>
     * <li><p>It does not affect API calls made with an AccessKey pair.</p>
     * </li>
     * <li><p>If a mask is not configured, logons are allowed from any IP address.</p>
     * </li>
     * </ul>
     * <p>Separate multiple entries with a semicolon (<code>;</code>). For example: 192.168.0.0/16;10.0.0.0/8.</p>
     * <p>The mask is limited to a maximum of 40 entries and a total length of 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    /**
     * <p>The duration of a logon session for a RAM user.</p>
     * <p>Valid values: 1 to 24. Unit: hours.</p>
     * <p>Default value: 6.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("LoginSessionDuration")
    public Integer loginSessionDuration;

    /**
     * <p>Specifies whether MFA is required for logon. This parameter replaces <code>EnforceMFAForLogin</code>. The <code>EnforceMFAForLogin</code> parameter is still valid, but using this new parameter is recommended. Valid values:</p>
     * <ul>
     * <li><p>mandatory: Enforces MFA for all RAM users. This value corresponds to <code>true</code> for the <code>EnforceMFAForLogin</code> parameter.</p>
     * </li>
     * <li><p>independent (default): The MFA requirement depends on the configuration of each RAM user. This value corresponds to <code>false</code> for the <code>EnforceMFAForLogin</code> parameter.</p>
     * </li>
     * <li><p>adaptive: Enforces MFA only for abnormal logons.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>adaptive</p>
     */
    @NameInMap("MFAOperationForLogin")
    public String MFAOperationForLogin;

    /**
     * <p>The maximum number of days that a RAM user\&quot;s AccessKey pair can be idle. If an AccessKey pair is not used within the specified period, it is automatically disabled the next day. Valid values:</p>
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
     * <p>The maximum number of days that a RAM user can be idle. If a RAM user with console logon enabled does not log on within this period, their console logon is automatically disabled the next day. This setting does not apply to single sign-on (SSO) logons. Valid values:</p>
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
    public java.util.List<String> verificationTypes;

    public static SetSecurityPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceRequest self = new SetSecurityPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public SetSecurityPreferenceRequest setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
        this.allowUserToChangePassword = allowUserToChangePassword;
        return this;
    }
    public Boolean getAllowUserToChangePassword() {
        return this.allowUserToChangePassword;
    }

    public SetSecurityPreferenceRequest setAllowUserToLoginWithPasskey(Boolean allowUserToLoginWithPasskey) {
        this.allowUserToLoginWithPasskey = allowUserToLoginWithPasskey;
        return this;
    }
    public Boolean getAllowUserToLoginWithPasskey() {
        return this.allowUserToLoginWithPasskey;
    }

    public SetSecurityPreferenceRequest setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
        this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
        return this;
    }
    public Boolean getAllowUserToManageAccessKeys() {
        return this.allowUserToManageAccessKeys;
    }

    public SetSecurityPreferenceRequest setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
        this.allowUserToManageMFADevices = allowUserToManageMFADevices;
        return this;
    }
    public Boolean getAllowUserToManageMFADevices() {
        return this.allowUserToManageMFADevices;
    }

    public SetSecurityPreferenceRequest setAllowUserToManagePersonalDingTalk(Boolean allowUserToManagePersonalDingTalk) {
        this.allowUserToManagePersonalDingTalk = allowUserToManagePersonalDingTalk;
        return this;
    }
    public Boolean getAllowUserToManagePersonalDingTalk() {
        return this.allowUserToManagePersonalDingTalk;
    }

    public SetSecurityPreferenceRequest setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
        this.enableSaveMFATicket = enableSaveMFATicket;
        return this;
    }
    public Boolean getEnableSaveMFATicket() {
        return this.enableSaveMFATicket;
    }

    public SetSecurityPreferenceRequest setLoginNetworkMasks(String loginNetworkMasks) {
        this.loginNetworkMasks = loginNetworkMasks;
        return this;
    }
    public String getLoginNetworkMasks() {
        return this.loginNetworkMasks;
    }

    public SetSecurityPreferenceRequest setLoginSessionDuration(Integer loginSessionDuration) {
        this.loginSessionDuration = loginSessionDuration;
        return this;
    }
    public Integer getLoginSessionDuration() {
        return this.loginSessionDuration;
    }

    public SetSecurityPreferenceRequest setMFAOperationForLogin(String MFAOperationForLogin) {
        this.MFAOperationForLogin = MFAOperationForLogin;
        return this;
    }
    public String getMFAOperationForLogin() {
        return this.MFAOperationForLogin;
    }

    public SetSecurityPreferenceRequest setMaxIdleDaysForAccessKeys(Integer maxIdleDaysForAccessKeys) {
        this.maxIdleDaysForAccessKeys = maxIdleDaysForAccessKeys;
        return this;
    }
    public Integer getMaxIdleDaysForAccessKeys() {
        return this.maxIdleDaysForAccessKeys;
    }

    public SetSecurityPreferenceRequest setMaxIdleDaysForUsers(Integer maxIdleDaysForUsers) {
        this.maxIdleDaysForUsers = maxIdleDaysForUsers;
        return this;
    }
    public Integer getMaxIdleDaysForUsers() {
        return this.maxIdleDaysForUsers;
    }

    @Deprecated
    public SetSecurityPreferenceRequest setOperationForRiskLogin(String operationForRiskLogin) {
        this.operationForRiskLogin = operationForRiskLogin;
        return this;
    }
    public String getOperationForRiskLogin() {
        return this.operationForRiskLogin;
    }

    public SetSecurityPreferenceRequest setVerificationTypes(java.util.List<String> verificationTypes) {
        this.verificationTypes = verificationTypes;
        return this;
    }
    public java.util.List<String> getVerificationTypes() {
        return this.verificationTypes;
    }

}
