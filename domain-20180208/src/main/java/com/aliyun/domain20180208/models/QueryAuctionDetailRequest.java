// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryAuctionDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AuctionId")
    public String auctionId;

    public static QueryAuctionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuctionDetailRequest self = new QueryAuctionDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuctionDetailRequest setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

}
