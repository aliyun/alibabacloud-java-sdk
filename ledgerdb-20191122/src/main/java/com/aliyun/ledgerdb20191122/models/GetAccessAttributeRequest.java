// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetAccessAttributeRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    public static GetAccessAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessAttributeRequest self = new GetAccessAttributeRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessAttributeRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

}
