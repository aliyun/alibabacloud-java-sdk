// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryExportAuctionDetailRequest extends TeaModel {
    @NameInMap("AuctionId")
    public String auctionId;

    public static QueryExportAuctionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExportAuctionDetailRequest self = new QueryExportAuctionDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryExportAuctionDetailRequest setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

}
