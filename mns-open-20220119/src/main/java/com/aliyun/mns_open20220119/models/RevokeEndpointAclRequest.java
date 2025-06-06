// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class RevokeEndpointAclRequest extends TeaModel {
    /**
     * <p>The ACL policy. Value:</p>
     * <ul>
     * <li><strong>allow</strong>: indicates that this operation is included in the Cidr whitelist. (Only the allow is supported.)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>allow</p>
     */
    @NameInMap("AclStrategy")
    public String aclStrategy;

    /**
     * <p>The list of CIDR block.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CidrList")
    public java.util.List<String> cidrList;

    /**
     * <p>The type of the endpoint. Valid values:</p>
     * <ul>
     * <li><strong>public</strong>: indicates public endpoint. (Only the public is supported.)</li>
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
