// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordInitializationConfigurationRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>密码强制更新状态。枚举取值:enabled(开启)、disabled(禁用)</p>
     */
    @NameInMap("PasswordForcedUpdateStatus")
    public String passwordForcedUpdateStatus;

    /**
     * <p>密码初始化通知渠道。枚举取值:email(邮件)、sms(短信)</p>
     */
    @NameInMap("PasswordInitializationNotificationChannels")
    public java.util.List<String> passwordInitializationNotificationChannels;

    /**
     * <p>密码初始化配置状态。枚举取值:enabled(开启)、disabled(禁用)</p>
     */
    @NameInMap("PasswordInitializationStatus")
    public String passwordInitializationStatus;

    /**
     * <p>密码初始化方式。当passwordInitializationStatus取值为enabled时必传。枚举取值:random(随机)</p>
     */
    @NameInMap("PasswordInitializationType")
    public String passwordInitializationType;

    public static SetPasswordInitializationConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordInitializationConfigurationRequest self = new SetPasswordInitializationConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordInitializationConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPasswordInitializationConfigurationRequest setPasswordForcedUpdateStatus(String passwordForcedUpdateStatus) {
        this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
        return this;
    }
    public String getPasswordForcedUpdateStatus() {
        return this.passwordForcedUpdateStatus;
    }

    public SetPasswordInitializationConfigurationRequest setPasswordInitializationNotificationChannels(java.util.List<String> passwordInitializationNotificationChannels) {
        this.passwordInitializationNotificationChannels = passwordInitializationNotificationChannels;
        return this;
    }
    public java.util.List<String> getPasswordInitializationNotificationChannels() {
        return this.passwordInitializationNotificationChannels;
    }

    public SetPasswordInitializationConfigurationRequest setPasswordInitializationStatus(String passwordInitializationStatus) {
        this.passwordInitializationStatus = passwordInitializationStatus;
        return this;
    }
    public String getPasswordInitializationStatus() {
        return this.passwordInitializationStatus;
    }

    public SetPasswordInitializationConfigurationRequest setPasswordInitializationType(String passwordInitializationType) {
        this.passwordInitializationType = passwordInitializationType;
        return this;
    }
    public String getPasswordInitializationType() {
        return this.passwordInitializationType;
    }

}
