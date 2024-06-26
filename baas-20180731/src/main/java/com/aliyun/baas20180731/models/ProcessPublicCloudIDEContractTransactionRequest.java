// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ProcessPublicCloudIDEContractTransactionRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("Transaction")
    public String transaction;

    public static ProcessPublicCloudIDEContractTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        ProcessPublicCloudIDEContractTransactionRequest self = new ProcessPublicCloudIDEContractTransactionRequest();
        return TeaModel.build(map, self);
    }

    public ProcessPublicCloudIDEContractTransactionRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ProcessPublicCloudIDEContractTransactionRequest setTransaction(String transaction) {
        this.transaction = transaction;
        return this;
    }
    public String getTransaction() {
        return this.transaction;
    }

}
