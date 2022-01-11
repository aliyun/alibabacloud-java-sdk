// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class ChangeAuctionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeAuctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeAuctionResponseBody self = new ChangeAuctionResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeAuctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
