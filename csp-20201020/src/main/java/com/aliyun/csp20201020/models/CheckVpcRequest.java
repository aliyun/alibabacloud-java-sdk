// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckVpcRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpcId")
    public String vpcId;

    public static CheckVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckVpcRequest self = new CheckVpcRequest();
        return TeaModel.build(map, self);
    }

    public CheckVpcRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
