// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteDeviceInternetPortRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can specify the ID of the server or container.</p>
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
     * <p>The ID of the rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
