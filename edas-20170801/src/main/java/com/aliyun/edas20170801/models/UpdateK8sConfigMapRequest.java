// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sConfigMapRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    public static UpdateK8sConfigMapRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sConfigMapRequest self = new UpdateK8sConfigMapRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sConfigMapRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateK8sConfigMapRequest setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public UpdateK8sConfigMapRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateK8sConfigMapRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
