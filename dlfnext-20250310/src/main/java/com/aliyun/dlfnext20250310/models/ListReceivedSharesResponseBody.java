// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListReceivedSharesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("shares")
    public java.util.List<ReceivedShare> shares;

    public static ListReceivedSharesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReceivedSharesResponseBody self = new ListReceivedSharesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReceivedSharesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListReceivedSharesResponseBody setShares(java.util.List<ReceivedShare> shares) {
        this.shares = shares;
        return this;
    }
    public java.util.List<ReceivedShare> getShares() {
        return this.shares;
    }

}
