// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListReceiversRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <strong>example:</strong>
     * <p>receiver_name</p>
     */
    @NameInMap("receiverName")
    public String receiverName;

    public static ListReceiversRequest build(java.util.Map<String, ?> map) throws Exception {
        ListReceiversRequest self = new ListReceiversRequest();
        return TeaModel.build(map, self);
    }

    public ListReceiversRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListReceiversRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListReceiversRequest setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

}
