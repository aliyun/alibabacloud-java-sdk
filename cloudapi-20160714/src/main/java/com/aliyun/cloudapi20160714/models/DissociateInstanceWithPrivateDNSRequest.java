// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DissociateInstanceWithPrivateDNSRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-hz-ead4f4b0bac8</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IntranetDomains")
    public java.util.List<String> intranetDomains;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DissociateInstanceWithPrivateDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateInstanceWithPrivateDNSRequest self = new DissociateInstanceWithPrivateDNSRequest();
        return TeaModel.build(map, self);
    }

    public DissociateInstanceWithPrivateDNSRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DissociateInstanceWithPrivateDNSRequest setIntranetDomains(java.util.List<String> intranetDomains) {
        this.intranetDomains = intranetDomains;
        return this;
    }
    public java.util.List<String> getIntranetDomains() {
        return this.intranetDomains;
    }

    public DissociateInstanceWithPrivateDNSRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
