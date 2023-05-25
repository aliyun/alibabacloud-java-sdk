// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("ModifyAction")
    public String modifyAction;

    @NameInMap("SkipWaitSwitch")
    public Boolean skipWaitSwitch;

    @NameInMap("Token")
    public String token;

    public static ModifyInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecRequest self = new ModifyInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyInstanceSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceSpecRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public ModifyInstanceSpecRequest setModifyAction(String modifyAction) {
        this.modifyAction = modifyAction;
        return this;
    }
    public String getModifyAction() {
        return this.modifyAction;
    }

    public ModifyInstanceSpecRequest setSkipWaitSwitch(Boolean skipWaitSwitch) {
        this.skipWaitSwitch = skipWaitSwitch;
        return this;
    }
    public Boolean getSkipWaitSwitch() {
        return this.skipWaitSwitch;
    }

    public ModifyInstanceSpecRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
