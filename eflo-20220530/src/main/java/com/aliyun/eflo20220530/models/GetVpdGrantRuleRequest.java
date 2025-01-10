// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVpdGrantRuleRequest extends TeaModel {
    /**
     * <p>Lingjun HUB Instance Id</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>Authorized Resource Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>grant-rule-xrgvqazb</p>
     */
    @NameInMap("GrantRuleId")
    public String grantRuleId;

    /**
     * <p>Authorized Tenant ID</p>
     * 
     * <strong>example:</strong>
     * <p>1620939556166277</p>
     */
    @NameInMap("GrantTenantId")
    public String grantTenantId;

    /**
     * <p>Authorized Instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-xxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetVpdGrantRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVpdGrantRuleRequest self = new GetVpdGrantRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetVpdGrantRuleRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public GetVpdGrantRuleRequest setGrantRuleId(String grantRuleId) {
        this.grantRuleId = grantRuleId;
        return this;
    }
    public String getGrantRuleId() {
        return this.grantRuleId;
    }

    public GetVpdGrantRuleRequest setGrantTenantId(String grantTenantId) {
        this.grantTenantId = grantTenantId;
        return this;
    }
    public String getGrantTenantId() {
        return this.grantTenantId;
    }

    public GetVpdGrantRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetVpdGrantRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
