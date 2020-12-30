// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyLedgerAttributeRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("LedgerName")
    public String ledgerName;

    @NameInMap("LedgerDescription")
    public String ledgerDescription;

    public static ModifyLedgerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLedgerAttributeRequest self = new ModifyLedgerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLedgerAttributeRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public ModifyLedgerAttributeRequest setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
        return this;
    }
    public String getLedgerName() {
        return this.ledgerName;
    }

    public ModifyLedgerAttributeRequest setLedgerDescription(String ledgerDescription) {
        this.ledgerDescription = ledgerDescription;
        return this;
    }
    public String getLedgerDescription() {
        return this.ledgerDescription;
    }

}
