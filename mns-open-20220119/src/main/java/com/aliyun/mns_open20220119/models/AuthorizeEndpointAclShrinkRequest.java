// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class AuthorizeEndpointAclShrinkRequest extends TeaModel {
    /**
     * <p>The access control list (ACL) policy. Valid value:</p>
     * <ul>
     * <li><strong>allow</strong>: A CIDR whitelist. Only allow is supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>allow</p>
     */
    @NameInMap("AclStrategy")
    public String aclStrategy;

    /**
     * <p>A list of CIDR blocks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CidrList")
    public String cidrListShrink;

    /**
     * <p>The type of the endpoint. Valid value:</p>
     * <ul>
     * <li><strong>public</strong>: An internet endpoint. Only public is supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    public static AuthorizeEndpointAclShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeEndpointAclShrinkRequest self = new AuthorizeEndpointAclShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeEndpointAclShrinkRequest setAclStrategy(String aclStrategy) {
        this.aclStrategy = aclStrategy;
        return this;
    }
    public String getAclStrategy() {
        return this.aclStrategy;
    }

    public AuthorizeEndpointAclShrinkRequest setCidrListShrink(String cidrListShrink) {
        this.cidrListShrink = cidrListShrink;
        return this;
    }
    public String getCidrListShrink() {
        return this.cidrListShrink;
    }

    public AuthorizeEndpointAclShrinkRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

}
