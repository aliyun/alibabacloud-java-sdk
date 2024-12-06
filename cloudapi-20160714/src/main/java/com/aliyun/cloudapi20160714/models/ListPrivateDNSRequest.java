// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ListPrivateDNSRequest extends TeaModel {
    /**
     * <p>The internal domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>api.demo.com</p>
     */
    @NameInMap("IntranetDomain")
    public String intranetDomain;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The internal domain name resolution type. Valid values:</p>
     * <ul>
     * <li>VPC: resolution for virtual private cloud (VPC) access authorizations. A resolution of this type can be bound only to traditional dedicated instances.</li>
     * <li>A: resolution that supports A records. A resolution of this type can be bound only to VPC integration dedicated instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListPrivateDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateDNSRequest self = new ListPrivateDNSRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateDNSRequest setIntranetDomain(String intranetDomain) {
        this.intranetDomain = intranetDomain;
        return this;
    }
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    public ListPrivateDNSRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ListPrivateDNSRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
