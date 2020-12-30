// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DescribeTSARequest extends TeaModel {
    @NameInMap("SequenceWithinLedger")
    public Long sequenceWithinLedger;

    public static DescribeTSARequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTSARequest self = new DescribeTSARequest();
        return TeaModel.build(map, self);
    }

    public DescribeTSARequest setSequenceWithinLedger(Long sequenceWithinLedger) {
        this.sequenceWithinLedger = sequenceWithinLedger;
        return this;
    }
    public Long getSequenceWithinLedger() {
        return this.sequenceWithinLedger;
    }

}
