// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceRequest extends TeaModel {
    /**
     * <p>Specifies whether RAM users can change their passwords. Valid values:</p>
     * <br>
     * <p>*   true (default)</p>
     * <p>*   false</p>
     */
    @NameInMap("AllowUserToChangePassword")
    public Boolean allowUserToChangePassword;

    /**
     * <p>Specifies whether RAM users can manage their AccessKey pairs. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     */
    @NameInMap("AllowUserToManageAccessKeys")
    public Boolean allowUserToManageAccessKeys;

    /**
     * <p>Specifies whether RAM users can manage their MFA devices. Valid values:</p>
     * <br>
     * <p>*   true (default)</p>
     * <p>*   false</p>
     */
    @NameInMap("AllowUserToManageMFADevices")
    public Boolean allowUserToManageMFADevices;

    /**
     * <p>Specifies whether RAM users can manage their personal DingTalk accounts, such as binding and unbinding of the accounts. Valid values:</p>
     * <br>
     * <p>*   true (default)</p>
     * <p>*   false</p>
     */
    @NameInMap("AllowUserToManagePersonalDingTalk")
    public Boolean allowUserToManagePersonalDingTalk;

    /**
     * <p>Specifies whether RAM users can remember the MFA devices for seven days. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
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
     * <p>Specifies whether MFA is required for all RAM users when they log on to the Alibaba Cloud Management Console. This parameter is used to replace EnforceMFAForLogin. EnforceMFAForLogin is still valid. However, we recommend that you use MFAOperationForLogin. Valid values:</p>
     * <br>
     * <p>*   mandatory: MFA is required for all RAM users. If you use EnforceMFAForLogin, set the value to true.</p>
     * <p>*   independent (default): User-specific settings are applied. If you use EnforceMFAForLogin, set the value to false.</p>
     * <p>*   adaptive: MFA is required only for RAM users who initiated unusual logons.</p>
     */
    @NameInMap("MFAOperationForLogin")
    public String MFAOperationForLogin;

    /**
     * <p>Specifies whether to enable MFA for RAM users who initiated unusual logons. Valid values:</p>
     * <br>
     * <p>*   autonomous (default): yes. MFA is prompted for RAM users who initiated unusual logons. However, the RAM users are allowed to skip MFA.</p>
     * <p>*   enforceVerify: MFA is prompted for RAM users who initiated unusual logons and the RAM users cannot skip MFA.</p>
     */
    @NameInMap("OperationForRiskLogin")
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
