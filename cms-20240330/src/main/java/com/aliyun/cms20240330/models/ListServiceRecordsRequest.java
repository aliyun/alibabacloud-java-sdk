// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServiceRecordsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return. Maximum value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The type of the linked entry. Currently supported:
     * logCorrelation, which indicates application log association.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>logCorrelation</p>
     */
    @NameInMap("recordType")
    public String recordType;

    /**
     * <p>The filter information for service-linked entries.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;serviceName&quot;: &quot;my-service&quot;,
     *   &quot;storeName&quot;: &quot;my-logstore&quot;
     * }</p>
     */
    @NameInMap("search")
    public String search;

    public static ListServiceRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRecordsRequest self = new ListServiceRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceRecordsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceRecordsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceRecordsRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public ListServiceRecordsRequest setSearch(String search) {
        this.search = search;
        return this;
    }
    public String getSearch() {
        return this.search;
    }

}
