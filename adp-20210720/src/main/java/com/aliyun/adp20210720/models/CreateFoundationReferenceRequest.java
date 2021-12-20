// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateFoundationReferenceRequest extends TeaModel {
    @NameInMap("clusterConfig")
    public String clusterConfig;

    @NameInMap("foundationVersionUID")
    public String foundationVersionUID;

    public static CreateFoundationReferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFoundationReferenceRequest self = new CreateFoundationReferenceRequest();
        return TeaModel.build(map, self);
    }

    public CreateFoundationReferenceRequest setClusterConfig(String clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }
    public String getClusterConfig() {
        return this.clusterConfig;
    }

    public CreateFoundationReferenceRequest setFoundationVersionUID(String foundationVersionUID) {
        this.foundationVersionUID = foundationVersionUID;
        return this;
    }
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

}
