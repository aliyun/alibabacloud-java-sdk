// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListRunsResponseBody extends TeaModel {
    /**
     * <p>The pagination token. Pass an empty value for the first page query. The query result returns the token for the next page. A token value of 0 indicates that all data has been retrieved. You can obtain the token for the next page from the NextPageToken field in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The list of runs.</p>
     */
    @NameInMap("Runs")
    public java.util.List<Run> runs;

    /**
     * <p>The total number of records that match the request conditions. This is an optional parameter and may not be returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunsResponseBody self = new ListRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRunsResponseBody setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListRunsResponseBody setRuns(java.util.List<Run> runs) {
        this.runs = runs;
        return this;
    }
    public java.util.List<Run> getRuns() {
        return this.runs;
    }

    public ListRunsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
