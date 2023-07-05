// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeletePictureRequest extends TeaModel {
    @NameInMap("DeletePicAfterQuery")
    public String deletePicAfterQuery;

    @NameInMap("TransactionId")
    public String transactionId;

    public static DeletePictureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePictureRequest self = new DeletePictureRequest();
        return TeaModel.build(map, self);
    }

    public DeletePictureRequest setDeletePicAfterQuery(String deletePicAfterQuery) {
        this.deletePicAfterQuery = deletePicAfterQuery;
        return this;
    }
    public String getDeletePicAfterQuery() {
        return this.deletePicAfterQuery;
    }

    public DeletePictureRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
