// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddEthereumNodeRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EthereumId")
    public String ethereumId;

    @NameInMap("ExternalNode")
    public Boolean externalNode;

    @NameInMap("NodeName")
    public String nodeName;

    public static AddEthereumNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEthereumNodeRequest self = new AddEthereumNodeRequest();
        return TeaModel.build(map, self);
    }

    public AddEthereumNodeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddEthereumNodeRequest setEthereumId(String ethereumId) {
        this.ethereumId = ethereumId;
        return this;
    }
    public String getEthereumId() {
        return this.ethereumId;
    }

    public AddEthereumNodeRequest setExternalNode(Boolean externalNode) {
        this.externalNode = externalNode;
        return this;
    }
    public Boolean getExternalNode() {
        return this.externalNode;
    }

    public AddEthereumNodeRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

}
