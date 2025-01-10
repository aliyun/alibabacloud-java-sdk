// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccGrantRuleRequest extends TeaModel {
    /**
     * <p>Lingjun HUB ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>Authorized Tenant ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1620939556166277</p>
     */
    @NameInMap("GrantTenantId")
    public String grantTenantId;

    /**
     * <p>Network Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-8rgvqazb</p>
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

    public static CreateVccGrantRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVccGrantRuleRequest self = new CreateVccGrantRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateVccGrantRuleRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public CreateVccGrantRuleRequest setGrantTenantId(String grantTenantId) {
        this.grantTenantId = grantTenantId;
        return this;
    }
    public String getGrantTenantId() {
        return this.grantTenantId;
    }

    public CreateVccGrantRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVccGrantRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
