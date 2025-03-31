// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployEnvironmentRequest extends TeaModel {
    @NameInMap("body")
    public DeployEnvironmentOptions body;

    public static DeployEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployEnvironmentRequest self = new DeployEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public DeployEnvironmentRequest setBody(DeployEnvironmentOptions body) {
        this.body = body;
        return this;
    }
    public DeployEnvironmentOptions getBody() {
        return this.body;
    }

}
