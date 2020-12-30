// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetIpWhiteListRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    public static GetIpWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpWhiteListRequest self = new GetIpWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public GetIpWhiteListRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

}
