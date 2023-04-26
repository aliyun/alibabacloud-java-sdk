// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVccGrantRuleRequest extends TeaModel {
    @NameInMap("ErId")
    public String erId;

    @NameInMap("GrantRuleId")
    public String grantRuleId;

    @NameInMap("InstanceId")
    public String instanceId;

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
