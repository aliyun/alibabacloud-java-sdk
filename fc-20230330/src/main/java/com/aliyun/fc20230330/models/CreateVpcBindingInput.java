// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateVpcBindingInput extends TeaModel {
    @NameInMap("vpcId")
    public String vpcId;

    public static CreateVpcBindingInput build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcBindingInput self = new CreateVpcBindingInput();
        return TeaModel.build(map, self);
    }

    public CreateVpcBindingInput setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
