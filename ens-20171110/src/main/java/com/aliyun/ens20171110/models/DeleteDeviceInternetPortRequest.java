// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteDeviceInternetPortRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can specify the ID of the server or container.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5scdmgpdegymqyugf85q66l1a</p>
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
     * <p>The ID of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-5rfzxah5gzfo869fl6epvon3y</p>
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
