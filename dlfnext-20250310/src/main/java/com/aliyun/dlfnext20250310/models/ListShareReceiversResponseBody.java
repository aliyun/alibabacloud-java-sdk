// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListShareReceiversResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("nextPageToken")
    public String nextPageToken;

    @NameInMap("receivers")
    public java.util.List<Receiver> receivers;

    public static ListShareReceiversResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShareReceiversResponseBody self = new ListShareReceiversResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShareReceiversResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListShareReceiversResponseBody setReceivers(java.util.List<Receiver> receivers) {
        this.receivers = receivers;
        return this;
    }
    public java.util.List<Receiver> getReceivers() {
        return this.receivers;
    }

}
