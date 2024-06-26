// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ContractId")
    public String contractId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TransactionHash")
    public String transactionHash;

    public static DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest self = new DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

}
