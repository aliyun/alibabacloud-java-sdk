// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetForgetPasswordConfigurationRequest extends TeaModel {
    /**
     * <p>The authentication channels. Valid values: email and sms.</p>
     * 
     * <strong>example:</strong>
     * <p>email</p>
     */
    @NameInMap("AuthenticationChannels")
    public java.util.List<String> authenticationChannels;

    /**
     * <p>The status of the forgot password feature. Valid values: enabled and disabled.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ForgetPasswordStatus")
    public String forgetPasswordStatus;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-111ccc1111</p>
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
