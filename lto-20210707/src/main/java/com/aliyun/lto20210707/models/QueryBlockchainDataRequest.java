// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class QueryBlockchainDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("ContractName")
    public String contractName;

    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IotDataDID")
    public String iotDataDID;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TransactionId")
    public String transactionId;

    public static QueryBlockchainDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainDataRequest self = new QueryBlockchainDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainDataRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public QueryBlockchainDataRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public QueryBlockchainDataRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public QueryBlockchainDataRequest setIotDataDID(String iotDataDID) {
        this.iotDataDID = iotDataDID;
        return this;
    }
    public String getIotDataDID() {
        return this.iotDataDID;
    }

    public QueryBlockchainDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryBlockchainDataRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
