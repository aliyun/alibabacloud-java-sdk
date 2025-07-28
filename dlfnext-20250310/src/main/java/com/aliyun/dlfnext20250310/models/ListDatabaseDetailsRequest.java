// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListDatabaseDetailsRequest extends TeaModel {
    @NameInMap("databaseNamePattern")
    public String databaseNamePattern;

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

    public static ListDatabaseDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseDetailsRequest self = new ListDatabaseDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabaseDetailsRequest setDatabaseNamePattern(String databaseNamePattern) {
        this.databaseNamePattern = databaseNamePattern;
        return this;
    }
    public String getDatabaseNamePattern() {
        return this.databaseNamePattern;
    }

    public ListDatabaseDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDatabaseDetailsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
