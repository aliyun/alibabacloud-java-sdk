// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DeleteMemberRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("MemberId")
    public String memberId;

    public static DeleteMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemberRequest self = new DeleteMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMemberRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public DeleteMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

}
