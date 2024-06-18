// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class ReserveDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12080761</p>
     */
    @NameInMap("AuctionId")
    public String auctionId;

    /**
     * <strong>example:</strong>
     * <p>64F63E07-3AF6-4D59-8616-55DF1A9E03ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReserveDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReserveDomainResponseBody self = new ReserveDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ReserveDomainResponseBody setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public ReserveDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
