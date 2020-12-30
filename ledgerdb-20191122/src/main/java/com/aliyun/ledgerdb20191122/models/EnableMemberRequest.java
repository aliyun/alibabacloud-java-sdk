// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class EnableMemberRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("MemberId")
    public String memberId;

    public static EnableMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMemberRequest self = new EnableMemberRequest();
        return TeaModel.build(map, self);
    }

    public EnableMemberRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public EnableMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

}
