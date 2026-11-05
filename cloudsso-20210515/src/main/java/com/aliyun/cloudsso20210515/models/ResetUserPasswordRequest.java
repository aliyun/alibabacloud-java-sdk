// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ResetUserPasswordRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>Specifies whether to automatically generate a password. Valid values:</p>
     * <ul>
     * <li>True: The password is automatically generated.</li>
     * <li>False (default): The password is manually specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("GenerateRandomPassword")
    public Boolean generateRandomPassword;

    /**
     * <p>The new password.</p>
     * <p>Format: The password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character.</p>
     * <p>Length: 8 to 32 characters.</p>
     * <blockquote>
     * <p>If GenerateRandomPassword is set to False, you must specify Password.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>uc)XK$?ictf72CKFDy9vtWaFmISl****</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether the user must reset the password upon the next logon. Valid values:</p>
     * <ul>
     * <li>True: The user must reset the password.</li>
     * <li>False (default): The user does not need to reset the password.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("RequirePasswordResetForNextLogin")
    public Boolean requirePasswordResetForNextLogin;

    /**
     * <strong>example:</strong>
     * <p>DirectPassword</p>
     */
    @NameInMap("ResetMethod")
    public String resetMethod;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>u-00q8wbq42wiltcrk****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ResetUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordRequest self = new ResetUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ResetUserPasswordRequest setGenerateRandomPassword(Boolean generateRandomPassword) {
        this.generateRandomPassword = generateRandomPassword;
        return this;
    }
    public Boolean getGenerateRandomPassword() {
        return this.generateRandomPassword;
    }

    public ResetUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetUserPasswordRequest setRequirePasswordResetForNextLogin(Boolean requirePasswordResetForNextLogin) {
        this.requirePasswordResetForNextLogin = requirePasswordResetForNextLogin;
        return this;
    }
    public Boolean getRequirePasswordResetForNextLogin() {
        return this.requirePasswordResetForNextLogin;
    }

    public ResetUserPasswordRequest setResetMethod(String resetMethod) {
        this.resetMethod = resetMethod;
        return this;
    }
    public String getResetMethod() {
        return this.resetMethod;
    }

    public ResetUserPasswordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
