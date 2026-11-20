// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class AuthorizeEndpointAclRequest extends TeaModel {
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
    public java.util.List<String> cidrList;

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

    public static AuthorizeEndpointAclRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeEndpointAclRequest self = new AuthorizeEndpointAclRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeEndpointAclRequest setAclStrategy(String aclStrategy) {
        this.aclStrategy = aclStrategy;
        return this;
    }
    public String getAclStrategy() {
        return this.aclStrategy;
    }

    public AuthorizeEndpointAclRequest setCidrList(java.util.List<String> cidrList) {
        this.cidrList = cidrList;
        return this;
    }
    public java.util.List<String> getCidrList() {
        return this.cidrList;
    }

    public AuthorizeEndpointAclRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

}
