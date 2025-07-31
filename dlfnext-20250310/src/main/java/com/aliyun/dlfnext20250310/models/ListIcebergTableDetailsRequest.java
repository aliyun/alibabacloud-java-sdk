// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListIcebergTableDetailsRequest extends TeaModel {
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
     * <p>table%</p>
     */
    @NameInMap("tableNamePattern")
    public String tableNamePattern;

    public static ListIcebergTableDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIcebergTableDetailsRequest self = new ListIcebergTableDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListIcebergTableDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIcebergTableDetailsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListIcebergTableDetailsRequest setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

}
