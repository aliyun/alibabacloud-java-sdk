// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeletePermanentTopologyNodesRequest extends TeaModel {
    @NameInMap("Configurations")
    public String configurations;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Product")
    public String product;

    @NameInMap("ViewId")
    public String viewId;

    public static DeletePermanentTopologyNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePermanentTopologyNodesRequest self = new DeletePermanentTopologyNodesRequest();
        return TeaModel.build(map, self);
    }

    public DeletePermanentTopologyNodesRequest setConfigurations(String configurations) {
        this.configurations = configurations;
        return this;
    }
    public String getConfigurations() {
        return this.configurations;
    }

    public DeletePermanentTopologyNodesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeletePermanentTopologyNodesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DeletePermanentTopologyNodesRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

}
