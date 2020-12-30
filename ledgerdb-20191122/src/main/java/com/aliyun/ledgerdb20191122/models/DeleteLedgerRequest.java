// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DeleteLedgerRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    public static DeleteLedgerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLedgerRequest self = new DeleteLedgerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLedgerRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

}
