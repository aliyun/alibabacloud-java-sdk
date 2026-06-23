// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordExpirationConfigurationRequest extends TeaModel {
    /**
     * <p>The list of effective authentication source IDs.</p>
     */
    @NameInMap("EffectiveAuthenticationSourceIds")
    public java.util.List<String> effectiveAuthenticationSourceIds;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The action to take when a password expires. This parameter is required when PasswordExpirationStatus is set to enabled. Valid values:</p>
     * <ul>
     * <li>forbid_login: Prohibit logon.</li>
     * <li>force_update_password: Force password change.</li>
     * <li>remind_update_password: Remind to change password.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>force_update_password</p>
     */
    @NameInMap("PasswordExpirationAction")
    public String passwordExpirationAction;

    /**
     * <p>The list of password expiration notification channels. This parameter is required when PasswordExpirationNotificationStatus is set to enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>login</p>
     */
    @NameInMap("PasswordExpirationNotificationChannels")
    public java.util.List<String> passwordExpirationNotificationChannels;

    /**
     * <p>The password expiration notification time, in days. This parameter is required when PasswordExpirationNotificationStatus is set to enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PasswordExpirationNotificationDuration")
    public Integer passwordExpirationNotificationDuration;

    /**
     * <p>The password expiration notification status. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("PasswordExpirationNotificationStatus")
    public String passwordExpirationNotificationStatus;

    /**
     * <p>The password expiration configuration status. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("PasswordExpirationStatus")
    public String passwordExpirationStatus;

    /**
     * <p>The forced password change time, in days. The value of this parameter must be greater than the value of PasswordExpirationNotificationDuration.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PasswordForcedUpdateDuration")
    public Integer passwordForcedUpdateDuration;

    /**
     * <p>The validity period of a password, in days. This parameter is required when PasswordExpirationStatus is set to enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("PasswordValidMaxDay")
    public Integer passwordValidMaxDay;

    public static SetPasswordExpirationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordExpirationConfigurationRequest self = new SetPasswordExpirationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordExpirationConfigurationRequest setEffectiveAuthenticationSourceIds(java.util.List<String> effectiveAuthenticationSourceIds) {
        this.effectiveAuthenticationSourceIds = effectiveAuthenticationSourceIds;
        return this;
    }
    public java.util.List<String> getEffectiveAuthenticationSourceIds() {
        return this.effectiveAuthenticationSourceIds;
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
