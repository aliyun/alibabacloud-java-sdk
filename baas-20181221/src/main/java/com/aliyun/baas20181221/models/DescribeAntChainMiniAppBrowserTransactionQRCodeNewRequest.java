// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bDXK6boZ</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <strong>example:</strong>
     * <p>9782291a957d28bec9e02f3dcb27d78392815ede7670b70793e0fd9763309cda</p>
     */
    @NameInMap("ContractId")
    public String contractId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4a1f1371012cf840a9e4c6bde430d5ba600e422e592d153bd2689783cd1f87d0</p>
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
