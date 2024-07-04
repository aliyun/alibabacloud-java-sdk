// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetDeviceInternetPortRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can specify the ID of the server or container. You can specify only one ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5s6xbnx9srb3vm6tp9hg9o64e</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the NAT gateway. The value must be of the enumerated data type. Valid values:</p>
     * <ul>
     * <li>SNAT</li>
     * <li>DNAT</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DNAT</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The ID of the rule. If you leave this parameter empty, all rules are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-5ref5fc1l1xgqnpjzrtw1hw5a</p>
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
