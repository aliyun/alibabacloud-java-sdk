// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListProvidedSharesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("shares")
    public java.util.List<Share> shares;

    public static ListProvidedSharesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProvidedSharesResponseBody self = new ListProvidedSharesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProvidedSharesResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListProvidedSharesResponseBody setShares(java.util.List<Share> shares) {
        this.shares = shares;
        return this;
    }
    public java.util.List<Share> getShares() {
        return this.shares;
    }

}
