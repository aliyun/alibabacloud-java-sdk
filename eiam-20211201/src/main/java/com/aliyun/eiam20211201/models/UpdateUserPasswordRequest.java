// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserPasswordRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>密码</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>强制修改密码状态,默认不启用。枚举取值:enabled(开启)、disabled(禁用)</p>
     */
    @NameInMap("PasswordForcedUpdateStatus")
    public String passwordForcedUpdateStatus;

    /**
     * <p>账户ID</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>密码通知渠道。枚举取值:email(邮件)、sms(短信)</p>
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
