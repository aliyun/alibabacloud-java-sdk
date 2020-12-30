// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyAccessAttributeRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("EnableOpenAccess")
    public Boolean enableOpenAccess;

    public static ModifyAccessAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessAttributeRequest self = new ModifyAccessAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccessAttributeRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public ModifyAccessAttributeRequest setEnableOpenAccess(Boolean enableOpenAccess) {
        this.enableOpenAccess = enableOpenAccess;
        return this;
    }
    public Boolean getEnableOpenAccess() {
        return this.enableOpenAccess;
    }

}
