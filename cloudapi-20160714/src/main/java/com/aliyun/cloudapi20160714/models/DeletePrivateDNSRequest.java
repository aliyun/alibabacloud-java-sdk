// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeletePrivateDNSRequest extends TeaModel {
    /**
     * <p>Specifies whether to force delete the resolution.</p>
     * <ul>
     * <li>true: force deletes the resolution if the resolution is associated with an instance.</li>
     * <li>false: does not force delete the resolution if the resolution is associated with an instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The internal domain name.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    public static DeletePrivateDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateDNSRequest self = new DeletePrivateDNSRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrivateDNSRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeletePrivateDNSRequest setIntranetDomain(String intranetDomain) {
        this.intranetDomain = intranetDomain;
        return this;
    }
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    public DeletePrivateDNSRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeletePrivateDNSRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
