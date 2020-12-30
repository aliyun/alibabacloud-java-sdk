// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyMemberACLsRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("MemberId")
    public String memberId;

    @NameInMap("Role")
    public String role;

    public static ModifyMemberACLsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMemberACLsRequest self = new ModifyMemberACLsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMemberACLsRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public ModifyMemberACLsRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ModifyMemberACLsRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
