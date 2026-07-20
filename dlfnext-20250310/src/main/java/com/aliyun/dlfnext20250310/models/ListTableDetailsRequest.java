// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListTableDetailsRequest extends TeaModel {
    /**
     * <p>The maximum number of records to retrieve in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token used to retrieve the next page of data. If the response does not provide this value, pass an empty string (&quot;&quot;) or an empty character (\&quot;\&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("pageToken")
    public String pageToken;

    /**
     * <p>The deletion status of the table. Valid values:</p>
     * <ul>
     * <li>retained: The table is deleted and temporarily stored in the recycle bin.</li>
     * <li>active: The table is in a normal state. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The fuzzy match pattern for the table name.</p>
     * 
     * <strong>example:</strong>
     * <p>table%</p>
     */
    @NameInMap("tableNamePattern")
    public String tableNamePattern;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
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

    public ListTableDetailsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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
