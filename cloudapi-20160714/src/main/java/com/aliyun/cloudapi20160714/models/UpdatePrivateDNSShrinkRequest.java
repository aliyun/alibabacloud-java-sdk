// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class UpdatePrivateDNSShrinkRequest extends TeaModel {
    /**
     * <p>The internal domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api.demo.com</p>
     */
    @NameInMap("IntranetDomain")
    public String intranetDomain;

    /**
     * <p>The resolution records. This parameter is valid only when Type is set to A.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Records")
    public String recordsShrink;

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

    public static UpdatePrivateDNSShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateDNSShrinkRequest self = new UpdatePrivateDNSShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateDNSShrinkRequest setIntranetDomain(String intranetDomain) {
        this.intranetDomain = intranetDomain;
        return this;
    }
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    public UpdatePrivateDNSShrinkRequest setRecordsShrink(String recordsShrink) {
        this.recordsShrink = recordsShrink;
        return this;
    }
    public String getRecordsShrink() {
        return this.recordsShrink;
    }

    public UpdatePrivateDNSShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public UpdatePrivateDNSShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
