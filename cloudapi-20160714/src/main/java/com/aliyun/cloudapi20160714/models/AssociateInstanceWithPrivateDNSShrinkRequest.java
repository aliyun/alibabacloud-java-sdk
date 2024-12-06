// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class AssociateInstanceWithPrivateDNSShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-hz-ead4f4b0bac8</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The internal domain names included in the resolution.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IntranetDomains")
    public String intranetDomainsShrink;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AssociateInstanceWithPrivateDNSShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateInstanceWithPrivateDNSShrinkRequest self = new AssociateInstanceWithPrivateDNSShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AssociateInstanceWithPrivateDNSShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssociateInstanceWithPrivateDNSShrinkRequest setIntranetDomainsShrink(String intranetDomainsShrink) {
        this.intranetDomainsShrink = intranetDomainsShrink;
        return this;
    }
    public String getIntranetDomainsShrink() {
        return this.intranetDomainsShrink;
    }

    public AssociateInstanceWithPrivateDNSShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
