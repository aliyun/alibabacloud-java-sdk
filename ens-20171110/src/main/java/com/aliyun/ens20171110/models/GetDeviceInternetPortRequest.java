// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetDeviceInternetPortRequest extends TeaModel {
    // A short description of struct
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NatType")
    public String natType;

    @NameInMap("RuleId")
    public String ruleId;

    public static GetDeviceInternetPortRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInternetPortRequest self = new GetDeviceInternetPortRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceInternetPortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDeviceInternetPortRequest setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public GetDeviceInternetPortRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

}
