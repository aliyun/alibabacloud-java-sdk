// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVpdGrantRuleRequest extends TeaModel {
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
     * <p>grant-rule-9rgxqazb</p>
     */
    @NameInMap("GrantRuleId")
    public String grantRuleId;

    /**
     * <p>Authorized Tenant ID</p>
     * 
     * <strong>example:</strong>
     * <p>1013666993027780</p>
     */
    @NameInMap("GrantTenantId")
    public String grantTenantId;

    /**
     * <p>Network Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-8rgvqazb</p>
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

    public static DeleteVpdGrantRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpdGrantRuleRequest self = new DeleteVpdGrantRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpdGrantRuleRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public DeleteVpdGrantRuleRequest setGrantRuleId(String grantRuleId) {
        this.grantRuleId = grantRuleId;
        return this;
    }
    public String getGrantRuleId() {
        return this.grantRuleId;
    }

    public DeleteVpdGrantRuleRequest setGrantTenantId(String grantTenantId) {
        this.grantTenantId = grantTenantId;
        return this;
    }
    public String getGrantTenantId() {
        return this.grantTenantId;
    }

    public DeleteVpdGrantRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteVpdGrantRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
