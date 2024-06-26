// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateBlockchainRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("BlockchainRegionId")
    public String blockchainRegionId;

    @NameInMap("BlockchainType")
    public String blockchainType;

    @NameInMap("CipherSuit")
    public String cipherSuit;

    @NameInMap("LiveTime")
    public Integer liveTime;

    @NameInMap("MachineNum")
    public Integer machineNum;

    @NameInMap("MerkleTreeSuit")
    public String merkleTreeSuit;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("TlsAlgo")
    public String tlsAlgo;

    public static CreateBlockchainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainRequest self = new CreateBlockchainRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateBlockchainRequest setBlockchainRegionId(String blockchainRegionId) {
        this.blockchainRegionId = blockchainRegionId;
        return this;
    }
    public String getBlockchainRegionId() {
        return this.blockchainRegionId;
    }

    public CreateBlockchainRequest setBlockchainType(String blockchainType) {
        this.blockchainType = blockchainType;
        return this;
    }
    public String getBlockchainType() {
        return this.blockchainType;
    }

    public CreateBlockchainRequest setCipherSuit(String cipherSuit) {
        this.cipherSuit = cipherSuit;
        return this;
    }
    public String getCipherSuit() {
        return this.cipherSuit;
    }

    public CreateBlockchainRequest setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
        return this;
    }
    public Integer getLiveTime() {
        return this.liveTime;
    }

    public CreateBlockchainRequest setMachineNum(Integer machineNum) {
        this.machineNum = machineNum;
        return this;
    }
    public Integer getMachineNum() {
        return this.machineNum;
    }

    public CreateBlockchainRequest setMerkleTreeSuit(String merkleTreeSuit) {
        this.merkleTreeSuit = merkleTreeSuit;
        return this;
    }
    public String getMerkleTreeSuit() {
        return this.merkleTreeSuit;
    }

    public CreateBlockchainRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public CreateBlockchainRequest setTlsAlgo(String tlsAlgo) {
        this.tlsAlgo = tlsAlgo;
        return this;
    }
    public String getTlsAlgo() {
        return this.tlsAlgo;
    }

}
