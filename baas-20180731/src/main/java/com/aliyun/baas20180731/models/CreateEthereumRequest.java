// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEthereumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Consensus")
    public String consensus;

    @NameInMap("Description")
    public String description;

    @NameInMap("Difficulty")
    public String difficulty;

    @NameInMap("Gas")
    public String gas;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Node")
    public java.util.List<CreateEthereumRequestNode> node;

    @NameInMap("Region")
    public String region;

    public static CreateEthereumRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEthereumRequest self = new CreateEthereumRequest();
        return TeaModel.build(map, self);
    }

    public CreateEthereumRequest setConsensus(String consensus) {
        this.consensus = consensus;
        return this;
    }
    public String getConsensus() {
        return this.consensus;
    }

    public CreateEthereumRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEthereumRequest setDifficulty(String difficulty) {
        this.difficulty = difficulty;
        return this;
    }
    public String getDifficulty() {
        return this.difficulty;
    }

    public CreateEthereumRequest setGas(String gas) {
        this.gas = gas;
        return this;
    }
    public String getGas() {
        return this.gas;
    }

    public CreateEthereumRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEthereumRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateEthereumRequest setNode(java.util.List<CreateEthereumRequestNode> node) {
        this.node = node;
        return this;
    }
    public java.util.List<CreateEthereumRequestNode> getNode() {
        return this.node;
    }

    public CreateEthereumRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public static class CreateEthereumRequestNode extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static CreateEthereumRequestNode build(java.util.Map<String, ?> map) throws Exception {
            CreateEthereumRequestNode self = new CreateEthereumRequestNode();
            return TeaModel.build(map, self);
        }

        public CreateEthereumRequestNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
