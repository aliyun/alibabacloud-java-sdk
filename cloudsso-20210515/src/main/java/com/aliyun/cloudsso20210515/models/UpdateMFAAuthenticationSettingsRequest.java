// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateMFAAuthenticationSettingsRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Specifies whether to enable MFA for all users. Valid values:</p>
     * <ul>
     * <li>Enabled: enables MFA for all users.</li>
     * <li>Byuser: uses user-specific settings. For more information about how to configure MFA for a single user, see <a href="https://help.aliyun.com/document_detail/450135.html">UpdateUserMFAAuthenticationSettings</a>.</li>
     * <li>Disabled: disables MFA for all users.</li>
     * <li>OnlyRiskyLogin: MFA is required only for unusual logons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("MFAAuthenticationSettings")
    public String MFAAuthenticationSettings;

    /**
     * <p>Specifies whether MFA is required for users who initiated unusual logons. Valid values:</p>
     * <p>Autonomous: MFA is prompted for users who initiated unusual logons. However, the users are allowed to skip MFA. If an MFA device is bound to a user who initiated an unusual logon, the user must pass MFA. EnforceVerify: MFA is required. If no MFA devices are bound to a user who initiated an unusual logon, the user must bind an MFA device. If an MFA device is already bound to a user who initiated an unusual logon, the user must pass MFA.</p>
     * 
     * <strong>example:</strong>
     * <p>Autonomous</p>
     */
    @NameInMap("OperationForRiskLogin")
    public String operationForRiskLogin;

    public static UpdateMFAAuthenticationSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMFAAuthenticationSettingsRequest self = new UpdateMFAAuthenticationSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMFAAuthenticationSettingsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateMFAAuthenticationSettingsRequest setMFAAuthenticationSettings(String MFAAuthenticationSettings) {
        this.MFAAuthenticationSettings = MFAAuthenticationSettings;
        return this;
    }
    public String getMFAAuthenticationSettings() {
        return this.MFAAuthenticationSettings;
    }

    public UpdateMFAAuthenticationSettingsRequest setOperationForRiskLogin(String operationForRiskLogin) {
        this.operationForRiskLogin = operationForRiskLogin;
        return this;
    }
    public String getOperationForRiskLogin() {
        return this.operationForRiskLogin;
    }

}
