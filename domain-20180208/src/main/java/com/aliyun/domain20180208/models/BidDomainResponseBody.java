// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BidDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("AuctionId")
    public String auctionId;

    /**
     * <strong>example:</strong>
     * <p>CC615585-9D93-4179-BD16-09337E32A3A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BidDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BidDomainResponseBody self = new BidDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public BidDomainResponseBody setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public BidDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
