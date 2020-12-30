// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GrantServiceLinkedRoleRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    public static GrantServiceLinkedRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantServiceLinkedRoleRequest self = new GrantServiceLinkedRoleRequest();
        return TeaModel.build(map, self);
    }

    public GrantServiceLinkedRoleRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

}
