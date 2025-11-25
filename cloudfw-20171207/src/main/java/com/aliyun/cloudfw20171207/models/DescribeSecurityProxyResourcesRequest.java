// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityProxyResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>136481150091****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <strong>example:</strong>
     * <p>ngw-uf6y16l23fm8hq0****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    public static DescribeSecurityProxyResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityProxyResourcesRequest self = new DescribeSecurityProxyResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityProxyResourcesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSecurityProxyResourcesRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribeSecurityProxyResourcesRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

}
