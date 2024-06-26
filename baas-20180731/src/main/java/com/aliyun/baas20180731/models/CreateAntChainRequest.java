// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainName")
    public String antChainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlockchainRegionId")
    public String blockchainRegionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CipherSuit")
    public String cipherSuit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LiveTime")
    public Integer liveTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MerkleTreeSuit")
    public String merkleTreeSuit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeNum")
    public Integer nodeNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceSize")
    public Integer resourceSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TlsAlgo")
    public String tlsAlgo;

    public static CreateAntChainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainRequest self = new CreateAntChainRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntChainRequest setAntChainName(String antChainName) {
        this.antChainName = antChainName;
        return this;
    }
    public String getAntChainName() {
        return this.antChainName;
    }

    public CreateAntChainRequest setBlockchainRegionId(String blockchainRegionId) {
        this.blockchainRegionId = blockchainRegionId;
        return this;
    }
    public String getBlockchainRegionId() {
        return this.blockchainRegionId;
    }

    public CreateAntChainRequest setCipherSuit(String cipherSuit) {
        this.cipherSuit = cipherSuit;
        return this;
    }
    public String getCipherSuit() {
        return this.cipherSuit;
    }

    public CreateAntChainRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateAntChainRequest setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
        return this;
    }
    public Integer getLiveTime() {
        return this.liveTime;
    }

    public CreateAntChainRequest setMerkleTreeSuit(String merkleTreeSuit) {
        this.merkleTreeSuit = merkleTreeSuit;
        return this;
    }
    public String getMerkleTreeSuit() {
        return this.merkleTreeSuit;
    }

    public CreateAntChainRequest setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Integer getNodeNum() {
        return this.nodeNum;
    }

    public CreateAntChainRequest setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }
    public Integer getResourceSize() {
        return this.resourceSize;
    }

    public CreateAntChainRequest setTlsAlgo(String tlsAlgo) {
        this.tlsAlgo = tlsAlgo;
        return this;
    }
    public String getTlsAlgo() {
        return this.tlsAlgo;
    }

}
