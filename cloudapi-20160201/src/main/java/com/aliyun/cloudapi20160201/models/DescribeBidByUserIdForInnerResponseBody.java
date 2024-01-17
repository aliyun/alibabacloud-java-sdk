// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeBidByUserIdForInnerResponseBody extends TeaModel {
    @NameInMap("Bid")
    public String bid;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBidByUserIdForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBidByUserIdForInnerResponseBody self = new DescribeBidByUserIdForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBidByUserIdForInnerResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeBidByUserIdForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
