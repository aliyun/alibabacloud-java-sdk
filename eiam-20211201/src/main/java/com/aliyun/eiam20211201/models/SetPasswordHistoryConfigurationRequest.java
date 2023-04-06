// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetPasswordHistoryConfigurationRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>保留最近密码记录数。当passwordHistoryStatus取值为enabled时必传。</p>
     */
    @NameInMap("PasswordHistoryMaxRetention")
    public Integer passwordHistoryMaxRetention;

    /**
     * <p>密码历史配置状态。枚举取值:enabled(开启)、disabled(禁用)</p>
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
