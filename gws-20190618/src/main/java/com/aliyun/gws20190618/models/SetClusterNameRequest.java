// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterNameRequest extends TeaModel {
    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static SetClusterNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClusterNameRequest self = new SetClusterNameRequest();
        return TeaModel.build(map, self);
    }

    public SetClusterNameRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetClusterNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
