// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddPermanentTopologyNodesRequest extends TeaModel {
    @NameInMap("Configurations")
    public String configurations;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Ports")
    public String ports;

    @NameInMap("Product")
    public String product;

    @NameInMap("ViewId")
    public String viewId;

    public static AddPermanentTopologyNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPermanentTopologyNodesRequest self = new AddPermanentTopologyNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddPermanentTopologyNodesRequest setConfigurations(String configurations) {
        this.configurations = configurations;
        return this;
    }
    public String getConfigurations() {
        return this.configurations;
    }

    public AddPermanentTopologyNodesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AddPermanentTopologyNodesRequest setPorts(String ports) {
        this.ports = ports;
        return this;
    }
    public String getPorts() {
        return this.ports;
    }

    public AddPermanentTopologyNodesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public AddPermanentTopologyNodesRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
