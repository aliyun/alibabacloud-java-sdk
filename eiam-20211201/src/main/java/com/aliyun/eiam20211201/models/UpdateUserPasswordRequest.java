// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserPasswordRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new password of the account. For more information about the password format, see the "Password Policies" topic.</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Specifies whether to enable forcible password change upon first logon. Default value: disabled. Valid values:</p>
     * <br>
     * <p>*   enabled</p>
     * <p>*   disabled</p>
     */
    @NameInMap("PasswordForcedUpdateStatus")
    public String passwordForcedUpdateStatus;

    /**
     * <p>The account ID.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The methods for receiving password notifications.</p>
     */
    @NameInMap("UserNotificationChannels")
    public java.util.List<String> userNotificationChannels;

    public static UpdateUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPasswordRequest self = new UpdateUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateUserPasswordRequest setPasswordForcedUpdateStatus(String passwordForcedUpdateStatus) {
        this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
        return this;
    }
    public String getPasswordForcedUpdateStatus() {
        return this.passwordForcedUpdateStatus;
    }

    public UpdateUserPasswordRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateUserPasswordRequest setUserNotificationChannels(java.util.List<String> userNotificationChannels) {
        this.userNotificationChannels = userNotificationChannels;
        return this;
    }
    public java.util.List<String> getUserNotificationChannels() {
        return this.userNotificationChannels;
    }

}
