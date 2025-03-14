// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class RevokeEndpointAclRequest extends TeaModel {
    /**
     * <p>The ACL policy. Valid value:</p>
     * <ul>
     * <li><strong>allow</strong>: indicates that the operation is initiated from an endpoint in CIDR whitelist. (Only allow is supported)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>allow</p>
     */
    @NameInMap("AclStrategy")
    public String aclStrategy;

    /**
     * <p>The CIDR blocks.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CidrList")
    public java.util.List<String> cidrList;

    /**
     * <p>The type of the endpoint. Valid value:</p>
     * <ul>
     * <li><strong>public</strong>: indicates an public endpoint. (Only public endpoint is supported.)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    public static RevokeEndpointAclRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeEndpointAclRequest self = new RevokeEndpointAclRequest();
        return TeaModel.build(map, self);
    }

    public RevokeEndpointAclRequest setAclStrategy(String aclStrategy) {
        this.aclStrategy = aclStrategy;
        return this;
    }
    public String getAclStrategy() {
        return this.aclStrategy;
    }

    public RevokeEndpointAclRequest setCidrList(java.util.List<String> cidrList) {
        this.cidrList = cidrList;
        return this;
    }
    public java.util.List<String> getCidrList() {
        return this.cidrList;
    }

    public RevokeEndpointAclRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

}
