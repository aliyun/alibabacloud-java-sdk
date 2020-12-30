// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class InviteMembersRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("AliUids")
    public String aliUids;

    public static InviteMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        InviteMembersRequest self = new InviteMembersRequest();
        return TeaModel.build(map, self);
    }

    public InviteMembersRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public InviteMembersRequest setAliUids(String aliUids) {
        this.aliUids = aliUids;
        return this;
    }
    public String getAliUids() {
        return this.aliUids;
    }

}
