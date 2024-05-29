// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordExpirationConfigurationRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The action to take upon password expiration. This parameter must be specified when PasswordExpirationStatus is set to enabled. Valid values:</p>
     * <br>
     * <p>*   forbid_login: Users cannot log on to IDaaS.</p>
     * <p>*   force_update_password: Users must change the password.</p>
     * <p>*   remind_update_password: IDaaS reminds users to change the password upon each logon.</p>
     */
    @NameInMap("PasswordExpirationAction")
    public String passwordExpirationAction;

    /**
     * <p>The methods for receiving password expiration notifications. This parameter must be specified when PasswordExpirationNotificationStatus is set to enabled.</p>
     */
    @NameInMap("PasswordExpirationNotificationChannels")
    public java.util.List<String> passwordExpirationNotificationChannels;

    /**
     * <p>The number of days before the expiration date during which password expiration notifications are sent. Unit: day. This parameter must be specified when PasswordExpirationNotificationStatus is set to enabled.</p>
     */
    @NameInMap("PasswordExpirationNotificationDuration")
    public Integer passwordExpirationNotificationDuration;

    /**
     * <p>Specifies whether to enable the password expiration notification feature. Valid values:</p>
     * <br>
     * <p>*   enabled</p>
     * <p>*   disabled</p>
     */
    @NameInMap("PasswordExpirationNotificationStatus")
    public String passwordExpirationNotificationStatus;

    /**
     * <p>Specifies whether to enable the password expiration feature. Valid values:</p>
     * <br>
     * <p>*   enabled</p>
     * <p>*   disabled</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PasswordExpirationStatus")
    public String passwordExpirationStatus;

    /**
     * <p>The number of days before which users must change the password to prevent password expiration. Unit: day. You must set this parameter to a value greater than the value of PasswordExpirationNotificationDuration.</p>
     */
    @NameInMap("PasswordForcedUpdateDuration")
    public Integer passwordForcedUpdateDuration;

    /**
     * <p>The validity period of a password. Unit: day. This parameter must be specified when PasswordExpirationStatus is set to enabled.</p>
     */
    @NameInMap("PasswordValidMaxDay")
    public Integer passwordValidMaxDay;

    public static SetPasswordExpirationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordExpirationConfigurationRequest self = new SetPasswordExpirationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordExpirationConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPasswordExpirationConfigurationRequest setPasswordExpirationAction(String passwordExpirationAction) {
        this.passwordExpirationAction = passwordExpirationAction;
        return this;
    }
    public String getPasswordExpirationAction() {
        return this.passwordExpirationAction;
    }

    public SetPasswordExpirationConfigurationRequest setPasswordExpirationNotificationChannels(java.util.List<String> passwordExpirationNotificationChannels) {
        this.passwordExpirationNotificationChannels = passwordExpirationNotificationChannels;
        return this;
    }
    public java.util.List<String> getPasswordExpirationNotificationChannels() {
        return this.passwordExpirationNotificationChannels;
    }

    public SetPasswordExpirationConfigurationRequest setPasswordExpirationNotificationDuration(Integer passwordExpirationNotificationDuration) {
        this.passwordExpirationNotificationDuration = passwordExpirationNotificationDuration;
        return this;
    }
    public Integer getPasswordExpirationNotificationDuration() {
        return this.passwordExpirationNotificationDuration;
    }

    public SetPasswordExpirationConfigurationRequest setPasswordExpirationNotificationStatus(String passwordExpirationNotificationStatus) {
        this.passwordExpirationNotificationStatus = passwordExpirationNotificationStatus;
        return this;
    }
    public String getPasswordExpirationNotificationStatus() {
        return this.passwordExpirationNotificationStatus;
    }

    public SetPasswordExpirationConfigurationRequest setPasswordExpirationStatus(String passwordExpirationStatus) {
        this.passwordExpirationStatus = passwordExpirationStatus;
        return this;
    }
    public String getPasswordExpirationStatus() {
        return this.passwordExpirationStatus;
    }

    public SetPasswordExpirationConfigurationRequest setPasswordForcedUpdateDuration(Integer passwordForcedUpdateDuration) {
        this.passwordForcedUpdateDuration = passwordForcedUpdateDuration;
        return this;
    }
    public Integer getPasswordForcedUpdateDuration() {
        return this.passwordForcedUpdateDuration;
    }

    public SetPasswordExpirationConfigurationRequest setPasswordValidMaxDay(Integer passwordValidMaxDay) {
        this.passwordValidMaxDay = passwordValidMaxDay;
        return this;
    }
    public Integer getPasswordValidMaxDay() {
        return this.passwordValidMaxDay;
    }

}
