// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordExpirationConfigurationRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>密码过期动作。当passwordExpirationStatus取值为enabled时必传。枚举取值:forbid_login(禁止登录)、force_update_password(强制修改密码)、remind_update_password(提醒修改密码)</p>
     */
    @NameInMap("PasswordExpirationAction")
    public String passwordExpirationAction;

    /**
     * <p>密码过期通知渠道。枚举取值:login(用户登录)、email(邮件)、sms(短信)</p>
     */
    @NameInMap("PasswordExpirationNotificationChannels")
    public java.util.List<String> passwordExpirationNotificationChannels;

    /**
     * <p>密码过期通知时间，单位是天。当passwordExpirationNotificationStatus取值为enabled时必传。</p>
     */
    @NameInMap("PasswordExpirationNotificationDuration")
    public Integer passwordExpirationNotificationDuration;

    /**
     * <p>密码过期通知状态。枚举取值:enabled(开启)、disabled(禁用)</p>
     */
    @NameInMap("PasswordExpirationNotificationStatus")
    public String passwordExpirationNotificationStatus;

    /**
     * <p>密码过期配置状态。枚举取值:enabled(开启)、disabled(禁用)</p>
     */
    @NameInMap("PasswordExpirationStatus")
    public String passwordExpirationStatus;

    /**
     * <p>密码强制修改时间，单位是天。当前字段取值要比passwordExpirationNotificationDuration大。</p>
     */
    @NameInMap("PasswordForcedUpdateDuration")
    public Integer passwordForcedUpdateDuration;

    /**
     * <p>密码有效时长，单位是天。当passwordExpirationStatus取值为enabled时必传。</p>
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
