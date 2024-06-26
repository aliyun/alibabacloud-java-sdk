// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ProcessCloudIDEContractTransactionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Transaction")
    public String transaction;

    public static ProcessCloudIDEContractTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessCloudIDEContractTransactionRequest self = new ProcessCloudIDEContractTransactionRequest();
        return TeaModel.build(map, self);
    }

    public ProcessCloudIDEContractTransactionRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ProcessCloudIDEContractTransactionRequest setTransaction(String transaction) {
        this.transaction = transaction;
        return this;
    }
    public String getTransaction() {
        return this.transaction;
    }

}
