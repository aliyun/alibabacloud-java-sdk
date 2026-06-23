// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordInitializationConfigurationRequest extends TeaModel {
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
     * <p>The password forced update status. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("PasswordForcedUpdateStatus")
    public String passwordForcedUpdateStatus;

    /**
     * <p>The list of password initialization notification channels.</p>
     * 
     * <strong>example:</strong>
     * <p>email</p>
     */
    @NameInMap("PasswordInitializationNotificationChannels")
    public java.util.List<String> passwordInitializationNotificationChannels;

    /**
     * <p>The password initialization configuration status. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("PasswordInitializationStatus")
    public String passwordInitializationStatus;

    /**
     * <p>The password initialization method. This parameter is required when PasswordInitializationStatus is set to enabled. Valid values:</p>
     * <ul>
     * <li>random: Random.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>random</p>
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
