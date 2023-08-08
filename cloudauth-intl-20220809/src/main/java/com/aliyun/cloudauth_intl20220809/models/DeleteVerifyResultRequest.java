// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteVerifyResultRequest extends TeaModel {
    @NameInMap("DeleteAfterQuery")
    public String deleteAfterQuery;

    @NameInMap("DeleteType")
    public String deleteType;

    @NameInMap("TransactionId")
    public String transactionId;

    public static DeleteVerifyResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVerifyResultRequest self = new DeleteVerifyResultRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVerifyResultRequest setDeleteAfterQuery(String deleteAfterQuery) {
        this.deleteAfterQuery = deleteAfterQuery;
        return this;
    }
    public String getDeleteAfterQuery() {
        return this.deleteAfterQuery;
    }

    public DeleteVerifyResultRequest setDeleteType(String deleteType) {
        this.deleteType = deleteType;
        return this;
    }
    public String getDeleteType() {
        return this.deleteType;
    }

    public DeleteVerifyResultRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
