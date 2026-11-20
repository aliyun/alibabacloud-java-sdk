// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class AuthorizeEndpointAclShrinkRequest extends TeaModel {
    /**
     * <p>The ACL policy. Valid values:</p>
     * <ul>
     * <li><strong>allow</strong>: CIDR whitelist. Currently, only allow is supported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>allow</p>
     */
    @NameInMap("AclStrategy")
    public String aclStrategy;

    /**
     * <p>The list of CIDR blocks. You must specify at least one CIDR block. Example: 192.168.1.0/24.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CidrList")
    public String cidrListShrink;

    /**
     * <p>The access point type. Valid values:</p>
     * <ul>
     * <li><strong>public</strong>: Internet-facing access point. Currently, only public is supported.</li>
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
