// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateMFAAuthenticationSettingsRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Specifies whether to enable MFA for all users. Valid value:</p>
     * <br>
     * <p>- Enabled: enables MFA for all users.</p>
     * <p>- Byuser: uses user-specific settings. For more information about how to configure MFA for a single user, see [UpdateUserMFAAuthenticationSettings](https://help.aliyun.com/document_detail/450135.html).</p>
     * <p>- Disabled: disables MFA for all users.</p>
     * <p>- OnlyRiskyLogin: MFA is required only for unusual logons.</p>
     */
    @NameInMap("MFAAuthenticationSettings")
    public String MFAAuthenticationSettings;

    /**
     * <p>Specifies whether MFA is required for users who initiated unusual logons. Valid value:</p>
     * <br>
     * <p>- Autonomous: MFA is prompted for users who initiated unusual logons. However, the users are allowed to skip MFA. If an MFA device is bound to a user who initiated an unusual logon, the user must pass MFA.</p>
     * <br>
     * <p>- EnforceVerify: MFA is required. If no MFA devices are bound to a user who initiated an unusual logon, the user must bind an MFA device. If an MFA device is already bound to a user who initiated an unusual logon, the user must pass MFA.</p>
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
