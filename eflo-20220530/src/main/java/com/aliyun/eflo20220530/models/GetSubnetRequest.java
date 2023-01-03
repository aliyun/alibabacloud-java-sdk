// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetSubnetRequest extends TeaModel {
    @NameInMap("SubnetId")
    public String subnetId;

    public static GetSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSubnetRequest self = new GetSubnetRequest();
        return TeaModel.build(map, self);
    }

    public GetSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

}
