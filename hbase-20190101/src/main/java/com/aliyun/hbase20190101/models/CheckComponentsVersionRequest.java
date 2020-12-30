// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CheckComponentsVersionRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Components")
    public String components;

    public static CheckComponentsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckComponentsVersionRequest self = new CheckComponentsVersionRequest();
        return TeaModel.build(map, self);
    }

    public CheckComponentsVersionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CheckComponentsVersionRequest setComponents(String components) {
        this.components = components;
        return this;
    }
    public String getComponents() {
        return this.components;
    }

}
