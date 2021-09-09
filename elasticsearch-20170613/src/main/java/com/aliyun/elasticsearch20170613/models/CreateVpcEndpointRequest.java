// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateVpcEndpointRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcEndpointRequest self = new CreateVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpcEndpointRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
