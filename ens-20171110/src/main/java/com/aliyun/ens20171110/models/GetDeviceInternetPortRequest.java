// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetDeviceInternetPortRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can specify the ID of the server or container. You can specify only one ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the NAT gateway. The value must be of the enumerated data type. Valid values:</p>
     * <br>
     * <p>*   SNAT</p>
     * <p>*   DNAT</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The ID of the rule. If you leave this parameter empty, all rules are queried.</p>
     */
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
