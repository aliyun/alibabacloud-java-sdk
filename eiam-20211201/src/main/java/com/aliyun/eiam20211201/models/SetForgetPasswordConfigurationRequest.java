// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetForgetPasswordConfigurationRequest extends TeaModel {
    /**
     * <p>身份认证渠道。枚举取值:email(邮件)、sms(短信)</p>
     */
    @NameInMap("AuthenticationChannels")
    public java.util.List<String> authenticationChannels;

    /**
     * <p>忘记密码配置状态。枚举取值:enabled(开启)、disabled(禁用)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForgetPasswordStatus")
    public String forgetPasswordStatus;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static SetForgetPasswordConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetForgetPasswordConfigurationRequest self = new SetForgetPasswordConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetForgetPasswordConfigurationRequest setAuthenticationChannels(java.util.List<String> authenticationChannels) {
        this.authenticationChannels = authenticationChannels;
        return this;
    }
    public java.util.List<String> getAuthenticationChannels() {
        return this.authenticationChannels;
    }

    public SetForgetPasswordConfigurationRequest setForgetPasswordStatus(String forgetPasswordStatus) {
        this.forgetPasswordStatus = forgetPasswordStatus;
        return this;
    }
    public String getForgetPasswordStatus() {
        return this.forgetPasswordStatus;
    }

    public SetForgetPasswordConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
