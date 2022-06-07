// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateFoundationReferenceRequest extends TeaModel {
    @NameInMap("clusterConfig")
    public String clusterConfig;

    public static UpdateFoundationReferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFoundationReferenceRequest self = new UpdateFoundationReferenceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFoundationReferenceRequest setClusterConfig(String clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }
    public String getClusterConfig() {
        return this.clusterConfig;
    }

}
