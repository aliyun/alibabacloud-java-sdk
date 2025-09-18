// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListTableDetailsRequest extends TeaModel {
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

    @NameInMap("tableNamePattern")
    public String tableNamePattern;

    @NameInMap("type")
    public String type;

    public static ListTableDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableDetailsRequest self = new ListTableDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListTableDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTableDetailsRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

    public ListTableDetailsRequest setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }
    public String getTableNamePattern() {
        return this.tableNamePattern;
    }

    public ListTableDetailsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
