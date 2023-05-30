// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateVpcBindingRequest extends TeaModel {
    /**
     * <p>Example 1</p>
     */
    @NameInMap("vpcId")
    public String vpcId;

    public static CreateVpcBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcBindingRequest self = new CreateVpcBindingRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcBindingRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
