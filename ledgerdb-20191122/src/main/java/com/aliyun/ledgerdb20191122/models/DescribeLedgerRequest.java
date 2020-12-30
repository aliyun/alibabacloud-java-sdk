// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DescribeLedgerRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    public static DescribeLedgerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLedgerRequest self = new DescribeLedgerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLedgerRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

}
