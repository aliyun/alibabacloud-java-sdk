// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListViewDetailsRequest extends TeaModel {
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
     * <p>view%</p>
     */
    @NameInMap("viewNamePattern")
    public String viewNamePattern;

    public static ListViewDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListViewDetailsRequest self = new ListViewDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListViewDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListViewDetailsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListViewDetailsRequest setViewNamePattern(String viewNamePattern) {
        this.viewNamePattern = viewNamePattern;
        return this;
    }
    public String getViewNamePattern() {
        return this.viewNamePattern;
    }

}
