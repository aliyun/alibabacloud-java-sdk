// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteDeviceInternetPortRequest extends TeaModel {
    // InstanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // NatType
    @NameInMap("NatType")
    public String natType;

    // RuleId
    @NameInMap("RuleId")
    public String ruleId;

    public static DeleteDeviceInternetPortRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceInternetPortRequest self = new DeleteDeviceInternetPortRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceInternetPortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteDeviceInternetPortRequest setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public DeleteDeviceInternetPortRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
