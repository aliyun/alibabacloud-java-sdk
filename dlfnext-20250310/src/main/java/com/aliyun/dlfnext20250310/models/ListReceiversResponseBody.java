// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListReceiversResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("receivers")
    public java.util.List<Receiver> receivers;

    public static ListReceiversResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReceiversResponseBody self = new ListReceiversResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReceiversResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListReceiversResponseBody setReceivers(java.util.List<Receiver> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<Receiver> getReceivers() {
        return this.receivers;
    }

}
