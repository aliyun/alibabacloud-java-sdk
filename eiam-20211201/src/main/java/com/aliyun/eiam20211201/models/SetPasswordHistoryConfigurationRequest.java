// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordHistoryConfigurationRequest extends TeaModel {
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
     * <p>The number of recent password records to retain. This parameter is required when PasswordHistoryStatus is set to enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PasswordHistoryMaxRetention")
    public Integer passwordHistoryMaxRetention;

    /**
     * <p>The status of the password history configuration. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("PasswordHistoryStatus")
    public String passwordHistoryStatus;

    public static SetPasswordHistoryConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordHistoryConfigurationRequest self = new SetPasswordHistoryConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordHistoryConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPasswordHistoryConfigurationRequest setPasswordHistoryMaxRetention(Integer passwordHistoryMaxRetention) {
        this.passwordHistoryMaxRetention = passwordHistoryMaxRetention;
        return this;
    }
    public Integer getPasswordHistoryMaxRetention() {
        return this.passwordHistoryMaxRetention;
    }

    public SetPasswordHistoryConfigurationRequest setPasswordHistoryStatus(String passwordHistoryStatus) {
        this.passwordHistoryStatus = passwordHistoryStatus;
        return this;
    }
    public String getPasswordHistoryStatus() {
        return this.passwordHistoryStatus;
    }

}
