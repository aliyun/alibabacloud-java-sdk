// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVccGrantRuleRequest extends TeaModel {
    /**
     * <p>Lingjun HUB ID</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>Authorization Entry ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grant-rule-jaj34d75h01</p>
     */
    @NameInMap("GrantRuleId")
    public String grantRuleId;

    /**
     * <p>Network Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-jaj34d75h01</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteVccGrantRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVccGrantRuleRequest self = new DeleteVccGrantRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVccGrantRuleRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public DeleteVccGrantRuleRequest setGrantRuleId(String grantRuleId) {
        this.grantRuleId = grantRuleId;
        return this;
    }
    public String getGrantRuleId() {
        return this.grantRuleId;
    }

    public DeleteVccGrantRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteVccGrantRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
