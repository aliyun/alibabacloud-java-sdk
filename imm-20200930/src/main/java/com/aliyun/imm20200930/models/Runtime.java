// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Runtime extends TeaModel {
    @NameInMap("Hyperparameters")
    public Hyperparameters hyperparameters;

    @NameInMap("Resource")
    public Resource resource;

    public static Runtime build(java.util.Map<String, ?> map) throws Exception {
        Runtime self = new Runtime();
        return TeaModel.build(map, self);
    }

    public Runtime setHyperparameters(Hyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
        return this;
    }
    public Hyperparameters getHyperparameters() {
        return this.hyperparameters;
    }

    public Runtime setResource(Resource resource) {
        this.resource = resource;
        return this;
    }
    public Resource getResource() {
        return this.resource;
    }

}
