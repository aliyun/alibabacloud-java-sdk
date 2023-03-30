// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdGrantRuleRequest extends TeaModel {
    @NameInMap("ErId")
    public String erId;

    @NameInMap("GrantTenantId")
    public String grantTenantId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateVpdGrantRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdGrantRuleRequest self = new CreateVpdGrantRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpdGrantRuleRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public CreateVpdGrantRuleRequest setGrantTenantId(String grantTenantId) {
        this.grantTenantId = grantTenantId;
        return this;
    }
    public String getGrantTenantId() {
        return this.grantTenantId;
    }

    public CreateVpdGrantRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVpdGrantRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
