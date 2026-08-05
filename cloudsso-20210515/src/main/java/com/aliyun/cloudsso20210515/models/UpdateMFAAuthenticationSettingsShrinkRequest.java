// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateMFAAuthenticationSettingsShrinkRequest extends TeaModel {
    @NameInMap("AllowedVerificationTypes")
    public String allowedVerificationTypesShrink;

    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The global MFA settings. Valid values:</p>
     * <ul>
     * <li>Enabled: MFA verification is enabled for all users.</li>
     * <li>Byuser: MFA verification depends on the individual MFA settings of each user. For more information about individual user MFA settings, see <a href="https://help.aliyun.com/document_detail/450135.html">UpdateUserMFAAuthenticationSettings</a>.</li>
     * <li>Disabled: MFA verification is disabled for all users.</li>
     * <li>OnlyRiskyLogin: MFA verification is required only for unusual logon attempts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("MFAAuthenticationSettings")
    public String MFAAuthenticationSettings;

    /**
     * <p>The action to take when the MFA settings option is set to verify only for unusual logon attempts. Valid values:</p>
     * <ul>
     * <li>Autonomous: Users can skip MFA binding during unusual logon, but users who have already bound MFA must complete MFA verification.</li>
     * <li>EnforceVerify: Users who have not bound MFA are required to bind it, and users who have already bound MFA must complete verification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Autonomous</p>
     */
    @NameInMap("OperationForRiskLogin")
    public String operationForRiskLogin;

    public static UpdateMFAAuthenticationSettingsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMFAAuthenticationSettingsShrinkRequest self = new UpdateMFAAuthenticationSettingsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMFAAuthenticationSettingsShrinkRequest setAllowedVerificationTypesShrink(String allowedVerificationTypesShrink) {
        this.allowedVerificationTypesShrink = allowedVerificationTypesShrink;
        return this;
    }
    public String getAllowedVerificationTypesShrink() {
        return this.allowedVerificationTypesShrink;
    }

    public UpdateMFAAuthenticationSettingsShrinkRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateMFAAuthenticationSettingsShrinkRequest setMFAAuthenticationSettings(String MFAAuthenticationSettings) {
        this.MFAAuthenticationSettings = MFAAuthenticationSettings;
        return this;
    }
    public String getMFAAuthenticationSettings() {
        return this.MFAAuthenticationSettings;
    }

    public UpdateMFAAuthenticationSettingsShrinkRequest setOperationForRiskLogin(String operationForRiskLogin) {
        this.operationForRiskLogin = operationForRiskLogin;
        return this;
    }
    public String getOperationForRiskLogin() {
        return this.operationForRiskLogin;
    }

}
