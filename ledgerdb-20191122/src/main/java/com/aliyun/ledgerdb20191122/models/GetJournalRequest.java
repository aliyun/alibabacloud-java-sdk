// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetJournalRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("JournalId")
    public Long journalId;

    public static GetJournalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJournalRequest self = new GetJournalRequest();
        return TeaModel.build(map, self);
    }

    public GetJournalRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public GetJournalRequest setJournalId(Long journalId) {
        this.journalId = journalId;
        return this;
    }
    public Long getJournalId() {
        return this.journalId;
    }

}
