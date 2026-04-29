// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class UpdateProxyPriceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sc123456</p>
     */
    @NameInMap("AuctionId")
    public String auctionId;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProxyPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProxyPriceResponseBody self = new UpdateProxyPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProxyPriceResponseBody setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public UpdateProxyPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
