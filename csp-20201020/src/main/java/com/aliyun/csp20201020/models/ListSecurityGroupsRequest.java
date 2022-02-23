// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsRequest extends TeaModel {
    @NameInMap("VpcId")
    public String vpcId;

    public static ListSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsRequest self = new ListSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
