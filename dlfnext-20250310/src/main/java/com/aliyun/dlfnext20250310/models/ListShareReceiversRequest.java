// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListShareReceiversRequest extends TeaModel {
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

    public static ListShareReceiversRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShareReceiversRequest self = new ListShareReceiversRequest();
        return TeaModel.build(map, self);
    }

    public ListShareReceiversRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListShareReceiversRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
