// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcefully enable multi-factor authentication (MFA) for the RAM user. Valid values:</p>
     * <ul>
     * <li>true: forcefully enables MFA for the RAM user. The RAM user must bind an MFA device upon the next logon.</li>
     * <li>false: does not forcefully enable MFA for the RAM user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MFABindRequired")
    public Boolean MFABindRequired;

    /**
     * <p>The new password that is used to log on to the console.</p>
     * <p>The new password must meet the complexity requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>mypassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether the RAM user is required to reset the password upon the next logon. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PasswordResetRequired")
    public Boolean passwordResetRequired;

    /**
     * <p>Specifies whether to enable password-based logons to the console. Valid values:</p>
     * <ul>
     * <li>Active: enables password-based logons to the console.</li>
     * <li>Inactive: disables password-based logons to the console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The logon name of the RAM user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
     */
    @NameInMap("UserPrincipalName")
    public String userPrincipalName;

    public static UpdateLoginProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileRequest self = new UpdateLoginProfileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoginProfileRequest setMFABindRequired(Boolean MFABindRequired) {
        this.MFABindRequired = MFABindRequired;
        return this;
    }
    public Boolean getMFABindRequired() {
        return this.MFABindRequired;
    }

    public UpdateLoginProfileRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateLoginProfileRequest setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }
    public Boolean getPasswordResetRequired() {
        return this.passwordResetRequired;
    }

    public UpdateLoginProfileRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateLoginProfileRequest setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }

}
