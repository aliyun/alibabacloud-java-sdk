// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class VPCBinding extends TeaModel {
    @NameInMap("vpcIds")
    public java.util.List<String> vpcIds;

    public static VPCBinding build(java.util.Map<String, ?> map) throws Exception {
        VPCBinding self = new VPCBinding();
        return TeaModel.build(map, self);
    }

    public VPCBinding setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

}
