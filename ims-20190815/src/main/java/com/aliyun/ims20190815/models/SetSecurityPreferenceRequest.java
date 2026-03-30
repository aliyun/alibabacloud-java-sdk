// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceRequest extends TeaModel {
    /**
     * <p>Specifies whether RAM users can change their passwords. Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    /**
     * <p>Specifies whether a RAM user can use a passkey for logon. Valid values:</p>
     * <ul>
     * <li>true: A RAM user can use a passkey for logon. This is the default value.</li>
     * <li>false: A RAM user cannot use a passkey for logon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToLoginWithPasskey")
    public Boolean allowUserToLoginWithPasskey;

    /**
     * <p>Specifies whether RAM users can manage their AccessKey pairs. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowUserToManageAccessKeys")
    public Boolean allowUserToManageAccessKeys;

    /**
     * <p>Specifies whether RAM users can manage their MFA devices. Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    /**
     * <p>Specifies whether RAM users can manage their personal DingTalk accounts, such as binding and unbinding of the accounts. Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowUserToManagePersonalDingTalk")
    public Boolean allowUserToManagePersonalDingTalk;

    /**
     * <p>Specifies whether RAM users can remember the MFA devices for seven days. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableSaveMFATicket")
    public Boolean enableSaveMFATicket;

    /**
     * <p>The subnet mask that specifies the IP addresses from which you can log on to the Alibaba Cloud Management Console. This parameter takes effect on password-based logon and single sign-on (SSO). This parameter does not take effect on API calls that are authenticated by using AccessKey pairs.</p>
     * <ul>
     * <li>If you specify a subnet mask, RAM users can use only the IP addresses in the subnet mask to log on to the Alibaba Cloud Management Console.</li>
     * <li>If you do not specify a subnet mask, RAM users can use all IP addresses to log on to the Alibaba Cloud Management Console.</li>
     * </ul>
     * <p>If you need to specify multiple subnet masks, separate the subnet masks with semicolons (;). Example: 192.168.0.0/16;10.0.0.0/8.</p>
     * <p>You can specify up to 40 subnet masks. The total length of the subnet masks can be a maximum of 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("LoginNetworkMasks")
    public String loginNetworkMasks;

    /**
     * <p>The validity period of the logon session of RAM users.</p>
     * <p>Valid values: 1 to 24. Unit: hours.</p>
     * <p>Default value: 6.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("LoginSessionDuration")
    public Integer loginSessionDuration;

    /**
     * <p>Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console. This parameter is used to replace EnforceMFAForLogin. EnforceMFAForLogin is still valid. However, we recommend that you use MFAOperationForLogin. Valid values:</p>
     * <ul>
     * <li>mandatory: MFA is required for all RAM users. If you use EnforceMFAForLogin, set the value to true.</li>
     * <li>independent (default): User-specific settings are applied. If you use EnforceMFAForLogin, set the value to false.</li>
     * <li>adaptive: MFA is required only for RAM users who initiated unusual logons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>adaptive</p>
     */
    @NameInMap("MFAOperationForLogin")
    public String MFAOperationForLogin;

    @NameInMap("MaxIdleDaysForAccessKeys")
    public Integer maxIdleDaysForAccessKeys;

    @NameInMap("MaxIdleDaysForUsers")
    public Integer maxIdleDaysForUsers;

    /**
     * <p>Specifies whether to enable MFA for RAM users who initiated unusual logons. Valid values:</p>
     * <ul>
     * <li>autonomous (default): yes. MFA is prompted for RAM users who initiated unusual logons. However, the RAM users are allowed to skip MFA.</li>
     * <li>enforceVerify: MFA is prompted for RAM users who initiated unusual logons and the RAM users cannot skip MFA.</li>
     * </ul>
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
